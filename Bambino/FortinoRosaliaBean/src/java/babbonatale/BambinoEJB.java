package babbonatale;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import javax.persistence.TypedQuery;
import static babbonatale.Bambino.*;
import javax.jws.WebService;

@Stateless
@LocalBean
@WebService
public class BambinoEJB implements BambinoEJBRemote {

    @Inject
    private EntityManager em;
    
    @Override
    public Bambino createBambino(Bambino b) {
        em.persist(b);
        return b;
    }
    
    @Override
    public Bambino updateBambino(Bambino b) {
        return em.merge(b);
    }
    
    @Override
    public void deleteBambino (Bambino b) {
        em.remove(em.merge(b));
    }
    
    @Override
    public List<Bambino> findAll() {
        TypedQuery<Bambino> query = em.createNamedQuery(FIND_ALL,Bambino.class);
        return query.getResultList();
    }

    @Override
    public Bambino findById(int id) {
        TypedQuery<Bambino> query = em.createNamedQuery(FIND_BY_ID, Bambino.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public List<Bambino> findByEta(int eta) {
        TypedQuery<Bambino> query = em.createNamedQuery(FIND_BY_ETA, Bambino.class);
        query.setParameter("eta", eta);
        return query.getResultList();
    }

    @Override
    public List<Bambino> findByStato(String stato) {
        TypedQuery<Bambino> query = em.createNamedQuery(FIND_BY_STATO, Bambino.class);
        query.setParameter("stato", stato);
        return query.getResultList();
    }

    @Override
    public List<Bambino> findByNumFamiliari(int numFamiliari) {
        TypedQuery<Bambino> query = em.createNamedQuery(FIND_BY_NUM_FAMILIARI, Bambino.class);
        query.setParameter("numFamiliari", numFamiliari);
        return query.getResultList();
    }  
}
