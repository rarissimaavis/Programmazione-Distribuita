package ejb;

import ejb.PartitaEJBRemote;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import javax.persistence.TypedQuery;
import static ejb.Partita.*;
import javax.jws.WebService;

@Stateless
@LocalBean
@WebService
public class PartitaEJB implements PartitaEJBRemote {

    @Inject
    private EntityManager em;
    
    @Override
    public Partita createPartita(Partita p) {
        em.persist(p);
        return p;
    }
    
    @Override
    public Partita updatePartita(Partita p) {
        return em.merge(p);
    }
    
    @Override
    public void deletePartita (Partita p) {
        em.remove(em.merge(p));
    }
    
    @Override
    public List<Partita> findAll() {
        TypedQuery<Partita> query = em.createNamedQuery(FIND_ALL,Partita.class);
        return query.getResultList();
    }
    
    @Override
    public Partita findById(int id) {
        TypedQuery<Partita> query = em.createNamedQuery(FIND_BY_ID, Partita.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
    
    @Override
    public List<Partita> findByTipo(String tipo) {
        TypedQuery<Partita> query = em.createNamedQuery(FIND_BY_TIPO, Partita.class);
        query.setParameter("tipo", tipo);
        return query.getResultList();
    }

    @Override
    public List<Partita> findByGiocatori(String g1, String g2) {
        TypedQuery<Partita> query = em.createNamedQuery(FIND_BY_GIOCATORI, Partita.class);
        query.setParameter("g1", g1);
        query.setParameter("g2", g2);
        return query.getResultList();
    }

    @Override
    public List<Partita> findByRisultato(String risultato) {
        TypedQuery<Partita> query = em.createNamedQuery(FIND_BY_RISULTATO, Partita.class);
        query.setParameter("risultato", risultato);
        return query.getResultList();
    }

    @Override
    public List<Partita> findByMosse(String mosse) {
        TypedQuery<Partita> query = em.createNamedQuery(FIND_BY_MOSSE, Partita.class);
        query.setParameter("mosse", mosse);
        return query.getResultList();
    }  
    
    @Override
    public List<Partita> findByRatings(int r1, int r2) {
        TypedQuery<Partita> query = em.createNamedQuery(FIND_BY_RATINGS, Partita.class);
        query.setParameter("r1", r1);
        query.setParameter("r2", r2);
        return query.getResultList();
    }
}
