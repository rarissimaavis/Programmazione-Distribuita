package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import javax.persistence.TypedQuery;
import static ejb.Vino.*;
import javax.jws.WebService;

@Stateless
@LocalBean
@WebService
public class VinoEJB implements VinoEJBRemote {

    @Inject
    private EntityManager em;
    
    @Override
    public Vino createVino(Vino v) {
        em.persist(v);
        return v;
    }
    
    @Override
    public Vino updateVino(Vino v) {
        return em.merge(v);
    }
    
    @Override
    public void deleteVino (Vino v) {
        em.remove(em.merge(v));
    }
    
    @Override
    public List<Vino> findAll() {
        TypedQuery<Vino> query = em.createNamedQuery(FIND_ALL,Vino.class);
        return query.getResultList();
    }

    @Override
    public Vino findById(int id) {
        TypedQuery<Vino> query = em.createNamedQuery(FIND_BY_ID, Vino.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public List<Vino> findByPrezzo(float prezzo) {
        TypedQuery<Vino> query = em.createNamedQuery(FIND_BY_PREZZO, Vino.class);
        query.setParameter("prezzo", prezzo);
        return query.getResultList();
    }

    @Override
    public List<Vino> findByVitigno(String vitigno) {
        TypedQuery<Vino> query = em.createNamedQuery(FIND_BY_VITIGNO, Vino.class);
        query.setParameter("vitigno", vitigno);
        return query.getResultList();
    }

    @Override
    public List<Vino> findByPrezzoInf(float prezzo) {
        TypedQuery<Vino> query = em.createNamedQuery(FIND_BY_PREZZO_INF, Vino.class);
        query.setParameter("prezzo", prezzo);
        return query.getResultList();
    }  
    
    @Override
    public List<Vino> findByProvenienza(String provenienza) {
        TypedQuery<Vino> query = em.createNamedQuery(FIND_BY_PROVENIENZA, Vino.class);
        query.setParameter("provenienza", provenienza);
        return query.getResultList();
    }
}
