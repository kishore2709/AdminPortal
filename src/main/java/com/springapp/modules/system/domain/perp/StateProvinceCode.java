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

@Entity(name="state_province_code")
public class StateProvinceCode implements Serializable {

    /** Primary key. */
    protected static final String PK = "stateProvinceUid";

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
    @Column(name="State_Province_UID", unique=true, nullable=false, precision=10)
    private int stateProvinceUid;
    @Column(name="Name", nullable=false, length=60)
    private String name;
    @Column(name="Short_Name", length=10)
    private String shortName;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Country_Code_UID", nullable=false)
    private CountryCode countryCode;
    @OneToMany(mappedBy="stateProvinceCode")
    private Set<Address> address;
    @OneToMany(mappedBy="stateProvinceCode")
    private Set<Vehicle> vehicle;

    /** Default constructor. */
    public StateProvinceCode() {
        super();
    }

    /**
     * Access method for stateProvinceUid.
     *
     * @return the current value of stateProvinceUid
     */
    public int getStateProvinceUid() {
        return stateProvinceUid;
    }

    /**
     * Setter method for stateProvinceUid.
     *
     * @param aStateProvinceUid the new value for stateProvinceUid
     */
    public void setStateProvinceUid(int aStateProvinceUid) {
        stateProvinceUid = aStateProvinceUid;
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
     * Access method for shortName.
     *
     * @return the current value of shortName
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Setter method for shortName.
     *
     * @param aShortName the new value for shortName
     */
    public void setShortName(String aShortName) {
        shortName = aShortName;
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
     * Access method for countryCode.
     *
     * @return the current value of countryCode
     */
    public CountryCode getCountryCode() {
        return countryCode;
    }

    /**
     * Setter method for countryCode.
     *
     * @param aCountryCode the new value for countryCode
     */
    public void setCountryCode(CountryCode aCountryCode) {
        countryCode = aCountryCode;
    }

    /**
     * Access method for address.
     *
     * @return the current value of address
     */
    public Set<Address> getAddress() {
        return address;
    }

    /**
     * Setter method for address.
     *
     * @param aAddress the new value for address
     */
    public void setAddress(Set<Address> aAddress) {
        address = aAddress;
    }

    /**
     * Access method for vehicle.
     *
     * @return the current value of vehicle
     */
    public Set<Vehicle> getVehicle() {
        return vehicle;
    }

    /**
     * Setter method for vehicle.
     *
     * @param aVehicle the new value for vehicle
     */
    public void setVehicle(Set<Vehicle> aVehicle) {
        vehicle = aVehicle;
    }

    /**
     * Compares the key for this instance with another StateProvinceCode.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StateProvinceCode and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StateProvinceCode)) {
            return false;
        }
        StateProvinceCode that = (StateProvinceCode) other;
        if (this.getStateProvinceUid() != that.getStateProvinceUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StateProvinceCode.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StateProvinceCode)) return false;
        return this.equalKeys(other) && ((StateProvinceCode)other).equalKeys(this);
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
        i = getStateProvinceUid();
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
        StringBuffer sb = new StringBuffer("[StateProvinceCode |");
        sb.append(" stateProvinceUid=").append(getStateProvinceUid());
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
        ret.put("stateProvinceUid", Integer.valueOf(getStateProvinceUid()));
        return ret;
    }

}
