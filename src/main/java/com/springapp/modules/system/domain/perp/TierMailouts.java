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

@Entity(name="tier_mailouts")
public class TierMailouts implements Serializable {

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
    @Column(length=45)
    private String appno;
    @Column(length=45)
    private String regno;
    @Column(length=45)
    private String trackingno;
    @Column(length=1)
    private String status;
    @Column(name="Create_Modified_Date")
    private Timestamp createModifiedDate;
    @Column(precision=10)
    private int appCount;
    @Column(name="company_uid", precision=10)
    private int companyUid;
    @Column(name="Expiration_Date")
    private Timestamp expirationDate;
    @Column(name="RegItem_UID", precision=10)
    private int regItemUid;
    @Column(length=45)
    private String apptranno;

    /** Default constructor. */
    public TierMailouts() {
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
     * Access method for appno.
     *
     * @return the current value of appno
     */
    public String getAppno() {
        return appno;
    }

    /**
     * Setter method for appno.
     *
     * @param aAppno the new value for appno
     */
    public void setAppno(String aAppno) {
        appno = aAppno;
    }

    /**
     * Access method for regno.
     *
     * @return the current value of regno
     */
    public String getRegno() {
        return regno;
    }

    /**
     * Setter method for regno.
     *
     * @param aRegno the new value for regno
     */
    public void setRegno(String aRegno) {
        regno = aRegno;
    }

    /**
     * Access method for trackingno.
     *
     * @return the current value of trackingno
     */
    public String getTrackingno() {
        return trackingno;
    }

    /**
     * Setter method for trackingno.
     *
     * @param aTrackingno the new value for trackingno
     */
    public void setTrackingno(String aTrackingno) {
        trackingno = aTrackingno;
    }

    /**
     * Access method for status.
     *
     * @return the current value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for status.
     *
     * @param aStatus the new value for status
     */
    public void setStatus(String aStatus) {
        status = aStatus;
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
     * Access method for appCount.
     *
     * @return the current value of appCount
     */
    public int getAppCount() {
        return appCount;
    }

    /**
     * Setter method for appCount.
     *
     * @param aAppCount the new value for appCount
     */
    public void setAppCount(int aAppCount) {
        appCount = aAppCount;
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
     * Access method for expirationDate.
     *
     * @return the current value of expirationDate
     */
    public Timestamp getExpirationDate() {
        return expirationDate;
    }

    /**
     * Setter method for expirationDate.
     *
     * @param aExpirationDate the new value for expirationDate
     */
    public void setExpirationDate(Timestamp aExpirationDate) {
        expirationDate = aExpirationDate;
    }

    /**
     * Access method for regItemUid.
     *
     * @return the current value of regItemUid
     */
    public int getRegItemUid() {
        return regItemUid;
    }

    /**
     * Setter method for regItemUid.
     *
     * @param aRegItemUid the new value for regItemUid
     */
    public void setRegItemUid(int aRegItemUid) {
        regItemUid = aRegItemUid;
    }

    /**
     * Access method for apptranno.
     *
     * @return the current value of apptranno
     */
    public String getApptranno() {
        return apptranno;
    }

    /**
     * Setter method for apptranno.
     *
     * @param aApptranno the new value for apptranno
     */
    public void setApptranno(String aApptranno) {
        apptranno = aApptranno;
    }

    /**
     * Compares the key for this instance with another TierMailouts.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TierMailouts and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TierMailouts)) {
            return false;
        }
        TierMailouts that = (TierMailouts) other;
        if (this.getUid() != that.getUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TierMailouts.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TierMailouts)) return false;
        return this.equalKeys(other) && ((TierMailouts)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[TierMailouts |");
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
