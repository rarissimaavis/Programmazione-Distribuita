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
        CircoloEJBRemote circoloEJB = (CircoloEJBRemote)ctx.lookup("java:global/FortinoRosaliaBean_Legambiente/CircoloEJB!ejb.CircoloEJBRemote");
        
        /* punto a */
        
        System.out.println("\na. Tutti i circoli");
        for(Circolo c: circoloEJB.findAll()) {
            System.out.println(c);
        }
        
        System.out.println("\nb. Tutti i circoli di una data regione data in input");
        System.out.println("Inserisci una regione");
        Scanner sc2 = new Scanner(System.in);
        String r = sc2.nextLine();
        for(Circolo c: circoloEJB.findByRegione(r)) {
            System.out.println(c);
        }
        
        /* punto c */
        
        ConnectionFactory cf = (ConnectionFactory) ctx.lookup("jms/javaee7/ConnectionFactory");
        Destination topic = (Destination) ctx.lookup("jms/javaee7/Topic");

        CircoloDTO msg = new CircoloDTO(2, "Legambiente2", "Antonio D'Auria2");

        try(JMSContext jmsCxt = cf.createContext()){
            jmsCxt.createProducer().send(topic, msg);
        }
    }
}
