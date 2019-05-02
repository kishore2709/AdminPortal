// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="vdecs_family_name_type")
public class VdecsFamilyNameType implements Serializable {

    /** Primary key. */
    protected static final String PK = "vdecsFamilyNameTypeUid";

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
    @Column(name="VDECS_Family_Name_Type_UID", unique=true, nullable=false, precision=10)
    private int vdecsFamilyNameTypeUid;
    @Column(name="Name", nullable=false, length=90)
    private String name;
    @Column(name="Level", precision=10)
    private int level;
    @Column(name="Display", length=128)
    private String display;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Identifier", nullable=false, length=45)
    private String identifier;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne
    @JoinColumn(name="Manufacturer_Type_UID")
    private ManufacturerType manufacturerType;
    @OneToMany(mappedBy="vdecsFamilyNameType")
    private Set<ComplianceInformation> complianceInformation;

    /** Default constructor. */
    public VdecsFamilyNameType() {
        super();
    }

    /**
     * Access method for vdecsFamilyNameTypeUid.
     *
     * @return the current value of vdecsFamilyNameTypeUid
     */
    public int getVdecsFamilyNameTypeUid() {
        return vdecsFamilyNameTypeUid;
    }

    /**
     * Setter method for vdecsFamilyNameTypeUid.
     *
     * @param aVdecsFamilyNameTypeUid the new value for vdecsFamilyNameTypeUid
     */
    public void setVdecsFamilyNameTypeUid(int aVdecsFamilyNameTypeUid) {
        vdecsFamilyNameTypeUid = aVdecsFamilyNameTypeUid;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for level.
     *
     * @return the current value of level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Setter method for level.
     *
     * @param aLevel the new value for level
     */
    public void setLevel(int aLevel) {
        level = aLevel;
    }

    /**
     * Access method for display.
     *
     * @return the current value of display
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Setter method for display.
     *
     * @param aDisplay the new value for display
     */
    public void setDisplay(String aDisplay) {
        display = aDisplay;
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
     * Access method for complianceInformation.
     *
     * @return the current value of complianceInformation
     */
    public Set<ComplianceInformation> getComplianceInformation() {
        return complianceInformation;
    }

    /**
     * Setter method for complianceInformation.
     *
     * @param aComplianceInformation the new value for complianceInformation
     */
    public void setComplianceInformation(Set<ComplianceInformation> aComplianceInformation) {
        complianceInformation = aComplianceInformation;
    }

    /**
     * Compares the key for this instance with another VdecsFamilyNameType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class VdecsFamilyNameType and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof VdecsFamilyNameType)) {
            return false;
        }
        VdecsFamilyNameType that = (VdecsFamilyNameType) other;
        if (this.getVdecsFamilyNameTypeUid() != that.getVdecsFamilyNameTypeUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another VdecsFamilyNameType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof VdecsFamilyNameType)) return false;
        return this.equalKeys(other) && ((VdecsFamilyNameType)other).equalKeys(this);
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
        i = getVdecsFamilyNameTypeUid();
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
        StringBuffer sb = new StringBuffer("[VdecsFamilyNameType |");
        sb.append(" vdecsFamilyNameTypeUid=").append(getVdecsFamilyNameTypeUid());
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
        ret.put("vdecsFamilyNameTypeUid", Integer.valueOf(getVdecsFamilyNameTypeUid()));
        return ret;
    }

}
