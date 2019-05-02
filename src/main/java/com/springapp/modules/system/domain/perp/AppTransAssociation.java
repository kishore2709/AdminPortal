// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="app_trans_association")
public class AppTransAssociation implements Serializable {

    /** Primary key. */
    protected static final String PK = "appTransAssocUid";

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
    @Column(name="AppTransAssoc_UID", unique=true, nullable=false, precision=10)
    private int appTransAssocUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="AppTrans_UID", nullable=false)
    private AppTransactions appTransactions;
    @ManyToOne(optional=false)
    @JoinColumn(name="Application_UID", nullable=false)
    private PerpApplications perpApplications;

    /** Default constructor. */
    public AppTransAssociation() {
        super();
    }

    /**
     * Access method for appTransAssocUid.
     *
     * @return the current value of appTransAssocUid
     */
    public int getAppTransAssocUid() {
        return appTransAssocUid;
    }

    /**
     * Setter method for appTransAssocUid.
     *
     * @param aAppTransAssocUid the new value for appTransAssocUid
     */
    public void setAppTransAssocUid(int aAppTransAssocUid) {
        appTransAssocUid = aAppTransAssocUid;
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

    /**
     * Access method for perpApplications.
     *
     * @return the current value of perpApplications
     */
    public PerpApplications getPerpApplications() {
        return perpApplications;
    }

    /**
     * Setter method for perpApplications.
     *
     * @param aPerpApplications the new value for perpApplications
     */
    public void setPerpApplications(PerpApplications aPerpApplications) {
        perpApplications = aPerpApplications;
    }

    /**
     * Compares the key for this instance with another AppTransAssociation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AppTransAssociation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AppTransAssociation)) {
            return false;
        }
        AppTransAssociation that = (AppTransAssociation) other;
        if (this.getAppTransAssocUid() != that.getAppTransAssocUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AppTransAssociation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AppTransAssociation)) return false;
        return this.equalKeys(other) && ((AppTransAssociation)other).equalKeys(this);
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
        i = getAppTransAssocUid();
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
        StringBuffer sb = new StringBuffer("[AppTransAssociation |");
        sb.append(" appTransAssocUid=").append(getAppTransAssocUid());
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
        ret.put("appTransAssocUid", Integer.valueOf(getAppTransAssocUid()));
        return ret;
    }

}
