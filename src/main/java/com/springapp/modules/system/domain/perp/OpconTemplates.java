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
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="opcon_templates")
public class OpconTemplates implements Serializable {

    /** Primary key. */
    protected static final String PK = "opConTemplateUid";

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
    @Column(name="OpConTemplate_UID", unique=true, nullable=false, precision=10)
    private int opConTemplateUid;
    @Column(name="Template_Name", nullable=false, length=45)
    private String templateName;
    @Column(name="Description", nullable=false, length=256)
    private String description;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="opconTemplates")
    private Set<OpcontempOpconRel> opcontempOpconRel;

    /** Default constructor. */
    public OpconTemplates() {
        super();
    }

    /**
     * Access method for opConTemplateUid.
     *
     * @return the current value of opConTemplateUid
     */
    public int getOpConTemplateUid() {
        return opConTemplateUid;
    }

    /**
     * Setter method for opConTemplateUid.
     *
     * @param aOpConTemplateUid the new value for opConTemplateUid
     */
    public void setOpConTemplateUid(int aOpConTemplateUid) {
        opConTemplateUid = aOpConTemplateUid;
    }

    /**
     * Access method for templateName.
     *
     * @return the current value of templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * Setter method for templateName.
     *
     * @param aTemplateName the new value for templateName
     */
    public void setTemplateName(String aTemplateName) {
        templateName = aTemplateName;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
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
     * Access method for opcontempOpconRel.
     *
     * @return the current value of opcontempOpconRel
     */
    public Set<OpcontempOpconRel> getOpcontempOpconRel() {
        return opcontempOpconRel;
    }

    /**
     * Setter method for opcontempOpconRel.
     *
     * @param aOpcontempOpconRel the new value for opcontempOpconRel
     */
    public void setOpcontempOpconRel(Set<OpcontempOpconRel> aOpcontempOpconRel) {
        opcontempOpconRel = aOpcontempOpconRel;
    }

    /**
     * Compares the key for this instance with another OpconTemplates.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OpconTemplates and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OpconTemplates)) {
            return false;
        }
        OpconTemplates that = (OpconTemplates) other;
        if (this.getOpConTemplateUid() != that.getOpConTemplateUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OpconTemplates.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OpconTemplates)) return false;
        return this.equalKeys(other) && ((OpconTemplates)other).equalKeys(this);
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
        i = getOpConTemplateUid();
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
        StringBuffer sb = new StringBuffer("[OpconTemplates |");
        sb.append(" opConTemplateUid=").append(getOpConTemplateUid());
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
        ret.put("opConTemplateUid", Integer.valueOf(getOpConTemplateUid()));
        return ret;
    }

}
