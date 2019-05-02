// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="appregitemaction_so_rel")
public class AppregitemactionSoRel implements Serializable {

    /** Primary key. */
    protected static final String PK = "AppregitemactionSoRelPrimary";

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

    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="App_RegItem_Action_UID", nullable=false)
    private AppRegitemActions appRegitemActions;
    @ManyToOne(optional=false)
    @JoinColumn(name="SO_UID", nullable=false)
    private SecurityObjects securityObjects;

    /** Default constructor. */
    public AppregitemactionSoRel() {
        super();
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
     * Access method for appRegitemActions.
     *
     * @return the current value of appRegitemActions
     */
    public AppRegitemActions getAppRegitemActions() {
        return appRegitemActions;
    }

    /**
     * Setter method for appRegitemActions.
     *
     * @param aAppRegitemActions the new value for appRegitemActions
     */
    public void setAppRegitemActions(AppRegitemActions aAppRegitemActions) {
        appRegitemActions = aAppRegitemActions;
    }

    /**
     * Access method for securityObjects.
     *
     * @return the current value of securityObjects
     */
    public SecurityObjects getSecurityObjects() {
        return securityObjects;
    }

    /**
     * Setter method for securityObjects.
     *
     * @param aSecurityObjects the new value for securityObjects
     */
    public void setSecurityObjects(SecurityObjects aSecurityObjects) {
        securityObjects = aSecurityObjects;
    }

    /** Temporary value holder for group key fragment appRegitemActionsUid */
    private transient int tempAppRegitemActionsUid;

    /**
     * Gets the key fragment uid for member appRegitemActions.
     * If this.appRegitemActions is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setAppRegitemActionsUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see AppRegitemActions
     */
    public int getAppRegitemActionsUid() {
        return (getAppRegitemActions() == null ? tempAppRegitemActionsUid : getAppRegitemActions().getUid());
    }

    /**
     * Sets the key fragment uid from member appRegitemActions.
     * If this.appRegitemActions is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getAppRegitemActionsUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aUid New value for the key fragment
     * @see AppRegitemActions
     */
    public void setAppRegitemActionsUid(int aUid) {
        if (getAppRegitemActions() == null) {
            tempAppRegitemActionsUid = aUid;
        } else {
            getAppRegitemActions().setUid(aUid);
        }
    }

    /** Temporary value holder for group key fragment securityObjectsSoUid */
    private transient int tempSecurityObjectsSoUid;

    /**
     * Gets the key fragment soUid for member securityObjects.
     * If this.securityObjects is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setSecurityObjectsSoUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see SecurityObjects
     */
    public int getSecurityObjectsSoUid() {
        return (getSecurityObjects() == null ? tempSecurityObjectsSoUid : getSecurityObjects().getSoUid());
    }

    /**
     * Sets the key fragment soUid from member securityObjects.
     * If this.securityObjects is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getSecurityObjectsSoUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aSoUid New value for the key fragment
     * @see SecurityObjects
     */
    public void setSecurityObjectsSoUid(int aSoUid) {
        if (getSecurityObjects() == null) {
            tempSecurityObjectsSoUid = aSoUid;
        } else {
            getSecurityObjects().setSoUid(aSoUid);
        }
    }

    /**
     * Compares the key for this instance with another AppregitemactionSoRel.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AppregitemactionSoRel and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AppregitemactionSoRel)) {
            return false;
        }
        AppregitemactionSoRel that = (AppregitemactionSoRel) other;
        if (this.getAppRegitemActionsUid() != that.getAppRegitemActionsUid()) {
            return false;
        }
        if (this.getSecurityObjectsSoUid() != that.getSecurityObjectsSoUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AppregitemactionSoRel.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AppregitemactionSoRel)) return false;
        return this.equalKeys(other) && ((AppregitemactionSoRel)other).equalKeys(this);
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
        i = getAppRegitemActionsUid();
        result = 37*result + i;
        i = getSecurityObjectsSoUid();
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
        StringBuffer sb = new StringBuffer("[AppregitemactionSoRel |");
        sb.append(" appRegitemActionsUid=").append(getAppRegitemActionsUid());
        sb.append(" securityObjectsSoUid=").append(getSecurityObjectsSoUid());
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
        ret.put("appRegitemActionsUid", Integer.valueOf(getAppRegitemActionsUid()));
        ret.put("securityObjectsSoUid", Integer.valueOf(getSecurityObjectsSoUid()));
        return ret;
    }

}
