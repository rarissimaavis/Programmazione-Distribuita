package ejb;

import java.util.List;
import javax.naming.NamingException;

public class Main {
    public static void main(String[] args) throws NamingException {
        /* punto c */
        System.out.println("Tutte le partite giocate");
        List<Partita> lista = findAll();
        for (Partita p: lista)
            System.out.println(p);
    }

    private static java.util.List<ejb.Partita> findAll() {
        ejb.PartitaEJBService service = new ejb.PartitaEJBService();
        ejb.PartitaEJB port = service.getPartitaEJBPort();
        return port.findAll();
    }

}