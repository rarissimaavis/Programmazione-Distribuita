package pcto;

import java.util.List;
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
        IstitutoEJBRemote istitutoEJB = (IstitutoEJBRemote)ctx.lookup("java:global/FortinoRosaliaBean_PCTO/IstitutoEJB!pcto.IstitutoEJBRemote");
        
        /* punto a */

        System.out.println("a. Tutte le entry di una determinata tipologia data in input");
        System.out.println("Inserisci una tipologia");
        Scanner sc2 = new Scanner(System.in);
        String t = sc2.nextLine();
        for(Istituto i: istitutoEJB.findByTipologia(t)) {
            System.out.println(i);
        } 
        
        System.out.println("\nb. Tutte le entry del database");
        for(Istituto i: istitutoEJB.findAll()) {
            System.out.println(i);
        }
        
        /* punto b */
        
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/javaee7/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/javaee7/Topic");

        IstitutoDTO msg = new IstitutoDTO(1, 50);

        try(JMSContext jmsCxt = cf.createContext()){
            jmsCxt.createProducer().send(topic, msg);
        }
    }
}
