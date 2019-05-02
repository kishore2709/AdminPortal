// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="sequence_tbl")
public class SequenceTbl implements Serializable {

    /** Primary key. */
    protected static final String PK = "sequenceTblUid";

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
    @Column(name="Sequence_Tbl_UID", unique=true, nullable=false, precision=10)
    private int sequenceTblUid;
    @Column(name="Sequence_Name", nullable=false, length=45)
    private String sequenceName;
    @Column(name="Sequence_Num", nullable=false, precision=10)
    private int sequenceNum;
    @Column(name="Active_Year")
    private Date activeYear;

    /** Default constructor. */
    public SequenceTbl() {
        super();
    }

    /**
     * Access method for sequenceTblUid.
     *
     * @return the current value of sequenceTblUid
     */
    public int getSequenceTblUid() {
        return sequenceTblUid;
    }

    /**
     * Setter method for sequenceTblUid.
     *
     * @param aSequenceTblUid the new value for sequenceTblUid
     */
    public void setSequenceTblUid(int aSequenceTblUid) {
        sequenceTblUid = aSequenceTblUid;
    }

    /**
     * Access method for sequenceName.
     *
     * @return the current value of sequenceName
     */
    public String getSequenceName() {
        return sequenceName;
    }

    /**
     * Setter method for sequenceName.
     *
     * @param aSequenceName the new value for sequenceName
     */
    public void setSequenceName(String aSequenceName) {
        sequenceName = aSequenceName;
    }

    /**
     * Access method for sequenceNum.
     *
     * @return the current value of sequenceNum
     */
    public int getSequenceNum() {
        return sequenceNum;
    }

    /**
     * Setter method for sequenceNum.
     *
     * @param aSequenceNum the new value for sequenceNum
     */
    public void setSequenceNum(int aSequenceNum) {
        sequenceNum = aSequenceNum;
    }

    /**
     * Access method for activeYear.
     *
     * @return the current value of activeYear
     */
    public Date getActiveYear() {
        return activeYear;
    }

    /**
     * Setter method for activeYear.
     *
     * @param aActiveYear the new value for activeYear
     */
    public void setActiveYear(Date aActiveYear) {
        activeYear = aActiveYear;
    }

    /**
     * Compares the key for this instance with another SequenceTbl.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class SequenceTbl and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof SequenceTbl)) {
            return false;
        }
        SequenceTbl that = (SequenceTbl) other;
        if (this.getSequenceTblUid() != that.getSequenceTblUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another SequenceTbl.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SequenceTbl)) return false;
        return this.equalKeys(other) && ((SequenceTbl)other).equalKeys(this);
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
        i = getSequenceTblUid();
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
        StringBuffer sb = new StringBuffer("[SequenceTbl |");
        sb.append(" sequenceTblUid=").append(getSequenceTblUid());
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
        ret.put("sequenceTblUid", Integer.valueOf(getSequenceTblUid()));
        return ret;
    }

}
