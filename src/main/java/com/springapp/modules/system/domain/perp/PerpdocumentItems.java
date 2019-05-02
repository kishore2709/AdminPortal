// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="perpdocument_items")
public class PerpdocumentItems implements Serializable {

    /** Primary key. */
    protected static final String PK = "perpDocDetailsUid";

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
    @Column(name="PerpDocDetails_UID", unique=true, nullable=false, precision=10)
    private int perpDocDetailsUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Date createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="PerpDoc_UID", nullable=false)
    private PerpDocuments perpDocuments;
    @ManyToOne(optional=false)
    @JoinColumn(name="RegItem_UID", nullable=false)
    private RegistrationItems registrationItems;

    /** Default constructor. */
    public PerpdocumentItems() {
        super();
    }

    /**
     * Access method for perpDocDetailsUid.
     *
     * @return the current value of perpDocDetailsUid
     */
    public int getPerpDocDetailsUid() {
        return perpDocDetailsUid;
    }

    /**
     * Setter method for perpDocDetailsUid.
     *
     * @param aPerpDocDetailsUid the new value for perpDocDetailsUid
     */
    public void setPerpDocDetailsUid(int aPerpDocDetailsUid) {
        perpDocDetailsUid = aPerpDocDetailsUid;
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
    public Date getCreateModifiedDate() {
        return createModifiedDate;
    }

    /**
     * Setter method for createModifiedDate.
     *
     * @param aCreateModifiedDate the new value for createModifiedDate
     */
    public void setCreateModifiedDate(Date aCreateModifiedDate) {
        createModifiedDate = aCreateModifiedDate;
    }

    /**
     * Access method for perpDocuments.
     *
     * @return the current value of perpDocuments
     */
    public PerpDocuments getPerpDocuments() {
        return perpDocuments;
    }

    /**
     * Setter method for perpDocuments.
     *
     * @param aPerpDocuments the new value for perpDocuments
     */
    public void setPerpDocuments(PerpDocuments aPerpDocuments) {
        perpDocuments = aPerpDocuments;
    }

    /**
     * Access method for registrationItems.
     *
     * @return the current value of registrationItems
     */
    public RegistrationItems getRegistrationItems() {
        return registrationItems;
    }

    /**
     * Setter method for registrationItems.
     *
     * @param aRegistrationItems the new value for registrationItems
     */
    public void setRegistrationItems(RegistrationItems aRegistrationItems) {
        registrationItems = aRegistrationItems;
    }

    /**
     * Compares the key for this instance with another PerpdocumentItems.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PerpdocumentItems and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PerpdocumentItems)) {
            return false;
        }
        PerpdocumentItems that = (PerpdocumentItems) other;
        if (this.getPerpDocDetailsUid() != that.getPerpDocDetailsUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PerpdocumentItems.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PerpdocumentItems)) return false;
        return this.equalKeys(other) && ((PerpdocumentItems)other).equalKeys(this);
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
        i = getPerpDocDetailsUid();
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
        StringBuffer sb = new StringBuffer("[PerpdocumentItems |");
        sb.append(" perpDocDetailsUid=").append(getPerpDocDetailsUid());
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
        ret.put("perpDocDetailsUid", Integer.valueOf(getPerpDocDetailsUid()));
        return ret;
    }

}
