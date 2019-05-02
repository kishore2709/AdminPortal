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

@Entity(name="operating_conditions_bkup")
public class OperatingConditionsBkup implements Serializable {

    /** Primary key. */
    protected static final String PK = "opConUid";

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
    @Column(name="OpCon_UID", unique=true, nullable=false, precision=10)
    private int opConUid;
    @Column(name="Operating_Condition")
    private String operatingCondition;
    @Column(name="Number_Of_Lines", precision=10)
    private int numberOfLines;
    @Column(name="OpCon_Comment", length=512)
    private String opConComment;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;

    /** Default constructor. */
    public OperatingConditionsBkup() {
        super();
    }

    /**
     * Access method for opConUid.
     *
     * @return the current value of opConUid
     */
    public int getOpConUid() {
        return opConUid;
    }

    /**
     * Setter method for opConUid.
     *
     * @param aOpConUid the new value for opConUid
     */
    public void setOpConUid(int aOpConUid) {
        opConUid = aOpConUid;
    }

    /**
     * Access method for operatingCondition.
     *
     * @return the current value of operatingCondition
     */
    public String getOperatingCondition() {
        return operatingCondition;
    }

    /**
     * Setter method for operatingCondition.
     *
     * @param aOperatingCondition the new value for operatingCondition
     */
    public void setOperatingCondition(String aOperatingCondition) {
        operatingCondition = aOperatingCondition;
    }

    /**
     * Access method for numberOfLines.
     *
     * @return the current value of numberOfLines
     */
    public int getNumberOfLines() {
        return numberOfLines;
    }

    /**
     * Setter method for numberOfLines.
     *
     * @param aNumberOfLines the new value for numberOfLines
     */
    public void setNumberOfLines(int aNumberOfLines) {
        numberOfLines = aNumberOfLines;
    }

    /**
     * Access method for opConComment.
     *
     * @return the current value of opConComment
     */
    public String getOpConComment() {
        return opConComment;
    }

    /**
     * Setter method for opConComment.
     *
     * @param aOpConComment the new value for opConComment
     */
    public void setOpConComment(String aOpConComment) {
        opConComment = aOpConComment;
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
     * Compares the key for this instance with another OperatingConditionsBkup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OperatingConditionsBkup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OperatingConditionsBkup)) {
            return false;
        }
        OperatingConditionsBkup that = (OperatingConditionsBkup) other;
        if (this.getOpConUid() != that.getOpConUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OperatingConditionsBkup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OperatingConditionsBkup)) return false;
        return this.equalKeys(other) && ((OperatingConditionsBkup)other).equalKeys(this);
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
        i = getOpConUid();
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
        StringBuffer sb = new StringBuffer("[OperatingConditionsBkup |");
        sb.append(" opConUid=").append(getOpConUid());
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
        ret.put("opConUid", Integer.valueOf(getOpConUid()));
        return ret;
    }

}
