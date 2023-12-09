package ejb;

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
        VinoEJBRemote vinoEJB = (VinoEJBRemote)ctx.lookup("java:global/FortinoRosaliaBean2/VinoEJB!ejb.VinoEJBRemote");
        
        /* punto a */
        
        System.out.println("a. Tutte le entry i cui corrispondenti prezzi siano inferiori di un importo dato in input");
        System.out.println("Inserisci un numero");
        Scanner sc = new Scanner(System.in);
        float n = sc.nextFloat();
        for(Vino v: vinoEJB.findByPrezzoInf(n)) {
            System.out.println(v);
        }
        
        System.out.println("\nb. Tutte le entry di una provenienza data in input");
        System.out.println("Inserisci una provenienza");
        Scanner sc2 = new Scanner(System.in);
        String p = sc2.nextLine();
        for(Vino v: vinoEJB.findByProvenienza(p)) {
            System.out.println(v);
        }
        
        System.out.println("\nc. Tutte le entry del database");
        for(Vino v: vinoEJB.findAll()) {
            System.out.println(v);
        }
        
        /* punto b */
        
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/javaee7/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/javaee7/Topic");

        VinoDTO msg = new VinoDTO(2, 8);

        try(JMSContext jmsCxt = cf.createContext()){
            jmsCxt.createProducer().
                send(topic, msg);

        }
    }
}
