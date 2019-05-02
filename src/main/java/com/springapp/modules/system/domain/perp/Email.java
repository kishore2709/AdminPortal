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

@Entity(name="email")
public class Email implements Serializable {

    /** Primary key. */
    protected static final String PK = "emailUid";

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
    @Column(name="Email_UID", unique=true, nullable=false, precision=10)
    private int emailUid;
    @Column(name="Email_Address", nullable=false, length=128)
    private String emailAddress;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne
    @JoinColumn(name="Contact_UID")
    private Contact contact;
    @ManyToOne(optional=false)
    @JoinColumn(name="Email_Type_UID", nullable=false)
    private EmailType emailType;
    @ManyToOne
    @JoinColumn(name="Users_UID")
    private Users users;

    /** Default constructor. */
    public Email() {
        super();
    }

    /**
     * Access method for emailUid.
     *
     * @return the current value of emailUid
     */
    public int getEmailUid() {
        return emailUid;
    }

    /**
     * Setter method for emailUid.
     *
     * @param aEmailUid the new value for emailUid
     */
    public void setEmailUid(int aEmailUid) {
        emailUid = aEmailUid;
    }

    /**
     * Access method for emailAddress.
     *
     * @return the current value of emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter method for emailAddress.
     *
     * @param aEmailAddress the new value for emailAddress
     */
    public void setEmailAddress(String aEmailAddress) {
        emailAddress = aEmailAddress;
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
     * Access method for emailType.
     *
     * @return the current value of emailType
     */
    public EmailType getEmailType() {
        return emailType;
    }

    /**
     * Setter method for emailType.
     *
     * @param aEmailType the new value for emailType
     */
    public void setEmailType(EmailType aEmailType) {
        emailType = aEmailType;
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
     * Compares the key for this instance with another Email.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Email and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Email)) {
            return false;
        }
        Email that = (Email) other;
        if (this.getEmailUid() != that.getEmailUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Email.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Email)) return false;
        return this.equalKeys(other) && ((Email)other).equalKeys(this);
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
        i = getEmailUid();
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
        StringBuffer sb = new StringBuffer("[Email |");
        sb.append(" emailUid=").append(getEmailUid());
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
        ret.put("emailUid", Integer.valueOf(getEmailUid()));
        return ret;
    }

}
