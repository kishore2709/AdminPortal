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

@Entity(name="appregitemaction_so_rel_aud")
public class AppregitemactionSoRelAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "ariasrAudUid";

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
    @Column(name="ARIASRAud_UID", unique=true, nullable=false, precision=10)
    private int ariasrAudUid;
    @Column(name="App_RegItem_Action_UID", nullable=false, precision=10)
    private int appRegItemActionUid;
    @Column(name="SO_UID", nullable=false, precision=10)
    private int soUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public AppregitemactionSoRelAud() {
        super();
    }

    /**
     * Access method for ariasrAudUid.
     *
     * @return the current value of ariasrAudUid
     */
    public int getAriasrAudUid() {
        return ariasrAudUid;
    }

    /**
     * Setter method for ariasrAudUid.
     *
     * @param aAriasrAudUid the new value for ariasrAudUid
     */
    public void setAriasrAudUid(int aAriasrAudUid) {
        ariasrAudUid = aAriasrAudUid;
    }

    /**
     * Access method for appRegItemActionUid.
     *
     * @return the current value of appRegItemActionUid
     */
    public int getAppRegItemActionUid() {
        return appRegItemActionUid;
    }

    /**
     * Setter method for appRegItemActionUid.
     *
     * @param aAppRegItemActionUid the new value for appRegItemActionUid
     */
    public void setAppRegItemActionUid(int aAppRegItemActionUid) {
        appRegItemActionUid = aAppRegItemActionUid;
    }

    /**
     * Access method for soUid.
     *
     * @return the current value of soUid
     */
    public int getSoUid() {
        return soUid;
    }

    /**
     * Setter method for soUid.
     *
     * @param aSoUid the new value for soUid
     */
    public void setSoUid(int aSoUid) {
        soUid = aSoUid;
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
     * Compares the key for this instance with another AppregitemactionSoRelAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AppregitemactionSoRelAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AppregitemactionSoRelAud)) {
            return false;
        }
        AppregitemactionSoRelAud that = (AppregitemactionSoRelAud) other;
        if (this.getAriasrAudUid() != that.getAriasrAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AppregitemactionSoRelAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AppregitemactionSoRelAud)) return false;
        return this.equalKeys(other) && ((AppregitemactionSoRelAud)other).equalKeys(this);
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
        i = getAriasrAudUid();
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
        StringBuffer sb = new StringBuffer("[AppregitemactionSoRelAud |");
        sb.append(" ariasrAudUid=").append(getAriasrAudUid());
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
        ret.put("ariasrAudUid", Integer.valueOf(getAriasrAudUid()));
        return ret;
    }

}
