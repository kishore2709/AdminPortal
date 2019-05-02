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

@Entity(name="serial_number_masks")
public class SerialNumberMasks implements Serializable {

    /** Primary key. */
    protected static final String PK = "serialNumberMasksUid";

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
    @Column(name="SerialNumberMasks_UID", unique=true, nullable=false, precision=10)
    private int serialNumberMasksUid;
    @Column(name="Mask_Name", nullable=false, length=45)
    private String maskName;
    @Column(name="Mask_Format", nullable=false, length=45)
    private String maskFormat;
    @Column(name="Mask_Reg_Exp", length=128)
    private String maskRegExp;
    @Column(name="Min_Number", precision=10)
    private int minNumber;
    @Column(name="Max_Number", precision=10)
    private int maxNumber;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Identifier", nullable=false, length=20)
    private String identifier;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Manufacturer_UID", nullable=false)
    private ManufacturerType manufacturerType;

    /** Default constructor. */
    public SerialNumberMasks() {
        super();
    }

    /**
     * Access method for serialNumberMasksUid.
     *
     * @return the current value of serialNumberMasksUid
     */
    public int getSerialNumberMasksUid() {
        return serialNumberMasksUid;
    }

    /**
     * Setter method for serialNumberMasksUid.
     *
     * @param aSerialNumberMasksUid the new value for serialNumberMasksUid
     */
    public void setSerialNumberMasksUid(int aSerialNumberMasksUid) {
        serialNumberMasksUid = aSerialNumberMasksUid;
    }

    /**
     * Access method for maskName.
     *
     * @return the current value of maskName
     */
    public String getMaskName() {
        return maskName;
    }

    /**
     * Setter method for maskName.
     *
     * @param aMaskName the new value for maskName
     */
    public void setMaskName(String aMaskName) {
        maskName = aMaskName;
    }

    /**
     * Access method for maskFormat.
     *
     * @return the current value of maskFormat
     */
    public String getMaskFormat() {
        return maskFormat;
    }

    /**
     * Setter method for maskFormat.
     *
     * @param aMaskFormat the new value for maskFormat
     */
    public void setMaskFormat(String aMaskFormat) {
        maskFormat = aMaskFormat;
    }

    /**
     * Access method for maskRegExp.
     *
     * @return the current value of maskRegExp
     */
    public String getMaskRegExp() {
        return maskRegExp;
    }

    /**
     * Setter method for maskRegExp.
     *
     * @param aMaskRegExp the new value for maskRegExp
     */
    public void setMaskRegExp(String aMaskRegExp) {
        maskRegExp = aMaskRegExp;
    }

    /**
     * Access method for minNumber.
     *
     * @return the current value of minNumber
     */
    public int getMinNumber() {
        return minNumber;
    }

    /**
     * Setter method for minNumber.
     *
     * @param aMinNumber the new value for minNumber
     */
    public void setMinNumber(int aMinNumber) {
        minNumber = aMinNumber;
    }

    /**
     * Access method for maxNumber.
     *
     * @return the current value of maxNumber
     */
    public int getMaxNumber() {
        return maxNumber;
    }

    /**
     * Setter method for maxNumber.
     *
     * @param aMaxNumber the new value for maxNumber
     */
    public void setMaxNumber(int aMaxNumber) {
        maxNumber = aMaxNumber;
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
     * Access method for identifier.
     *
     * @return the current value of identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Setter method for identifier.
     *
     * @param aIdentifier the new value for identifier
     */
    public void setIdentifier(String aIdentifier) {
        identifier = aIdentifier;
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
     * Access method for manufacturerType.
     *
     * @return the current value of manufacturerType
     */
    public ManufacturerType getManufacturerType() {
        return manufacturerType;
    }

    /**
     * Setter method for manufacturerType.
     *
     * @param aManufacturerType the new value for manufacturerType
     */
    public void setManufacturerType(ManufacturerType aManufacturerType) {
        manufacturerType = aManufacturerType;
    }

    /**
     * Compares the key for this instance with another SerialNumberMasks.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class SerialNumberMasks and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof SerialNumberMasks)) {
            return false;
        }
        SerialNumberMasks that = (SerialNumberMasks) other;
        if (this.getSerialNumberMasksUid() != that.getSerialNumberMasksUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another SerialNumberMasks.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SerialNumberMasks)) return false;
        return this.equalKeys(other) && ((SerialNumberMasks)other).equalKeys(this);
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
        i = getSerialNumberMasksUid();
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
        StringBuffer sb = new StringBuffer("[SerialNumberMasks |");
        sb.append(" serialNumberMasksUid=").append(getSerialNumberMasksUid());
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
        ret.put("serialNumberMasksUid", Integer.valueOf(getSerialNumberMasksUid()));
        return ret;
    }

}
