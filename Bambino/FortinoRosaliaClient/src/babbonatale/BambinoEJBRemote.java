package babbonatale;

import babbonatale.Bambino;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface BambinoEJBRemote {
    List<Bambino> findAll();
    Bambino createBambino(Bambino b);
    void deleteBambino(Bambino b);
    Bambino updateBambino(Bambino b);
    
    Bambino findById(int id);
    List<Bambino> findByEta(int eta);
    List<Bambino> findByStato(String stato);
    List<Bambino> findByNumFamiliari(int numFamiliari);
}