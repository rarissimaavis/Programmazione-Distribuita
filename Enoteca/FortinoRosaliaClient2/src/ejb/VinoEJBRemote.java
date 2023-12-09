package ejb;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface VinoEJBRemote {
    List<Vino> findAll();
    Vino createVino(Vino v);
    void deleteVino(Vino v);
    Vino updateVino(Vino v);
    
    Vino findById(int id);
    List<Vino> findByPrezzo(float prezzo);
    List<Vino> findByVitigno(String vitigno);
    List<Vino> findByPrezzoInf(float prezzo);
    List<Vino> findByProvenienza(String provenienza);
}