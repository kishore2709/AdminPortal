// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="opcontemp_opcon_rel")
public class OpcontempOpconRel implements Serializable {

    /** Primary key. */
    protected static final String PK = "OpcontempOpconRelPrimary";

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

    @Column(name="Default_Flag", nullable=false, length=1)
    private String defaultFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="opcontempOpconRel")
    private Set<OpconDefoverrideRel> opconDefoverrideRel;
    @OneToMany(mappedBy="opcontempOpconRel2")
    private Set<OpconDefoverrideRel> opconDefoverrideRel2;
    @ManyToOne(optional=false)
    @JoinColumn(name="OpCon_UID", nullable=false)
    private OperatingConditions operatingConditions;
    @ManyToOne(optional=false)
    @JoinColumn(name="OpConTemplate_UID", nullable=false)
    private OpconTemplates opconTemplates;

    /** Default constructor. */
    public OpcontempOpconRel() {
        super();
    }

    /**
     * Access method for defaultFlag.
     *
     * @return the current value of defaultFlag
     */
    public String getDefaultFlag() {
        return defaultFlag;
    }

    /**
     * Setter method for defaultFlag.
     *
     * @param aDefaultFlag the new value for defaultFlag
     */
    public void setDefaultFlag(String aDefaultFlag) {
        defaultFlag = aDefaultFlag;
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
     * Access method for opconDefoverrideRel.
     *
     * @return the current value of opconDefoverrideRel
     */
    public Set<OpconDefoverrideRel> getOpconDefoverrideRel() {
        return opconDefoverrideRel;
    }

    /**
     * Setter method for opconDefoverrideRel.
     *
     * @param aOpconDefoverrideRel the new value for opconDefoverrideRel
     */
    public void setOpconDefoverrideRel(Set<OpconDefoverrideRel> aOpconDefoverrideRel) {
        opconDefoverrideRel = aOpconDefoverrideRel;
    }

    /**
     * Access method for opconDefoverrideRel2.
     *
     * @return the current value of opconDefoverrideRel2
     */
    public Set<OpconDefoverrideRel> getOpconDefoverrideRel2() {
        return opconDefoverrideRel2;
    }

    /**
     * Setter method for opconDefoverrideRel2.
     *
     * @param aOpconDefoverrideRel2 the new value for opconDefoverrideRel2
     */
    public void setOpconDefoverrideRel2(Set<OpconDefoverrideRel> aOpconDefoverrideRel2) {
        opconDefoverrideRel2 = aOpconDefoverrideRel2;
    }

    /**
     * Access method for operatingConditions.
     *
     * @return the current value of operatingConditions
     */
    public OperatingConditions getOperatingConditions() {
        return operatingConditions;
    }

    /**
     * Setter method for operatingConditions.
     *
     * @param aOperatingConditions the new value for operatingConditions
     */
    public void setOperatingConditions(OperatingConditions aOperatingConditions) {
        operatingConditions = aOperatingConditions;
    }

    /**
     * Access method for opconTemplates.
     *
     * @return the current value of opconTemplates
     */
    public OpconTemplates getOpconTemplates() {
        return opconTemplates;
    }

    /**
     * Setter method for opconTemplates.
     *
     * @param aOpconTemplates the new value for opconTemplates
     */
    public void setOpconTemplates(OpconTemplates aOpconTemplates) {
        opconTemplates = aOpconTemplates;
    }

    /** Temporary value holder for group key fragment opconTemplatesOpConTemplateUid */
    private transient int tempOpconTemplatesOpConTemplateUid;

    /**
     * Gets the key fragment opConTemplateUid for member opconTemplates.
     * If this.opconTemplates is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setOpconTemplatesOpConTemplateUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see OpconTemplates
     */
    public int getOpconTemplatesOpConTemplateUid() {
        return (getOpconTemplates() == null ? tempOpconTemplatesOpConTemplateUid : getOpconTemplates().getOpConTemplateUid());
    }

    /**
     * Sets the key fragment opConTemplateUid from member opconTemplates.
     * If this.opconTemplates is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getOpconTemplatesOpConTemplateUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aOpConTemplateUid New value for the key fragment
     * @see OpconTemplates
     */
    public void setOpconTemplatesOpConTemplateUid(int aOpConTemplateUid) {
        if (getOpconTemplates() == null) {
            tempOpconTemplatesOpConTemplateUid = aOpConTemplateUid;
        } else {
            getOpconTemplates().setOpConTemplateUid(aOpConTemplateUid);
        }
    }

    /**
     * Compares the key for this instance with another OpcontempOpconRel.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OpcontempOpconRel and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OpcontempOpconRel)) {
            return false;
        }
        OpcontempOpconRel that = (OpcontempOpconRel) other;
        if (this.getOpconTemplatesOpConTemplateUid() != that.getOpconTemplatesOpConTemplateUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OpcontempOpconRel.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OpcontempOpconRel)) return false;
        return this.equalKeys(other) && ((OpcontempOpconRel)other).equalKeys(this);
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
        i = getOpconTemplatesOpConTemplateUid();
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
        StringBuffer sb = new StringBuffer("[OpcontempOpconRel |");
        sb.append(" opconTemplatesOpConTemplateUid=").append(getOpconTemplatesOpConTemplateUid());
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
        ret.put("opconTemplatesOpConTemplateUid", Integer.valueOf(getOpconTemplatesOpConTemplateUid()));
        return ret;
    }

}
