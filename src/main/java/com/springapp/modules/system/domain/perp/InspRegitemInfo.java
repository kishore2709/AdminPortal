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

@Entity(name="insp_regitem_info")
public class InspRegitemInfo implements Serializable {

    /** Primary key. */
    protected static final String PK = "inspRegItemInfoUid";

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
    @Column(name="InspRegItemInfo_UID", unique=true, nullable=false, precision=10)
    private int inspRegItemInfoUid;
    @Column(name="BrakeHPRanges_UID", precision=10)
    private int brakeHpRangesUid;
    @Column(name="BrakeHPRanges_Units_UID", precision=10)
    private int brakeHpRangesUnitsUid;
    @Column(name="BrakeHPValue", precision=10)
    private int brakeHpValue;
    @Column(name="CARBCertNumber", length=50)
    private String carbCertNumber;
    @Column(name="Company_Uint_ID", length=50)
    private String companyUintId;
    @Column(name="Corrections", length=255)
    private String corrections;
    @Column(name="Description")
    private String description;
    @Column(name="District_UID", precision=10)
    private int districtUid;
    @Column(name="Engine_Family", length=12)
    private String engineFamily;
    @Column(name="EnginePowersType_UID", precision=10)
    private int enginePowersTypeUid;
    @Column(name="EPACertNumber", length=50)
    private String epaCertNumber;
    @Column(name="Expiration_Date")
    private Date expirationDate;
    @Column(name="Manufacturer_UID", precision=10)
    private int manufacturerUid;
    @Column(name="Model", length=75)
    private String model;
    @Column(name="ModelYear_UID", precision=10)
    private int modelYearUid;
    @Column(name="RegItemSubType_UID", precision=10)
    private int regItemSubTypeUid;
    @Column(name="RegItemSubSubTypes_UID", precision=10)
    private int regItemSubSubTypesUid;
    @Column(name="RegItemType_UID", precision=10)
    private int regItemTypeUid;
    @Column(name="Serial_No", length=75)
    private String serialNo;
    @Column(name="Certificate_No", precision=10)
    private int certificateNo;
    @Column(name="SuspectedStolen_Flag", length=1)
    private String suspectedStolenFlag;
    @Column(name="Actual_Controls_List", length=512)
    private String actualControlsList;
    @Column(name="Actual_Materials_List", length=512)
    private String actualMaterialsList;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Legacy_AEAbrasives", length=50)
    private String legacyAeAbrasives;
    @Column(name="Legacy_AEConsistent_Flag", length=50)
    private String legacyAeConsistentFlag;
    @Column(name="Legacy_AEConsistentNot_Comment", length=255)
    private String legacyAeConsistentNotComment;
    @Column(name="Legacy_AEEngineAssoc", length=255)
    private String legacyAeEngineAssoc;
    @Column(name="Legacy_AEType", length=75)
    private String legacyAeType;
    @Column(name="Legacy_EngineEmissionsControls", length=50)
    private String legacyEngineEmissionsControls;
    @Column(name="Legacy_EngineEquipmentAssoc", length=255)
    private String legacyEngineEquipmentAssoc;
    @Column(name="Legacy_EngineOtherEmissionsControl", length=75)
    private String legacyEngineOtherEmissionsControl;
    @Column(name="Legacy_Make", length=75)
    private String legacyMake;
    @Column(name="Legacy_SparkOrCompression", length=50)
    private String legacySparkOrCompression;
    @Column(name="Manufacturer_Other", length=60)
    private String manufacturerOther;
    @Column(name="Rental_Flag", length=1)
    private String rentalFlag;
    @Column(name="Actual_Blasting_List", length=512)
    private String actualBlastingList;
    @Column(name="Tier_UID", precision=10)
    private int tierUid;
    @ManyToOne
    @JoinColumn(name="Inspection_UID")
    private Inspections inspections;

    /** Default constructor. */
    public InspRegitemInfo() {
        super();
    }

    /**
     * Access method for inspRegItemInfoUid.
     *
     * @return the current value of inspRegItemInfoUid
     */
    public int getInspRegItemInfoUid() {
        return inspRegItemInfoUid;
    }

