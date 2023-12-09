package ejb;

import javax.enterprise.event.Observes;

public class RiassortimentoNotification {
    public void notify (@Observes @Riassortimento Vino v) {
        System.out.println("Il vino " + v + " deve essere riassortito");
        v.setAcquisto("SI");
    }
}
