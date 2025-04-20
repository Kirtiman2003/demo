
package com.dd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RsconvertResult" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rsconvertResult"
})
@XmlRootElement(name = "RsconvertResponse")
public class RsconvertResponse {

    @XmlElement(name = "RsconvertResult")
    protected double rsconvertResult;

    /**
     * Gets the value of the rsconvertResult property.
     * 
     */
    public double getRsconvertResult() {
        return rsconvertResult;
    }

    /**
     * Sets the value of the rsconvertResult property.
     * 
     */
    public void setRsconvertResult(double value) {
        this.rsconvertResult = value;
    }

}
