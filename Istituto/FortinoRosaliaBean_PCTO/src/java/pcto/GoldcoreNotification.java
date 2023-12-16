package pcto;

import javax.enterprise.event.Observes;

public class GoldcoreNotification {
    public void notify (@Observes @Goldcore Istituto i) {
        System.out.println("L'istituto " + i.getNome() + " entra nel gold core!");
        i.setGoldCore("SI");
    }
}
