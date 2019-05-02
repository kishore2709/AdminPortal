// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="arber_db_update_version_log")
public class ArberDbUpdateVersionLog implements Serializable {

    /** Primary key. */
    protected static final String PK = "adbuvlUid";

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
    @Column(name="ADBUVL_UID", unique=true, nullable=false, precision=10)
    private int adbuvlUid;
    @Column(name="Version_No", nullable=false, precision=10, scale=2)
    private BigDecimal versionNo;
    @Column(name="Notes", length=512)
    private String notes;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;

    /** Default constructor. */
    public ArberDbUpdateVersionLog() {
        super();
    }

    /**
     * Access method for adbuvlUid.
     *
     * @return the current value of adbuvlUid
     */
    public int getAdbuvlUid() {
        return adbuvlUid;
    }

    /**
     * Setter method for adbuvlUid.
     *
     * @param aAdbuvlUid the new value for adbuvlUid
     */
    public void setAdbuvlUid(int aAdbuvlUid) {
        adbuvlUid = aAdbuvlUid;
    }

    /**
     * Access method for versionNo.
     *
     * @return the current value of versionNo
     */
    public BigDecimal getVersionNo() {
        return versionNo;
    }

    /**
     * Setter method for versionNo.
     *
     * @param aVersionNo the new value for versionNo
     */
    public void setVersionNo(BigDecimal aVersionNo) {
        versionNo = aVersionNo;
    }

    /**
     * Access method for notes.
     *
     * @return the current value of notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Setter method for notes.
     *
     * @param aNotes the new value for notes
     */
    public void setNotes(String aNotes) {
        notes = aNotes;
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
     * Compares the key for this instance with another ArberDbUpdateVersionLog.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ArberDbUpdateVersionLog and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ArberDbUpdateVersionLog)) {
            return false;
        }
        ArberDbUpdateVersionLog that = (ArberDbUpdateVersionLog) other;
        if (this.getAdbuvlUid() != that.getAdbuvlUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ArberDbUpdateVersionLog.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ArberDbUpdateVersionLog)) return false;
        return this.equalKeys(other) && ((ArberDbUpdateVersionLog)other).equalKeys(this);
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
        i = getAdbuvlUid();
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
        StringBuffer sb = new StringBuffer("[ArberDbUpdateVersionLog |");
        sb.append(" adbuvlUid=").append(getAdbuvlUid());
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
        ret.put("adbuvlUid", Integer.valueOf(getAdbuvlUid()));
        return ret;
    }

}
