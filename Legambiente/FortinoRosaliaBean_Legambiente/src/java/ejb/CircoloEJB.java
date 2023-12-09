package ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;
import javax.persistence.TypedQuery;
import static ejb.Circolo.*;

@Stateless
@LocalBean
@InterceptorCount
public class CircoloEJB implements CircoloEJBRemote {

    @Inject
    private EntityManager em;
    
    @Override
    public Circolo createCircolo(Circolo c) {
        em.persist(c);
        return c;
    }
    
    @Override
    public Circolo updateCircolo(Circolo c) {
        return em.merge(c);
    }
    
    @Override
    public void deleteCircolo (Circolo c) {
        em.remove(em.merge(c));
    }
    
    @Override
    public List<Circolo> findAll() {
        TypedQuery<Circolo> query = em.createNamedQuery(FIND_ALL,Circolo.class);
        return query.getResultList();
    }

    @Override
    public Circolo findById(int id) {
        TypedQuery<Circolo> query = em.createNamedQuery(FIND_BY_ID, Circolo.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public List<Circolo> findByRegione(String regione) {
        TypedQuery<Circolo> query = em.createNamedQuery(FIND_BY_REGIONE, Circolo.class);
        query.setParameter("regione", regione);
        return query.getResultList();
    }
}
