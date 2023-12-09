package ejb;

import javax.enterprise.event.Observes;

public class SuperNotification {
    public void notify (@Observes @Super Partita p) {
        if (p.getRisultato().equals("G1") && p.getR1() > 2800)
            System.out.println(p.getG1() + " is a superplayer");
        if (p.getRisultato().equals("G2") && p.getR2() > 2800)
            System.out.println(p.getG2() + " is a superplayer");
        if (p.getRisultato().equals("Patta"))
            System.out.println("Partita conclusa con un pareggio");
    }
}
