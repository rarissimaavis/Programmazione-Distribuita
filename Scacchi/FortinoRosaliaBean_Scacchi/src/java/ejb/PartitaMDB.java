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
public class PartitaMDB implements MessageListener {
    @Inject
    private PartitaEJB ejb;
    
    @Inject @Super
    Event<Partita> superEvent;
    
    @Override
    public void onMessage(Message msg) {
        try {
            PartitaDTO wrapper = msg.getBody(PartitaDTO.class);
            
            Integer id = wrapper.getId();
            String mosse = wrapper.getMosse();
            String risultato = wrapper.getRisultato();
            
            Partita p = ejb.findById(id);
            p.setMosse(mosse);
            p.setRisultato(risultato);
            p = ejb.updatePartita(p);
            System.out.println(p.getR1());
            
            superEvent.fire(p);
        } catch (JMSException e) {
            Logger.getLogger(PartitaMDB.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
}
