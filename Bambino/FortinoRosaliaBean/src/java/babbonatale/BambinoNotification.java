package babbonatale;

import javax.enterprise.event.Observes;

public class BambinoNotification {
    public void notify (@Observes Bambino b) {
        System.out.println("Aggiornamento effettuato");
    }
}
