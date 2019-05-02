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

@Entity(name="actionrequest_decision_rel")
public class ActionrequestDecisionRel implements Serializable {

    /** Primary key. */
    protected static final String PK = "requestDecisionRelUid";

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
    @Column(name="RequestDecisionRel_UID", unique=true, nullable=false, precision=10)
    private int requestDecisionRelUid;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="DecisionAction_UID", nullable=false)
    private AppRegitemActions appRegitemActions2;
    @ManyToOne(optional=false)
    @JoinColumn(name="RequestAction_UID", nullable=false)
    private AppRegitemActions appRegitemActions;

    /** Default constructor. */
    public ActionrequestDecisionRel() {
        super();
    }

    /**
     * Access method for requestDecisionRelUid.
     *
     * @return the current value of requestDecisionRelUid
     */
    public int getRequestDecisionRelUid() {
        return requestDecisionRelUid;
    }

    /**
     * Setter method for requestDecisionRelUid.
     *
     * @param aRequestDecisionRelUid the new value for requestDecisionRelUid
     */
    public void setRequestDecisionRelUid(int aRequestDecisionRelUid) {
        requestDecisionRelUid = aRequestDecisionRelUid;
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
     * Access method for appRegitemActions2.
     *
     * @return the current value of appRegitemActions2
     */
    public AppRegitemActions getAppRegitemActions2() {
        return appRegitemActions2;
    }

    /**
     * Setter method for appRegitemActions2.
     *
     * @param aAppRegitemActions2 the new value for appRegitemActions2
     */
    public void setAppRegitemActions2(AppRegitemActions aAppRegitemActions2) {
        appRegitemActions2 = aAppRegitemActions2;
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
     * Compares the key for this instance with another ActionrequestDecisionRel.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ActionrequestDecisionRel and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ActionrequestDecisionRel)) {
            return false;
        }
        ActionrequestDecisionRel that = (ActionrequestDecisionRel) other;
        if (this.getRequestDecisionRelUid() != that.getRequestDecisionRelUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ActionrequestDecisionRel.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ActionrequestDecisionRel)) return false;
        return this.equalKeys(other) && ((ActionrequestDecisionRel)other).equalKeys(this);
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
        i = getRequestDecisionRelUid();
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
        StringBuffer sb = new StringBuffer("[ActionrequestDecisionRel |");
        sb.append(" requestDecisionRelUid=").append(getRequestDecisionRelUid());
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
        ret.put("requestDecisionRelUid", Integer.valueOf(getRequestDecisionRelUid()));
        return ret;
    }

}
