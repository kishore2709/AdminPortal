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

@Entity(name="district_codes")
public class DistrictCodes implements Serializable {

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
    @Column(name="Name", nullable=false, length=45)
    private String name;
    @Column(name="Display", nullable=false, length=80)
    private String display;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Identifier", nullable=false, length=45)
    private String identifier;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="districtCodes")
    private Set<RegistrationItems> registrationItems;
    @OneToMany(mappedBy="districtCodes")
    private Set<Company> company;
    @OneToMany(mappedBy="districtCodes")
    private Set<Address> address;
    @OneToMany(mappedBy="districtCodes")
    private Set<Contact> contact;
    @OneToMany(mappedBy="districtCodes")
    private Set<PerpAnnualReportItemDetails> perpAnnualReportItemDetails;
    @OneToMany(mappedBy="districtCodes")
    private Set<PerpAnnualReportItems> perpAnnualReportItems;
    @OneToMany(mappedBy="districtCodes")
    private Set<Users> users;

    /** Default constructor. */
    public DistrictCodes() {
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
     * Access method for registrationItems.
     *
     * @return the current value of registrationItems
     */
    public Set<RegistrationItems> getRegistrationItems() {
        return registrationItems;
    }

    /**
     * Setter method for registrationItems.
     *
     * @param aRegistrationItems the new value for registrationItems
     */
    public void setRegistrationItems(Set<RegistrationItems> aRegistrationItems) {
        registrationItems = aRegistrationItems;
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
     * Access method for contact.
     *
     * @return the current value of contact
     */
    public Set<Contact> getContact() {
        return contact;
    }

    /**
     * Setter method for contact.
     *
     * @param aContact the new value for contact
     */
    public void setContact(Set<Contact> aContact) {
        contact = aContact;
    }

    /**
     * Access method for perpAnnualReportItemDetails.
     *
     * @return the current value of perpAnnualReportItemDetails
     */
    public Set<PerpAnnualReportItemDetails> getPerpAnnualReportItemDetails() {
        return perpAnnualReportItemDetails;
    }

    /**
     * Setter method for perpAnnualReportItemDetails.
     *
     * @param aPerpAnnualReportItemDetails the new value for perpAnnualReportItemDetails
     */
    public void setPerpAnnualReportItemDetails(Set<PerpAnnualReportItemDetails> aPerpAnnualReportItemDetails) {
        perpAnnualReportItemDetails = aPerpAnnualReportItemDetails;
    }

    /**
     * Access method for perpAnnualReportItems.
     *
     * @return the current value of perpAnnualReportItems
     */
    public Set<PerpAnnualReportItems> getPerpAnnualReportItems() {
        return perpAnnualReportItems;
    }

    /**
     * Setter method for perpAnnualReportItems.
     *
     * @param aPerpAnnualReportItems the new value for perpAnnualReportItems
     */
    public void setPerpAnnualReportItems(Set<PerpAnnualReportItems> aPerpAnnualReportItems) {
        perpAnnualReportItems = aPerpAnnualReportItems;
    }

    /**
     * Access method for users.
     *
     * @return the current value of users
     */
    public Set<Users> getUsers() {
        return users;
    }

    /**
     * Setter method for users.
     *
     * @param aUsers the new value for users
     */
    public void setUsers(Set<Users> aUsers) {
        users = aUsers;
    }

    /**
     * Compares the key for this instance with another DistrictCodes.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class DistrictCodes and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof DistrictCodes)) {
            return false;
        }
        DistrictCodes that = (DistrictCodes) other;
        if (this.getUid() != that.getUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another DistrictCodes.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof DistrictCodes)) return false;
        return this.equalKeys(other) && ((DistrictCodes)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[DistrictCodes |");
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
