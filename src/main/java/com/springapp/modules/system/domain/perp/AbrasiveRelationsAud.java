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

@Entity(name="abrasive_relations_aud")
public class AbrasiveRelationsAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "arAudUid";

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
    @Column(name="ARAud_UID", unique=true, nullable=false, precision=10)
    private int arAudUid;
    @Column(name="AbrasiveType_UID", nullable=false, precision=10)
    private int abrasiveTypeUid;
    @Column(name="RegItemDet_UID", nullable=false, precision=10)
    private int regItemDetUid;
    @Column(name="Other_Type_Text", length=255)
    private String otherTypeText;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public AbrasiveRelationsAud() {
        super();
    }

    /**
     * Access method for arAudUid.
     *
     * @return the current value of arAudUid
     */
    public int getArAudUid() {
        return arAudUid;
    }

    /**
     * Setter method for arAudUid.
     *
     * @param aArAudUid the new value for arAudUid
     */
    public void setArAudUid(int aArAudUid) {
        arAudUid = aArAudUid;
    }

    /**
     * Access method for abrasiveTypeUid.
     *
     * @return the current value of abrasiveTypeUid
     */
    public int getAbrasiveTypeUid() {
        return abrasiveTypeUid;
    }

    /**
     * Setter method for abrasiveTypeUid.
     *
     * @param aAbrasiveTypeUid the new value for abrasiveTypeUid
     */
    public void setAbrasiveTypeUid(int aAbrasiveTypeUid) {
        abrasiveTypeUid = aAbrasiveTypeUid;
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
     * Compares the key for this instance with another AbrasiveRelationsAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AbrasiveRelationsAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AbrasiveRelationsAud)) {
            return false;
        }
        AbrasiveRelationsAud that = (AbrasiveRelationsAud) other;
        if (this.getArAudUid() != that.getArAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AbrasiveRelationsAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AbrasiveRelationsAud)) return false;
        return this.equalKeys(other) && ((AbrasiveRelationsAud)other).equalKeys(this);
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
        i = getArAudUid();
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
        StringBuffer sb = new StringBuffer("[AbrasiveRelationsAud |");
        sb.append(" arAudUid=").append(getArAudUid());
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
        ret.put("arAudUid", Integer.valueOf(getArAudUid()));
        return ret;
    }

}
