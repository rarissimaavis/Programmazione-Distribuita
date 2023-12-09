package ejb;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.enterprise.event.Event;
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
public class CircoloMDB implements MessageListener {
    @Inject
    private CircoloEJB ejb;
    
    @Inject 
    Event<Circolo> event;
    
    @Override
    public void onMessage(Message msg) {
        try {
            CircoloDTO wrapper = msg.getBody(CircoloDTO.class);
            
            Integer id = wrapper.getId();
            String nome = wrapper.getNome();
            String responsabile = wrapper.getResponsabile();
            
            Circolo c = ejb.findById(id);
            c.setNome(nome);
            c.setResponsabile(responsabile);
            c = ejb.updateCircolo(c);
            event.fire(c);
        } catch (JMSException e) {
            Logger.getLogger(CircoloMDB.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
}
