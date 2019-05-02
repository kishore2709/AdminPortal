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

@Entity(name="opcon_regitem_relation_bkup")
public class OpconRegitemRelationBkup implements Serializable {

    /** Primary key. */
    protected static final String PK = "ocriRelationUid";

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
    @Column(name="OCRIRelation_UID", unique=true, nullable=false, precision=10)
    private int ocriRelationUid;
    @Column(name="OpCon_UID", nullable=false, precision=10)
    private int opConUid;
    @Column(name="RegItem_UID", nullable=false, precision=10)
    private int regItemUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;

    /** Default constructor. */
    public OpconRegitemRelationBkup() {
        super();
    }

    /**
     * Access method for ocriRelationUid.
     *
     * @return the current value of ocriRelationUid
     */
    public int getOcriRelationUid() {
        return ocriRelationUid;
    }

    /**
     * Setter method for ocriRelationUid.
     *
     * @param aOcriRelationUid the new value for ocriRelationUid
     */
    public void setOcriRelationUid(int aOcriRelationUid) {
        ocriRelationUid = aOcriRelationUid;
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
     * Access method for regItemUid.
     *
     * @return the current value of regItemUid
     */
    public int getRegItemUid() {
        return regItemUid;
    }

    /**
     * Setter method for regItemUid.
     *
     * @param aRegItemUid the new value for regItemUid
     */
    public void setRegItemUid(int aRegItemUid) {
        regItemUid = aRegItemUid;
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
     * Compares the key for this instance with another OpconRegitemRelationBkup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OpconRegitemRelationBkup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OpconRegitemRelationBkup)) {
            return false;
        }
        OpconRegitemRelationBkup that = (OpconRegitemRelationBkup) other;
        if (this.getOcriRelationUid() != that.getOcriRelationUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OpconRegitemRelationBkup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OpconRegitemRelationBkup)) return false;
        return this.equalKeys(other) && ((OpconRegitemRelationBkup)other).equalKeys(this);
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
        i = getOcriRelationUid();
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
        StringBuffer sb = new StringBuffer("[OpconRegitemRelationBkup |");
        sb.append(" ocriRelationUid=").append(getOcriRelationUid());
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
        ret.put("ocriRelationUid", Integer.valueOf(getOcriRelationUid()));
        return ret;
    }

}
