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

@Entity(name="fleetsize_lookup")
public class FleetsizeLookup implements Serializable {

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
    @Column(name="Display", nullable=false, length=45)
    private String display;
    @Column(name="Start_Value", nullable=false, length=45)
    private String startValue;
    @Column(name="End_Value", length=45)
    private String endValue;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Active_From", nullable=false)
    private Timestamp activeFrom;
    @Column(name="Active_To")
    private Timestamp activeTo;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="fleetsizeLookup")
    private Set<Company> company;

    /** Default constructor. */
    public FleetsizeLookup() {
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
     * Access method for display.
     *
     * @return the current value of display
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Setter method for display.
     *
     * @param aDisplay the new value for display
     */
    public void setDisplay(String aDisplay) {
        display = aDisplay;
    }

    /**
     * Access method for startValue.
     *
     * @return the current value of startValue
     */
    public String getStartValue() {
        return startValue;
    }

    /**
     * Setter method for startValue.
     *
     * @param aStartValue the new value for startValue
     */
    public void setStartValue(String aStartValue) {
        startValue = aStartValue;
    }

    /**
     * Access method for endValue.
     *
     * @return the current value of endValue
     */
    public String getEndValue() {
        return endValue;
    }

    /**
     * Setter method for endValue.
     *
     * @param aEndValue the new value for endValue
     */
    public void setEndValue(String aEndValue) {
        endValue = aEndValue;
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
     * Access method for activeFrom.
     *
     * @return the current value of activeFrom
     */
    public Timestamp getActiveFrom() {
        return activeFrom;
    }

    /**
     * Setter method for activeFrom.
     *
     * @param aActiveFrom the new value for activeFrom
     */
    public void setActiveFrom(Timestamp aActiveFrom) {
        activeFrom = aActiveFrom;
    }

    /**
     * Access method for activeTo.
     *
     * @return the current value of activeTo
     */
    public Timestamp getActiveTo() {
        return activeTo;
    }

    /**
     * Setter method for activeTo.
     *
     * @param aActiveTo the new value for activeTo
     */
    public void setActiveTo(Timestamp aActiveTo) {
        activeTo = aActiveTo;
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
     * Access method for company.
     *
     * @return the current value of company
     */
    public Set<Company> getCompany() {
        return company;
    }

    /**
     * Setter method for company.
     *
     * @param aCompany the new value for company
     */
    public void setCompany(Set<Company> aCompany) {
        company = aCompany;
    }

    /**
     * Compares the key for this instance with another FleetsizeLookup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class FleetsizeLookup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof FleetsizeLookup)) {
            return false;
        }
        FleetsizeLookup that = (FleetsizeLookup) other;
        if (this.getUid() != that.getUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another FleetsizeLookup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof FleetsizeLookup)) return false;
        return this.equalKeys(other) && ((FleetsizeLookup)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[FleetsizeLookup |");
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
