
package components;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for user complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="user">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="draw_money_history" type="{http://webservice/}drawmoneyhistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fullname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalMoney" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *         &lt;element name="transferhistory" type="{http://webservice/}transferhistory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
    "drawMoneyHistory",
    "fullname",
    "password",
    "totalMoney",
    "transferhistory",
    "username"
})
public class User {

    @XmlElement(name = "draw_money_history", nillable = true)
    protected List<Drawmoneyhistory> drawMoneyHistory;
    protected String fullname;
    protected String password;
    protected float totalMoney;
    @XmlElement(nillable = true)
    protected List<Transferhistory> transferhistory;
    protected String username;

    /**
     * Gets the value of the drawMoneyHistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the drawMoneyHistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDrawMoneyHistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Drawmoneyhistory }
     * 
     * 
     */
    public List<Drawmoneyhistory> getDrawMoneyHistory() {
        if (drawMoneyHistory == null) {
            drawMoneyHistory = new ArrayList<Drawmoneyhistory>();
        }
        return this.drawMoneyHistory;
    }

    /**
     * Gets the value of the fullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * Sets the value of the fullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullname(String value) {
        this.fullname = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * Gets the value of the totalMoney property.
     * 
     */
    public float getTotalMoney() {
        return totalMoney;
    }

    /**
     * Sets the value of the totalMoney property.
     * 
     */
    public void setTotalMoney(float value) {
        this.totalMoney = value;
    }

    /**
     * Gets the value of the transferhistory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferhistory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferhistory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transferhistory }
     * 
     * 
     */
    public List<Transferhistory> getTransferhistory() {
        if (transferhistory == null) {
            transferhistory = new ArrayList<Transferhistory>();
        }
        return this.transferhistory;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
