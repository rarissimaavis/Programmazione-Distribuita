package ejb;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Main {
    public static void main(String[] args) throws NamingException {
        Context ctx = new InitialContext();
        PartitaEJBRemote partitaEJB = (PartitaEJBRemote)ctx.lookup("java:global/FortinoRosaliaBean_Scacchi/PartitaEJB!ejb.PartitaEJBRemote");
        
        /* punto a */
        
        System.out.println("a. Tutte le partite finite dove entrambi i giocatori hanno rating maggiore di 2300");
        for(Partita p: partitaEJB.findByRatings(2300, 2300)) {
            if (p.isConclusa())
                System.out.println(p);
        }
        
        System.out.println("\nb. Tutte le partite finite in pareggio");
        for(Partita p: partitaEJB.findByRisultato("Patta")) {
            System.out.println(p);
        }
        
        /* punto b */
        
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/javaee7/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/javaee7/Topic");

        PartitaDTO msg = new PartitaDTO(4, "MOSSE NUOVE", "G2");

        try(JMSContext jmsCxt = cf.createContext()){
            jmsCxt.createProducer().send(topic, msg);
        }
    }
}
