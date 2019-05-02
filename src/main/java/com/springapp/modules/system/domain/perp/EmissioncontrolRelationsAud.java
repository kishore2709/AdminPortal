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

@Entity(name="emissioncontrol_relations_aud")
public class EmissioncontrolRelationsAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "ecrAudUid";

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
    @Column(name="ECRAud_UID", unique=true, nullable=false, precision=10)
    private int ecrAudUid;
    @Column(name="EmissionControlType_UID", nullable=false, precision=10)
    private int emissionControlTypeUid;
    @Column(name="RegItemDet_UID", nullable=false, precision=10)
    private int regItemDetUid;
    @Column(name="Other_Type_Text", length=255)
    private String otherTypeText;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public EmissioncontrolRelationsAud() {
        super();
    }

    /**
     * Access method for ecrAudUid.
     *
     * @return the current value of ecrAudUid
     */
    public int getEcrAudUid() {
        return ecrAudUid;
    }

    /**
     * Setter method for ecrAudUid.
     *
     * @param aEcrAudUid the new value for ecrAudUid
     */
    public void setEcrAudUid(int aEcrAudUid) {
        ecrAudUid = aEcrAudUid;
    }

    /**
     * Access method for emissionControlTypeUid.
     *
     * @return the current value of emissionControlTypeUid
     */
    public int getEmissionControlTypeUid() {
        return emissionControlTypeUid;
    }

    /**
     * Setter method for emissionControlTypeUid.
     *
     * @param aEmissionControlTypeUid the new value for emissionControlTypeUid
     */
    public void setEmissionControlTypeUid(int aEmissionControlTypeUid) {
        emissionControlTypeUid = aEmissionControlTypeUid;
    }

    /**
     * Access method for regItemDetUid.
     *
     * @return the current value of regItemDetUid
     */
    public int getRegItemDetUid() {
        return regItemDetUid;
    }

    /**
     * Setter method for regItemDetUid.
     *
     * @param aRegItemDetUid the new value for regItemDetUid
     */
    public void setRegItemDetUid(int aRegItemDetUid) {
        regItemDetUid = aRegItemDetUid;
    }

    /**
     * Access method for otherTypeText.
     *
     * @return the current value of otherTypeText
     */
    public String getOtherTypeText() {
        return otherTypeText;
    }

    /**
     * Setter method for otherTypeText.
     *
     * @param aOtherTypeText the new value for otherTypeText
     */
    public void setOtherTypeText(String aOtherTypeText) {
        otherTypeText = aOtherTypeText;
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
     * Compares the key for this instance with another EmissioncontrolRelationsAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EmissioncontrolRelationsAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EmissioncontrolRelationsAud)) {
            return false;
        }
        EmissioncontrolRelationsAud that = (EmissioncontrolRelationsAud) other;
        if (this.getEcrAudUid() != that.getEcrAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EmissioncontrolRelationsAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EmissioncontrolRelationsAud)) return false;
        return this.equalKeys(other) && ((EmissioncontrolRelationsAud)other).equalKeys(this);
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
        i = getEcrAudUid();
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
        StringBuffer sb = new StringBuffer("[EmissioncontrolRelationsAud |");
        sb.append(" ecrAudUid=").append(getEcrAudUid());
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
        ret.put("ecrAudUid", Integer.valueOf(getEcrAudUid()));
        return ret;
    }

}
