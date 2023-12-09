package babbonatale;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Singleton
@Startup
@DataSourceDefinition(
    className = "org.apache.derby.jdbc.EmbeddedDataSource",
    name = "jdbc/EsameDS",
    user = "APP",
    password = "APP",
    databaseName = "EsameDB",
    properties = {"connectionAttributes=;create=true"}
)
public class DatabasePopulator {
    
    @Inject
    private BambinoEJB ejb;
    private Bambino b1, b2, b3, b4;
    
    @PostConstruct
    private void populateDB() {
        b1 = new Bambino(1, "Di Dio Angelo", "Messina", "Italia", 4, 3, "SI", "NO");
        b2 = new Bambino(2, "God Angelina", "New York", "USA", 3, 10, "NO", "NO");
        b3 = new Bambino(3, "Birbantello Luigi", "Salerno", "Italia", 5, 3, "SI", "SI");
        b4 = new Bambino(4, "Birbantello Mario", "Roma", "Italia", 7, 13, "SI", "SI");
        
        ejb.createBambino(b1);
        ejb.createBambino(b2);
        ejb.createBambino(b3);
        ejb.createBambino(b4);
    }
    
    @PreDestroy
    private void clearDB() {
        ejb.deleteBambino(b1);
        ejb.deleteBambino(b2);
        ejb.deleteBambino(b3);
        ejb.deleteBambino(b4);
    }
}
