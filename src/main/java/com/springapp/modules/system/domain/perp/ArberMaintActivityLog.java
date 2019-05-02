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

@Entity(name="arber_maint_activity_log")
public class ArberMaintActivityLog implements Serializable {

    /** Primary key. */
    protected static final String PK = "amalUid";

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
    @Column(name="AMAL_UID", unique=true, nullable=false, precision=10)
    private int amalUid;
    @Column(name="Source", nullable=false, length=45)
    private String source;
    @Column(name="Action", nullable=false, length=45)
    private String action;
    @Column(name="Users_UID", nullable=false, precision=10)
    private int usersUid;
    @Column(name="ID", nullable=false, precision=10)
    private int id;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;

    /** Default constructor. */
    public ArberMaintActivityLog() {
        super();
    }

    /**
     * Access method for amalUid.
     *
     * @return the current value of amalUid
     */
    public int getAmalUid() {
        return amalUid;
    }

    /**
     * Setter method for amalUid.
     *
     * @param aAmalUid the new value for amalUid
     */
    public void setAmalUid(int aAmalUid) {
        amalUid = aAmalUid;
    }

    /**
     * Access method for source.
     *
     * @return the current value of source
     */
    public String getSource() {
        return source;
    }

    /**
     * Setter method for source.
     *
     * @param aSource the new value for source
     */
    public void setSource(String aSource) {
        source = aSource;
    }

    /**
     * Access method for action.
     *
     * @return the current value of action
     */
    public String getAction() {
        return action;
    }

    /**
     * Setter method for action.
     *
     * @param aAction the new value for action
     */
    public void setAction(String aAction) {
        action = aAction;
    }

    /**
     * Access method for usersUid.
     *
     * @return the current value of usersUid
     */
    public int getUsersUid() {
        return usersUid;
    }

    /**
     * Setter method for usersUid.
     *
     * @param aUsersUid the new value for usersUid
     */
    public void setUsersUid(int aUsersUid) {
        usersUid = aUsersUid;
    }

    /**
     * Access method for id.
     *
     * @return the current value of id
     */
    public int getId() {
        return id;
    }

    /**
     * Setter method for id.
     *
     * @param aId the new value for id
     */
    public void setId(int aId) {
        id = aId;
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
     * Compares the key for this instance with another ArberMaintActivityLog.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ArberMaintActivityLog and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ArberMaintActivityLog)) {
            return false;
        }
        ArberMaintActivityLog that = (ArberMaintActivityLog) other;
        if (this.getAmalUid() != that.getAmalUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ArberMaintActivityLog.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ArberMaintActivityLog)) return false;
        return this.equalKeys(other) && ((ArberMaintActivityLog)other).equalKeys(this);
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
        i = getAmalUid();
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
        StringBuffer sb = new StringBuffer("[ArberMaintActivityLog |");
        sb.append(" amalUid=").append(getAmalUid());
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
        ret.put("amalUid", Integer.valueOf(getAmalUid()));
        return ret;
    }

}
