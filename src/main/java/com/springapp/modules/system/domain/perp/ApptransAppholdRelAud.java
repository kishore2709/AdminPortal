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

@Entity(name="apptrans_apphold_rel_aud")
public class ApptransAppholdRelAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "athrAudUid";

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
    @Column(name="ATHRAud_UID", unique=true, nullable=false, precision=10)
    private int athrAudUid;
    @Column(name="AppTrans_UID", nullable=false, precision=10)
    private int appTransUid;
    @Column(name="AppTransHoldReason_UID", nullable=false, precision=10)
    private int appTransHoldReasonUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public ApptransAppholdRelAud() {
        super();
    }

    /**
     * Access method for athrAudUid.
     *
     * @return the current value of athrAudUid
     */
    public int getAthrAudUid() {
        return athrAudUid;
    }

    /**
     * Setter method for athrAudUid.
     *
     * @param aAthrAudUid the new value for athrAudUid
     */
    public void setAthrAudUid(int aAthrAudUid) {
        athrAudUid = aAthrAudUid;
    }

    /**
     * Access method for appTransUid.
     *
     * @return the current value of appTransUid
     */
    public int getAppTransUid() {
        return appTransUid;
    }

    /**
     * Setter method for appTransUid.
     *
     * @param aAppTransUid the new value for appTransUid
     */
    public void setAppTransUid(int aAppTransUid) {
        appTransUid = aAppTransUid;
    }

    /**
     * Access method for appTransHoldReasonUid.
     *
     * @return the current value of appTransHoldReasonUid
     */
    public int getAppTransHoldReasonUid() {
        return appTransHoldReasonUid;
    }

    /**
     * Setter method for appTransHoldReasonUid.
     *
     * @param aAppTransHoldReasonUid the new value for appTransHoldReasonUid
     */
    public void setAppTransHoldReasonUid(int aAppTransHoldReasonUid) {
        appTransHoldReasonUid = aAppTransHoldReasonUid;
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
     * Compares the key for this instance with another ApptransAppholdRelAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ApptransAppholdRelAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ApptransAppholdRelAud)) {
            return false;
        }
        ApptransAppholdRelAud that = (ApptransAppholdRelAud) other;
        if (this.getAthrAudUid() != that.getAthrAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ApptransAppholdRelAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ApptransAppholdRelAud)) return false;
        return this.equalKeys(other) && ((ApptransAppholdRelAud)other).equalKeys(this);
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
        i = getAthrAudUid();
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
        StringBuffer sb = new StringBuffer("[ApptransAppholdRelAud |");
        sb.append(" athrAudUid=").append(getAthrAudUid());
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
        ret.put("athrAudUid", Integer.valueOf(getAthrAudUid()));
        return ret;
    }

}
