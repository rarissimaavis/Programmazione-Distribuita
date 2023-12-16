package pcto;

import java.io.Serializable;
import javax.persistence.*;
import static pcto.Istituto.*;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = FIND_ALL, query = "SELECT i FROM Istituto i"),
    @NamedQuery(name = FIND_BY_ID, query = "SELECT i FROM Istituto i WHERE i.id = :id"),
    @NamedQuery(name = FIND_BY_NOME, query = "SELECT i FROM Istituto i WHERE i.nome = :nome"),
    @NamedQuery(name = FIND_BY_TIPOLOGIA, query = "SELECT i FROM Istituto i WHERE i.tipologia = :tipologia"),
    @NamedQuery(name = FIND_BY_PROVINCIA, query = "SELECT i FROM Istituto i WHERE i.provincia = :provincia")
})
public class Istituto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public static final String FIND_ALL = "Istituto.findAll";
    public static final String FIND_BY_ID = "Istituto.findById";
    public static final String FIND_BY_NOME = "Istituto.findByNome";
    public static final String FIND_BY_TIPOLOGIA = "Istituto.findByTipologia";
    public static final String FIND_BY_PROVINCIA = "Istituto.findByProvincia";
    
    @Id @GeneratedValue
    private int id;
    
    private String nome;
    private String tipologia;
    private String provincia;
    private String responsabile;
    private String argomento;
    private int studentiAmmessi;
    private String goldCore;
    
    public Istituto(){};

    public Istituto(String nome, String tipologia, String provincia, String responsabile, String argomento, int studentiAmmessi, String goldCore) {
        this.nome = nome;
        this.tipologia = tipologia;
        this.provincia = provincia;
        this.responsabile = responsabile;
        this.argomento = argomento;
        this.studentiAmmessi = studentiAmmessi;
        this.goldCore = goldCore;
    }

    public Istituto(int id, String nome, String tipologia, String provincia, String responsabile, String argomento, int studentiAmmessi, String goldCore) {
        this.id = id;
        this.nome = nome;
        this.tipologia = tipologia;
        this.provincia = provincia;
        this.responsabile = responsabile;
        this.argomento = argomento;
        this.studentiAmmessi = studentiAmmessi;
        this.goldCore = goldCore;
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

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getResponsabile() {
        return responsabile;
    }

    public void setResponsabile(String responsabile) {
        this.responsabile = responsabile;
    }

    public String getArgomento() {
        return argomento;
    }

    public void setArgomento(String argomento) {
        this.argomento = argomento;
    }

    public int getStudentiAmmessi() {
        return studentiAmmessi;
    }

    public void setStudentiAmmessi(int studentiAmmessi) {
        this.studentiAmmessi = studentiAmmessi;
    }

    public String getGoldCore() {
        return goldCore;
    }

    public void setGoldCore(String goldCore) {
        this.goldCore = goldCore;
    }

    @Override
    public String toString() {
        return "Istituto{" + "id=" + id + ", nome=" + nome + ", tipologia=" + tipologia + ", provincia=" + provincia + ", responsabile=" + responsabile + ", argomento=" + argomento + ", studentiAmmessi=" + studentiAmmessi + ", goldCore=" + goldCore + '}';
    }
}
