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

@Entity(name="apptrans_apphold_rel")
public class ApptransAppholdRel implements Serializable {

    /** Primary key. */
    protected static final String PK = "ApptransAppholdRelPrimary";

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
    @JoinColumn(name="AppTransHoldReason_UID", nullable=false)
    private ApptransHoldReasons apptransHoldReasons;
    @ManyToOne(optional=false)
    @JoinColumn(name="AppTrans_UID", nullable=false)
    private AppTransactions appTransactions;

    /** Default constructor. */
    public ApptransAppholdRel() {
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
     * Access method for apptransHoldReasons.
     *
     * @return the current value of apptransHoldReasons
     */
    public ApptransHoldReasons getApptransHoldReasons() {
        return apptransHoldReasons;
    }

    /**
     * Setter method for apptransHoldReasons.
     *
     * @param aApptransHoldReasons the new value for apptransHoldReasons
     */
    public void setApptransHoldReasons(ApptransHoldReasons aApptransHoldReasons) {
        apptransHoldReasons = aApptransHoldReasons;
    }

    /**
     * Access method for appTransactions.
     *
     * @return the current value of appTransactions
     */
    public AppTransactions getAppTransactions() {
        return appTransactions;
    }

    /**
     * Setter method for appTransactions.
     *
     * @param aAppTransactions the new value for appTransactions
     */
    public void setAppTransactions(AppTransactions aAppTransactions) {
        appTransactions = aAppTransactions;
    }

    /** Temporary value holder for group key fragment appTransactionsAppTransUid */
    private transient int tempAppTransactionsAppTransUid;

    /**
     * Gets the key fragment appTransUid for member appTransactions.
     * If this.appTransactions is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setAppTransactionsAppTransUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see AppTransactions
     */
    public int getAppTransactionsAppTransUid() {
        return (getAppTransactions() == null ? tempAppTransactionsAppTransUid : getAppTransactions().getAppTransUid());
    }

    /**
     * Sets the key fragment appTransUid from member appTransactions.
     * If this.appTransactions is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getAppTransactionsAppTransUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aAppTransUid New value for the key fragment
     * @see AppTransactions
     */
    public void setAppTransactionsAppTransUid(int aAppTransUid) {
        if (getAppTransactions() == null) {
            tempAppTransactionsAppTransUid = aAppTransUid;
        } else {
            getAppTransactions().setAppTransUid(aAppTransUid);
        }
    }

    /** Temporary value holder for group key fragment apptransHoldReasonsUid */
    private transient int tempApptransHoldReasonsUid;

    /**
     * Gets the key fragment uid for member apptransHoldReasons.
     * If this.apptransHoldReasons is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setApptransHoldReasonsUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see ApptransHoldReasons
     */
    public int getApptransHoldReasonsUid() {
        return (getApptransHoldReasons() == null ? tempApptransHoldReasonsUid : getApptransHoldReasons().getUid());
    }

    /**
     * Sets the key fragment uid from member apptransHoldReasons.
     * If this.apptransHoldReasons is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getApptransHoldReasonsUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aUid New value for the key fragment
     * @see ApptransHoldReasons
     */
    public void setApptransHoldReasonsUid(int aUid) {
        if (getApptransHoldReasons() == null) {
            tempApptransHoldReasonsUid = aUid;
        } else {
            getApptransHoldReasons().setUid(aUid);
        }
    }

    /**
     * Compares the key for this instance with another ApptransAppholdRel.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ApptransAppholdRel and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ApptransAppholdRel)) {
            return false;
        }
        ApptransAppholdRel that = (ApptransAppholdRel) other;
        if (this.getAppTransactionsAppTransUid() != that.getAppTransactionsAppTransUid()) {
            return false;
        }
        if (this.getApptransHoldReasonsUid() != that.getApptransHoldReasonsUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ApptransAppholdRel.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ApptransAppholdRel)) return false;
        return this.equalKeys(other) && ((ApptransAppholdRel)other).equalKeys(this);
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
        i = getAppTransactionsAppTransUid();
        result = 37*result + i;
        i = getApptransHoldReasonsUid();
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
        StringBuffer sb = new StringBuffer("[ApptransAppholdRel |");
        sb.append(" appTransactionsAppTransUid=").append(getAppTransactionsAppTransUid());
        sb.append(" apptransHoldReasonsUid=").append(getApptransHoldReasonsUid());
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
        ret.put("appTransactionsAppTransUid", Integer.valueOf(getAppTransactionsAppTransUid()));
        ret.put("apptransHoldReasonsUid", Integer.valueOf(getApptransHoldReasonsUid()));
        return ret;
    }

}
