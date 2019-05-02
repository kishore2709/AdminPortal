// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="address_aud")
public class AddressAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "addressAudUid";

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
    @Column(name="Address_Aud_UID", unique=true, nullable=false, precision=10)
    private int addressAudUid;
    @Column(name="Address_UID", nullable=false, precision=10)
    private int addressUid;
    @Column(name="Address_Type_UID", nullable=false, precision=10)
    private int addressTypeUid;
    @Column(name="State_Province_UID", nullable=false, precision=10)
    private int stateProvinceUid;
    @Column(name="Country_Code_UID", nullable=false, precision=10)
    private int countryCodeUid;
    @Column(name="Users_UID", precision=10)
    private int usersUid;
    @Column(name="Terminal_UID", precision=10)
    private int terminalUid;
    @Column(name="Company_UID", precision=10)
    private int companyUid;
    @Column(name="Contact_UID", precision=10)
    private int contactUid;
    @Column(name="Address1", nullable=false, length=128)
    private String address1;
    @Column(name="Address2", length=128)
    private String address2;
    @Column(name="City", nullable=false, length=45)
    private String city;
    @Column(name="County", length=45)
    private String county;
    @Column(name="Zip_Code", length=15)
    private String zipCode;
    @Column(name="Validation_Status", length=45)
    private String validationStatus;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;
    @Column(name="District_UID", precision=10)
    private int districtUid;

    /** Default constructor. */
    public AddressAud() {
        super();
    }

    /**
     * Access method for addressAudUid.
     *
     * @return the current value of addressAudUid
     */
    public int getAddressAudUid() {
        return addressAudUid;
    }

    /**
     * Setter method for addressAudUid.
     *
     * @param aAddressAudUid the new value for addressAudUid
     */
    public void setAddressAudUid(int aAddressAudUid) {
        addressAudUid = aAddressAudUid;
    }

    /**
     * Access method for addressUid.
     *
     * @return the current value of addressUid
     */
    public int getAddressUid() {
        return addressUid;
    }

    /**
     * Setter method for addressUid.
     *
     * @param aAddressUid the new value for addressUid
     */
    public void setAddressUid(int aAddressUid) {
        addressUid = aAddressUid;
    }

    /**
     * Access method for addressTypeUid.
     *
     * @return the current value of addressTypeUid
     */
    public int getAddressTypeUid() {
        return addressTypeUid;
    }

    /**
     * Setter method for addressTypeUid.
     *
     * @param aAddressTypeUid the new value for addressTypeUid
     */
    public void setAddressTypeUid(int aAddressTypeUid) {
        addressTypeUid = aAddressTypeUid;
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
     * Access method for usersUid.
     *
     * @return the current value of usersUid
     */
    public int getUsersUid() {
        return usersUid;
    }

    /**
     * Setter method for usersUid.
     *
     * @param aUsersUid the new value for usersUid
     */
    public void setUsersUid(int aUsersUid) {
        usersUid = aUsersUid;
    }

    /**
     * Access method for terminalUid.
     *
     * @return the current value of terminalUid
     */
    public int getTerminalUid() {
        return terminalUid;
    }

    /**
     * Setter method for terminalUid.
     *
     * @param aTerminalUid the new value for terminalUid
     */
    public void setTerminalUid(int aTerminalUid) {
        terminalUid = aTerminalUid;
    }

    /**
     * Access method for companyUid.
     *
     * @return the current value of companyUid
     */
    public int getCompanyUid() {
        return companyUid;
    }

    /**
     * Setter method for companyUid.
     *
     * @param aCompanyUid the new value for companyUid
     */
    public void setCompanyUid(int aCompanyUid) {
        companyUid = aCompanyUid;
    }

    /**
     * Access method for contactUid.
     *
     * @return the current value of contactUid
     */
    public int getContactUid() {
        return contactUid;
    }

    /**
     * Setter method for contactUid.
     *
     * @param aContactUid the new value for contactUid
     */
    public void setContactUid(int aContactUid) {
        contactUid = aContactUid;
    }

    /**
     * Access method for address1.
     *
     * @return the current value of address1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Setter method for address1.
     *
     * @param aAddress1 the new value for address1
     */
    public void setAddress1(String aAddress1) {
        address1 = aAddress1;
    }

    /**
     * Access method for address2.
     *
     * @return the current value of address2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Setter method for address2.
     *
     * @param aAddress2 the new value for address2
     */
    public void setAddress2(String aAddress2) {
        address2 = aAddress2;
    }

    /**
     * Access method for city.
     *
     * @return the current value of city
     */
    public String getCity() {
        return city;
    }

    /**
     * Setter method for city.
     *
     * @param aCity the new value for city
     */
    public void setCity(String aCity) {
        city = aCity;
    }

    /**
     * Access method for county.
     *
     * @return the current value of county
     */
    public String getCounty() {
        return county;
    }

    /**
     * Setter method for county.
     *
     * @param aCounty the new value for county
     */
    public void setCounty(String aCounty) {
        county = aCounty;
    }

    /**
     * Access method for zipCode.
     *
     * @return the current value of zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * Setter method for zipCode.
     *
     * @param aZipCode the new value for zipCode
     */
    public void setZipCode(String aZipCode) {
        zipCode = aZipCode;
    }

    /**
     * Access method for validationStatus.
     *
     * @return the current value of validationStatus
     */
    public String getValidationStatus() {
        return validationStatus;
    }

    /**
     * Setter method for validationStatus.
     *
     * @param aValidationStatus the new value for validationStatus
     */
    public void setValidationStatus(String aValidationStatus) {
        validationStatus = aValidationStatus;
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
     * Access method for operation.
     *
     * @return the current value of operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Setter method for operation.
     *
     * @param aOperation the new value for operation
     */
    public void setOperation(String aOperation) {
        operation = aOperation;
    }

    /**
     * Access method for districtUid.
     *
     * @return the current value of districtUid
     */
    public int getDistrictUid() {
        return districtUid;
    }

    /**
     * Setter method for districtUid.
     *
     * @param aDistrictUid the new value for districtUid
     */
    public void setDistrictUid(int aDistrictUid) {
        districtUid = aDistrictUid;
    }

    /**
     * Compares the key for this instance with another AddressAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AddressAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AddressAud)) {
            return false;
        }
        AddressAud that = (AddressAud) other;
        if (this.getAddressAudUid() != that.getAddressAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AddressAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AddressAud)) return false;
        return this.equalKeys(other) && ((AddressAud)other).equalKeys(this);
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
        i = getAddressAudUid();
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
        StringBuffer sb = new StringBuffer("[AddressAud |");
        sb.append(" addressAudUid=").append(getAddressAudUid());
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
        ret.put("addressAudUid", Integer.valueOf(getAddressAudUid()));
        return ret;
    }

}
