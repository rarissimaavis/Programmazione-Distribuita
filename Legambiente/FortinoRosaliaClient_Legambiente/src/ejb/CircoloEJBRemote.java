package ejb;

import ejb.Circolo;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface CircoloEJBRemote {
    List<Circolo> findAll();
    Circolo createCircolo(Circolo c);
    void deleteCircolo(Circolo c);
    Circolo updateCircolo(Circolo c);
    
    Circolo findById(int id);
    List<Circolo> findByRegione(String regione);
}