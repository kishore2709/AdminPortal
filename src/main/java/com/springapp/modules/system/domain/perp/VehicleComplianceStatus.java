// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="vehicle_compliance_status")
public class VehicleComplianceStatus implements Serializable {

    /** Primary key. */
    protected static final String PK = "vehicleComplianceStatusUid";

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
    @Column(name="Vehicle_Compliance_Status_UID", unique=true, nullable=false, precision=10)
    private int vehicleComplianceStatusUid;
    @Column(name="Status", length=128)
    private String status;
    @Column(name="Until_Date")
    private Date untilDate;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Compliance_Information_UID", nullable=false)
    private ComplianceInformation complianceInformation;
    @ManyToOne(optional=false)
    @JoinColumn(name="Vehicle_Compliance_Lookup_UID", nullable=false)
    private VehicleComplianceLookup vehicleComplianceLookup;
    @ManyToOne(optional=false)
    @JoinColumn(name="Vehicle_UID", nullable=false)
    private Vehicle vehicle;

    /** Default constructor. */
    public VehicleComplianceStatus() {
        super();
    }

    /**
     * Access method for vehicleComplianceStatusUid.
     *
     * @return the current value of vehicleComplianceStatusUid
     */
    public int getVehicleComplianceStatusUid() {
        return vehicleComplianceStatusUid;
    }

    /**
     * Setter method for vehicleComplianceStatusUid.
     *
     * @param aVehicleComplianceStatusUid the new value for vehicleComplianceStatusUid
     */
    public void setVehicleComplianceStatusUid(int aVehicleComplianceStatusUid) {
        vehicleComplianceStatusUid = aVehicleComplianceStatusUid;
    }

    /**
     * Access method for status.
     *
     * @return the current value of status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter method for status.
     *
     * @param aStatus the new value for status
     */
    public void setStatus(String aStatus) {
        status = aStatus;
    }

    /**
     * Access method for untilDate.
     *
     * @return the current value of untilDate
     */
    public Date getUntilDate() {
        return untilDate;
    }

    /**
     * Setter method for untilDate.
     *
     * @param aUntilDate the new value for untilDate
     */
    public void setUntilDate(Date aUntilDate) {
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
     * Access method for complianceInformation.
     *
     * @return the current value of complianceInformation
     */
    public ComplianceInformation getComplianceInformation() {
        return complianceInformation;
    }

    /**
     * Setter method for complianceInformation.
     *
     * @param aComplianceInformation the new value for complianceInformation
     */
    public void setComplianceInformation(ComplianceInformation aComplianceInformation) {
        complianceInformation = aComplianceInformation;
    }

    /**
     * Access method for vehicleComplianceLookup.
     *
     * @return the current value of vehicleComplianceLookup
     */
    public VehicleComplianceLookup getVehicleComplianceLookup() {
        return vehicleComplianceLookup;
    }

    /**
     * Setter method for vehicleComplianceLookup.
     *
     * @param aVehicleComplianceLookup the new value for vehicleComplianceLookup
     */
    public void setVehicleComplianceLookup(VehicleComplianceLookup aVehicleComplianceLookup) {
        vehicleComplianceLookup = aVehicleComplianceLookup;
    }

    /**
     * Access method for vehicle.
     *
     * @return the current value of vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Setter method for vehicle.
     *
     * @param aVehicle the new value for vehicle
     */
    public void setVehicle(Vehicle aVehicle) {
        vehicle = aVehicle;
    }

    /**
     * Compares the key for this instance with another VehicleComplianceStatus.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class VehicleComplianceStatus and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof VehicleComplianceStatus)) {
            return false;
        }
        VehicleComplianceStatus that = (VehicleComplianceStatus) other;
        if (this.getVehicleComplianceStatusUid() != that.getVehicleComplianceStatusUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another VehicleComplianceStatus.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof VehicleComplianceStatus)) return false;
        return this.equalKeys(other) && ((VehicleComplianceStatus)other).equalKeys(this);
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
        i = getVehicleComplianceStatusUid();
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
        StringBuffer sb = new StringBuffer("[VehicleComplianceStatus |");
        sb.append(" vehicleComplianceStatusUid=").append(getVehicleComplianceStatusUid());
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
        ret.put("vehicleComplianceStatusUid", Integer.valueOf(getVehicleComplianceStatusUid()));
        return ret;
    }

}
