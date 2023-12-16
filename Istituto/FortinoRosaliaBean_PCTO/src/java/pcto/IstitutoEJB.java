package pcto;

import pcto.IstitutoEJBRemote;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import javax.persistence.TypedQuery;
import static pcto.Istituto.*;
import javax.jws.WebService;

@Stateless
@LocalBean
@WebService
public class IstitutoEJB implements IstitutoEJBRemote {

    @Inject
    private EntityManager em;
    
    @Override
    public Istituto createIstituto(Istituto i) {
        em.persist(i);
        return i;
    }
    
    @Override
    public Istituto updateIstituto(Istituto i) {
        return em.merge(i);
    }
    
    @Override
    public void deleteIstituto (Istituto i) {
        em.remove(em.merge(i));
    }
    
    @Override
    public List<Istituto> findAll() {
        TypedQuery<Istituto> query = em.createNamedQuery(FIND_ALL,Istituto.class);
        return query.getResultList();
    }

    @Override
    public Istituto findById(int id) {
        TypedQuery<Istituto> query = em.createNamedQuery(FIND_BY_ID, Istituto.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
    
    @Override
    public List<Istituto> findByNome(String nome) {
        TypedQuery<Istituto> query = em.createNamedQuery(FIND_BY_NOME, Istituto.class);
        query.setParameter("nome", nome);
        return query.getResultList();
    }

    @Override
    public List<Istituto> findByTipologia(String tipologia) {
        TypedQuery<Istituto> query = em.createNamedQuery(FIND_BY_TIPOLOGIA, Istituto.class);
        query.setParameter("tipologia", tipologia);
        return query.getResultList();
    }

    @Override
    public List<Istituto> findByProvincia(String provincia) {
        TypedQuery<Istituto> query = em.createNamedQuery(FIND_BY_PROVINCIA, Istituto.class);
        query.setParameter("provincia", provincia);
        return query.getResultList();
    }
}
