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

@Entity(name="company_aud")
public class CompanyAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "companyAudUid";

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
    @Column(name="Company_Aud_UID", unique=true, nullable=false, precision=10)
    private int companyAudUid;
    @Column(name="Company_UID", nullable=false, precision=10)
    private int companyUid;
    @Column(name="Company_Name", length=100)
    private String companyName;
    @Column(name="OON", length=25)
    private String oon;
    @Column(name="Taxid_ARBN", nullable=false, length=25)
    private String taxidArbn;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Batch_Upload_Flag", length=1)
    private String batchUploadFlag;
    @Column(name="Ftp_Pswd", length=64)
    private String ftpPswd;
    @Column(name="Manages_Companies_Flag", nullable=false, length=1)
    private String managesCompaniesFlag;
    @Column(name="Registers_Equipment_Flag", nullable=false, length=1)
    private String registersEquipmentFlag;
    @Column(name="Old_Company_Number", length=60)
    private String oldCompanyNumber;
    @Column(name="Fleetsize_Lookup_UID", precision=10)
    private int fleetsizeLookupUid;
    @Column(name="DOT_Number", length=20)
    private String dotNumber;
    @Column(name="Motor_Carrier_Number", length=45)
    private String motorCarrierNumber;
    @Column(name="General_NOB", length=256)
    private String generalNob;
    @Column(name="WS_Token", length=256)
    private String wsToken;
    @Column(name="WS_Flag", nullable=false, length=1)
    private String wsFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Public_Flag", nullable=false, length=1)
    private String publicFlag;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;
    @Column(name="PEPS_Flag", length=1)
    private String pepsFlag;
    @Column(name="Military_Flag", nullable=false, length=1)
    private String militaryFlag;
    @Column(name="Rental_Co_Flag", nullable=false, length=1)
    private String rentalCoFlag;
    @Column(name="Perp_Equip_Duration", precision=10)
    private int perpEquipDuration;
    @Column(name="MilitaryDistrict_UID", precision=10)
    private int militaryDistrictUid;
    @Column(name="DistrictCode_UID", precision=10)
    private int districtCodeUid;
    @Column(name="AGSource_Flag", nullable=false, length=1)
    private String agSourceFlag;
    @Column(name="Confidential_Flag", length=1)
    private String confidentialFlag;

    /** Default constructor. */
    public CompanyAud() {
        super();
    }

    /**
     * Access method for companyAudUid.
     *
     * @return the current value of companyAudUid
     */
    public int getCompanyAudUid() {
        return companyAudUid;
    }

    /**
     * Setter method for companyAudUid.
     *
     * @param aCompanyAudUid the new value for companyAudUid
     */
    public void setCompanyAudUid(int aCompanyAudUid) {
        companyAudUid = aCompanyAudUid;
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
     * Access method for companyName.
     *
     * @return the current value of companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Setter method for companyName.
     *
     * @param aCompanyName the new value for companyName
     */
    public void setCompanyName(String aCompanyName) {
        companyName = aCompanyName;
    }

    /**
     * Access method for oon.
     *
     * @return the current value of oon
     */
    public String getOon() {
        return oon;
    }

    /**
     * Setter method for oon.
     *
     * @param aOon the new value for oon
     */
    public void setOon(String aOon) {
        oon = aOon;
    }

    /**
     * Access method for taxidArbn.
     *
     * @return the current value of taxidArbn
     */
    public String getTaxidArbn() {
        return taxidArbn;
    }

    /**
     * Setter method for taxidArbn.
     *
     * @param aTaxidArbn the new value for taxidArbn
     */
    public void setTaxidArbn(String aTaxidArbn) {
        taxidArbn = aTaxidArbn;
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
     * Access method for batchUploadFlag.
     *
     * @return the current value of batchUploadFlag
     */
    public String getBatchUploadFlag() {
        return batchUploadFlag;
    }

    /**
     * Setter method for batchUploadFlag.
     *
     * @param aBatchUploadFlag the new value for batchUploadFlag
     */
    public void setBatchUploadFlag(String aBatchUploadFlag) {
        batchUploadFlag = aBatchUploadFlag;
    }

    /**
     * Access method for ftpPswd.
     *
     * @return the current value of ftpPswd
     */
    public String getFtpPswd() {
        return ftpPswd;
    }

    /**
     * Setter method for ftpPswd.
     *
     * @param aFtpPswd the new value for ftpPswd
     */
    public void setFtpPswd(String aFtpPswd) {
        ftpPswd = aFtpPswd;
    }

    /**
     * Access method for managesCompaniesFlag.
     *
     * @return the current value of managesCompaniesFlag
     */
    public String getManagesCompaniesFlag() {
        return managesCompaniesFlag;
    }

    /**
     * Setter method for managesCompaniesFlag.
     *
     * @param aManagesCompaniesFlag the new value for managesCompaniesFlag
     */
    public void setManagesCompaniesFlag(String aManagesCompaniesFlag) {
        managesCompaniesFlag = aManagesCompaniesFlag;
    }

    /**
     * Access method for registersEquipmentFlag.
     *
     * @return the current value of registersEquipmentFlag
     */
    public String getRegistersEquipmentFlag() {
        return registersEquipmentFlag;
    }

    /**
     * Setter method for registersEquipmentFlag.
     *
     * @param aRegistersEquipmentFlag the new value for registersEquipmentFlag
     */
    public void setRegistersEquipmentFlag(String aRegistersEquipmentFlag) {
        registersEquipmentFlag = aRegistersEquipmentFlag;
    }

    /**
     * Access method for oldCompanyNumber.
     *
     * @return the current value of oldCompanyNumber
     */
    public String getOldCompanyNumber() {
        return oldCompanyNumber;
    }

    /**
     * Setter method for oldCompanyNumber.
     *
     * @param aOldCompanyNumber the new value for oldCompanyNumber
     */
    public void setOldCompanyNumber(String aOldCompanyNumber) {
        oldCompanyNumber = aOldCompanyNumber;
    }

    /**
     * Access method for fleetsizeLookupUid.
     *
     * @return the current value of fleetsizeLookupUid
     */
    public int getFleetsizeLookupUid() {
        return fleetsizeLookupUid;
    }

    /**
     * Setter method for fleetsizeLookupUid.
     *
     * @param aFleetsizeLookupUid the new value for fleetsizeLookupUid
     */
    public void setFleetsizeLookupUid(int aFleetsizeLookupUid) {
        fleetsizeLookupUid = aFleetsizeLookupUid;
    }

    /**
     * Access method for dotNumber.
     *
     * @return the current value of dotNumber
     */
    public String getDotNumber() {
        return dotNumber;
    }

    /**
     * Setter method for dotNumber.
     *
     * @param aDotNumber the new value for dotNumber
     */
    public void setDotNumber(String aDotNumber) {
        dotNumber = aDotNumber;
    }

    /**
     * Access method for motorCarrierNumber.
     *
     * @return the current value of motorCarrierNumber
     */
    public String getMotorCarrierNumber() {
        return motorCarrierNumber;
    }

    /**
     * Setter method for motorCarrierNumber.
     *
     * @param aMotorCarrierNumber the new value for motorCarrierNumber
     */
    public void setMotorCarrierNumber(String aMotorCarrierNumber) {
        motorCarrierNumber = aMotorCarrierNumber;
    }

    /**
     * Access method for generalNob.
     *
     * @return the current value of generalNob
     */
    public String getGeneralNob() {
        return generalNob;
    }

    /**
     * Setter method for generalNob.
     *
     * @param aGeneralNob the new value for generalNob
     */
    public void setGeneralNob(String aGeneralNob) {
        generalNob = aGeneralNob;
    }

    /**
     * Access method for wsToken.
     *
     * @return the current value of wsToken
     */
    public String getWsToken() {
        return wsToken;
    }

    /**
     * Setter method for wsToken.
     *
     * @param aWsToken the new value for wsToken
     */
    public void setWsToken(String aWsToken) {
        wsToken = aWsToken;
    }

    /**
     * Access method for wsFlag.
     *
     * @return the current value of wsFlag
     */
    public String getWsFlag() {
        return wsFlag;
    }

    /**
     * Setter method for wsFlag.
     *
     * @param aWsFlag the new value for wsFlag
     */
    public void setWsFlag(String aWsFlag) {
        wsFlag = aWsFlag;
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
     * Access method for publicFlag.
     *
     * @return the current value of publicFlag
     */
    public String getPublicFlag() {
        return publicFlag;
    }

    /**
     * Setter method for publicFlag.
     *
     * @param aPublicFlag the new value for publicFlag
     */
    public void setPublicFlag(String aPublicFlag) {
        publicFlag = aPublicFlag;
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
     * Access method for pepsFlag.
     *
     * @return the current value of pepsFlag
     */
    public String getPepsFlag() {
        return pepsFlag;
    }

    /**
     * Setter method for pepsFlag.
     *
     * @param aPepsFlag the new value for pepsFlag
     */
    public void setPepsFlag(String aPepsFlag) {
        pepsFlag = aPepsFlag;
    }

    /**
     * Access method for militaryFlag.
     *
     * @return the current value of militaryFlag
     */
    public String getMilitaryFlag() {
        return militaryFlag;
    }

    /**
     * Setter method for militaryFlag.
     *
     * @param aMilitaryFlag the new value for militaryFlag
     */
    public void setMilitaryFlag(String aMilitaryFlag) {
        militaryFlag = aMilitaryFlag;
    }

    /**
     * Access method for rentalCoFlag.
     *
     * @return the current value of rentalCoFlag
     */
    public String getRentalCoFlag() {
        return rentalCoFlag;
    }

    /**
     * Setter method for rentalCoFlag.
     *
     * @param aRentalCoFlag the new value for rentalCoFlag
     */
    public void setRentalCoFlag(String aRentalCoFlag) {
        rentalCoFlag = aRentalCoFlag;
    }

    /**
     * Access method for perpEquipDuration.
     *
     * @return the current value of perpEquipDuration
     */
    public int getPerpEquipDuration() {
        return perpEquipDuration;
    }

    /**
     * Setter method for perpEquipDuration.
     *
     * @param aPerpEquipDuration the new value for perpEquipDuration
     */
    public void setPerpEquipDuration(int aPerpEquipDuration) {
        perpEquipDuration = aPerpEquipDuration;
    }

    /**
     * Access method for militaryDistrictUid.
     *
     * @return the current value of militaryDistrictUid
     */
    public int getMilitaryDistrictUid() {
        return militaryDistrictUid;
    }

    /**
     * Setter method for militaryDistrictUid.
     *
     * @param aMilitaryDistrictUid the new value for militaryDistrictUid
     */
    public void setMilitaryDistrictUid(int aMilitaryDistrictUid) {
        militaryDistrictUid = aMilitaryDistrictUid;
    }

    /**
     * Access method for districtCodeUid.
     *
     * @return the current value of districtCodeUid
     */
    public int getDistrictCodeUid() {
        return districtCodeUid;
    }

    /**
     * Setter method for districtCodeUid.
     *
     * @param aDistrictCodeUid the new value for districtCodeUid
     */
    public void setDistrictCodeUid(int aDistrictCodeUid) {
        districtCodeUid = aDistrictCodeUid;
    }

    /**
     * Access method for agSourceFlag.
     *
     * @return the current value of agSourceFlag
     */
    public String getAgSourceFlag() {
        return agSourceFlag;
    }

    /**
     * Setter method for agSourceFlag.
     *
     * @param aAgSourceFlag the new value for agSourceFlag
     */
    public void setAgSourceFlag(String aAgSourceFlag) {
        agSourceFlag = aAgSourceFlag;
    }

    /**
     * Access method for confidentialFlag.
     *
     * @return the current value of confidentialFlag
     */
    public String getConfidentialFlag() {
        return confidentialFlag;
    }

    /**
     * Setter method for confidentialFlag.
     *
     * @param aConfidentialFlag the new value for confidentialFlag
     */
    public void setConfidentialFlag(String aConfidentialFlag) {
        confidentialFlag = aConfidentialFlag;
    }

    /**
     * Compares the key for this instance with another CompanyAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CompanyAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CompanyAud)) {
            return false;
        }
        CompanyAud that = (CompanyAud) other;
        if (this.getCompanyAudUid() != that.getCompanyAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CompanyAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CompanyAud)) return false;
        return this.equalKeys(other) && ((CompanyAud)other).equalKeys(this);
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
        i = getCompanyAudUid();
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
        StringBuffer sb = new StringBuffer("[CompanyAud |");
        sb.append(" companyAudUid=").append(getCompanyAudUid());
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
        ret.put("companyAudUid", Integer.valueOf(getCompanyAudUid()));
        return ret;
    }

}
