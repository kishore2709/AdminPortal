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

@Entity(name="ocrir_input_values_bkup")
public class OcrirInputValuesBkup implements Serializable {

    /** Primary key. */
    protected static final String PK = "ocrirInputVAluesUid";

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
    @Column(name="OCRIR_InputVAlues_UID", unique=true, nullable=false, precision=10)
    private int ocrirInputVAluesUid;
    @Column(name="OCRIRelation_UID", nullable=false, precision=10)
    private int ocriRelationUid;
    @Column(name="opConInput_Relation_UID", precision=10)
    private int opConInputRelationUid;
    @Column(name="OpConVar_Type", length=50)
    private String opConVarType;
    @Column(name="OpCon_Values", length=100)
    private String opConValues;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;

    /** Default constructor. */
    public OcrirInputValuesBkup() {
        super();
    }

    /**
     * Access method for ocrirInputVAluesUid.
     *
     * @return the current value of ocrirInputVAluesUid
     */
    public int getOcrirInputVAluesUid() {
        return ocrirInputVAluesUid;
    }

    /**
     * Setter method for ocrirInputVAluesUid.
     *
     * @param aOcrirInputVAluesUid the new value for ocrirInputVAluesUid
     */
    public void setOcrirInputVAluesUid(int aOcrirInputVAluesUid) {
        ocrirInputVAluesUid = aOcrirInputVAluesUid;
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
     * Access method for opConVarType.
     *
     * @return the current value of opConVarType
     */
    public String getOpConVarType() {
        return opConVarType;
    }

    /**
     * Setter method for opConVarType.
     *
     * @param aOpConVarType the new value for opConVarType
     */
    public void setOpConVarType(String aOpConVarType) {
        opConVarType = aOpConVarType;
    }

    /**
     * Access method for opConValues.
     *
     * @return the current value of opConValues
     */
    public String getOpConValues() {
        return opConValues;
    }

    /**
     * Setter method for opConValues.
     *
     * @param aOpConValues the new value for opConValues
     */
    public void setOpConValues(String aOpConValues) {
        opConValues = aOpConValues;
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
     * Compares the key for this instance with another OcrirInputValuesBkup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OcrirInputValuesBkup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OcrirInputValuesBkup)) {
            return false;
        }
        OcrirInputValuesBkup that = (OcrirInputValuesBkup) other;
        if (this.getOcrirInputVAluesUid() != that.getOcrirInputVAluesUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OcrirInputValuesBkup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OcrirInputValuesBkup)) return false;
        return this.equalKeys(other) && ((OcrirInputValuesBkup)other).equalKeys(this);
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
        i = getOcrirInputVAluesUid();
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
        StringBuffer sb = new StringBuffer("[OcrirInputValuesBkup |");
        sb.append(" ocrirInputVAluesUid=").append(getOcrirInputVAluesUid());
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
        ret.put("ocrirInputVAluesUid", Integer.valueOf(getOcrirInputVAluesUid()));
        return ret;
    }

}
