//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.01.10 at 07:19:41 PM GMT 
//


package pl.baczkowicz.mqttspy.versions.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jvnet.jaxb2_commons.lang.CopyTo;
import org.jvnet.jaxb2_commons.lang.Copyable;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.builder.CopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBCopyBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBEqualsBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBHashCodeBuilder;
import org.jvnet.jaxb2_commons.lang.builder.JAXBToStringBuilder;


/**
 * <p>Java class for ReleaseStatuses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReleaseStatuses">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReleaseStatus" type="{http://baczkowicz.pl/mqtt-spy-versions}ReleaseStatus" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReleaseStatuses", propOrder = {
    "releaseStatus"
})
public class ReleaseStatuses
    implements CopyTo, Copyable, Equals, HashCode, ToString
{

    @XmlElement(name = "ReleaseStatus", required = true)
    protected List<ReleaseStatus> releaseStatus;

    /**
     * Gets the value of the releaseStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the releaseStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReleaseStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReleaseStatus }
     * 
     * 
     */
    public List<ReleaseStatus> getReleaseStatus() {
        if (releaseStatus == null) {
            releaseStatus = new ArrayList<ReleaseStatus>();
        }
        return this.releaseStatus;
    }

    public void toString(ToStringBuilder toStringBuilder) {
        {
            List<ReleaseStatus> theReleaseStatus;
            theReleaseStatus = this.getReleaseStatus();
            toStringBuilder.append("releaseStatus", theReleaseStatus);
        }
    }

    public String toString() {
        final ToStringBuilder toStringBuilder = new JAXBToStringBuilder(this);
        toString(toStringBuilder);
        return toStringBuilder.toString();
    }

    public void equals(Object object, EqualsBuilder equalsBuilder) {
        if (!(object instanceof ReleaseStatuses)) {
            equalsBuilder.appendSuper(false);
            return ;
        }
        if (this == object) {
            return ;
        }
        final ReleaseStatuses that = ((ReleaseStatuses) object);
        equalsBuilder.append(this.getReleaseStatus(), that.getReleaseStatus());
    }

    public boolean equals(Object object) {
        if (!(object instanceof ReleaseStatuses)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EqualsBuilder equalsBuilder = new JAXBEqualsBuilder();
        equals(object, equalsBuilder);
        return equalsBuilder.isEquals();
    }

    public void hashCode(HashCodeBuilder hashCodeBuilder) {
        hashCodeBuilder.append(this.getReleaseStatus());
    }

    public int hashCode() {
        final HashCodeBuilder hashCodeBuilder = new JAXBHashCodeBuilder();
        hashCode(hashCodeBuilder);
        return hashCodeBuilder.toHashCode();
    }

    public Object copyTo(Object target, CopyBuilder copyBuilder) {
        final ReleaseStatuses copy = ((target == null)?((ReleaseStatuses) createCopy()):((ReleaseStatuses) target));
        {
            List<ReleaseStatus> sourceReleaseStatus;
            sourceReleaseStatus = this.getReleaseStatus();
            List<ReleaseStatus> copyReleaseStatus = ((List<ReleaseStatus> ) copyBuilder.copy(sourceReleaseStatus));
            copy.releaseStatus = null;
            List<ReleaseStatus> uniqueReleaseStatusl = copy.getReleaseStatus();
            uniqueReleaseStatusl.addAll(copyReleaseStatus);
        }
        return copy;
    }

    public Object copyTo(Object target) {
        final CopyBuilder copyBuilder = new JAXBCopyBuilder();
        return copyTo(target, copyBuilder);
    }

    public Object createCopy() {
        return new ReleaseStatuses();
    }

}
