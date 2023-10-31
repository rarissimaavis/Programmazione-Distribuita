package jpa_lab_2;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class Main {

  public static void main(String[] args) {

    Book book = new Book("H2G2", "The Hitchhiker's Guide to the Galaxy", 12.5F, "1-84023-742-2", 354, false);

    //ottiene un entity manager e una transazione
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_Lab2PU");
    EntityManager em = emf.createEntityManager();

    //salva il libro nel database
    EntityTransaction tx = em.getTransaction();
    tx.begin();
    em.persist(book);
    tx.commit();

    book = em.createNamedQuery("findBookH2G2", Book.class).getSingleResult();
    System.out.println("Query per H2G2");
    System.out.println("######### " + book.getDescription());
   
    Query all = em.createNamedQuery("findAllBooks", Book.class);
    
    List<Book> results = all.getResultList();
    System.out.println("\nQuery per tutti i libri");
     for (Book b : results) {
      System.out.println(b.getTitle());
  }
    //chiude entity manager e factory
    em.close();
    emf.close();
  }
}