    /**
     * Setter method for inspRegItemInfoUid.
     *
     * @param aInspRegItemInfoUid the new value for inspRegItemInfoUid
     */
    public void setInspRegItemInfoUid(int aInspRegItemInfoUid) {
        inspRegItemInfoUid = aInspRegItemInfoUid;
    }

    /**
     * Access method for brakeHpRangesUid.
     *
     * @return the current value of brakeHpRangesUid
     */
    public int getBrakeHpRangesUid() {
        return brakeHpRangesUid;
    }

    /**
     * Setter method for brakeHpRangesUid.
     *
     * @param aBrakeHpRangesUid the new value for brakeHpRangesUid
     */
    public void setBrakeHpRangesUid(int aBrakeHpRangesUid) {
        brakeHpRangesUid = aBrakeHpRangesUid;
    }

    /**
     * Access method for brakeHpRangesUnitsUid.
     *
     * @return the current value of brakeHpRangesUnitsUid
     */
    public int getBrakeHpRangesUnitsUid() {
        return brakeHpRangesUnitsUid;
    }

    /**
     * Setter method for brakeHpRangesUnitsUid.
     *
     * @param aBrakeHpRangesUnitsUid the new value for brakeHpRangesUnitsUid
     */
    public void setBrakeHpRangesUnitsUid(int aBrakeHpRangesUnitsUid) {
        brakeHpRangesUnitsUid = aBrakeHpRangesUnitsUid;
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
     * Access method for carbCertNumber.
     *
     * @return the current value of carbCertNumber
     */
    public String getCarbCertNumber() {
        return carbCertNumber;
    }

    /**
     * Setter method for carbCertNumber.
     *
     * @param aCarbCertNumber the new value for carbCertNumber
     */
    public void setCarbCertNumber(String aCarbCertNumber) {
        carbCertNumber = aCarbCertNumber;
    }

    /**
     * Access method for companyUintId.
     *
     * @return the current value of companyUintId
     */
    public String getCompanyUintId() {
        return companyUintId;
    }

    /**
     * Setter method for companyUintId.
     *
     * @param aCompanyUintId the new value for companyUintId
     */
    public void setCompanyUintId(String aCompanyUintId) {
        companyUintId = aCompanyUintId;
    }

    /**
     * Access method for corrections.
     *
     * @return the current value of corrections
     */
    public String getCorrections() {
        return corrections;
    }

    /**
     * Setter method for corrections.
     *
     * @param aCorrections the new value for corrections
     */
    public void setCorrections(String aCorrections) {
        corrections = aCorrections;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    /**
     * Access method for districtUid.
     *
     * @return the current value of districtUid
     */
    public int getDistrictUid() {
        return districtUid;
    }

    /**
     * Setter method for districtUid.
     *
     * @param aDistrictUid the new value for districtUid
     */
    public void setDistrictUid(int aDistrictUid) {
        districtUid = aDistrictUid;
    }

    /**
     * Access method for engineFamily.
     *
     * @return the current value of engineFamily
     */
    public String getEngineFamily() {
        return engineFamily;
    }

    /**
     * Setter method for engineFamily.
     *
     * @param aEngineFamily the new value for engineFamily
     */
    public void setEngineFamily(String aEngineFamily) {
        engineFamily = aEngineFamily;
    }

    /**
     * Access method for enginePowersTypeUid.
     *
     * @return the current value of enginePowersTypeUid
     */
    public int getEnginePowersTypeUid() {
        return enginePowersTypeUid;
    }

    /**
     * Setter method for enginePowersTypeUid.
     *
     * @param aEnginePowersTypeUid the new value for enginePowersTypeUid
     */
    public void setEnginePowersTypeUid(int aEnginePowersTypeUid) {
        enginePowersTypeUid = aEnginePowersTypeUid;
    }

    /**
     * Access method for epaCertNumber.
     *
     * @return the current value of epaCertNumber
     */
    public String getEpaCertNumber() {
        return epaCertNumber;
    }

    /**
     * Setter method for epaCertNumber.
     *
     * @param aEpaCertNumber the new value for epaCertNumber
     */
    public void setEpaCertNumber(String aEpaCertNumber) {
        epaCertNumber = aEpaCertNumber;
    }

    /**
     * Access method for expirationDate.
     *
     * @return the current value of expirationDate
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * Setter method for expirationDate.
     *
     * @param aExpirationDate the new value for expirationDate
     */
    public void setExpirationDate(Date aExpirationDate) {
        expirationDate = aExpirationDate;
    }

    /**
     * Access method for manufacturerUid.
     *
     * @return the current value of manufacturerUid
     */
    public int getManufacturerUid() {
        return manufacturerUid;
    }

    /**
     * Setter method for manufacturerUid.
     *
     * @param aManufacturerUid the new value for manufacturerUid
     */
    public void setManufacturerUid(int aManufacturerUid) {
        manufacturerUid = aManufacturerUid;
    }

    /**
     * Access method for model.
     *
     * @return the current value of model
     */
    public String getModel() {
        return model;
    }

    /**
     * Setter method for model.
     *
     * @param aModel the new value for model
     */
    public void setModel(String aModel) {
        model = aModel;
    }

    /**
     * Access method for modelYearUid.
     *
     * @return the current value of modelYearUid
     */
    public int getModelYearUid() {
        return modelYearUid;
    }

    /**
     * Setter method for modelYearUid.
     *
     * @param aModelYearUid the new value for modelYearUid
     */
    public void setModelYearUid(int aModelYearUid) {
        modelYearUid = aModelYearUid;
    }

    /**
     * Access method for regItemSubTypeUid.
     *
     * @return the current value of regItemSubTypeUid
     */
    public int getRegItemSubTypeUid() {
        return regItemSubTypeUid;
    }

    /**
     * Setter method for regItemSubTypeUid.
     *
     * @param aRegItemSubTypeUid the new value for regItemSubTypeUid
     */
    public void setRegItemSubTypeUid(int aRegItemSubTypeUid) {
        regItemSubTypeUid = aRegItemSubTypeUid;
    }

    /**
     * Access method for regItemSubSubTypesUid.
     *
     * @return the current value of regItemSubSubTypesUid
     */
    public int getRegItemSubSubTypesUid() {
        return regItemSubSubTypesUid;
    }

    /**
     * Setter method for regItemSubSubTypesUid.
     *
     * @param aRegItemSubSubTypesUid the new value for regItemSubSubTypesUid
     */
    public void setRegItemSubSubTypesUid(int aRegItemSubSubTypesUid) {
        regItemSubSubTypesUid = aRegItemSubSubTypesUid;
    }

    /**
     * Access method for regItemTypeUid.
     *
     * @return the current value of regItemTypeUid
     */
    public int getRegItemTypeUid() {
        return regItemTypeUid;
    }

    /**
     * Setter method for regItemTypeUid.
     *
     * @param aRegItemTypeUid the new value for regItemTypeUid
     */
    public void setRegItemTypeUid(int aRegItemTypeUid) {
        regItemTypeUid = aRegItemTypeUid;
    }

    /**
     * Access method for serialNo.
     *
     * @return the current value of serialNo
     */
    public String getSerialNo() {
        return serialNo;
    }

    /**
     * Setter method for serialNo.
     *
     * @param aSerialNo the new value for serialNo
     */
    public void setSerialNo(String aSerialNo) {
        serialNo = aSerialNo;
    }

    /**
     * Access method for certificateNo.
     *
     * @return the current value of certificateNo
     */
    public int getCertificateNo() {
        return certificateNo;
    }

    /**
     * Setter method for certificateNo.
     *
     * @param aCertificateNo the new value for certificateNo
     */
    public void setCertificateNo(int aCertificateNo) {
        certificateNo = aCertificateNo;
    }

    /**
     * Access method for suspectedStolenFlag.
     *
     * @return the current value of suspectedStolenFlag
     */
    public String getSuspectedStolenFlag() {
        return suspectedStolenFlag;
    }

    /**
     * Setter method for suspectedStolenFlag.
     *
     * @param aSuspectedStolenFlag the new value for suspectedStolenFlag
     */
    public void setSuspectedStolenFlag(String aSuspectedStolenFlag) {
        suspectedStolenFlag = aSuspectedStolenFlag;
    }

    /**
     * Access method for actualControlsList.
     *
     * @return the current value of actualControlsList
     */
    public String getActualControlsList() {
        return actualControlsList;
    }

    /**
     * Setter method for actualControlsList.
     *
     * @param aActualControlsList the new value for actualControlsList
     */
    public void setActualControlsList(String aActualControlsList) {
        actualControlsList = aActualControlsList;
    }

    /**
     * Access method for actualMaterialsList.
     *
     * @return the current value of actualMaterialsList
     */
    public String getActualMaterialsList() {
        return actualMaterialsList;
    }

    /**
     * Setter method for actualMaterialsList.
     *
     * @param aActualMaterialsList the new value for actualMaterialsList
     */
    public void setActualMaterialsList(String aActualMaterialsList) {
        actualMaterialsList = aActualMaterialsList;
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
     * Access method for legacyAeAbrasives.
     *
     * @return the current value of legacyAeAbrasives
     */
    public String getLegacyAeAbrasives() {
        return legacyAeAbrasives;
    }

    /**
     * Setter method for legacyAeAbrasives.
     *
     * @param aLegacyAeAbrasives the new value for legacyAeAbrasives
     */
    public void setLegacyAeAbrasives(String aLegacyAeAbrasives) {
        legacyAeAbrasives = aLegacyAeAbrasives;
    }

    /**
     * Access method for legacyAeConsistentFlag.
     *
     * @return the current value of legacyAeConsistentFlag
     */
    public String getLegacyAeConsistentFlag() {
        return legacyAeConsistentFlag;
    }

    /**
     * Setter method for legacyAeConsistentFlag.
     *
     * @param aLegacyAeConsistentFlag the new value for legacyAeConsistentFlag
     */
    public void setLegacyAeConsistentFlag(String aLegacyAeConsistentFlag) {
        legacyAeConsistentFlag = aLegacyAeConsistentFlag;
    }

    /**
     * Access method for legacyAeConsistentNotComment.
     *
     * @return the current value of legacyAeConsistentNotComment
     */
    public String getLegacyAeConsistentNotComment() {
        return legacyAeConsistentNotComment;
    }

    /**
     * Setter method for legacyAeConsistentNotComment.
     *
     * @param aLegacyAeConsistentNotComment the new value for legacyAeConsistentNotComment
     */
    public void setLegacyAeConsistentNotComment(String aLegacyAeConsistentNotComment) {
        legacyAeConsistentNotComment = aLegacyAeConsistentNotComment;
    }

    /**
     * Access method for legacyAeEngineAssoc.
     *
     * @return the current value of legacyAeEngineAssoc
     */
    public String getLegacyAeEngineAssoc() {
        return legacyAeEngineAssoc;
    }

    /**
     * Setter method for legacyAeEngineAssoc.
     *
     * @param aLegacyAeEngineAssoc the new value for legacyAeEngineAssoc
     */
    public void setLegacyAeEngineAssoc(String aLegacyAeEngineAssoc) {
        legacyAeEngineAssoc = aLegacyAeEngineAssoc;
    }

    /**
     * Access method for legacyAeType.
     *
     * @return the current value of legacyAeType
     */
    public String getLegacyAeType() {
        return legacyAeType;
    }

    /**
     * Setter method for legacyAeType.
     *
     * @param aLegacyAeType the new value for legacyAeType
     */
    public void setLegacyAeType(String aLegacyAeType) {
        legacyAeType = aLegacyAeType;
    }

    /**
     * Access method for legacyEngineEmissionsControls.
     *
     * @return the current value of legacyEngineEmissionsControls
     */
    public String getLegacyEngineEmissionsControls() {
        return legacyEngineEmissionsControls;
    }

    /**
     * Setter method for legacyEngineEmissionsControls.
     *
     * @param aLegacyEngineEmissionsControls the new value for legacyEngineEmissionsControls
     */
    public void setLegacyEngineEmissionsControls(String aLegacyEngineEmissionsControls) {
        legacyEngineEmissionsControls = aLegacyEngineEmissionsControls;
    }

    /**
     * Access method for legacyEngineEquipmentAssoc.
     *
     * @return the current value of legacyEngineEquipmentAssoc
     */
    public String getLegacyEngineEquipmentAssoc() {
        return legacyEngineEquipmentAssoc;
    }

    /**
     * Setter method for legacyEngineEquipmentAssoc.
     *
     * @param aLegacyEngineEquipmentAssoc the new value for legacyEngineEquipmentAssoc
     */
    public void setLegacyEngineEquipmentAssoc(String aLegacyEngineEquipmentAssoc) {
        legacyEngineEquipmentAssoc = aLegacyEngineEquipmentAssoc;
    }

    /**
     * Access method for legacyEngineOtherEmissionsControl.
     *
     * @return the current value of legacyEngineOtherEmissionsControl
     */
    public String getLegacyEngineOtherEmissionsControl() {
        return legacyEngineOtherEmissionsControl;
    }

    /**
     * Setter method for legacyEngineOtherEmissionsControl.
     *
     * @param aLegacyEngineOtherEmissionsControl the new value for legacyEngineOtherEmissionsControl
     */
    public void setLegacyEngineOtherEmissionsControl(String aLegacyEngineOtherEmissionsControl) {
        legacyEngineOtherEmissionsControl = aLegacyEngineOtherEmissionsControl;
    }

    /**
     * Access method for legacyMake.
     *
     * @return the current value of legacyMake
     */
    public String getLegacyMake() {
        return legacyMake;
    }

    /**
     * Setter method for legacyMake.
     *
     * @param aLegacyMake the new value for legacyMake
     */
    public void setLegacyMake(String aLegacyMake) {
        legacyMake = aLegacyMake;
    }

    /**
     * Access method for legacySparkOrCompression.
     *
     * @return the current value of legacySparkOrCompression
     */
    public String getLegacySparkOrCompression() {
        return legacySparkOrCompression;
    }

    /**
     * Setter method for legacySparkOrCompression.
     *
     * @param aLegacySparkOrCompression the new value for legacySparkOrCompression
     */
    public void setLegacySparkOrCompression(String aLegacySparkOrCompression) {
        legacySparkOrCompression = aLegacySparkOrCompression;
    }

    /**
     * Access method for manufacturerOther.
     *
     * @return the current value of manufacturerOther
     */
    public String getManufacturerOther() {
        return manufacturerOther;
    }

    /**
     * Setter method for manufacturerOther.
     *
     * @param aManufacturerOther the new value for manufacturerOther
     */
    public void setManufacturerOther(String aManufacturerOther) {
        manufacturerOther = aManufacturerOther;
    }

    /**
     * Access method for rentalFlag.
     *
     * @return the current value of rentalFlag
     */
    public String getRentalFlag() {
        return rentalFlag;
    }

    /**
     * Setter method for rentalFlag.
     *
     * @param aRentalFlag the new value for rentalFlag
     */
    public void setRentalFlag(String aRentalFlag) {
        rentalFlag = aRentalFlag;
    }

    /**
     * Access method for actualBlastingList.
     *
     * @return the current value of actualBlastingList
     */
    public String getActualBlastingList() {
        return actualBlastingList;
    }

    /**
     * Setter method for actualBlastingList.
     *
     * @param aActualBlastingList the new value for actualBlastingList
     */
    public void setActualBlastingList(String aActualBlastingList) {
        actualBlastingList = aActualBlastingList;
    }

    /**
     * Access method for tierUid.
     *
     * @return the current value of tierUid
     */
    public int getTierUid() {
        return tierUid;
    }

    /**
     * Setter method for tierUid.
     *
     * @param aTierUid the new value for tierUid
     */
    public void setTierUid(int aTierUid) {
        tierUid = aTierUid;
    }

    /**
     * Access method for inspections.
     *
     * @return the current value of inspections
     */
    public Inspections getInspections() {
        return inspections;
    }

    /**
     * Setter method for inspections.
     *
     * @param aInspections the new value for inspections
     */
    public void setInspections(Inspections aInspections) {
        inspections = aInspections;
    }

    /**
     * Compares the key for this instance with another InspRegitemInfo.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class InspRegitemInfo and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof InspRegitemInfo)) {
            return false;
        }
        InspRegitemInfo that = (InspRegitemInfo) other;
        if (this.getInspRegItemInfoUid() != that.getInspRegItemInfoUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another InspRegitemInfo.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof InspRegitemInfo)) return false;
        return this.equalKeys(other) && ((InspRegitemInfo)other).equalKeys(this);
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
        i = getInspRegItemInfoUid();
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
        StringBuffer sb = new StringBuffer("[InspRegitemInfo |");
        sb.append(" inspRegItemInfoUid=").append(getInspRegItemInfoUid());
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
        ret.put("inspRegItemInfoUid", Integer.valueOf(getInspRegItemInfoUid()));
        return ret;
    }

}
