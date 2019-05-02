// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="fleet_emission_details")
public class FleetEmissionDetails implements Serializable {

    /** Primary key. */
    protected static final String PK = "distFleetEmisRowUid";

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
    @Column(name="DistFleetEmisRow_UID", unique=true, nullable=false, precision=10)
    private int distFleetEmisRowUid;
    @Column(name="Perp_Registration_UID", precision=10)
    private int perpRegistrationUid;
    @Column(name="District_Permit_Number", length=20)
    private String districtPermitNumber;
    @Column(name="Company_Unit_ID", length=20)
    private String companyUnitId;
    @Column(name="Engine_Family_Name", length=20)
    private String engineFamilyName;
    @Column(name="BrakeHPValue", precision=10)
    private int brakeHpValue;
    @Column(name="Pm_Emission_Factor", precision=5, scale=4)
    private BigDecimal pmEmissionFactor;
    @Column(name="Fuel_Modifier", length=20)
    private String fuelModifier;
    @Column(name="Electric_Use_Percent", precision=10)
    private int electricUsePercent;
    @Column(name="PM_Emission_Factor_Override", precision=5, scale=4)
    private BigDecimal pmEmissionFactorOverride;
    @Column(name="Filter_Control_Efficiency", precision=10)
    private int filterControlEfficiency;
    @Column(name="Net_PM_Emission_Factor", precision=4, scale=2)
    private BigDecimal netPmEmissionFactor;
    @Column(name="Weighted_Emission_Factor", precision=10, scale=2)
    private BigDecimal weightedEmissionFactor;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Company_UID", nullable=false, precision=10)
    private int companyUid;
    @Column(name="Report_Year", precision=10)
    private int reportYear;
    @Column(name="Export_Date")
    private Timestamp exportDate;

    /** Default constructor. */
    public FleetEmissionDetails() {
        super();
    }

    /**
     * Access method for distFleetEmisRowUid.
     *
     * @return the current value of distFleetEmisRowUid
     */
    public int getDistFleetEmisRowUid() {
        return distFleetEmisRowUid;
    }

    /**
     * Setter method for distFleetEmisRowUid.
     *
     * @param aDistFleetEmisRowUid the new value for distFleetEmisRowUid
     */
    public void setDistFleetEmisRowUid(int aDistFleetEmisRowUid) {
        distFleetEmisRowUid = aDistFleetEmisRowUid;
    }

    /**
     * Access method for perpRegistrationUid.
     *
     * @return the current value of perpRegistrationUid
     */
    public int getPerpRegistrationUid() {
        return perpRegistrationUid;
    }

    /**
     * Setter method for perpRegistrationUid.
     *
     * @param aPerpRegistrationUid the new value for perpRegistrationUid
     */
    public void setPerpRegistrationUid(int aPerpRegistrationUid) {
        perpRegistrationUid = aPerpRegistrationUid;
    }

    /**
     * Access method for districtPermitNumber.
     *
     * @return the current value of districtPermitNumber
     */
    public String getDistrictPermitNumber() {
        return districtPermitNumber;
    }

    /**
     * Setter method for districtPermitNumber.
     *
     * @param aDistrictPermitNumber the new value for districtPermitNumber
     */
    public void setDistrictPermitNumber(String aDistrictPermitNumber) {
        districtPermitNumber = aDistrictPermitNumber;
    }

    /**
     * Access method for companyUnitId.
     *
     * @return the current value of companyUnitId
     */
    public String getCompanyUnitId() {
        return companyUnitId;
    }

    /**
     * Setter method for companyUnitId.
     *
     * @param aCompanyUnitId the new value for companyUnitId
     */
    public void setCompanyUnitId(String aCompanyUnitId) {
        companyUnitId = aCompanyUnitId;
    }

    /**
     * Access method for engineFamilyName.
     *
     * @return the current value of engineFamilyName
     */
    public String getEngineFamilyName() {
        return engineFamilyName;
    }

    /**
     * Setter method for engineFamilyName.
     *
     * @param aEngineFamilyName the new value for engineFamilyName
     */
    public void setEngineFamilyName(String aEngineFamilyName) {
        engineFamilyName = aEngineFamilyName;
    }

    /**
     * Access method for brakeHpValue.
     *
     * @return the current value of brakeHpValue
     */
    public int getBrakeHpValue() {
        return brakeHpValue;
    }

    /**
     * Setter method for brakeHpValue.
     *
     * @param aBrakeHpValue the new value for brakeHpValue
     */
    public void setBrakeHpValue(int aBrakeHpValue) {
        brakeHpValue = aBrakeHpValue;
    }

    /**
     * Access method for pmEmissionFactor.
     *
     * @return the current value of pmEmissionFactor
     */
    public BigDecimal getPmEmissionFactor() {
        return pmEmissionFactor;
    }

    /**
     * Setter method for pmEmissionFactor.
     *
     * @param aPmEmissionFactor the new value for pmEmissionFactor
     */
    public void setPmEmissionFactor(BigDecimal aPmEmissionFactor) {
        pmEmissionFactor = aPmEmissionFactor;
    }

