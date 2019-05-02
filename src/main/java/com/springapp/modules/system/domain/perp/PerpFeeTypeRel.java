// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="perp_fee_type_rel")
public class PerpFeeTypeRel implements Serializable {

    /** Primary key. */
    protected static final String PK = "PerpFeeTypeRelPrimary";

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

    @Column(name="Create_Modified_By", length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date")
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="PerpFeeLookup_UID", nullable=false)
    private PerpFeesLookup perpFeesLookup;
    @ManyToOne(optional=false)
    @JoinColumn(name="RegItemTypes_UID", nullable=false)
    private RegitemTypes regitemTypes;

    /** Default constructor. */
    public PerpFeeTypeRel() {
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
     * Access method for perpFeesLookup.
     *
     * @return the current value of perpFeesLookup
     */
    public PerpFeesLookup getPerpFeesLookup() {
        return perpFeesLookup;
    }

    /**
     * Setter method for perpFeesLookup.
     *
     * @param aPerpFeesLookup the new value for perpFeesLookup
     */
    public void setPerpFeesLookup(PerpFeesLookup aPerpFeesLookup) {
        perpFeesLookup = aPerpFeesLookup;
    }

    /**
     * Access method for regitemTypes.
     *
     * @return the current value of regitemTypes
     */
    public RegitemTypes getRegitemTypes() {
        return regitemTypes;
    }

    /**
     * Setter method for regitemTypes.
     *
     * @param aRegitemTypes the new value for regitemTypes
     */
    public void setRegitemTypes(RegitemTypes aRegitemTypes) {
        regitemTypes = aRegitemTypes;
    }

    /** Temporary value holder for group key fragment regitemTypesUid */
    private transient int tempRegitemTypesUid;

    /**
     * Gets the key fragment uid for member regitemTypes.
     * If this.regitemTypes is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setRegitemTypesUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see RegitemTypes
     */
    public int getRegitemTypesUid() {
        return (getRegitemTypes() == null ? tempRegitemTypesUid : getRegitemTypes().getUid());
    }

    /**
     * Sets the key fragment uid from member regitemTypes.
     * If this.regitemTypes is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getRegitemTypesUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aUid New value for the key fragment
     * @see RegitemTypes
     */
    public void setRegitemTypesUid(int aUid) {
        if (getRegitemTypes() == null) {
            tempRegitemTypesUid = aUid;
        } else {
            getRegitemTypes().setUid(aUid);
        }
    }

    /** Temporary value holder for group key fragment perpFeesLookupPerpFeeLookupUid */
    private transient int tempPerpFeesLookupPerpFeeLookupUid;

    /**
     * Gets the key fragment perpFeeLookupUid for member perpFeesLookup.
     * If this.perpFeesLookup is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setPerpFeesLookupPerpFeeLookupUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see PerpFeesLookup
     */
    public int getPerpFeesLookupPerpFeeLookupUid() {
        return (getPerpFeesLookup() == null ? tempPerpFeesLookupPerpFeeLookupUid : getPerpFeesLookup().getPerpFeeLookupUid());
    }

    /**
     * Sets the key fragment perpFeeLookupUid from member perpFeesLookup.
     * If this.perpFeesLookup is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getPerpFeesLookupPerpFeeLookupUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aPerpFeeLookupUid New value for the key fragment
     * @see PerpFeesLookup
     */
    public void setPerpFeesLookupPerpFeeLookupUid(int aPerpFeeLookupUid) {
        if (getPerpFeesLookup() == null) {
            tempPerpFeesLookupPerpFeeLookupUid = aPerpFeeLookupUid;
        } else {
            getPerpFeesLookup().setPerpFeeLookupUid(aPerpFeeLookupUid);
        }
    }

    /**
     * Compares the key for this instance with another PerpFeeTypeRel.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PerpFeeTypeRel and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PerpFeeTypeRel)) {
            return false;
        }
        PerpFeeTypeRel that = (PerpFeeTypeRel) other;
        if (this.getRegitemTypesUid() != that.getRegitemTypesUid()) {
            return false;
        }
        if (this.getPerpFeesLookupPerpFeeLookupUid() != that.getPerpFeesLookupPerpFeeLookupUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PerpFeeTypeRel.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PerpFeeTypeRel)) return false;
        return this.equalKeys(other) && ((PerpFeeTypeRel)other).equalKeys(this);
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
        i = getRegitemTypesUid();
        result = 37*result + i;
        i = getPerpFeesLookupPerpFeeLookupUid();
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
        StringBuffer sb = new StringBuffer("[PerpFeeTypeRel |");
        sb.append(" regitemTypesUid=").append(getRegitemTypesUid());
        sb.append(" perpFeesLookupPerpFeeLookupUid=").append(getPerpFeesLookupPerpFeeLookupUid());
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
        ret.put("regitemTypesUid", Integer.valueOf(getRegitemTypesUid()));
        ret.put("perpFeesLookupPerpFeeLookupUid", Integer.valueOf(getPerpFeesLookupPerpFeeLookupUid()));
        return ret;
    }

}
