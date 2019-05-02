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

@Entity(name="vehicle_co_transfer_rel")
public class VehicleCoTransferRel implements Serializable {

    /** Primary key. */
    protected static final String PK = "vctrUid";

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
    @Column(name="VCTR_UID", unique=true, nullable=false, precision=10)
    private int vctrUid;
    @Column(name="Old_Company_UID", nullable=false, precision=10)
    private int oldCompanyUid;
    @Column(name="New_Company_UID", nullable=false, precision=10)
    private int newCompanyUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Vehicle_UID", nullable=false)
    private Vehicle vehicle;

    /** Default constructor. */
    public VehicleCoTransferRel() {
        super();
    }

    /**
     * Access method for vctrUid.
     *
     * @return the current value of vctrUid
     */
    public int getVctrUid() {
        return vctrUid;
    }

    /**
     * Setter method for vctrUid.
     *
     * @param aVctrUid the new value for vctrUid
     */
    public void setVctrUid(int aVctrUid) {
        vctrUid = aVctrUid;
    }

    /**
     * Access method for oldCompanyUid.
     *
     * @return the current value of oldCompanyUid
     */
    public int getOldCompanyUid() {
        return oldCompanyUid;
    }

    /**
     * Setter method for oldCompanyUid.
     *
     * @param aOldCompanyUid the new value for oldCompanyUid
     */
    public void setOldCompanyUid(int aOldCompanyUid) {
        oldCompanyUid = aOldCompanyUid;
    }

    /**
     * Access method for newCompanyUid.
     *
     * @return the current value of newCompanyUid
     */
    public int getNewCompanyUid() {
        return newCompanyUid;
    }

    /**
     * Setter method for newCompanyUid.
     *
     * @param aNewCompanyUid the new value for newCompanyUid
     */
    public void setNewCompanyUid(int aNewCompanyUid) {
        newCompanyUid = aNewCompanyUid;
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
     * Compares the key for this instance with another VehicleCoTransferRel.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class VehicleCoTransferRel and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof VehicleCoTransferRel)) {
            return false;
        }
        VehicleCoTransferRel that = (VehicleCoTransferRel) other;
        if (this.getVctrUid() != that.getVctrUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another VehicleCoTransferRel.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof VehicleCoTransferRel)) return false;
        return this.equalKeys(other) && ((VehicleCoTransferRel)other).equalKeys(this);
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
        i = getVctrUid();
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
        StringBuffer sb = new StringBuffer("[VehicleCoTransferRel |");
        sb.append(" vctrUid=").append(getVctrUid());
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
        ret.put("vctrUid", Integer.valueOf(getVctrUid()));
        return ret;
    }

}
