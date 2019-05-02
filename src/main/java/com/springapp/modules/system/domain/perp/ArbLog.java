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

@Entity(name="arb_log")
public class ArbLog implements Serializable {

    /** Primary key. */
    protected static final String PK = "arbLogUid";

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
    @Column(name="ARB_LOG_UID", unique=true, nullable=false, precision=10)
    private int arbLogUid;
    @Column(name="Operation", length=64)
    private String operation;
    @Column(name="Date_Time_Stamp")
    private Timestamp dateTimeStamp;
    @Column(name="Error_Flag")
    private boolean errorFlag;
    @Column(name="User_UID", precision=10)
    private int userUid;
    @Column(name="Notes", length=128)
    private String notes;

    /** Default constructor. */
    public ArbLog() {
        super();
    }

    /**
     * Access method for arbLogUid.
     *
     * @return the current value of arbLogUid
     */
    public int getArbLogUid() {
        return arbLogUid;
    }

    /**
     * Setter method for arbLogUid.
     *
     * @param aArbLogUid the new value for arbLogUid
     */
    public void setArbLogUid(int aArbLogUid) {
        arbLogUid = aArbLogUid;
    }

    /**
     * Access method for operation.
     *
     * @return the current value of operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Setter method for operation.
     *
     * @param aOperation the new value for operation
     */
    public void setOperation(String aOperation) {
        operation = aOperation;
    }

    /**
     * Access method for dateTimeStamp.
     *
     * @return the current value of dateTimeStamp
     */
    public Timestamp getDateTimeStamp() {
        return dateTimeStamp;
    }

    /**
     * Setter method for dateTimeStamp.
     *
     * @param aDateTimeStamp the new value for dateTimeStamp
     */
    public void setDateTimeStamp(Timestamp aDateTimeStamp) {
        dateTimeStamp = aDateTimeStamp;
    }

    /**
     * Access method for errorFlag.
     *
     * @return true if and only if errorFlag is currently true
     */
    public boolean getErrorFlag() {
        return errorFlag;
    }

    /**
     * Setter method for errorFlag.
     *
     * @param aErrorFlag the new value for errorFlag
     */
    public void setErrorFlag(boolean aErrorFlag) {
        errorFlag = aErrorFlag;
    }

    /**
     * Access method for userUid.
     *
     * @return the current value of userUid
     */
    public int getUserUid() {
        return userUid;
    }

    /**
     * Setter method for userUid.
     *
     * @param aUserUid the new value for userUid
     */
    public void setUserUid(int aUserUid) {
        userUid = aUserUid;
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
     * Compares the key for this instance with another ArbLog.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ArbLog and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ArbLog)) {
            return false;
        }
        ArbLog that = (ArbLog) other;
        if (this.getArbLogUid() != that.getArbLogUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ArbLog.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ArbLog)) return false;
        return this.equalKeys(other) && ((ArbLog)other).equalKeys(this);
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
        i = getArbLogUid();
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
        StringBuffer sb = new StringBuffer("[ArbLog |");
        sb.append(" arbLogUid=").append(getArbLogUid());
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
        ret.put("arbLogUid", Integer.valueOf(getArbLogUid()));
        return ret;
    }

}
