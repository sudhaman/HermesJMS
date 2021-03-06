//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.19 at 10:30:34 AM GMT 
//


package hermes.config;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WatchConfig complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WatchConfig">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destination" type="{}DestinationConfig" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultDepthAlertThreshold" type="{http://www.w3.org/2001/XMLSchema}int" default="0" />
 *       &lt;attribute name="defaultAgeAlertThreshold" type="{http://www.w3.org/2001/XMLSchema}long" default="0" />
 *       &lt;attribute name="showAge" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="updateFrequency" type="{http://www.w3.org/2001/XMLSchema}long" default="30000" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WatchConfig", propOrder = {
    "destination"
})
public class WatchConfig {

    protected List<DestinationConfig> destination;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "defaultDepthAlertThreshold")
    protected Integer defaultDepthAlertThreshold;
    @XmlAttribute(name = "defaultAgeAlertThreshold")
    protected Long defaultAgeAlertThreshold;
    @XmlAttribute(name = "showAge")
    protected Boolean showAge;
    @XmlAttribute(name = "updateFrequency")
    protected Long updateFrequency;

    /**
     * Gets the value of the destination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DestinationConfig }
     * 
     * 
     */
    public List<DestinationConfig> getDestination() {
        if (destination == null) {
            destination = new ArrayList<DestinationConfig>();
        }
        return this.destination;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the defaultDepthAlertThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getDefaultDepthAlertThreshold() {
        if (defaultDepthAlertThreshold == null) {
            return  0;
        } else {
            return defaultDepthAlertThreshold;
        }
    }

    /**
     * Sets the value of the defaultDepthAlertThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDefaultDepthAlertThreshold(Integer value) {
        this.defaultDepthAlertThreshold = value;
    }

    /**
     * Gets the value of the defaultAgeAlertThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getDefaultAgeAlertThreshold() {
        if (defaultAgeAlertThreshold == null) {
            return  0L;
        } else {
            return defaultAgeAlertThreshold;
        }
    }

    /**
     * Sets the value of the defaultAgeAlertThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDefaultAgeAlertThreshold(Long value) {
        this.defaultAgeAlertThreshold = value;
    }

    /**
     * Gets the value of the showAge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowAge() {
        if (showAge == null) {
            return true;
        } else {
            return showAge;
        }
    }

    /**
     * Sets the value of the showAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowAge(Boolean value) {
        this.showAge = value;
    }

    /**
     * Gets the value of the updateFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public long getUpdateFrequency() {
        if (updateFrequency == null) {
            return  30000L;
        } else {
            return updateFrequency;
        }
    }

    /**
     * Sets the value of the updateFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUpdateFrequency(Long value) {
        this.updateFrequency = value;
    }

}
