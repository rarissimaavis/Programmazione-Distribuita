package ejb;

import java.util.List;
import javax.naming.NamingException;

public class Main {
    public static void main(String[] args) throws NamingException {
        /* punto c */
        System.out.println("Tutte le entry la cui tipologia è Champagne");
        List<ejb.Vino> bottiglie = findAll();
        for (ejb.Vino b: bottiglie) {
            if (b.getTipologia().equals("Champagne")) {
                System.out.println(b);
            }
        }
    }

    private static java.util.List<ejb.Vino> findAll() {
        ejb.VinoEJBService service = new ejb.VinoEJBService();
        ejb.VinoEJB port = service.getVinoEJBPort();
        return port.findAll();
    }
}
