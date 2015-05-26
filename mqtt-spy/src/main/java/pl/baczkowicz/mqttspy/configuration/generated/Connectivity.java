//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.26 at 11:18:53 PM BST 
//


package pl.baczkowicz.mqttspy.configuration.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.CopyStrategy;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBCopyStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for Connectivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Connectivity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="Connection" type="{http://baczkowicz.pl/mqtt-spy-configuration}UserInterfaceMqttConnectionDetailsV010"/&gt;
 *         &lt;element name="ConnectionV2" type="{http://baczkowicz.pl/mqtt-spy-configuration}UserInterfaceMqttConnectionDetails"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Connectivity", propOrder = {
    "connectionOrConnectionV2"
})
public class Connectivity implements Cloneable, CopyTo, Equals, HashCode, ToString
{

    @XmlElements({
        @XmlElement(name = "Connection", type = UserInterfaceMqttConnectionDetailsV010 .class),
        @XmlElement(name = "ConnectionV2", type = UserInterfaceMqttConnectionDetails.class)
    })
    protected List<Object> connectionOrConnectionV2;

    /**
     * Default no-arg constructor
     * 
     */
    public Connectivity() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Connectivity(final List<Object> connectionOrConnectionV2) {
        this.connectionOrConnectionV2 = connectionOrConnectionV2;
    }

    /**
     * Gets the value of the connectionOrConnectionV2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the connectionOrConnectionV2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConnectionOrConnectionV2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserInterfaceMqttConnectionDetailsV010 }
     * {@link UserInterfaceMqttConnectionDetails }
     * 
     * 
     */
    public List<Object> getConnectionOrConnectionV2() {
        if (connectionOrConnectionV2 == null) {
            connectionOrConnectionV2 = new ArrayList<Object>();
        }
        return this.connectionOrConnectionV2;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        {
            List<Object> theConnectionOrConnectionV2;
            theConnectionOrConnectionV2 = (((this.connectionOrConnectionV2 != null)&&(!this.connectionOrConnectionV2 .isEmpty()))?this.getConnectionOrConnectionV2():null);
            strategy.appendField(locator, this, "connectionOrConnectionV2", buffer, theConnectionOrConnectionV2);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof Connectivity)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Connectivity that = ((Connectivity) object);
        {
            List<Object> lhsConnectionOrConnectionV2;
            lhsConnectionOrConnectionV2 = (((this.connectionOrConnectionV2 != null)&&(!this.connectionOrConnectionV2 .isEmpty()))?this.getConnectionOrConnectionV2():null);
            List<Object> rhsConnectionOrConnectionV2;
            rhsConnectionOrConnectionV2 = (((that.connectionOrConnectionV2 != null)&&(!that.connectionOrConnectionV2 .isEmpty()))?that.getConnectionOrConnectionV2():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "connectionOrConnectionV2", lhsConnectionOrConnectionV2), LocatorUtils.property(thatLocator, "connectionOrConnectionV2", rhsConnectionOrConnectionV2), lhsConnectionOrConnectionV2, rhsConnectionOrConnectionV2)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = 1;
        {
            List<Object> theConnectionOrConnectionV2;
            theConnectionOrConnectionV2 = (((this.connectionOrConnectionV2 != null)&&(!this.connectionOrConnectionV2 .isEmpty()))?this.getConnectionOrConnectionV2():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "connectionOrConnectionV2", theConnectionOrConnectionV2), currentHashCode, theConnectionOrConnectionV2);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public Object clone() {
        return copyTo(createNewInstance());
    }

    public Object copyTo(Object target) {
        final CopyStrategy strategy = JAXBCopyStrategy.INSTANCE;
        return copyTo(null, target, strategy);
    }

    public Object copyTo(ObjectLocator locator, Object target, CopyStrategy strategy) {
        final Object draftCopy = ((target == null)?createNewInstance():target);
        if (draftCopy instanceof Connectivity) {
            final Connectivity copy = ((Connectivity) draftCopy);
            if ((this.connectionOrConnectionV2 != null)&&(!this.connectionOrConnectionV2 .isEmpty())) {
                List<Object> sourceConnectionOrConnectionV2;
                sourceConnectionOrConnectionV2 = (((this.connectionOrConnectionV2 != null)&&(!this.connectionOrConnectionV2 .isEmpty()))?this.getConnectionOrConnectionV2():null);
                @SuppressWarnings("unchecked")
                List<Object> copyConnectionOrConnectionV2 = ((List<Object> ) strategy.copy(LocatorUtils.property(locator, "connectionOrConnectionV2", sourceConnectionOrConnectionV2), sourceConnectionOrConnectionV2));
                copy.connectionOrConnectionV2 = null;
                if (copyConnectionOrConnectionV2 != null) {
                    List<Object> uniqueConnectionOrConnectionV2l = copy.getConnectionOrConnectionV2();
                    uniqueConnectionOrConnectionV2l.addAll(copyConnectionOrConnectionV2);
                }
            } else {
                copy.connectionOrConnectionV2 = null;
            }
        }
        return draftCopy;
    }

    public Object createNewInstance() {
        return new Connectivity();
    }

}
