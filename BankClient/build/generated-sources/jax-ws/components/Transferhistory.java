
package components;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for transferhistory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="transferhistory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="from_username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="to_username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalTransfer" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="transferDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transferhistory", propOrder = {
    "fromUsername",
    "id",
    "note",
    "toUsername",
    "totalTransfer",
    "transferDate"
})
public class Transferhistory {

    @XmlElement(name = "from_username")
    protected String fromUsername;
    protected int id;
    protected String note;
    @XmlElement(name = "to_username")
    protected String toUsername;
    protected float totalTransfer;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transferDate;

    /**
     * Gets the value of the fromUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromUsername() {
        return fromUsername;
    }

    /**
     * Sets the value of the fromUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromUsername(String value) {
        this.fromUsername = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Gets the value of the toUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToUsername() {
        return toUsername;
    }

    /**
     * Sets the value of the toUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToUsername(String value) {
        this.toUsername = value;
    }

    /**
     * Gets the value of the totalTransfer property.
     * 
     */
    public float getTotalTransfer() {
        return totalTransfer;
    }

    /**
     * Sets the value of the totalTransfer property.
     * 
     */
    public void setTotalTransfer(float value) {
        this.totalTransfer = value;
    }

    /**
     * Gets the value of the transferDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransferDate() {
        return transferDate;
    }

    /**
     * Sets the value of the transferDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransferDate(XMLGregorianCalendar value) {
        this.transferDate = value;
    }

}
