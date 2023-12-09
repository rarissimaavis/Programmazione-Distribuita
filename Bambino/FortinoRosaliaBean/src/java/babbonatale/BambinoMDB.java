package babbonatale;

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
public class BambinoMDB implements MessageListener {
    @Inject
    private BambinoEJB ejb;

    @Inject 
    Event<Bambino> event;
    
    @Inject @Priorita
    Event<Bambino> priorityEvent;
    
    @Override
    public void onMessage(Message msg) {
        try {
            BambinoDTO wrapper = msg.getBody(BambinoDTO.class);
            
            Integer id = wrapper.getId();
            String stato = wrapper.getStato();
            
            Bambino b = ejb.findById(id);
            b.setStato(stato);
            b = ejb.updateBambino(b);
            
            if (b.getNumFamiliari() > 10)
                priorityEvent.fire(b);
            else
                event.fire(b);
        } catch (JMSException e) {
            Logger.getLogger(BambinoMDB.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
}
