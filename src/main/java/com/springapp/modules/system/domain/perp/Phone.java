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

@Entity(name="phone")
public class Phone implements Serializable {

    /** Primary key. */
    protected static final String PK = "phoneUid";

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
    @Column(name="Phone_UID", unique=true, nullable=false, precision=10)
    private int phoneUid;
    @Column(name="Phone_Number", nullable=false, length=45)
    private String phoneNumber;
    @Column(name="Extension", length=10)
    private String extension;
    @Column(name="Fax", length=20)
    private String fax;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne
    @JoinColumn(name="Company_UID")
    private Company company;
    @ManyToOne
    @JoinColumn(name="Contact_UID")
    private Contact contact;
    @ManyToOne(optional=false)
    @JoinColumn(name="Phone_Type_UID", nullable=false)
    private PhoneType phoneType;
    @ManyToOne
    @JoinColumn(name="Users_UID")
    private Users users;

    /** Default constructor. */
    public Phone() {
        super();
    }

    /**
     * Access method for phoneUid.
     *
     * @return the current value of phoneUid
     */
    public int getPhoneUid() {
        return phoneUid;
    }

    /**
     * Setter method for phoneUid.
     *
     * @param aPhoneUid the new value for phoneUid
     */
    public void setPhoneUid(int aPhoneUid) {
        phoneUid = aPhoneUid;
    }

    /**
     * Access method for phoneNumber.
     *
     * @return the current value of phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Setter method for phoneNumber.
     *
     * @param aPhoneNumber the new value for phoneNumber
     */
    public void setPhoneNumber(String aPhoneNumber) {
        phoneNumber = aPhoneNumber;
    }

    /**
     * Access method for extension.
     *
     * @return the current value of extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Setter method for extension.
     *
     * @param aExtension the new value for extension
     */
    public void setExtension(String aExtension) {
        extension = aExtension;
    }

    /**
     * Access method for fax.
     *
     * @return the current value of fax
     */
    public String getFax() {
        return fax;
    }

    /**
     * Setter method for fax.
     *
     * @param aFax the new value for fax
     */
    public void setFax(String aFax) {
        fax = aFax;
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
     * Access method for phoneType.
     *
     * @return the current value of phoneType
     */
    public PhoneType getPhoneType() {
        return phoneType;
    }

    /**
     * Setter method for phoneType.
     *
     * @param aPhoneType the new value for phoneType
     */
    public void setPhoneType(PhoneType aPhoneType) {
        phoneType = aPhoneType;
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
     * Compares the key for this instance with another Phone.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Phone and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Phone)) {
            return false;
        }
        Phone that = (Phone) other;
        if (this.getPhoneUid() != that.getPhoneUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Phone.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Phone)) return false;
        return this.equalKeys(other) && ((Phone)other).equalKeys(this);
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
        i = getPhoneUid();
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
        StringBuffer sb = new StringBuffer("[Phone |");
        sb.append(" phoneUid=").append(getPhoneUid());
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
        ret.put("phoneUid", Integer.valueOf(getPhoneUid()));
        return ret;
    }

}
