package ejb;

import java.io.Serializable;
import javax.persistence.*;
import static ejb.Partita.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = FIND_ALL, query = "SELECT p FROM Partita p"),
    @NamedQuery(name = FIND_BY_ID, query = "SELECT p FROM Partita p WHERE p.id = :id"),
    @NamedQuery(name = FIND_BY_TIPO, query = "SELECT p FROM Partita p WHERE p.tipo = :tipo"),
    @NamedQuery(name = FIND_BY_GIOCATORI, query = "SELECT p FROM Partita p WHERE p.g1 = :g1 AND p.g2 = :g2"),
    @NamedQuery(name = FIND_BY_RISULTATO, query = "SELECT p FROM Partita p WHERE p.risultato = :risultato"),
    @NamedQuery(name = FIND_BY_MOSSE, query = "SELECT p FROM Partita p WHERE p.mosse = :mosse"),
    @NamedQuery(name = FIND_BY_RATINGS, query = "SELECT p FROM Partita p WHERE p.r1 > :r1 AND p.r2 > :r2")
        
})
public class Partita implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public static final String FIND_ALL = "Partita.findAll";
    public static final String FIND_BY_ID = "Partita.findById";
    public static final String FIND_BY_TIPO = "Partita.findByTipo";
    public static final String FIND_BY_GIOCATORI = "Partita.findByGiocatori";
    public static final String FIND_BY_RISULTATO = "Partita.findByRisultato";
    public static final String FIND_BY_MOSSE = "Partita.findByMosse";
    public static final String FIND_BY_RATINGS = "Partita.findByRatings";
    
    @Id @GeneratedValue
    private int id;
    
    private String tipo;
    private String g1;
    private String g2;
    private int r1;
    private int r2;
    private String mosse;
    private String risultato;
    private boolean conclusa;
    
    public Partita(){};

    public Partita(int id, String tipo, String g1, String g2, int r1, int r2, String mosse, String risultato, boolean conclusa) {
        this.id = id;
        this.tipo = tipo;
        this.g1 = g1;
        this.g2 = g2;
        this.r1 = r1;
        this.r2 = r2;
        this.mosse = mosse;
        this.risultato = risultato;
        this.conclusa = conclusa;
    }

    public Partita(String tipo, String g1, String g2, int r1, int r2, String mosse, String risultato, boolean conclusa) {
        this.tipo = tipo;
        this.g1 = g1;
        this.g2 = g2;
        this.r1 = r1;
        this.r2 = r2;
        this.mosse = mosse;
        this.risultato = risultato;
        this.conclusa = conclusa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getG1() {
        return g1;
    }

    public void setG1(String g1) {
        this.g1 = g1;
    }

    public String getG2() {
        return g2;
    }

    public void setG2(String g2) {
        this.g2 = g2;
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    public String getMosse() {
        return mosse;
    }

    public void setMosse(String mosse) {
        this.mosse = mosse;
    }

    public String getRisultato() {
        return risultato;
    }

    public void setRisultato(String risultato) {
        this.risultato = risultato;
    }

    public boolean isConclusa() {
        return conclusa;
    }

    public void setConclusa(boolean conclusa) {
        this.conclusa = conclusa;
    }

    @Override
    public String toString() {
        return "Partita{" + "id=" + id + ", tipo=" + tipo + ", g1=" + g1 + ", g2=" + g2 + ", r1=" + r1 + ", r2=" + r2 + ", mosse=" + mosse + ", risultato=" + risultato + ", conclusa=" + conclusa + '}';
    }
}
