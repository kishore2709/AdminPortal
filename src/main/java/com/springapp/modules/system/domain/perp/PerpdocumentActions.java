// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="perpdocument_actions")
public class PerpdocumentActions implements Serializable {

    /** Primary key. */
    protected static final String PK = "perpDocActionUid";

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
    @Column(name="PerpDocAction_UID", unique=true, nullable=false, precision=10)
    private int perpDocActionUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Date createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="DecisionAction_UID", nullable=false)
    private AppRegitemActions appRegitemActions;
    @ManyToOne(optional=false)
    @JoinColumn(name="PerpDoc_UID", nullable=false)
    private PerpDocuments perpDocuments;

    /** Default constructor. */
    public PerpdocumentActions() {
        super();
    }

    /**
     * Access method for perpDocActionUid.
     *
     * @return the current value of perpDocActionUid
     */
    public int getPerpDocActionUid() {
        return perpDocActionUid;
    }

    /**
     * Setter method for perpDocActionUid.
     *
     * @param aPerpDocActionUid the new value for perpDocActionUid
     */
    public void setPerpDocActionUid(int aPerpDocActionUid) {
        perpDocActionUid = aPerpDocActionUid;
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
    public Date getCreateModifiedDate() {
        return createModifiedDate;
    }

    /**
     * Setter method for createModifiedDate.
     *
     * @param aCreateModifiedDate the new value for createModifiedDate
     */
    public void setCreateModifiedDate(Date aCreateModifiedDate) {
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
     * Access method for perpDocuments.
     *
     * @return the current value of perpDocuments
     */
    public PerpDocuments getPerpDocuments() {
        return perpDocuments;
    }

    /**
     * Setter method for perpDocuments.
     *
     * @param aPerpDocuments the new value for perpDocuments
     */
    public void setPerpDocuments(PerpDocuments aPerpDocuments) {
        perpDocuments = aPerpDocuments;
    }

    /**
     * Compares the key for this instance with another PerpdocumentActions.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PerpdocumentActions and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PerpdocumentActions)) {
            return false;
        }
        PerpdocumentActions that = (PerpdocumentActions) other;
        if (this.getPerpDocActionUid() != that.getPerpDocActionUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PerpdocumentActions.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PerpdocumentActions)) return false;
        return this.equalKeys(other) && ((PerpdocumentActions)other).equalKeys(this);
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
        i = getPerpDocActionUid();
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
        StringBuffer sb = new StringBuffer("[PerpdocumentActions |");
        sb.append(" perpDocActionUid=").append(getPerpDocActionUid());
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
        ret.put("perpDocActionUid", Integer.valueOf(getPerpDocActionUid()));
        return ret;
    }

}
