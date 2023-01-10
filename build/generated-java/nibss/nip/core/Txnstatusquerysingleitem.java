
package nibss.nip.core;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * &lt;p&gt;Java class for txnstatusquerysingleitem complex type.
 * 
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 * 
 * &lt;pre&gt;
 * &amp;lt;complexType name="txnstatusquerysingleitem"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txnstatusquerysingleitem", propOrder = {
    "request"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2023-01-09T04:30:32+01:00", comments = "JAXB RI v2.3.3")
public class Txnstatusquerysingleitem {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-01-09T04:30:32+01:00", comments = "JAXB RI v2.3.3")
    protected String request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-01-09T04:30:32+01:00", comments = "JAXB RI v2.3.3")
    public String getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2023-01-09T04:30:32+01:00", comments = "JAXB RI v2.3.3")
    public void setRequest(String value) {
        this.request = value;
    }

}
