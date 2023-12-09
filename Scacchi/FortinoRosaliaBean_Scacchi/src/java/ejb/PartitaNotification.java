package ejb;

import javax.enterprise.event.Observes;

public class PartitaNotification {
    public void notify (@Observes Partita p) {
        System.out.println("Aggiornamento effettuato");
    }
}
