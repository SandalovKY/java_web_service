
package server.generated.teacher;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for recordImpl complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="recordImpl"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="m_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_patr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="m_mark" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "recordImpl", propOrder = {
    "mName",
    "mSurname",
    "mPatr",
    "mMark"
})
public class RecordImpl {

    @XmlElement(name = "m_name")
    protected String mName;
    @XmlElement(name = "m_surname")
    protected String mSurname;
    @XmlElement(name = "m_patr")
    protected String mPatr;
    @XmlElement(name = "m_mark")
    protected Integer mMark;

    /**
     * Gets the value of the mName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMName() {
        return mName;
    }

    /**
     * Sets the value of the mName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMName(String value) {
        this.mName = value;
    }

    /**
     * Gets the value of the mSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSurname() {
        return mSurname;
    }

    /**
     * Sets the value of the mSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSurname(String value) {
        this.mSurname = value;
    }

    /**
     * Gets the value of the mPatr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMPatr() {
        return mPatr;
    }

    /**
     * Sets the value of the mPatr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMPatr(String value) {
        this.mPatr = value;
    }

    /**
     * Gets the value of the mMark property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMMark() {
        return mMark;
    }

    /**
     * Sets the value of the mMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMMark(Integer value) {
        this.mMark = value;
    }

}
