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

@Entity(name="country_code")
public class CountryCode implements Serializable {

    /** Primary key. */
    protected static final String PK = "countryCodeUid";

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
    @Column(name="Country_Code_UID", unique=true, nullable=false, precision=10)
    private int countryCodeUid;
    @Column(name="Country", nullable=false, length=60)
    private String country;
    @Column(name="Country_Short_Name", length=45)
    private String countryShortName;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="countryCode")
    private Set<Address> address;
    @OneToMany(mappedBy="countryCode")
    private Set<StateProvinceCode> stateProvinceCode;
    @OneToMany(mappedBy="countryCode")
    private Set<Vehicle> vehicle;

    /** Default constructor. */
    public CountryCode() {
        super();
    }

    /**
     * Access method for countryCodeUid.
     *
     * @return the current value of countryCodeUid
     */
    public int getCountryCodeUid() {
        return countryCodeUid;
    }

    /**
     * Setter method for countryCodeUid.
     *
     * @param aCountryCodeUid the new value for countryCodeUid
     */
    public void setCountryCodeUid(int aCountryCodeUid) {
        countryCodeUid = aCountryCodeUid;
    }

    /**
     * Access method for country.
     *
     * @return the current value of country
     */
    public String getCountry() {
        return country;
    }

    /**
     * Setter method for country.
     *
     * @param aCountry the new value for country
     */
    public void setCountry(String aCountry) {
        country = aCountry;
    }

    /**
     * Access method for countryShortName.
     *
     * @return the current value of countryShortName
     */
    public String getCountryShortName() {
        return countryShortName;
    }

    /**
     * Setter method for countryShortName.
     *
     * @param aCountryShortName the new value for countryShortName
     */
    public void setCountryShortName(String aCountryShortName) {
        countryShortName = aCountryShortName;
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
     * Access method for stateProvinceCode.
     *
     * @return the current value of stateProvinceCode
     */
    public Set<StateProvinceCode> getStateProvinceCode() {
        return stateProvinceCode;
    }

    /**
     * Setter method for stateProvinceCode.
     *
     * @param aStateProvinceCode the new value for stateProvinceCode
     */
    public void setStateProvinceCode(Set<StateProvinceCode> aStateProvinceCode) {
        stateProvinceCode = aStateProvinceCode;
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
     * Compares the key for this instance with another CountryCode.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CountryCode and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CountryCode)) {
            return false;
        }
        CountryCode that = (CountryCode) other;
        if (this.getCountryCodeUid() != that.getCountryCodeUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CountryCode.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CountryCode)) return false;
        return this.equalKeys(other) && ((CountryCode)other).equalKeys(this);
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
        i = getCountryCodeUid();
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
        StringBuffer sb = new StringBuffer("[CountryCode |");
        sb.append(" countryCodeUid=").append(getCountryCodeUid());
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
        ret.put("countryCodeUid", Integer.valueOf(getCountryCodeUid()));
        return ret;
    }

}
