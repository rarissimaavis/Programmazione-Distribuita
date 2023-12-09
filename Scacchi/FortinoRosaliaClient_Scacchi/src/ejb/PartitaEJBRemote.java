package ejb;

import ejb.Partita;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface PartitaEJBRemote {
    List<Partita> findAll();
    Partita createPartita(Partita p);
    void deletePartita(Partita p);
    Partita updatePartita(Partita p);
    
    Partita findById(int id);
    List<Partita> findByTipo(String tipo);
    List<Partita> findByGiocatori(String g1, String g2);
    List<Partita> findByRisultato(String risultato);
    List<Partita> findByMosse(String mosse);
    List<Partita> findByRatings(int r1, int r2);
}