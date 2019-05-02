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

@Entity(name="tmp_plackardstoprint")
public class TmpPlackardstoprint implements Serializable {

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
    @Column(name="Create_Modiified_By", nullable=false, length=45)
    private String createModiifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;

    /** Default constructor. */
    public TmpPlackardstoprint() {
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
     * Access method for createModiifiedBy.
     *
     * @return the current value of createModiifiedBy
     */
    public String getCreateModiifiedBy() {
        return createModiifiedBy;
    }

    /**
     * Setter method for createModiifiedBy.
     *
     * @param aCreateModiifiedBy the new value for createModiifiedBy
     */
    public void setCreateModiifiedBy(String aCreateModiifiedBy) {
        createModiifiedBy = aCreateModiifiedBy;
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
     * Compares the key for this instance with another TmpPlackardstoprint.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TmpPlackardstoprint and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TmpPlackardstoprint)) {
            return false;
        }
        TmpPlackardstoprint that = (TmpPlackardstoprint) other;
        if (this.getUid() != that.getUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TmpPlackardstoprint.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TmpPlackardstoprint)) return false;
        return this.equalKeys(other) && ((TmpPlackardstoprint)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[TmpPlackardstoprint |");
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
