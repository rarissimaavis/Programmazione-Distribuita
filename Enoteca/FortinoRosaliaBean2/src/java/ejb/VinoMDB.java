package ejb;

import javax.enterprise.event.Event;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(activationConfig = {
    @ActivationConfigProperty(propertyName = "clientId", propertyValue = "jms/javaee7/Topic"),
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "jms/javaee7/Topic"),
    @ActivationConfigProperty(propertyName = "subscriptionDurability", propertyValue = "Durable"),
    @ActivationConfigProperty(propertyName = "subscriptionName", propertyValue = "jms/javaee7/Topic"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Topic")
})
public class VinoMDB implements MessageListener {
    @Inject
    private VinoEJB ejb;

    @Inject 
    Event<Vino> event;
    
    @Inject @Riassortimento
    Event<Vino> priorityEvent;
    
    @Override
    public void onMessage(Message msg) {
        try {
            VinoDTO wrapper = msg.getBody(VinoDTO.class);
            
            Integer id = wrapper.getId();
            Integer numBottiglie = wrapper.getNumBottiglieDisponibili();
            
            Vino v = ejb.findById(id);
            v.setNumBottiglieDisponibili(numBottiglie);
            v = ejb.updateVino(v);
            
            if (v.getNumBottiglieDisponibili() < 10)
                priorityEvent.fire(v);
            else
                event.fire(v);
        } catch (JMSException e) {
            Logger.getLogger(VinoMDB.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
}
