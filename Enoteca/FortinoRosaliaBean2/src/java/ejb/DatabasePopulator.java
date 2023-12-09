package ejb;

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
    private VinoEJB ejb;
    private Vino v1, v2, v3;
    
    @PostConstruct
    private void populateDB() {
        v1 = new Vino(1, "Montevetrano", "Cabernet", "Colli di Salerno", 11, "Italia", 60, "Rosso", "NO");
        v2 = new Vino(2, "Terra di Lavoro", "Aglianico", "Galardi", 15, "Italia", 50, "Rosso", "NO");
        v3 = new Vino(3, "Influence Miniere", "Meunier", "Rodolphe Miniere", 5, "Francia", 70, "Champagne", "NO");
                
        ejb.createVino(v1);
        ejb.createVino(v2);
        ejb.createVino(v3);
    }
    
    @PreDestroy
    private void clearDB() {
        ejb.deleteVino(v1);
        ejb.deleteVino(v2);
        ejb.deleteVino(v3);
    }
}
