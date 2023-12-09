package babbonatale;

import java.io.Serializable;
import javax.persistence.*;
import static babbonatale.Bambino.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = FIND_ALL, query = "SELECT b FROM Bambino b"),
    @NamedQuery(name = FIND_BY_ID, query = "SELECT b FROM Bambino b WHERE b.id = :id"),
    @NamedQuery(name = FIND_BY_ETA, query = "SELECT b FROM Bambino b WHERE b.eta = :eta"),
    @NamedQuery(name = FIND_BY_STATO, query = "SELECT b FROM Bambino b WHERE b.stato = :stato"),
    @NamedQuery(name = FIND_BY_NUM_FAMILIARI, query = "SELECT b FROM Bambino b WHERE b.numFamiliari > :numFamiliari")
})
public class Bambino implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public static final String FIND_ALL = "Bambino.findAll";
    public static final String FIND_BY_ID= "Bambino.findById";
    public static final String FIND_BY_ETA = "Bambino.findByEta";
    public static final String FIND_BY_STATO = "Bambino.findByStato";
    public static final String FIND_BY_NUM_FAMILIARI = "Bambino.findByNumFamiliari";
    
    @Id @GeneratedValue
    private int id;
    
    private String cognome;
    private String citta;
    private String paese;
    private int eta;
    private int numFamiliari;
    private String stato;
    private String priorita;
    
    public Bambino(){};

    public Bambino(String cognome, String citta, String paese, int eta, int numFamiliari, String stato, String priorita) {
        this.cognome = cognome;
        this.citta = citta;
        this.paese = paese;
        this.eta = eta;
        this.numFamiliari = numFamiliari;
        this.stato = stato;
        this.priorita = priorita;
    }
    
    public Bambino(int id, String cognome, String citta, String paese, int eta, int numFamiliari, String stato, String priorita) {
        this.id = id;
        this.cognome = cognome;
        this.citta = citta;
        this.paese = paese;
        this.eta = eta;
        this.numFamiliari = numFamiliari;
        this.stato = stato;
        this.priorita = priorita;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getPaese() {
        return paese;
    }

    public void setPaese(String paese) {
        this.paese = paese;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public int getNumFamiliari() {
        return numFamiliari;
    }

    public void setNumFamiliari(int numFamiliari) {
        this.numFamiliari = numFamiliari;
    }

    public String getStato() {
        return stato;
    }

    public void setStato(String stato) {
        this.stato = stato;
    }

    public String getPriorita() {
        return priorita;
    }

    public void setPriorita(String priorita) {
        this.priorita = priorita;
    }
    
    @Override
    public String toString() {
        return "Bambino{" + "id=" + id + ", cognome=" + cognome + ", citta=" + citta + ", paese=" + paese + ", eta=" + eta + ", numFamiliari=" + numFamiliari + ", stato=" + stato + ", priorita=" + priorita + '}';
    }
}
