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

@Entity(name="vehicle_compliance_lookup")
public class VehicleComplianceLookup implements Serializable {

    /** Primary key. */
    protected static final String PK = "vehicleComplianceLookupUid";

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
    @Column(name="Vehicle_Compliance_Lookup_UID", unique=true, nullable=false, precision=10)
    private int vehicleComplianceLookupUid;
    @Column(name="Lookup_Code", nullable=false, length=45)
    private String lookupCode;
    @Column(name="Until_Date")
    private Timestamp untilDate;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Class_Ident", length=45)
    private String classIdent;
    @OneToMany(mappedBy="vehicleComplianceLookup")
    private Set<VehicleComplianceStatus> vehicleComplianceStatus;

    /** Default constructor. */
    public VehicleComplianceLookup() {
        super();
    }

    /**
     * Access method for vehicleComplianceLookupUid.
     *
     * @return the current value of vehicleComplianceLookupUid
     */
    public int getVehicleComplianceLookupUid() {
        return vehicleComplianceLookupUid;
    }

    /**
     * Setter method for vehicleComplianceLookupUid.
     *
     * @param aVehicleComplianceLookupUid the new value for vehicleComplianceLookupUid
     */
    public void setVehicleComplianceLookupUid(int aVehicleComplianceLookupUid) {
        vehicleComplianceLookupUid = aVehicleComplianceLookupUid;
    }

    /**
     * Access method for lookupCode.
     *
     * @return the current value of lookupCode
     */
    public String getLookupCode() {
        return lookupCode;
    }

    /**
     * Setter method for lookupCode.
     *
     * @param aLookupCode the new value for lookupCode
     */
    public void setLookupCode(String aLookupCode) {
        lookupCode = aLookupCode;
    }

    /**
     * Access method for untilDate.
     *
     * @return the current value of untilDate
     */
    public Timestamp getUntilDate() {
        return untilDate;
    }

    /**
     * Setter method for untilDate.
     *
     * @param aUntilDate the new value for untilDate
     */
    public void setUntilDate(Timestamp aUntilDate) {
        untilDate = aUntilDate;
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
     * Access method for classIdent.
     *
     * @return the current value of classIdent
     */
    public String getClassIdent() {
        return classIdent;
    }

    /**
     * Setter method for classIdent.
     *
     * @param aClassIdent the new value for classIdent
     */
    public void setClassIdent(String aClassIdent) {
        classIdent = aClassIdent;
    }

    /**
     * Access method for vehicleComplianceStatus.
     *
     * @return the current value of vehicleComplianceStatus
     */
    public Set<VehicleComplianceStatus> getVehicleComplianceStatus() {
        return vehicleComplianceStatus;
    }

    /**
     * Setter method for vehicleComplianceStatus.
     *
     * @param aVehicleComplianceStatus the new value for vehicleComplianceStatus
     */
    public void setVehicleComplianceStatus(Set<VehicleComplianceStatus> aVehicleComplianceStatus) {
        vehicleComplianceStatus = aVehicleComplianceStatus;
    }

    /**
     * Compares the key for this instance with another VehicleComplianceLookup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class VehicleComplianceLookup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof VehicleComplianceLookup)) {
            return false;
        }
        VehicleComplianceLookup that = (VehicleComplianceLookup) other;
        if (this.getVehicleComplianceLookupUid() != that.getVehicleComplianceLookupUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another VehicleComplianceLookup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof VehicleComplianceLookup)) return false;
        return this.equalKeys(other) && ((VehicleComplianceLookup)other).equalKeys(this);
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
        i = getVehicleComplianceLookupUid();
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
        StringBuffer sb = new StringBuffer("[VehicleComplianceLookup |");
        sb.append(" vehicleComplianceLookupUid=").append(getVehicleComplianceLookupUid());
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
        ret.put("vehicleComplianceLookupUid", Integer.valueOf(getVehicleComplianceLookupUid()));
        return ret;
    }

}
