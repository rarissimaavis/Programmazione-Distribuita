package pcto;

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
public class IstitutoMDB implements MessageListener {
    @Inject
    private IstitutoEJB ejb;

    @Inject 
    Event<Istituto> event;
    
    @Inject @Goldcore
    Event<Istituto> goldCoreEvent;
    
    @Override
    public void onMessage(Message msg) {
        try {
            IstitutoDTO wrapper = msg.getBody(IstitutoDTO.class);
            
            Integer id = wrapper.getId();
            Integer studentiAmmessi = wrapper.getStudentiAmmessi();
            
            Istituto i = ejb.findById(id);
            i.setStudentiAmmessi(studentiAmmessi);
            i = ejb.updateIstituto(i);
            
            if (i.getStudentiAmmessi() > 40)
                goldCoreEvent.fire(i);
            else
                event.fire(i);
        } catch (JMSException e) {
            Logger.getLogger(IstitutoMDB.class.getName()).log(Level.SEVERE, null, e);
        }
        
    }
}