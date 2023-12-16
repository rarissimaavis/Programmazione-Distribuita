package pcto;

import javax.enterprise.event.Observes;

public class IstitutoNotification {
    public void notify (@Observes Istituto i) {
        System.out.println("Aggiornamento effettuato");
    }
}
