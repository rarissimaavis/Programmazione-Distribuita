package babbonatale;

import java.util.Scanner;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Main {
    public static void main(String[] args) throws NamingException {
        Context ctx = new InitialContext();
        BambinoEJBRemote bambinoEJB = (BambinoEJBRemote)ctx.lookup("java:global/FortinoRosaliaBean/BambinoEJB!babbonatale.BambinoEJBRemote");
        
        /* punto a */
        
        System.out.println("a. Tutte le entry i cui corrispondenti nuclei familiari siano composti da un numero di persone maggiore di un numero dato in input");
        System.out.println("Inserisci un numero");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(Bambino b: bambinoEJB.findByNumFamiliari(n)) {
            System.out.println(b);
        }
        
        System.out.println("\nb. Tutte le entry dei bambini che non hanno mandato la letterina");
        for(Bambino b: bambinoEJB.findByStato("NO")) {
            System.out.println(b);
        }
        
        System.out.println("\nc. Tutte le entry del database");
        for(Bambino b: bambinoEJB.findAll()) {
            System.out.println(b);
        }
        
        /* punto b */
        
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/javaee7/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/javaee7/Topic");

        BambinoDTO msg = new BambinoDTO(4, "SI");

        try(JMSContext jmsCxt = cf.createContext()){
            jmsCxt.createProducer().send(topic, msg);
        }
    }
}