    /**
     * Access method for fuelModifier.
     *
     * @return the current value of fuelModifier
     */
    public String getFuelModifier() {
        return fuelModifier;
    }

    /**
     * Setter method for fuelModifier.
     *
     * @param aFuelModifier the new value for fuelModifier
     */
    public void setFuelModifier(String aFuelModifier) {
        fuelModifier = aFuelModifier;
    }

    /**
     * Access method for electricUsePercent.
     *
     * @return the current value of electricUsePercent
     */
    public int getElectricUsePercent() {
        return electricUsePercent;
    }

    /**
     * Setter method for electricUsePercent.
     *
     * @param aElectricUsePercent the new value for electricUsePercent
     */
    public void setElectricUsePercent(int aElectricUsePercent) {
        electricUsePercent = aElectricUsePercent;
    }

    /**
     * Access method for pmEmissionFactorOverride.
     *
     * @return the current value of pmEmissionFactorOverride
     */
    public BigDecimal getPmEmissionFactorOverride() {
        return pmEmissionFactorOverride;
    }

    /**
     * Setter method for pmEmissionFactorOverride.
     *
     * @param aPmEmissionFactorOverride the new value for pmEmissionFactorOverride
     */
    public void setPmEmissionFactorOverride(BigDecimal aPmEmissionFactorOverride) {
        pmEmissionFactorOverride = aPmEmissionFactorOverride;
    }

    /**
     * Access method for filterControlEfficiency.
     *
     * @return the current value of filterControlEfficiency
     */
    public int getFilterControlEfficiency() {
        return filterControlEfficiency;
    }

    /**
     * Setter method for filterControlEfficiency.
     *
     * @param aFilterControlEfficiency the new value for filterControlEfficiency
     */
    public void setFilterControlEfficiency(int aFilterControlEfficiency) {
        filterControlEfficiency = aFilterControlEfficiency;
    }

    /**
     * Access method for netPmEmissionFactor.
     *
     * @return the current value of netPmEmissionFactor
     */
    public BigDecimal getNetPmEmissionFactor() {
        return netPmEmissionFactor;
    }

    /**
     * Setter method for netPmEmissionFactor.
     *
     * @param aNetPmEmissionFactor the new value for netPmEmissionFactor
     */
    public void setNetPmEmissionFactor(BigDecimal aNetPmEmissionFactor) {
        netPmEmissionFactor = aNetPmEmissionFactor;
    }

    /**
     * Access method for weightedEmissionFactor.
     *
     * @return the current value of weightedEmissionFactor
     */
    public BigDecimal getWeightedEmissionFactor() {
        return weightedEmissionFactor;
    }

    /**
     * Setter method for weightedEmissionFactor.
     *
     * @param aWeightedEmissionFactor the new value for weightedEmissionFactor
     */
    public void setWeightedEmissionFactor(BigDecimal aWeightedEmissionFactor) {
        weightedEmissionFactor = aWeightedEmissionFactor;
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
     * Access method for companyUid.
     *
     * @return the current value of companyUid
     */
    public int getCompanyUid() {
        return companyUid;
    }

    /**
     * Setter method for companyUid.
     *
     * @param aCompanyUid the new value for companyUid
     */
    public void setCompanyUid(int aCompanyUid) {
        companyUid = aCompanyUid;
    }

    /**
     * Access method for reportYear.
     *
     * @return the current value of reportYear
     */
    public int getReportYear() {
        return reportYear;
    }

    /**
     * Setter method for reportYear.
     *
     * @param aReportYear the new value for reportYear
     */
    public void setReportYear(int aReportYear) {
        reportYear = aReportYear;
    }

    /**
     * Access method for exportDate.
     *
     * @return the current value of exportDate
     */
    public Timestamp getExportDate() {
        return exportDate;
    }

    /**
     * Setter method for exportDate.
     *
     * @param aExportDate the new value for exportDate
     */
    public void setExportDate(Timestamp aExportDate) {
        exportDate = aExportDate;
    }

    /**
     * Compares the key for this instance with another FleetEmissionDetails.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class FleetEmissionDetails and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof FleetEmissionDetails)) {
            return false;
        }
        FleetEmissionDetails that = (FleetEmissionDetails) other;
        if (this.getDistFleetEmisRowUid() != that.getDistFleetEmisRowUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another FleetEmissionDetails.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof FleetEmissionDetails)) return false;
        return this.equalKeys(other) && ((FleetEmissionDetails)other).equalKeys(this);
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
        i = getDistFleetEmisRowUid();
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
        StringBuffer sb = new StringBuffer("[FleetEmissionDetails |");
        sb.append(" distFleetEmisRowUid=").append(getDistFleetEmisRowUid());
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
        ret.put("distFleetEmisRowUid", Integer.valueOf(getDistFleetEmisRowUid()));
        return ret;
    }

}
