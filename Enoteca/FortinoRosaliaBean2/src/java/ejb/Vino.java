package ejb;

import java.io.Serializable;
import javax.persistence.*;
import static ejb.Vino.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = FIND_ALL, query = "SELECT v FROM Vino v"),
    @NamedQuery(name = FIND_BY_ID, query = "SELECT v FROM Vino v WHERE v.id = :id"),
    @NamedQuery(name = FIND_BY_PREZZO, query = "SELECT v FROM Vino v WHERE v.prezzo = :prezzo"),
    @NamedQuery(name = FIND_BY_VITIGNO, query = "SELECT v FROM Vino v WHERE v.vitigno = :vitigno"),
    @NamedQuery(name = FIND_BY_PREZZO_INF, query = "SELECT v FROM Vino v WHERE v.prezzo < :prezzo"),
    @NamedQuery(name = FIND_BY_PROVENIENZA, query = "SELECT v FROM Vino v WHERE v.provenienza = :provenienza")
})
public class Vino implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public static final String FIND_ALL = "Vino.findAll";
    public static final String FIND_BY_ID = "Vino.findById";
    public static final String FIND_BY_PREZZO = "Vino.findByPrezzo";
    public static final String FIND_BY_VITIGNO = "Vino.findByVitigno";
    public static final String FIND_BY_PREZZO_INF = "Vino.findByPrezzoInf";
    public static final String FIND_BY_PROVENIENZA = "Vino.findByProvenienza";
    
    @Id @GeneratedValue
    private int id;
    
    private String nominativo;
    private String vitigno;
    private String azienda;
    private int numBottiglieDisponibili;
    private String provenienza;
    private float prezzo;
    private String tipologia;
    private String acquisto;
    
    public Vino(){};

    public Vino(String nominativo, String vitigno, String azienda, int numBottiglieDisponibili, String provenienza, float prezzo, String tipologia, String acquisto) {
        this.nominativo = nominativo;
        this.vitigno = vitigno;
        this.azienda = azienda;
        this.numBottiglieDisponibili = numBottiglieDisponibili;
        this.provenienza = provenienza;
        this.prezzo = prezzo;
        this.tipologia = tipologia;
        this.acquisto = acquisto;
    }
    
    public Vino(int id, String nominativo, String vitigno, String azienda, int numBottiglieDisponibili, String provenienza, float prezzo, String tipologia, String acquisto) {
        this.id = id;
        this.nominativo = nominativo;
        this.vitigno = vitigno;
        this.azienda = azienda;
        this.numBottiglieDisponibili = numBottiglieDisponibili;
        this.provenienza = provenienza;
        this.prezzo = prezzo;
        this.tipologia = tipologia;
        this.acquisto = acquisto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNominativo() {
        return nominativo;
    }

    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }

    public String getVitigno() {
        return vitigno;
    }

    public void setVitigno(String vitigno) {
        this.vitigno = vitigno;
    }

    public String getAzienda() {
        return azienda;
    }

    public void setAzienda(String azienda) {
        this.azienda = azienda;
    }

    public int getNumBottiglieDisponibili() {
        return numBottiglieDisponibili;
    }

    public void setNumBottiglieDisponibili(int numBottiglieDisponibili) {
        this.numBottiglieDisponibili = numBottiglieDisponibili;
    }

    public String getProvenienza() {
        return provenienza;
    }

    public void setProvenienza(String provenienza) {
        this.provenienza = provenienza;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getAcquisto() {
        return acquisto;
    }

    public void setAcquisto(String acquisto) {
        this.acquisto = acquisto;
    }

    @Override
    public String toString() {
        return "Vino{" + "id=" + id + ", nominativo=" + nominativo + ", vitigno=" + vitigno + ", azienda=" + azienda + ", numBottiglieDisponibili=" + numBottiglieDisponibili + ", provenienza=" + provenienza + ", prezzo=" + prezzo + ", tipologia=" + tipologia + ", acquisto=" + acquisto + '}';
    }
}
