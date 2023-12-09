package ejb;

import java.io.Serializable;
import javax.persistence.*;
import static ejb.Circolo.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQueries({
    @NamedQuery(name = FIND_ALL, query = "SELECT c FROM Circolo c"),
    @NamedQuery(name = FIND_BY_ID, query = "SELECT c FROM Circolo c WHERE c.id = :id"),
    @NamedQuery(name = FIND_BY_REGIONE, query = "SELECT c FROM Circolo c WHERE c.regione = :regione")
})
public class Circolo implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public static final String FIND_ALL = "Circolo.findAll";
    public static final String FIND_BY_ID = "Circolo.findById";
    public static final String FIND_BY_REGIONE = "Circolo.findByEta";
    
    @Id @GeneratedValue
    private int id;
    
    private String nome;
    private String responsabile;
    private String email;
    private String citta;
    private String provincia;
    private String regione;
    
    public Circolo(){};

    public Circolo(String nome, String responsabile, String email, String citta, String provincia, String regione) {
        this.nome = nome;
        this.responsabile = responsabile;
        this.email = email;
        this.citta = citta;
        this.provincia = provincia;
        this.regione = regione;
    }

    public Circolo(int id, String nome, String responsabile, String email, String citta, String provincia, String regione) {
        this.id = id;
        this.nome = nome;
        this.responsabile = responsabile;
        this.email = email;
        this.citta = citta;
        this.provincia = provincia;
        this.regione = regione;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResponsabile() {
        return responsabile;
    }

    public void setResponsabile(String responsabile) {
        this.responsabile = responsabile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getRegione() {
        return regione;
    }

    public void setRegione(String regione) {
        this.regione = regione;
    }

    @Override
    public String toString() {
        return "Circolo{" + "id=" + id + ", nome=" + nome + ", responsabile=" + responsabile + ", email=" + email + ", citta=" + citta + ", provincia=" + provincia + ", regione=" + regione + '}';
    }
}
