package pcto;

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
    private IstitutoEJB ejb;
    private Istituto i1, i2, i3;
    
    @PostConstruct
    private void populateDB() {
        i1 = new Istituto(1, "Margherita Hack", "Tecnico", "Salerno", "Mario Rossi", "Bioinformatica", 40, "NO");
        i2 = new Istituto(2, "Focaccia", "Tecnico", "Salerno", "Guido Verdi", "IoT", 50, "NO");
        i3 = new Istituto(3, "Genovesi-Da Vinci", "Scientifico", "Salerno", "Gianluca Bianchi", "CodingGirls", 55, "NO");
        
        ejb.createIstituto(i1);
        ejb.createIstituto(i2);
        ejb.createIstituto(i3);
    }
    
    @PreDestroy
    private void clearDB() {
        ejb.deleteIstituto(i1);
        ejb.deleteIstituto(i2);
        ejb.deleteIstituto(i3);
    }
}
