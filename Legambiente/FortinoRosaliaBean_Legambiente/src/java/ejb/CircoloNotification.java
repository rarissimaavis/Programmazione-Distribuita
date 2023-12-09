package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.event.Observes;

@Stateless
@LocalBean
public class CircoloNotification {
    public void notify (@Observes Circolo c) {
        System.out.println("EVENTO: aggiornamento del seguente circolo" + c);
    }
}
