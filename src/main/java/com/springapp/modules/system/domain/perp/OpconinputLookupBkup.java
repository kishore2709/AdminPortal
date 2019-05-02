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

@Entity(name="opconinput_lookup_bkup")
public class OpconinputLookupBkup implements Serializable {

    /** Primary key. */
    protected static final String PK = "opConInputRelationUid";

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
    @Column(name="opConInput_Relation_UID", unique=true, nullable=false, precision=10)
    private int opConInputRelationUid;
    @Column(name="OpCon_UID", nullable=false, precision=10)
    private int opConUid;
    @Column(name="Var_Type", nullable=false, length=50)
    private String varType;
    @Column(name="Value_Default", nullable=false, length=45)
    private String valueDefault;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;

    /** Default constructor. */
    public OpconinputLookupBkup() {
        super();
    }

    /**
     * Access method for opConInputRelationUid.
     *
     * @return the current value of opConInputRelationUid
     */
    public int getOpConInputRelationUid() {
        return opConInputRelationUid;
    }

    /**
     * Setter method for opConInputRelationUid.
     *
     * @param aOpConInputRelationUid the new value for opConInputRelationUid
     */
    public void setOpConInputRelationUid(int aOpConInputRelationUid) {
        opConInputRelationUid = aOpConInputRelationUid;
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
     * Access method for varType.
     *
     * @return the current value of varType
     */
    public String getVarType() {
        return varType;
    }

    /**
     * Setter method for varType.
     *
     * @param aVarType the new value for varType
     */
    public void setVarType(String aVarType) {
        varType = aVarType;
    }

    /**
     * Access method for valueDefault.
     *
     * @return the current value of valueDefault
     */
    public String getValueDefault() {
        return valueDefault;
    }

    /**
     * Setter method for valueDefault.
     *
     * @param aValueDefault the new value for valueDefault
     */
    public void setValueDefault(String aValueDefault) {
        valueDefault = aValueDefault;
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
     * Compares the key for this instance with another OpconinputLookupBkup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OpconinputLookupBkup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OpconinputLookupBkup)) {
            return false;
        }
        OpconinputLookupBkup that = (OpconinputLookupBkup) other;
        if (this.getOpConInputRelationUid() != that.getOpConInputRelationUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OpconinputLookupBkup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OpconinputLookupBkup)) return false;
        return this.equalKeys(other) && ((OpconinputLookupBkup)other).equalKeys(this);
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
        i = getOpConInputRelationUid();
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
        StringBuffer sb = new StringBuffer("[OpconinputLookupBkup |");
        sb.append(" opConInputRelationUid=").append(getOpConInputRelationUid());
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
        ret.put("opConInputRelationUid", Integer.valueOf(getOpConInputRelationUid()));
        return ret;
    }

}
