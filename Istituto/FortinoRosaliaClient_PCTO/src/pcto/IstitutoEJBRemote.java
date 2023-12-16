package pcto;

import pcto.Istituto;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface IstitutoEJBRemote {
    List<Istituto> findAll();
    Istituto createIstituto(Istituto i);
    void deleteIstituto(Istituto i);
    Istituto updateIstituto(Istituto i);
    
    Istituto findById(int id);
    List<Istituto> findByNome(String nome);
    List<Istituto> findByTipologia(String tipologia);
    List<Istituto> findByProvincia(String provincia);
}