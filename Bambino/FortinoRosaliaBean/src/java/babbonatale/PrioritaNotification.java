package babbonatale;

import javax.enterprise.event.Observes;

public class PrioritaNotification {
    public void notify (@Observes @Priorita Bambino b) {
        System.out.println("Procedere con priorità qui");
        b.setPriorita("SI");
    }
}
