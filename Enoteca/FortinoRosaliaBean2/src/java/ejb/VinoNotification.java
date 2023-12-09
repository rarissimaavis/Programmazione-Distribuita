package ejb;

import javax.enterprise.event.Observes;

public class VinoNotification {
    public void notify (@Observes Vino v) {
        System.out.println("Aggiornamento effettuato");
    }
}
