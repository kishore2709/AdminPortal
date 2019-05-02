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
import javax.persistence.Version;

@Entity(name="vehicle_compliance_status_aud")
public class VehicleComplianceStatusAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "vehicleCompStatusAudUid";

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
    @Column(name="Vehicle_Comp_Status_Aud_UID", unique=true, nullable=false, precision=10)
    private int vehicleCompStatusAudUid;
    @Column(name="Vehicle_Compliance_Status_UID", nullable=false, precision=10)
    private int vehicleComplianceStatusUid;
    @Column(name="Vehicle_UID", nullable=false, precision=10)
    private int vehicleUid;
    @Column(name="Compliance_Information_UID", nullable=false, precision=10)
    private int complianceInformationUid;
    @Column(name="Vehicle_Compliance_Lookup_UID", nullable=false, precision=10)
    private int vehicleComplianceLookupUid;
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
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public VehicleComplianceStatusAud() {
        super();
    }

    /**
     * Access method for vehicleCompStatusAudUid.
     *
     * @return the current value of vehicleCompStatusAudUid
     */
    public int getVehicleCompStatusAudUid() {
        return vehicleCompStatusAudUid;
    }

    /**
     * Setter method for vehicleCompStatusAudUid.
     *
     * @param aVehicleCompStatusAudUid the new value for vehicleCompStatusAudUid
     */
    public void setVehicleCompStatusAudUid(int aVehicleCompStatusAudUid) {
        vehicleCompStatusAudUid = aVehicleCompStatusAudUid;
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
     * Access method for vehicleUid.
     *
     * @return the current value of vehicleUid
     */
    public int getVehicleUid() {
        return vehicleUid;
    }

    /**
     * Setter method for vehicleUid.
     *
     * @param aVehicleUid the new value for vehicleUid
     */
    public void setVehicleUid(int aVehicleUid) {
        vehicleUid = aVehicleUid;
    }

    /**
     * Access method for complianceInformationUid.
     *
     * @return the current value of complianceInformationUid
     */
    public int getComplianceInformationUid() {
        return complianceInformationUid;
    }

    /**
     * Setter method for complianceInformationUid.
     *
     * @param aComplianceInformationUid the new value for complianceInformationUid
     */
    public void setComplianceInformationUid(int aComplianceInformationUid) {
        complianceInformationUid = aComplianceInformationUid;
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
     * Compares the key for this instance with another VehicleComplianceStatusAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class VehicleComplianceStatusAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof VehicleComplianceStatusAud)) {
            return false;
        }
        VehicleComplianceStatusAud that = (VehicleComplianceStatusAud) other;
        if (this.getVehicleCompStatusAudUid() != that.getVehicleCompStatusAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another VehicleComplianceStatusAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof VehicleComplianceStatusAud)) return false;
        return this.equalKeys(other) && ((VehicleComplianceStatusAud)other).equalKeys(this);
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
        i = getVehicleCompStatusAudUid();
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
        StringBuffer sb = new StringBuffer("[VehicleComplianceStatusAud |");
        sb.append(" vehicleCompStatusAudUid=").append(getVehicleCompStatusAudUid());
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
        ret.put("vehicleCompStatusAudUid", Integer.valueOf(getVehicleCompStatusAudUid()));
        return ret;
    }

}
