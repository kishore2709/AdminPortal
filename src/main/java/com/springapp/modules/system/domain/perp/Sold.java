// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="sold")
public class Sold implements Serializable {

    /** Primary key. */
    protected static final String PK = "soldUid";

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
    @Column(name="Sold_UID", unique=true, nullable=false, precision=10)
    private int soldUid;
    @Column(name="Date_of_Sale", nullable=false)
    private Date dateOfSale;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="sold")
    private Set<Contact> contact;

    /** Default constructor. */
    public Sold() {
        super();
    }

    /**
     * Access method for soldUid.
     *
     * @return the current value of soldUid
     */
    public int getSoldUid() {
        return soldUid;
    }

    /**
     * Setter method for soldUid.
     *
     * @param aSoldUid the new value for soldUid
     */
    public void setSoldUid(int aSoldUid) {
        soldUid = aSoldUid;
    }

    /**
     * Access method for dateOfSale.
     *
     * @return the current value of dateOfSale
     */
    public Date getDateOfSale() {
        return dateOfSale;
    }

    /**
     * Setter method for dateOfSale.
     *
     * @param aDateOfSale the new value for dateOfSale
     */
    public void setDateOfSale(Date aDateOfSale) {
        dateOfSale = aDateOfSale;
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
     * Compares the key for this instance with another Sold.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Sold and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Sold)) {
            return false;
        }
        Sold that = (Sold) other;
        if (this.getSoldUid() != that.getSoldUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Sold.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Sold)) return false;
        return this.equalKeys(other) && ((Sold)other).equalKeys(this);
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
        i = getSoldUid();
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
        StringBuffer sb = new StringBuffer("[Sold |");
        sb.append(" soldUid=").append(getSoldUid());
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
        ret.put("soldUid", Integer.valueOf(getSoldUid()));
        return ret;
    }

}
