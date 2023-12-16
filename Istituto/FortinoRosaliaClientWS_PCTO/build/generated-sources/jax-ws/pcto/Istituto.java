
package pcto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per istituto complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="istituto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="argomento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="goldCore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="provincia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="responsabile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="studentiAmmessi" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tipologia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "istituto", propOrder = {
    "argomento",
    "goldCore",
    "id",
    "nome",
    "provincia",
    "responsabile",
    "studentiAmmessi",
    "tipologia"
})
public class Istituto {

    protected String argomento;
    protected String goldCore;
    protected int id;
    protected String nome;
    protected String provincia;
    protected String responsabile;
    protected int studentiAmmessi;
    protected String tipologia;

    /**
     * Recupera il valore della proprietà argomento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArgomento() {
        return argomento;
    }

    /**
     * Imposta il valore della proprietà argomento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArgomento(String value) {
        this.argomento = value;
    }

    /**
     * Recupera il valore della proprietà goldCore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoldCore() {
        return goldCore;
    }

    /**
     * Imposta il valore della proprietà goldCore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoldCore(String value) {
        this.goldCore = value;
    }

    /**
     * Recupera il valore della proprietà id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Recupera il valore della proprietà nome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Imposta il valore della proprietà nome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Recupera il valore della proprietà provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Imposta il valore della proprietà provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Recupera il valore della proprietà responsabile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsabile() {
        return responsabile;
    }

    /**
     * Imposta il valore della proprietà responsabile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsabile(String value) {
        this.responsabile = value;
    }

    /**
     * Recupera il valore della proprietà studentiAmmessi.
     * 
     */
    public int getStudentiAmmessi() {
        return studentiAmmessi;
    }

    /**
     * Imposta il valore della proprietà studentiAmmessi.
     * 
     */
    public void setStudentiAmmessi(int value) {
        this.studentiAmmessi = value;
    }

    /**
     * Recupera il valore della proprietà tipologia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipologia() {
        return tipologia;
    }

    /**
     * Imposta il valore della proprietà tipologia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipologia(String value) {
        this.tipologia = value;
    }

}
