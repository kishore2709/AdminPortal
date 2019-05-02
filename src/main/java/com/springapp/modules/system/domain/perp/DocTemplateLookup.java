// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="doc_template_lookup")
public class DocTemplateLookup implements Serializable {

    /** Primary key. */
    protected static final String PK = "docTemplateUid";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(name="DocTemplate_UID", unique=true, nullable=false, precision=10)
    private int docTemplateUid;
    @Column(name="Name", nullable=false, length=128)
    private String name;
    @Column(name="Header_Text", length=512)
    private String headerText;
    @Column(name="Footer_Text", length=255)
    private String footerText;
    @Column(name="Transaction_Flag", length=1)
    private String transactionFlag;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="docTemplateLookup")
    private Set<DocTemplateActionRelation> docTemplateActionRelation;
    @ManyToOne(optional=false)
    @JoinColumn(name="Area1_UID", nullable=false)
    private DocTemplateTexts docTemplateTexts;
    @ManyToOne
    @JoinColumn(name="Area2_UID")
    private DocTemplateTexts docTemplateTexts2;
    @ManyToOne
    @JoinColumn(name="Area3_UID")
    private DocTemplateTexts docTemplateTexts3;
    @ManyToOne
    @JoinColumn(name="Area4_UID")
    private DocTemplateTexts docTemplateTexts4;
    @ManyToOne
    @JoinColumn(name="Area5_UID")
    private DocTemplateTexts docTemplateTexts5;
    @ManyToOne(optional=false)
    @JoinColumn(name="DocumentType_UID", nullable=false)
    private PerpDocumentTypes perpDocumentTypes;

    /** Default constructor. */
    public DocTemplateLookup() {
        super();
    }

    /**
     * Access method for docTemplateUid.
     *
     * @return the current value of docTemplateUid
     */
    public int getDocTemplateUid() {
        return docTemplateUid;
    }

    /**
     * Setter method for docTemplateUid.
     *
     * @param aDocTemplateUid the new value for docTemplateUid
     */
    public void setDocTemplateUid(int aDocTemplateUid) {
        docTemplateUid = aDocTemplateUid;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for headerText.
     *
     * @return the current value of headerText
     */
    public String getHeaderText() {
        return headerText;
    }

    /**
     * Setter method for headerText.
     *
     * @param aHeaderText the new value for headerText
     */
    public void setHeaderText(String aHeaderText) {
        headerText = aHeaderText;
    }

    /**
     * Access method for footerText.
     *
     * @return the current value of footerText
     */
    public String getFooterText() {
        return footerText;
    }

    /**
     * Setter method for footerText.
     *
     * @param aFooterText the new value for footerText
     */
    public void setFooterText(String aFooterText) {
        footerText = aFooterText;
    }

    /**
     * Access method for transactionFlag.
     *
     * @return the current value of transactionFlag
     */
    public String getTransactionFlag() {
        return transactionFlag;
    }

    /**
     * Setter method for transactionFlag.
     *
     * @param aTransactionFlag the new value for transactionFlag
     */
    public void setTransactionFlag(String aTransactionFlag) {
        transactionFlag = aTransactionFlag;
    }

    /**
     * Access method for activeFlag.
     *
     * @return the current value of activeFlag
     */
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * Setter method for activeFlag.
     *
     * @param aActiveFlag the new value for activeFlag
     */
    public void setActiveFlag(String aActiveFlag) {
        activeFlag = aActiveFlag;
    }

    /**
     * Access method for createModifiedBy.
     *
     * @return the current value of createModifiedBy
     */
    public String getCreateModifiedBy() {
        return createModifiedBy;
    }

    /**
     * Setter method for createModifiedBy.
     *
     * @param aCreateModifiedBy the new value for createModifiedBy
     */
    public void setCreateModifiedBy(String aCreateModifiedBy) {
        createModifiedBy = aCreateModifiedBy;
    }

    /**
     * Access method for createModifiedDate.
     *
     * @return the current value of createModifiedDate
     */
    public Timestamp getCreateModifiedDate() {
        return createModifiedDate;
    }

    /**
     * Setter method for createModifiedDate.
     *
     * @param aCreateModifiedDate the new value for createModifiedDate
     */
    public void setCreateModifiedDate(Timestamp aCreateModifiedDate) {
        createModifiedDate = aCreateModifiedDate;
    }

    /**
     * Access method for docTemplateActionRelation.
     *
     * @return the current value of docTemplateActionRelation
     */
    public Set<DocTemplateActionRelation> getDocTemplateActionRelation() {
        return docTemplateActionRelation;
    }

    /**
     * Setter method for docTemplateActionRelation.
     *
     * @param aDocTemplateActionRelation the new value for docTemplateActionRelation
     */
    public void setDocTemplateActionRelation(Set<DocTemplateActionRelation> aDocTemplateActionRelation) {
        docTemplateActionRelation = aDocTemplateActionRelation;
    }

    /**
     * Access method for docTemplateTexts.
     *
     * @return the current value of docTemplateTexts
     */
    public DocTemplateTexts getDocTemplateTexts() {
        return docTemplateTexts;
    }

    /**
     * Setter method for docTemplateTexts.
     *
     * @param aDocTemplateTexts the new value for docTemplateTexts
     */
    public void setDocTemplateTexts(DocTemplateTexts aDocTemplateTexts) {
        docTemplateTexts = aDocTemplateTexts;
    }

    /**
     * Access method for docTemplateTexts2.
     *
     * @return the current value of docTemplateTexts2
     */
    public DocTemplateTexts getDocTemplateTexts2() {
        return docTemplateTexts2;
    }

    /**
     * Setter method for docTemplateTexts2.
     *
     * @param aDocTemplateTexts2 the new value for docTemplateTexts2
     */
    public void setDocTemplateTexts2(DocTemplateTexts aDocTemplateTexts2) {
        docTemplateTexts2 = aDocTemplateTexts2;
    }

    /**
     * Access method for docTemplateTexts3.
     *
     * @return the current value of docTemplateTexts3
     */
    public DocTemplateTexts getDocTemplateTexts3() {
        return docTemplateTexts3;
    }

    /**
     * Setter method for docTemplateTexts3.
     *
     * @param aDocTemplateTexts3 the new value for docTemplateTexts3
     */
    public void setDocTemplateTexts3(DocTemplateTexts aDocTemplateTexts3) {
        docTemplateTexts3 = aDocTemplateTexts3;
    }

    /**
     * Access method for docTemplateTexts4.
     *
     * @return the current value of docTemplateTexts4
     */
    public DocTemplateTexts getDocTemplateTexts4() {
        return docTemplateTexts4;
    }

    /**
     * Setter method for docTemplateTexts4.
     *
     * @param aDocTemplateTexts4 the new value for docTemplateTexts4
     */
    public void setDocTemplateTexts4(DocTemplateTexts aDocTemplateTexts4) {
        docTemplateTexts4 = aDocTemplateTexts4;
    }

    /**
     * Access method for docTemplateTexts5.
     *
     * @return the current value of docTemplateTexts5
     */
    public DocTemplateTexts getDocTemplateTexts5() {
        return docTemplateTexts5;
    }

    /**
     * Setter method for docTemplateTexts5.
     *
     * @param aDocTemplateTexts5 the new value for docTemplateTexts5
     */
    public void setDocTemplateTexts5(DocTemplateTexts aDocTemplateTexts5) {
        docTemplateTexts5 = aDocTemplateTexts5;
    }

    /**
     * Access method for perpDocumentTypes.
     *
     * @return the current value of perpDocumentTypes
     */
    public PerpDocumentTypes getPerpDocumentTypes() {
        return perpDocumentTypes;
    }

    /**
     * Setter method for perpDocumentTypes.
     *
     * @param aPerpDocumentTypes the new value for perpDocumentTypes
     */
    public void setPerpDocumentTypes(PerpDocumentTypes aPerpDocumentTypes) {
        perpDocumentTypes = aPerpDocumentTypes;
    }

    /**
     * Compares the key for this instance with another DocTemplateLookup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class DocTemplateLookup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof DocTemplateLookup)) {
            return false;
        }
        DocTemplateLookup that = (DocTemplateLookup) other;
        if (this.getDocTemplateUid() != that.getDocTemplateUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another DocTemplateLookup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof DocTemplateLookup)) return false;
        return this.equalKeys(other) && ((DocTemplateLookup)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getDocTemplateUid();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[DocTemplateLookup |");
        sb.append(" docTemplateUid=").append(getDocTemplateUid());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("docTemplateUid", Integer.valueOf(getDocTemplateUid()));
        return ret;
    }

}
