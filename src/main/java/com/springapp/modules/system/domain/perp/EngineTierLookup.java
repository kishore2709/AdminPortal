// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="engine_tier_lookup")
public class EngineTierLookup implements Serializable {

    /** Primary key. */
    protected static final String PK = "uid";

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
    @Column(name="UID", unique=true, nullable=false, precision=10)
    private int uid;
    @Column(name="Start_Model_Year")
    private Date startModelYear;
    @Column(name="End_Model_Year")
    private Date endModelYear;
    @Column(name="Identifier", nullable=false, length=45)
    private String identifier;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="BrakeHP_UID", nullable=false)
    private BrakeHpRanges brakeHpRanges;
    @ManyToOne
    @JoinColumn(name="Tiers_UID")
    private Tiers tiers;

    /** Default constructor. */
    public EngineTierLookup() {
        super();
    }

    /**
     * Access method for uid.
     *
     * @return the current value of uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * Setter method for uid.
     *
     * @param aUid the new value for uid
     */
    public void setUid(int aUid) {
        uid = aUid;
    }

    /**
     * Access method for startModelYear.
     *
     * @return the current value of startModelYear
     */
    public Date getStartModelYear() {
        return startModelYear;
    }

    /**
     * Setter method for startModelYear.
     *
     * @param aStartModelYear the new value for startModelYear
     */
    public void setStartModelYear(Date aStartModelYear) {
        startModelYear = aStartModelYear;
    }

    /**
     * Access method for endModelYear.
     *
     * @return the current value of endModelYear
     */
    public Date getEndModelYear() {
        return endModelYear;
    }

    /**
     * Setter method for endModelYear.
     *
     * @param aEndModelYear the new value for endModelYear
     */
    public void setEndModelYear(Date aEndModelYear) {
        endModelYear = aEndModelYear;
    }

    /**
     * Access method for identifier.
     *
     * @return the current value of identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Setter method for identifier.
     *
     * @param aIdentifier the new value for identifier
     */
    public void setIdentifier(String aIdentifier) {
        identifier = aIdentifier;
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
     * Access method for brakeHpRanges.
     *
     * @return the current value of brakeHpRanges
     */
    public BrakeHpRanges getBrakeHpRanges() {
        return brakeHpRanges;
    }

    /**
     * Setter method for brakeHpRanges.
     *
     * @param aBrakeHpRanges the new value for brakeHpRanges
     */
    public void setBrakeHpRanges(BrakeHpRanges aBrakeHpRanges) {
        brakeHpRanges = aBrakeHpRanges;
    }

    /**
     * Access method for tiers.
     *
     * @return the current value of tiers
     */
    public Tiers getTiers() {
        return tiers;
    }

    /**
     * Setter method for tiers.
     *
     * @param aTiers the new value for tiers
     */
    public void setTiers(Tiers aTiers) {
        tiers = aTiers;
    }

    /**
     * Compares the key for this instance with another EngineTierLookup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EngineTierLookup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EngineTierLookup)) {
            return false;
        }
        EngineTierLookup that = (EngineTierLookup) other;
        if (this.getUid() != that.getUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EngineTierLookup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EngineTierLookup)) return false;
        return this.equalKeys(other) && ((EngineTierLookup)other).equalKeys(this);
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
        i = getUid();
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
        StringBuffer sb = new StringBuffer("[EngineTierLookup |");
        sb.append(" uid=").append(getUid());
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
        ret.put("uid", Integer.valueOf(getUid()));
        return ret;
    }

}
