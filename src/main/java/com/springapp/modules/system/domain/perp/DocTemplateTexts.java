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

@Entity(name="doc_template_texts")
public class DocTemplateTexts implements Serializable {

    /** Primary key. */
    protected static final String PK = "docTemplateTextUid";

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
    @Column(name="DocTemplateText_UID", unique=true, nullable=false, precision=10)
    private int docTemplateTextUid;
    @Column(name="Name", nullable=false, length=128)
    private String name;
    @Column(name="Text_Area", nullable=false)
    private String textArea;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="docTemplateTexts")
    private Set<DocTemplateLookup> docTemplateLookup;
    @OneToMany(mappedBy="docTemplateTexts2")
    private Set<DocTemplateLookup> docTemplateLookup2;
    @OneToMany(mappedBy="docTemplateTexts3")
    private Set<DocTemplateLookup> docTemplateLookup3;
    @OneToMany(mappedBy="docTemplateTexts4")
    private Set<DocTemplateLookup> docTemplateLookup4;
    @OneToMany(mappedBy="docTemplateTexts5")
    private Set<DocTemplateLookup> docTemplateLookup5;
    @ManyToOne(optional=false)
    @JoinColumn(name="TextArea_UID", nullable=false)
    private TemplateTextAreas templateTextAreas;

    /** Default constructor. */
    public DocTemplateTexts() {
        super();
    }

    /**
     * Access method for docTemplateTextUid.
     *
     * @return the current value of docTemplateTextUid
     */
    public int getDocTemplateTextUid() {
        return docTemplateTextUid;
    }

    /**
     * Setter method for docTemplateTextUid.
     *
     * @param aDocTemplateTextUid the new value for docTemplateTextUid
     */
    public void setDocTemplateTextUid(int aDocTemplateTextUid) {
        docTemplateTextUid = aDocTemplateTextUid;
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
     * Access method for textArea.
     *
     * @return the current value of textArea
     */
    public String getTextArea() {
        return textArea;
    }

    /**
     * Setter method for textArea.
     *
     * @param aTextArea the new value for textArea
     */
    public void setTextArea(String aTextArea) {
        textArea = aTextArea;
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
     * Access method for docTemplateLookup.
     *
     * @return the current value of docTemplateLookup
     */
    public Set<DocTemplateLookup> getDocTemplateLookup() {
        return docTemplateLookup;
    }

    /**
     * Setter method for docTemplateLookup.
     *
     * @param aDocTemplateLookup the new value for docTemplateLookup
     */
    public void setDocTemplateLookup(Set<DocTemplateLookup> aDocTemplateLookup) {
        docTemplateLookup = aDocTemplateLookup;
    }

    /**
     * Access method for docTemplateLookup2.
     *
     * @return the current value of docTemplateLookup2
     */
    public Set<DocTemplateLookup> getDocTemplateLookup2() {
        return docTemplateLookup2;
    }

    /**
     * Setter method for docTemplateLookup2.
     *
     * @param aDocTemplateLookup2 the new value for docTemplateLookup2
     */
    public void setDocTemplateLookup2(Set<DocTemplateLookup> aDocTemplateLookup2) {
        docTemplateLookup2 = aDocTemplateLookup2;
    }

    /**
     * Access method for docTemplateLookup3.
     *
     * @return the current value of docTemplateLookup3
     */
    public Set<DocTemplateLookup> getDocTemplateLookup3() {
        return docTemplateLookup3;
    }

    /**
     * Setter method for docTemplateLookup3.
     *
     * @param aDocTemplateLookup3 the new value for docTemplateLookup3
     */
    public void setDocTemplateLookup3(Set<DocTemplateLookup> aDocTemplateLookup3) {
        docTemplateLookup3 = aDocTemplateLookup3;
    }

    /**
     * Access method for docTemplateLookup4.
     *
     * @return the current value of docTemplateLookup4
     */
    public Set<DocTemplateLookup> getDocTemplateLookup4() {
        return docTemplateLookup4;
    }

    /**
     * Setter method for docTemplateLookup4.
     *
     * @param aDocTemplateLookup4 the new value for docTemplateLookup4
     */
    public void setDocTemplateLookup4(Set<DocTemplateLookup> aDocTemplateLookup4) {
        docTemplateLookup4 = aDocTemplateLookup4;
    }

    /**
     * Access method for docTemplateLookup5.
     *
     * @return the current value of docTemplateLookup5
     */
    public Set<DocTemplateLookup> getDocTemplateLookup5() {
        return docTemplateLookup5;
    }

    /**
     * Setter method for docTemplateLookup5.
     *
     * @param aDocTemplateLookup5 the new value for docTemplateLookup5
     */
    public void setDocTemplateLookup5(Set<DocTemplateLookup> aDocTemplateLookup5) {
        docTemplateLookup5 = aDocTemplateLookup5;
    }

    /**
     * Access method for templateTextAreas.
     *
     * @return the current value of templateTextAreas
     */
    public TemplateTextAreas getTemplateTextAreas() {
        return templateTextAreas;
    }

    /**
     * Setter method for templateTextAreas.
     *
     * @param aTemplateTextAreas the new value for templateTextAreas
     */
    public void setTemplateTextAreas(TemplateTextAreas aTemplateTextAreas) {
        templateTextAreas = aTemplateTextAreas;
    }

    /**
     * Compares the key for this instance with another DocTemplateTexts.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class DocTemplateTexts and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof DocTemplateTexts)) {
            return false;
        }
        DocTemplateTexts that = (DocTemplateTexts) other;
        if (this.getDocTemplateTextUid() != that.getDocTemplateTextUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another DocTemplateTexts.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof DocTemplateTexts)) return false;
        return this.equalKeys(other) && ((DocTemplateTexts)other).equalKeys(this);
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
        i = getDocTemplateTextUid();
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
        StringBuffer sb = new StringBuffer("[DocTemplateTexts |");
        sb.append(" docTemplateTextUid=").append(getDocTemplateTextUid());
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
        ret.put("docTemplateTextUid", Integer.valueOf(getDocTemplateTextUid()));
        return ret;
    }

}
