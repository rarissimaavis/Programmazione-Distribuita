package pcto;

import java.util.List;
import java.util.Scanner;
import javax.naming.NamingException;

public class Main {
    public static void main(String[] args) throws NamingException {
        
        /* punto c */
        
        System.out.println("Numero di studenti partecipanti ai PCTO di un istituto dato in input");
        System.out.println("Inserisci un nome di un istituto");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        List<Istituto> lista = findByNome(n);
        int totale = 0;
        for (Istituto i: lista)
            totale += i.getStudentiAmmessi();
        System.out.println(totale);
        
    }

    private static java.util.List<pcto.Istituto> findByNome(java.lang.String arg0) {
        pcto.IstitutoEJBService service = new pcto.IstitutoEJBService();
        pcto.IstitutoEJB port = service.getIstitutoEJBPort();
        return port.findByNome(arg0);
    }

}