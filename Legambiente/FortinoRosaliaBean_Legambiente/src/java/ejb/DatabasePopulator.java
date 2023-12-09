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
    private CircoloEJB ejb;
    private Circolo c1, c2, c3;
    
    @PostConstruct
    private void populateDB() {
        c1 = new Circolo("Legambiente Benevento", "Antonio Basile", "legambiente.benevento@gmail.com", "Benevento", "Benevento", "Campania");
        c2 = new Circolo("LEGAMBIENTE Valle dell'Irno", "Antonio D’Auria", "info@legambienteirno.it", "Baronissi", "Salerno", "Campania");
        c3 = new Circolo("Esther Ada", "Francesco Sanguedolce", "rancosangi@gmail.com", "Lampedusa", "Agrigento", "Sicilia");
        
        ejb.createCircolo(c1);
        ejb.createCircolo(c2);
        ejb.createCircolo(c3);
    }
    
    @PreDestroy
    private void clearDB() {
        ejb.deleteCircolo(c1);
        ejb.deleteCircolo(c2);
        ejb.deleteCircolo(c3);
    }
}
