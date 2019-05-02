// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="address")
public class Address implements Serializable {

    /** Primary key. */
    protected static final String PK = "addressUid";

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
    @Column(name="Address_UID", unique=true, nullable=false, precision=10)
    private int addressUid;
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
    @Column(name="Validation_Status", nullable=false, length=45)
    private String validationStatus;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Address_Type_UID", nullable=false)
    private AddressType addressType;
    @ManyToOne
    @JoinColumn(name="Company_UID")
    private Company company;
    @ManyToOne
    @JoinColumn(name="Contact_UID")
    private Contact contact;
    @ManyToOne(optional=false)
    @JoinColumn(name="Country_Code_UID", nullable=false)
    private CountryCode countryCode;
    @ManyToOne
    @JoinColumn(name="District_UID")
    private DistrictCodes districtCodes;
    @ManyToOne(optional=false)
    @JoinColumn(name="State_Province_UID", nullable=false)
    private StateProvinceCode stateProvinceCode;
    @ManyToOne
    @JoinColumn(name="Terminal_UID")
    private Terminal terminal;
    @ManyToOne
    @JoinColumn(name="Users_UID")
    private Users users;

    /** Default constructor. */
    public Address() {
        super();
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
     * Access method for addressType.
     *
     * @return the current value of addressType
     */
    public AddressType getAddressType() {
        return addressType;
    }

    /**
     * Setter method for addressType.
     *
     * @param aAddressType the new value for addressType
     */
    public void setAddressType(AddressType aAddressType) {
        addressType = aAddressType;
    }

    /**
     * Access method for company.
     *
     * @return the current value of company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Setter method for company.
     *
     * @param aCompany the new value for company
     */
    public void setCompany(Company aCompany) {
        company = aCompany;
    }

    /**
     * Access method for contact.
     *
     * @return the current value of contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Setter method for contact.
     *
     * @param aContact the new value for contact
     */
    public void setContact(Contact aContact) {
        contact = aContact;
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
     * Access method for districtCodes.
     *
     * @return the current value of districtCodes
     */
    public DistrictCodes getDistrictCodes() {
        return districtCodes;
    }

    /**
     * Setter method for districtCodes.
     *
     * @param aDistrictCodes the new value for districtCodes
     */
    public void setDistrictCodes(DistrictCodes aDistrictCodes) {
        districtCodes = aDistrictCodes;
    }

    /**
     * Access method for stateProvinceCode.
     *
     * @return the current value of stateProvinceCode
     */
    public StateProvinceCode getStateProvinceCode() {
        return stateProvinceCode;
    }

    /**
     * Setter method for stateProvinceCode.
     *
     * @param aStateProvinceCode the new value for stateProvinceCode
     */
    public void setStateProvinceCode(StateProvinceCode aStateProvinceCode) {
        stateProvinceCode = aStateProvinceCode;
    }

    /**
     * Access method for terminal.
     *
     * @return the current value of terminal
     */
    public Terminal getTerminal() {
        return terminal;
    }

    /**
     * Setter method for terminal.
     *
     * @param aTerminal the new value for terminal
     */
    public void setTerminal(Terminal aTerminal) {
        terminal = aTerminal;
    }

    /**
     * Access method for users.
     *
     * @return the current value of users
     */
    public Users getUsers() {
        return users;
    }

    /**
     * Setter method for users.
     *
     * @param aUsers the new value for users
     */
    public void setUsers(Users aUsers) {
        users = aUsers;
    }

    /**
     * Compares the key for this instance with another Address.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Address and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Address)) {
            return false;
        }
        Address that = (Address) other;
        if (this.getAddressUid() != that.getAddressUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Address.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Address)) return false;
        return this.equalKeys(other) && ((Address)other).equalKeys(this);
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
        i = getAddressUid();
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
        StringBuffer sb = new StringBuffer("[Address |");
        sb.append(" addressUid=").append(getAddressUid());
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
        ret.put("addressUid", Integer.valueOf(getAddressUid()));
        return ret;
    }

}
