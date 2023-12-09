
package ejb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per partita complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="partita"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="conclusa" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="g1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="g2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mosse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="r1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="r2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="risultato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partita", propOrder = {
    "conclusa",
    "g1",
    "g2",
    "id",
    "mosse",
    "r1",
    "r2",
    "risultato",
    "tipo"
})
public class Partita {

    protected boolean conclusa;
    protected String g1;
    protected String g2;
    protected int id;
    protected String mosse;
    protected int r1;
    protected int r2;
    protected String risultato;
    protected String tipo;

    /**
     * Recupera il valore della proprietà conclusa.
     * 
     */
    public boolean isConclusa() {
        return conclusa;
    }

    /**
     * Imposta il valore della proprietà conclusa.
     * 
     */
    public void setConclusa(boolean value) {
        this.conclusa = value;
    }

    /**
     * Recupera il valore della proprietà g1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getG1() {
        return g1;
    }

    /**
     * Imposta il valore della proprietà g1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setG1(String value) {
        this.g1 = value;
    }

    /**
     * Recupera il valore della proprietà g2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getG2() {
        return g2;
    }

    /**
     * Imposta il valore della proprietà g2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setG2(String value) {
        this.g2 = value;
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
     * Recupera il valore della proprietà mosse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMosse() {
        return mosse;
    }

    /**
     * Imposta il valore della proprietà mosse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMosse(String value) {
        this.mosse = value;
    }

    /**
     * Recupera il valore della proprietà r1.
     * 
     */
    public int getR1() {
        return r1;
    }

    /**
     * Imposta il valore della proprietà r1.
     * 
     */
    public void setR1(int value) {
        this.r1 = value;
    }

    /**
     * Recupera il valore della proprietà r2.
     * 
     */
    public int getR2() {
        return r2;
    }

    /**
     * Imposta il valore della proprietà r2.
     * 
     */
    public void setR2(int value) {
        this.r2 = value;
    }

    /**
     * Recupera il valore della proprietà risultato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRisultato() {
        return risultato;
    }

    /**
     * Imposta il valore della proprietà risultato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRisultato(String value) {
        this.risultato = value;
    }

    /**
     * Recupera il valore della proprietà tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Imposta il valore della proprietà tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

}
