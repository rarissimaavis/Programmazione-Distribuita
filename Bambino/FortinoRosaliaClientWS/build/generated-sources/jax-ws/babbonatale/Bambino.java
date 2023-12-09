
package babbonatale;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per bambino complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="bambino"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="citta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cognome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="eta" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="numFamiliari" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="paese" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="priorita" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bambino", propOrder = {
    "citta",
    "cognome",
    "eta",
    "id",
    "numFamiliari",
    "paese",
    "priorita",
    "stato"
})
public class Bambino {

    protected String citta;
    protected String cognome;
    protected int eta;
    protected int id;
    protected int numFamiliari;
    protected String paese;
    protected String priorita;
    protected String stato;

    /**
     * Recupera il valore della proprietà citta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitta() {
        return citta;
    }

    /**
     * Imposta il valore della proprietà citta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitta(String value) {
        this.citta = value;
    }

    /**
     * Recupera il valore della proprietà cognome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Imposta il valore della proprietà cognome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCognome(String value) {
        this.cognome = value;
    }

    /**
     * Recupera il valore della proprietà eta.
     * 
     */
    public int getEta() {
        return eta;
    }

    /**
     * Imposta il valore della proprietà eta.
     * 
     */
    public void setEta(int value) {
        this.eta = value;
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
     * Recupera il valore della proprietà numFamiliari.
     * 
     */
    public int getNumFamiliari() {
        return numFamiliari;
    }

    /**
     * Imposta il valore della proprietà numFamiliari.
     * 
     */
    public void setNumFamiliari(int value) {
        this.numFamiliari = value;
    }

    /**
     * Recupera il valore della proprietà paese.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaese() {
        return paese;
    }

    /**
     * Imposta il valore della proprietà paese.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaese(String value) {
        this.paese = value;
    }

    /**
     * Recupera il valore della proprietà priorita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorita() {
        return priorita;
    }

    /**
     * Imposta il valore della proprietà priorita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorita(String value) {
        this.priorita = value;
    }

    /**
     * Recupera il valore della proprietà stato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStato() {
        return stato;
    }

    /**
     * Imposta il valore della proprietà stato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStato(String value) {
        this.stato = value;
    }

}
