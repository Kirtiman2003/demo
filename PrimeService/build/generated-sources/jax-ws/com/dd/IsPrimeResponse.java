
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
 *         &lt;element name="IsPrimeResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "isPrimeResult"
})
@XmlRootElement(name = "IsPrimeResponse")
public class IsPrimeResponse {

    @XmlElement(name = "IsPrimeResult")
    protected boolean isPrimeResult;

    /**
     * Gets the value of the isPrimeResult property.
     * 
     */
    public boolean isIsPrimeResult() {
        return isPrimeResult;
    }

    /**
     * Sets the value of the isPrimeResult property.
     * 
     */
    public void setIsPrimeResult(boolean value) {
        this.isPrimeResult = value;
    }

}
