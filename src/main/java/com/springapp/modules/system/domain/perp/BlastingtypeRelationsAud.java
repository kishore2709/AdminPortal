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

@Entity(name="blastingtype_relations_aud")
public class BlastingtypeRelationsAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "btrAudUid";

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
    @Column(name="BTRAud_UID", unique=true, nullable=false, precision=10)
    private int btrAudUid;
    @Column(name="BlastingType_UID", nullable=false, precision=10)
    private int blastingTypeUid;
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
    public BlastingtypeRelationsAud() {
        super();
    }

    /**
     * Access method for btrAudUid.
     *
     * @return the current value of btrAudUid
     */
    public int getBtrAudUid() {
        return btrAudUid;
    }

    /**
     * Setter method for btrAudUid.
     *
     * @param aBtrAudUid the new value for btrAudUid
     */
    public void setBtrAudUid(int aBtrAudUid) {
        btrAudUid = aBtrAudUid;
    }

    /**
     * Access method for blastingTypeUid.
     *
     * @return the current value of blastingTypeUid
     */
    public int getBlastingTypeUid() {
        return blastingTypeUid;
    }

    /**
     * Setter method for blastingTypeUid.
     *
     * @param aBlastingTypeUid the new value for blastingTypeUid
     */
    public void setBlastingTypeUid(int aBlastingTypeUid) {
        blastingTypeUid = aBlastingTypeUid;
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
     * Compares the key for this instance with another BlastingtypeRelationsAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BlastingtypeRelationsAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BlastingtypeRelationsAud)) {
            return false;
        }
        BlastingtypeRelationsAud that = (BlastingtypeRelationsAud) other;
        if (this.getBtrAudUid() != that.getBtrAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BlastingtypeRelationsAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BlastingtypeRelationsAud)) return false;
        return this.equalKeys(other) && ((BlastingtypeRelationsAud)other).equalKeys(this);
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
        i = getBtrAudUid();
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
        StringBuffer sb = new StringBuffer("[BlastingtypeRelationsAud |");
        sb.append(" btrAudUid=").append(getBtrAudUid());
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
        ret.put("btrAudUid", Integer.valueOf(getBtrAudUid()));
        return ret;
    }

}
