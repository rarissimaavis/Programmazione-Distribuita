package babbonatale;

import java.util.List;
import javax.naming.NamingException;

public class Main {
    public static void main(String[] args) throws NamingException {
        /* punto c */
        System.out.println("Tutti i paesi per cui i corrispondenti bambini non hanno mandato la letterina");
        List<babbonatale.Bambino> lista = findByStato("NO");
        for (babbonatale.Bambino b: lista)
            System.out.println(b.getPaese());
    }

    private static java.util.List<babbonatale.Bambino> findByStato(java.lang.String arg0) {
        babbonatale.BambinoEJBService service = new babbonatale.BambinoEJBService();
        babbonatale.BambinoEJB port = service.getBambinoEJBPort();
        return port.findByStato(arg0);
    }
}