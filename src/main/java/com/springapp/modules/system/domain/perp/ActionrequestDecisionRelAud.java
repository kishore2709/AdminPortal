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

@Entity(name="actionrequest_decision_rel_aud")
public class ActionrequestDecisionRelAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "ardrAudUid";

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
    @Column(name="ARDRAud_UID", unique=true, nullable=false, precision=10)
    private int ardrAudUid;
    @Column(name="RequestDecisionRel_UID", nullable=false, precision=10)
    private int requestDecisionRelUid;
    @Column(name="RequestAction_UID", nullable=false, precision=10)
    private int requestActionUid;
    @Column(name="DecisionAction_UID", nullable=false, precision=10)
    private int decisionActionUid;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public ActionrequestDecisionRelAud() {
        super();
    }

    /**
     * Access method for ardrAudUid.
     *
     * @return the current value of ardrAudUid
     */
    public int getArdrAudUid() {
        return ardrAudUid;
    }

    /**
     * Setter method for ardrAudUid.
     *
     * @param aArdrAudUid the new value for ardrAudUid
     */
    public void setArdrAudUid(int aArdrAudUid) {
        ardrAudUid = aArdrAudUid;
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
     * Access method for requestActionUid.
     *
     * @return the current value of requestActionUid
     */
    public int getRequestActionUid() {
        return requestActionUid;
    }

    /**
     * Setter method for requestActionUid.
     *
     * @param aRequestActionUid the new value for requestActionUid
     */
    public void setRequestActionUid(int aRequestActionUid) {
        requestActionUid = aRequestActionUid;
    }

    /**
     * Access method for decisionActionUid.
     *
     * @return the current value of decisionActionUid
     */
    public int getDecisionActionUid() {
        return decisionActionUid;
    }

    /**
     * Setter method for decisionActionUid.
     *
     * @param aDecisionActionUid the new value for decisionActionUid
     */
    public void setDecisionActionUid(int aDecisionActionUid) {
        decisionActionUid = aDecisionActionUid;
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
     * Compares the key for this instance with another ActionrequestDecisionRelAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ActionrequestDecisionRelAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ActionrequestDecisionRelAud)) {
            return false;
        }
        ActionrequestDecisionRelAud that = (ActionrequestDecisionRelAud) other;
        if (this.getArdrAudUid() != that.getArdrAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ActionrequestDecisionRelAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ActionrequestDecisionRelAud)) return false;
        return this.equalKeys(other) && ((ActionrequestDecisionRelAud)other).equalKeys(this);
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
        i = getArdrAudUid();
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
        StringBuffer sb = new StringBuffer("[ActionrequestDecisionRelAud |");
        sb.append(" ardrAudUid=").append(getArdrAudUid());
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
        ret.put("ardrAudUid", Integer.valueOf(getArdrAudUid()));
        return ret;
    }

}
