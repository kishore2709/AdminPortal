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
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="manufacturer_type")
public class ManufacturerType implements Serializable {

    /** Primary key. */
    protected static final String PK = "uid";

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
    @Column(name="UID", unique=true, nullable=false, precision=10)
    private int uid;
    @Column(name="Name", nullable=false, length=45)
    private String name;
    @Column(name="Display", nullable=false, length=60)
    private String display;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Identifier", nullable=false, length=45)
    private String identifier;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Warning_Override_Flag", length=1)
    private String warningOverrideFlag;
    @OneToMany(mappedBy="manufacturerType")
    private Set<RegitemDetails> regitemDetails;
    @OneToMany(mappedBy="manufacturerType")
    private Set<SerialNumberMasks> serialNumberMasks;
    @OneToMany(mappedBy="manufacturerType")
    private Set<Vehicle> vehicle;
    @OneToMany(mappedBy="manufacturerType")
    private Set<ComplianceInformation> complianceInformation;
    @OneToMany(mappedBy="manufacturerType")
    private Set<VdecsFamilyNameType> vdecsFamilyNameType;
    @OneToMany(mappedBy="manufacturerType2")
    private Set<Vehicle> vehicle2;

    /** Default constructor. */
    public ManufacturerType() {
        super();
    }

    /**
     * Access method for uid.
     *
     * @return the current value of uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * Setter method for uid.
     *
     * @param aUid the new value for uid
     */
    public void setUid(int aUid) {
        uid = aUid;
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
     * Access method for warningOverrideFlag.
     *
     * @return the current value of warningOverrideFlag
     */
    public String getWarningOverrideFlag() {
        return warningOverrideFlag;
    }

    /**
     * Setter method for warningOverrideFlag.
     *
     * @param aWarningOverrideFlag the new value for warningOverrideFlag
     */
    public void setWarningOverrideFlag(String aWarningOverrideFlag) {
        warningOverrideFlag = aWarningOverrideFlag;
    }

    /**
     * Access method for regitemDetails.
     *
     * @return the current value of regitemDetails
     */
    public Set<RegitemDetails> getRegitemDetails() {
        return regitemDetails;
    }

    /**
     * Setter method for regitemDetails.
     *
     * @param aRegitemDetails the new value for regitemDetails
     */
    public void setRegitemDetails(Set<RegitemDetails> aRegitemDetails) {
        regitemDetails = aRegitemDetails;
    }

    /**
     * Access method for serialNumberMasks.
     *
     * @return the current value of serialNumberMasks
     */
    public Set<SerialNumberMasks> getSerialNumberMasks() {
        return serialNumberMasks;
    }

    /**
     * Setter method for serialNumberMasks.
     *
     * @param aSerialNumberMasks the new value for serialNumberMasks
     */
    public void setSerialNumberMasks(Set<SerialNumberMasks> aSerialNumberMasks) {
        serialNumberMasks = aSerialNumberMasks;
    }

    /**
     * Access method for vehicle.
     *
     * @return the current value of vehicle
     */
    public Set<Vehicle> getVehicle() {
        return vehicle;
    }

    /**
     * Setter method for vehicle.
     *
     * @param aVehicle the new value for vehicle
     */
    public void setVehicle(Set<Vehicle> aVehicle) {
        vehicle = aVehicle;
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
     * Access method for vdecsFamilyNameType.
     *
     * @return the current value of vdecsFamilyNameType
     */
    public Set<VdecsFamilyNameType> getVdecsFamilyNameType() {
        return vdecsFamilyNameType;
    }

    /**
     * Setter method for vdecsFamilyNameType.
     *
     * @param aVdecsFamilyNameType the new value for vdecsFamilyNameType
     */
    public void setVdecsFamilyNameType(Set<VdecsFamilyNameType> aVdecsFamilyNameType) {
        vdecsFamilyNameType = aVdecsFamilyNameType;
    }

    /**
     * Access method for vehicle2.
     *
     * @return the current value of vehicle2
     */
    public Set<Vehicle> getVehicle2() {
        return vehicle2;
    }

    /**
     * Setter method for vehicle2.
     *
     * @param aVehicle2 the new value for vehicle2
     */
    public void setVehicle2(Set<Vehicle> aVehicle2) {
        vehicle2 = aVehicle2;
    }

    /**
     * Compares the key for this instance with another ManufacturerType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ManufacturerType and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ManufacturerType)) {
            return false;
        }
        ManufacturerType that = (ManufacturerType) other;
        if (this.getUid() != that.getUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ManufacturerType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ManufacturerType)) return false;
        return this.equalKeys(other) && ((ManufacturerType)other).equalKeys(this);
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
        i = getUid();
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
        StringBuffer sb = new StringBuffer("[ManufacturerType |");
        sb.append(" uid=").append(getUid());
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
        ret.put("uid", Integer.valueOf(getUid()));
        return ret;
    }

}
