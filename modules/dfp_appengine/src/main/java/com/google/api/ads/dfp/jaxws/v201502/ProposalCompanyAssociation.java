
package com.google.api.ads.dfp.jaxws.v201502;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code ProposalCompanyAssociation} represents a {@link Company} associated with the
 *             {@link Proposal} and a set of {@link Contact} objects belonging to the company.
 *           
 * 
 * <p>Java class for ProposalCompanyAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProposalCompanyAssociation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="companyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="type" type="{https://www.google.com/apis/ads/publisher/v201502}ProposalCompanyAssociationType" minOccurs="0"/>
 *         &lt;element name="contactIds" type="{http://www.w3.org/2001/XMLSchema}long" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProposalCompanyAssociation", propOrder = {
    "companyId",
    "type",
    "contactIds"
})
public class ProposalCompanyAssociation {

    protected Long companyId;
    protected ProposalCompanyAssociationType type;
    @XmlElement(type = Long.class)
    protected List<Long> contactIds;

    /**
     * Gets the value of the companyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCompanyId() {
        return companyId;
    }

    /**
     * Sets the value of the companyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCompanyId(Long value) {
        this.companyId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ProposalCompanyAssociationType }
     *     
     */
    public ProposalCompanyAssociationType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProposalCompanyAssociationType }
     *     
     */
    public void setType(ProposalCompanyAssociationType value) {
        this.type = value;
    }

    /**
     * Gets the value of the contactIds property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactIds property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactIds().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Long }
     * 
     * 
     */
    public List<Long> getContactIds() {
        if (contactIds == null) {
            contactIds = new ArrayList<Long>();
        }
        return this.contactIds;
    }

}
