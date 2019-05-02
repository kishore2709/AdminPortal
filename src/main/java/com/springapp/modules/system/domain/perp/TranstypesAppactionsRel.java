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

@Entity(name="transtypes_appactions_rel")
public class TranstypesAppactionsRel implements Serializable {

    /** Primary key. */
    protected static final String PK = "TranstypesAppactionsRelPrimary";

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

    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="AppRegItemAction_UID", nullable=false)
    private AppRegitemActions appRegitemActions;
    @ManyToOne(optional=false)
    @JoinColumn(name="AppTransType_UID", nullable=false)
    private ApptransTypes apptransTypes;

    /** Default constructor. */
    public TranstypesAppactionsRel() {
        super();
    }

    /**
     * Access method for activeFlag.
     *
     * @return the current value of activeFlag
     */
    public String getActiveFlag() {
        return activeFlag;
    }

    /**
     * Setter method for activeFlag.
     *
     * @param aActiveFlag the new value for activeFlag
     */
    public void setActiveFlag(String aActiveFlag) {
        activeFlag = aActiveFlag;
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
     * Access method for apptransTypes.
     *
     * @return the current value of apptransTypes
     */
    public ApptransTypes getApptransTypes() {
        return apptransTypes;
    }

    /**
     * Setter method for apptransTypes.
     *
     * @param aApptransTypes the new value for apptransTypes
     */
    public void setApptransTypes(ApptransTypes aApptransTypes) {
        apptransTypes = aApptransTypes;
    }

    /** Temporary value holder for group key fragment apptransTypesUid */
    private transient int tempApptransTypesUid;

    /**
     * Gets the key fragment uid for member apptransTypes.
     * If this.apptransTypes is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setApptransTypesUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see ApptransTypes
     */
    public int getApptransTypesUid() {
        return (getApptransTypes() == null ? tempApptransTypesUid : getApptransTypes().getUid());
    }

    /**
     * Sets the key fragment uid from member apptransTypes.
     * If this.apptransTypes is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getApptransTypesUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aUid New value for the key fragment
     * @see ApptransTypes
     */
    public void setApptransTypesUid(int aUid) {
        if (getApptransTypes() == null) {
            tempApptransTypesUid = aUid;
        } else {
            getApptransTypes().setUid(aUid);
        }
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

    /**
     * Compares the key for this instance with another TranstypesAppactionsRel.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TranstypesAppactionsRel and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TranstypesAppactionsRel)) {
            return false;
        }
        TranstypesAppactionsRel that = (TranstypesAppactionsRel) other;
        if (this.getApptransTypesUid() != that.getApptransTypesUid()) {
            return false;
        }
        if (this.getAppRegitemActionsUid() != that.getAppRegitemActionsUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TranstypesAppactionsRel.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TranstypesAppactionsRel)) return false;
        return this.equalKeys(other) && ((TranstypesAppactionsRel)other).equalKeys(this);
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
        i = getApptransTypesUid();
        result = 37*result + i;
        i = getAppRegitemActionsUid();
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
        StringBuffer sb = new StringBuffer("[TranstypesAppactionsRel |");
        sb.append(" apptransTypesUid=").append(getApptransTypesUid());
        sb.append(" appRegitemActionsUid=").append(getAppRegitemActionsUid());
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
        ret.put("apptransTypesUid", Integer.valueOf(getApptransTypesUid()));
        ret.put("appRegitemActionsUid", Integer.valueOf(getAppRegitemActionsUid()));
        return ret;
    }

}
