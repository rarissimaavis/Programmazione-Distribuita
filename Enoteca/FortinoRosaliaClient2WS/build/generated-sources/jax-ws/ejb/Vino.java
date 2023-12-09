
package ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per vino complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="vino"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="acquisto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="azienda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nominativo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numBottiglieDisponibili" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prezzo" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="provenienza" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipologia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="vitigno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vino", propOrder = {
    "acquisto",
    "azienda",
    "id",
    "nominativo",
    "numBottiglieDisponibili",
    "prezzo",
    "provenienza",
    "tipologia",
    "vitigno"
})
public class Vino {

    protected String acquisto;
    protected String azienda;
    protected int id;
    protected String nominativo;
    protected int numBottiglieDisponibili;
    protected float prezzo;
    protected String provenienza;
    protected String tipologia;
    protected String vitigno;

    /**
     * Recupera il valore della proprietà acquisto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcquisto() {
        return acquisto;
    }

    /**
     * Imposta il valore della proprietà acquisto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcquisto(String value) {
        this.acquisto = value;
    }

    /**
     * Recupera il valore della proprietà azienda.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAzienda() {
        return azienda;
    }

    /**
     * Imposta il valore della proprietà azienda.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAzienda(String value) {
        this.azienda = value;
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
     * Recupera il valore della proprietà nominativo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNominativo() {
        return nominativo;
    }

    /**
     * Imposta il valore della proprietà nominativo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNominativo(String value) {
        this.nominativo = value;
    }

    /**
     * Recupera il valore della proprietà numBottiglieDisponibili.
     * 
     */
    public int getNumBottiglieDisponibili() {
        return numBottiglieDisponibili;
    }

    /**
     * Imposta il valore della proprietà numBottiglieDisponibili.
     * 
     */
    public void setNumBottiglieDisponibili(int value) {
        this.numBottiglieDisponibili = value;
    }

    /**
     * Recupera il valore della proprietà prezzo.
     * 
     */
    public float getPrezzo() {
        return prezzo;
    }

    /**
     * Imposta il valore della proprietà prezzo.
     * 
     */
    public void setPrezzo(float value) {
        this.prezzo = value;
    }

    /**
     * Recupera il valore della proprietà provenienza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvenienza() {
        return provenienza;
    }

    /**
     * Imposta il valore della proprietà provenienza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvenienza(String value) {
        this.provenienza = value;
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

    /**
     * Recupera il valore della proprietà vitigno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVitigno() {
        return vitigno;
    }

    /**
     * Imposta il valore della proprietà vitigno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVitigno(String value) {
        this.vitigno = value;
    }

}
