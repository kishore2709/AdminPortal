// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="opcon_defoverride_rel")
public class OpconDefoverrideRel implements Serializable {

    /** Primary key. */
    protected static final String PK = "OpconDefoverrideRelPrimary";

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

    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Date createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="opConInput_Relation_UID", nullable=false)
    private OpconinputLookup opconinputLookup;
    @ManyToOne(optional=false)
    @JoinColumn(name="OpCon_UID", nullable=false)
    private OpcontempOpconRel opcontempOpconRel;
    @ManyToOne(optional=false)
    @JoinColumn(name="OpConTemplate_UID", nullable=false)
    private OpcontempOpconRel opcontempOpconRel2;

    /** Default constructor. */
    public OpconDefoverrideRel() {
        super();
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
    public Date getCreateModifiedDate() {
        return createModifiedDate;
    }

    /**
     * Setter method for createModifiedDate.
     *
     * @param aCreateModifiedDate the new value for createModifiedDate
     */
    public void setCreateModifiedDate(Date aCreateModifiedDate) {
        createModifiedDate = aCreateModifiedDate;
    }

    /**
     * Access method for opconinputLookup.
     *
     * @return the current value of opconinputLookup
     */
    public OpconinputLookup getOpconinputLookup() {
        return opconinputLookup;
    }

    /**
     * Setter method for opconinputLookup.
     *
     * @param aOpconinputLookup the new value for opconinputLookup
     */
    public void setOpconinputLookup(OpconinputLookup aOpconinputLookup) {
        opconinputLookup = aOpconinputLookup;
    }

    /**
     * Access method for opcontempOpconRel.
     *
     * @return the current value of opcontempOpconRel
     */
    public OpcontempOpconRel getOpcontempOpconRel() {
        return opcontempOpconRel;
    }

    /**
     * Setter method for opcontempOpconRel.
     *
     * @param aOpcontempOpconRel the new value for opcontempOpconRel
     */
    public void setOpcontempOpconRel(OpcontempOpconRel aOpcontempOpconRel) {
        opcontempOpconRel = aOpcontempOpconRel;
    }

    /**
     * Access method for opcontempOpconRel2.
     *
     * @return the current value of opcontempOpconRel2
     */
    public OpcontempOpconRel getOpcontempOpconRel2() {
        return opcontempOpconRel2;
    }

    /**
     * Setter method for opcontempOpconRel2.
     *
     * @param aOpcontempOpconRel2 the new value for opcontempOpconRel2
     */
    public void setOpcontempOpconRel2(OpcontempOpconRel aOpcontempOpconRel2) {
        opcontempOpconRel2 = aOpcontempOpconRel2;
    }

    /** Temporary value holder for group key fragment opcontempOpconRelOpconTemplatesOpConTemplateUid */
    private transient int tempOpcontempOpconRelOpconTemplatesOpConTemplateUid;

    /**
     * Gets the key fragment opConTemplateUid for member opcontempOpconRel.
     * If this.opcontempOpconRel is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setOpcontempOpconRelOpconTemplatesOpConTemplateUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see OpconTemplates
     */
    public int getOpcontempOpconRelOpconTemplatesOpConTemplateUid() {
        return (getOpcontempOpconRel() == null ? tempOpcontempOpconRelOpconTemplatesOpConTemplateUid : getOpcontempOpconRel().getOpconTemplatesOpConTemplateUid());
    }

    /**
     * Sets the key fragment opConTemplateUid from member opcontempOpconRel.
     * If this.opcontempOpconRel is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getOpcontempOpconRelOpconTemplatesOpConTemplateUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aOpConTemplateUid New value for the key fragment
     * @see OpconTemplates
     */
    public void setOpcontempOpconRelOpconTemplatesOpConTemplateUid(int aOpConTemplateUid) {
        if (getOpcontempOpconRel() == null) {
            tempOpcontempOpconRelOpconTemplatesOpConTemplateUid = aOpConTemplateUid;
        } else {
            getOpcontempOpconRel().setOpconTemplatesOpConTemplateUid(aOpConTemplateUid);
        }
    }

    /** Temporary value holder for group key fragment opconinputLookupOpConInputRelationUid */
    private transient int tempOpconinputLookupOpConInputRelationUid;

    /**
     * Gets the key fragment opConInputRelationUid for member opconinputLookup.
     * If this.opconinputLookup is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setOpconinputLookupOpConInputRelationUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see OpconinputLookup
     */
    public int getOpconinputLookupOpConInputRelationUid() {
        return (getOpconinputLookup() == null ? tempOpconinputLookupOpConInputRelationUid : getOpconinputLookup().getOpConInputRelationUid());
    }

    /**
     * Sets the key fragment opConInputRelationUid from member opconinputLookup.
     * If this.opconinputLookup is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getOpconinputLookupOpConInputRelationUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aOpConInputRelationUid New value for the key fragment
     * @see OpconinputLookup
     */
    public void setOpconinputLookupOpConInputRelationUid(int aOpConInputRelationUid) {
        if (getOpconinputLookup() == null) {
            tempOpconinputLookupOpConInputRelationUid = aOpConInputRelationUid;
        } else {
            getOpconinputLookup().setOpConInputRelationUid(aOpConInputRelationUid);
        }
    }

    /**
     * Compares the key for this instance with another OpconDefoverrideRel.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OpconDefoverrideRel and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OpconDefoverrideRel)) {
            return false;
        }
        OpconDefoverrideRel that = (OpconDefoverrideRel) other;
        if (this.getOpcontempOpconRelOpconTemplatesOpConTemplateUid() != that.getOpcontempOpconRelOpconTemplatesOpConTemplateUid()) {
            return false;
        }
        if (this.getOpconinputLookupOpConInputRelationUid() != that.getOpconinputLookupOpConInputRelationUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OpconDefoverrideRel.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OpconDefoverrideRel)) return false;
        return this.equalKeys(other) && ((OpconDefoverrideRel)other).equalKeys(this);
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
        i = getOpcontempOpconRelOpconTemplatesOpConTemplateUid();
        result = 37*result + i;
        i = getOpconinputLookupOpConInputRelationUid();
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
        StringBuffer sb = new StringBuffer("[OpconDefoverrideRel |");
        sb.append(" opcontempOpconRelOpconTemplatesOpConTemplateUid=").append(getOpcontempOpconRelOpconTemplatesOpConTemplateUid());
        sb.append(" opconinputLookupOpConInputRelationUid=").append(getOpconinputLookupOpConInputRelationUid());
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
        ret.put("opcontempOpconRelOpconTemplatesOpConTemplateUid", Integer.valueOf(getOpcontempOpconRelOpconTemplatesOpConTemplateUid()));
        ret.put("opconinputLookupOpConInputRelationUid", Integer.valueOf(getOpconinputLookupOpConInputRelationUid()));
        return ret;
    }

}
