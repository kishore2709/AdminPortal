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

@Entity(name="compliance_information_aud")
public class ComplianceInformationAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "complianceInformationAudUid";

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
    @Column(name="Compliance_Information_Aud_UID", unique=true, nullable=false, precision=10)
    private int complianceInformationAudUid;
    @Column(name="Compliance_Information_UID", nullable=false, precision=10)
    private int complianceInformationUid;
    @Column(name="Compliance_Standard_Type_UID", nullable=false, precision=10)
    private int complianceStandardTypeUid;
    @Column(name="Received_Date")
    private Date receivedDate;
    @Column(name="Cert_Date")
    private Date certDate;
    @Column(name="Cert_By_UID", precision=10)
    private int certByUid;
    @Column(name="Verification_Date")
    private Date verificationDate;
    @Column(name="Verification_By_UID", precision=10)
    private int verificationByUid;
    @Column(name="Compliance_Date")
    private Date complianceDate;
    @Column(name="VDECS_Manufact_UID", precision=10)
    private int vdecsManufactUid;
    @Column(name="VDECS_Serial_Number", length=45)
    private String vdecsSerialNumber;
    @Column(name="VDECS_Family_Name_Type_UID", precision=10)
    private int vdecsFamilyNameTypeUid;
    @Column(name="VDECS_Manufact_Date")
    private Date vdecsManufactDate;
    @Column(name="VDECS_Install_Date")
    private Date vdecsInstallDate;
    @Column(name="Alt_Tech_Type_UID", precision=10)
    private int altTechTypeUid;
    @Column(name="Other_Desc", length=45)
    private String otherDesc;
    @Column(name="Alt_Tech_Install_Date")
    private Date altTechInstallDate;
    @Column(name="Exempt_Extend", length=10)
    private String exemptExtend;
    @Column(name="Extend_Years", precision=10)
    private int extendYears;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;
    @Column(name="tru_uletru_extension_flag", length=1)
    private String truUletruExtensionFlag;
    @Column(name="tru_uletru_extension_date")
    private Timestamp truUletruExtensionDate;
    @Column(name="tru_letru_extension_flag", length=1)
    private String truLetruExtensionFlag;
    @Column(name="tru_letru_extension_date")
    private Timestamp truLetruExtensionDate;
    @Column(name="tru_exempt_reasons_uid", precision=10)
    private int truExemptReasonsUid;
    @Column(name="tru_exempt_date")
    private Timestamp truExemptDate;

    /** Default constructor. */
    public ComplianceInformationAud() {
        super();
    }

    /**
     * Access method for complianceInformationAudUid.
     *
     * @return the current value of complianceInformationAudUid
     */
    public int getComplianceInformationAudUid() {
        return complianceInformationAudUid;
    }

    /**
     * Setter method for complianceInformationAudUid.
     *
     * @param aComplianceInformationAudUid the new value for complianceInformationAudUid
     */
    public void setComplianceInformationAudUid(int aComplianceInformationAudUid) {
        complianceInformationAudUid = aComplianceInformationAudUid;
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
     * Access method for complianceStandardTypeUid.
     *
     * @return the current value of complianceStandardTypeUid
     */
    public int getComplianceStandardTypeUid() {
        return complianceStandardTypeUid;
    }

    /**
     * Setter method for complianceStandardTypeUid.
     *
     * @param aComplianceStandardTypeUid the new value for complianceStandardTypeUid
     */
    public void setComplianceStandardTypeUid(int aComplianceStandardTypeUid) {
        complianceStandardTypeUid = aComplianceStandardTypeUid;
    }

    /**
     * Access method for receivedDate.
     *
     * @return the current value of receivedDate
     */
    public Date getReceivedDate() {
        return receivedDate;
    }

    /**
     * Setter method for receivedDate.
     *
     * @param aReceivedDate the new value for receivedDate
     */
    public void setReceivedDate(Date aReceivedDate) {
        receivedDate = aReceivedDate;
    }

    /**
     * Access method for certDate.
     *
     * @return the current value of certDate
     */
    public Date getCertDate() {
        return certDate;
    }

    /**
     * Setter method for certDate.
     *
     * @param aCertDate the new value for certDate
     */
    public void setCertDate(Date aCertDate) {
        certDate = aCertDate;
    }

    /**
     * Access method for certByUid.
     *
     * @return the current value of certByUid
     */
    public int getCertByUid() {
        return certByUid;
    }

    /**
     * Setter method for certByUid.
     *
     * @param aCertByUid the new value for certByUid
     */
    public void setCertByUid(int aCertByUid) {
        certByUid = aCertByUid;
    }

    /**
     * Access method for verificationDate.
     *
     * @return the current value of verificationDate
     */
    public Date getVerificationDate() {
        return verificationDate;
    }

    /**
     * Setter method for verificationDate.
     *
     * @param aVerificationDate the new value for verificationDate
     */
    public void setVerificationDate(Date aVerificationDate) {
        verificationDate = aVerificationDate;
    }

    /**
     * Access method for verificationByUid.
     *
     * @return the current value of verificationByUid
     */
    public int getVerificationByUid() {
        return verificationByUid;
    }

    /**
     * Setter method for verificationByUid.
     *
     * @param aVerificationByUid the new value for verificationByUid
     */
    public void setVerificationByUid(int aVerificationByUid) {
        verificationByUid = aVerificationByUid;
    }

    /**
     * Access method for complianceDate.
     *
     * @return the current value of complianceDate
     */
    public Date getComplianceDate() {
        return complianceDate;
    }

    /**
     * Setter method for complianceDate.
     *
     * @param aComplianceDate the new value for complianceDate
     */
    public void setComplianceDate(Date aComplianceDate) {
        complianceDate = aComplianceDate;
    }

    /**
     * Access method for vdecsManufactUid.
     *
     * @return the current value of vdecsManufactUid
     */
    public int getVdecsManufactUid() {
        return vdecsManufactUid;
    }

    /**
     * Setter method for vdecsManufactUid.
     *
     * @param aVdecsManufactUid the new value for vdecsManufactUid
     */
    public void setVdecsManufactUid(int aVdecsManufactUid) {
        vdecsManufactUid = aVdecsManufactUid;
    }

    /**
     * Access method for vdecsSerialNumber.
     *
     * @return the current value of vdecsSerialNumber
     */
    public String getVdecsSerialNumber() {
        return vdecsSerialNumber;
    }

    /**
     * Setter method for vdecsSerialNumber.
     *
     * @param aVdecsSerialNumber the new value for vdecsSerialNumber
     */
    public void setVdecsSerialNumber(String aVdecsSerialNumber) {
        vdecsSerialNumber = aVdecsSerialNumber;
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
     * Access method for vdecsManufactDate.
     *
     * @return the current value of vdecsManufactDate
     */
    public Date getVdecsManufactDate() {
        return vdecsManufactDate;
    }

    /**
     * Setter method for vdecsManufactDate.
     *
     * @param aVdecsManufactDate the new value for vdecsManufactDate
     */
    public void setVdecsManufactDate(Date aVdecsManufactDate) {
        vdecsManufactDate = aVdecsManufactDate;
    }

    /**
     * Access method for vdecsInstallDate.
     *
     * @return the current value of vdecsInstallDate
     */
    public Date getVdecsInstallDate() {
        return vdecsInstallDate;
    }

    /**
     * Setter method for vdecsInstallDate.
     *
     * @param aVdecsInstallDate the new value for vdecsInstallDate
     */
    public void setVdecsInstallDate(Date aVdecsInstallDate) {
        vdecsInstallDate = aVdecsInstallDate;
    }

    /**
     * Access method for altTechTypeUid.
     *
     * @return the current value of altTechTypeUid
     */
    public int getAltTechTypeUid() {
        return altTechTypeUid;
    }

    /**
     * Setter method for altTechTypeUid.
     *
     * @param aAltTechTypeUid the new value for altTechTypeUid
     */
    public void setAltTechTypeUid(int aAltTechTypeUid) {
        altTechTypeUid = aAltTechTypeUid;
    }

    /**
     * Access method for otherDesc.
     *
     * @return the current value of otherDesc
     */
    public String getOtherDesc() {
        return otherDesc;
    }

    /**
     * Setter method for otherDesc.
     *
     * @param aOtherDesc the new value for otherDesc
     */
    public void setOtherDesc(String aOtherDesc) {
        otherDesc = aOtherDesc;
    }

    /**
     * Access method for altTechInstallDate.
     *
     * @return the current value of altTechInstallDate
     */
    public Date getAltTechInstallDate() {
        return altTechInstallDate;
    }

    /**
     * Setter method for altTechInstallDate.
     *
     * @param aAltTechInstallDate the new value for altTechInstallDate
     */
    public void setAltTechInstallDate(Date aAltTechInstallDate) {
        altTechInstallDate = aAltTechInstallDate;
    }

    /**
     * Access method for exemptExtend.
     *
     * @return the current value of exemptExtend
     */
    public String getExemptExtend() {
        return exemptExtend;
    }

    /**
     * Setter method for exemptExtend.
     *
     * @param aExemptExtend the new value for exemptExtend
     */
    public void setExemptExtend(String aExemptExtend) {
        exemptExtend = aExemptExtend;
    }

    /**
     * Access method for extendYears.
     *
     * @return the current value of extendYears
     */
    public int getExtendYears() {
        return extendYears;
    }

    /**
     * Setter method for extendYears.
     *
     * @param aExtendYears the new value for extendYears
     */
    public void setExtendYears(int aExtendYears) {
        extendYears = aExtendYears;
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
     * Access method for truUletruExtensionFlag.
     *
     * @return the current value of truUletruExtensionFlag
     */
    public String getTruUletruExtensionFlag() {
        return truUletruExtensionFlag;
    }

    /**
     * Setter method for truUletruExtensionFlag.
     *
     * @param aTruUletruExtensionFlag the new value for truUletruExtensionFlag
     */
    public void setTruUletruExtensionFlag(String aTruUletruExtensionFlag) {
        truUletruExtensionFlag = aTruUletruExtensionFlag;
    }

    /**
     * Access method for truUletruExtensionDate.
     *
     * @return the current value of truUletruExtensionDate
     */
    public Timestamp getTruUletruExtensionDate() {
        return truUletruExtensionDate;
    }

    /**
     * Setter method for truUletruExtensionDate.
     *
     * @param aTruUletruExtensionDate the new value for truUletruExtensionDate
     */
    public void setTruUletruExtensionDate(Timestamp aTruUletruExtensionDate) {
        truUletruExtensionDate = aTruUletruExtensionDate;
    }

    /**
     * Access method for truLetruExtensionFlag.
     *
     * @return the current value of truLetruExtensionFlag
     */
    public String getTruLetruExtensionFlag() {
        return truLetruExtensionFlag;
    }

    /**
     * Setter method for truLetruExtensionFlag.
     *
     * @param aTruLetruExtensionFlag the new value for truLetruExtensionFlag
     */
    public void setTruLetruExtensionFlag(String aTruLetruExtensionFlag) {
        truLetruExtensionFlag = aTruLetruExtensionFlag;
    }

    /**
     * Access method for truLetruExtensionDate.
     *
     * @return the current value of truLetruExtensionDate
     */
    public Timestamp getTruLetruExtensionDate() {
        return truLetruExtensionDate;
    }

    /**
     * Setter method for truLetruExtensionDate.
     *
     * @param aTruLetruExtensionDate the new value for truLetruExtensionDate
     */
    public void setTruLetruExtensionDate(Timestamp aTruLetruExtensionDate) {
        truLetruExtensionDate = aTruLetruExtensionDate;
    }

    /**
     * Access method for truExemptReasonsUid.
     *
     * @return the current value of truExemptReasonsUid
     */
    public int getTruExemptReasonsUid() {
        return truExemptReasonsUid;
    }

    /**
     * Setter method for truExemptReasonsUid.
     *
     * @param aTruExemptReasonsUid the new value for truExemptReasonsUid
     */
    public void setTruExemptReasonsUid(int aTruExemptReasonsUid) {
        truExemptReasonsUid = aTruExemptReasonsUid;
    }

    /**
     * Access method for truExemptDate.
     *
     * @return the current value of truExemptDate
     */
    public Timestamp getTruExemptDate() {
        return truExemptDate;
    }

    /**
     * Setter method for truExemptDate.
     *
     * @param aTruExemptDate the new value for truExemptDate
     */
    public void setTruExemptDate(Timestamp aTruExemptDate) {
        truExemptDate = aTruExemptDate;
    }

    /**
     * Compares the key for this instance with another ComplianceInformationAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ComplianceInformationAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ComplianceInformationAud)) {
            return false;
        }
        ComplianceInformationAud that = (ComplianceInformationAud) other;
        if (this.getComplianceInformationAudUid() != that.getComplianceInformationAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ComplianceInformationAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ComplianceInformationAud)) return false;
        return this.equalKeys(other) && ((ComplianceInformationAud)other).equalKeys(this);
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
        i = getComplianceInformationAudUid();
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
        StringBuffer sb = new StringBuffer("[ComplianceInformationAud |");
        sb.append(" complianceInformationAudUid=").append(getComplianceInformationAudUid());
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
        ret.put("complianceInformationAudUid", Integer.valueOf(getComplianceInformationAudUid()));
        return ret;
    }

}
