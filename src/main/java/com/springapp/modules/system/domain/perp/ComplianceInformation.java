// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Date;
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

@Entity(name="compliance_information")
public class ComplianceInformation implements Serializable {

    /** Primary key. */
    protected static final String PK = "complianceInformationUid";

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
    @Column(name="Compliance_Information_UID", unique=true, nullable=false, precision=10)
    private int complianceInformationUid;
    @Column(name="Received_Date")
    private Date receivedDate;
    @Column(name="Cert_Date")
    private Date certDate;
    @Column(name="Verification_Date")
    private Date verificationDate;
    @Column(name="Compliance_Date")
    private Date complianceDate;
    @Column(name="VDECS_Serial_Number", length=45)
    private String vdecsSerialNumber;
    @Column(name="VDECS_Manufact_Date")
    private Date vdecsManufactDate;
    @Column(name="VDECS_Install_Date")
    private Date vdecsInstallDate;
    @Column(name="Electronic_Tracking_Supplier_UID", precision=10)
    private int electronicTrackingSupplierUid;
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
    @Column(name="tru_uletru_extension_flag", nullable=false, length=1)
    private String truUletruExtensionFlag;
    @Column(name="tru_uletru_extension_date")
    private Timestamp truUletruExtensionDate;
    @Column(name="tru_letru_extension_flag", nullable=false, length=1)
    private String truLetruExtensionFlag;
    @Column(name="tru_letru_extension_date")
    private Timestamp truLetruExtensionDate;
    @Column(name="tru_exempt_date")
    private Timestamp truExemptDate;
    @ManyToOne
    @JoinColumn(name="Alt_Tech_Type_UID")
    private AltTechType altTechType;
    @OneToMany(mappedBy="complianceInformation")
    private Set<Contact> contact;
    @OneToMany(mappedBy="complianceInformation")
    private Set<VehicleComplianceStatus> vehicleComplianceStatus;
    @ManyToOne(optional=false)
    @JoinColumn(name="Compliance_Standard_Type_UID", nullable=false)
    private ComplianceStandardType complianceStandardType;
    @ManyToOne
    @JoinColumn(name="VDECS_Manufact_UID")
    private ManufacturerType manufacturerType;
    @ManyToOne
    @JoinColumn(name="Verification_By_UID")
    private Users users2;
    @ManyToOne
    @JoinColumn(name="Cert_By_UID")
    private Users users;
    @ManyToOne
    @JoinColumn(name="VDECS_Family_Name_Type_UID")
    private VdecsFamilyNameType vdecsFamilyNameType;

    /** Default constructor. */
    public ComplianceInformation() {
        super();
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
     * Access method for electronicTrackingSupplierUid.
     *
     * @return the current value of electronicTrackingSupplierUid
     */
    public int getElectronicTrackingSupplierUid() {
        return electronicTrackingSupplierUid;
    }

    /**
     * Setter method for electronicTrackingSupplierUid.
     *
     * @param aElectronicTrackingSupplierUid the new value for electronicTrackingSupplierUid
     */
    public void setElectronicTrackingSupplierUid(int aElectronicTrackingSupplierUid) {
        electronicTrackingSupplierUid = aElectronicTrackingSupplierUid;
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
     * Access method for altTechType.
     *
     * @return the current value of altTechType
     */
    public AltTechType getAltTechType() {
        return altTechType;
    }

    /**
     * Setter method for altTechType.
     *
     * @param aAltTechType the new value for altTechType
     */
    public void setAltTechType(AltTechType aAltTechType) {
        altTechType = aAltTechType;
    }

    /**
     * Access method for contact.
     *
     * @return the current value of contact
     */
    public Set<Contact> getContact() {
        return contact;
    }

    /**
     * Setter method for contact.
     *
     * @param aContact the new value for contact
     */
    public void setContact(Set<Contact> aContact) {
        contact = aContact;
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
     * Access method for complianceStandardType.
     *
     * @return the current value of complianceStandardType
     */
    public ComplianceStandardType getComplianceStandardType() {
        return complianceStandardType;
    }

    /**
     * Setter method for complianceStandardType.
     *
     * @param aComplianceStandardType the new value for complianceStandardType
     */
    public void setComplianceStandardType(ComplianceStandardType aComplianceStandardType) {
        complianceStandardType = aComplianceStandardType;
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
     * Access method for users2.
     *
     * @return the current value of users2
     */
    public Users getUsers2() {
        return users2;
    }

    /**
     * Setter method for users2.
     *
     * @param aUsers2 the new value for users2
     */
    public void setUsers2(Users aUsers2) {
        users2 = aUsers2;
    }

    /**
     * Access method for users.
     *
     * @return the current value of users
     */
    public Users getUsers() {
        return users;
    }

    /**
     * Setter method for users.
     *
     * @param aUsers the new value for users
     */
    public void setUsers(Users aUsers) {
        users = aUsers;
    }

    /**
     * Access method for vdecsFamilyNameType.
     *
     * @return the current value of vdecsFamilyNameType
     */
    public VdecsFamilyNameType getVdecsFamilyNameType() {
        return vdecsFamilyNameType;
    }

    /**
     * Setter method for vdecsFamilyNameType.
     *
     * @param aVdecsFamilyNameType the new value for vdecsFamilyNameType
     */
    public void setVdecsFamilyNameType(VdecsFamilyNameType aVdecsFamilyNameType) {
        vdecsFamilyNameType = aVdecsFamilyNameType;
    }

    /**
     * Compares the key for this instance with another ComplianceInformation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ComplianceInformation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ComplianceInformation)) {
            return false;
        }
        ComplianceInformation that = (ComplianceInformation) other;
        if (this.getComplianceInformationUid() != that.getComplianceInformationUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ComplianceInformation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ComplianceInformation)) return false;
        return this.equalKeys(other) && ((ComplianceInformation)other).equalKeys(this);
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
        i = getComplianceInformationUid();
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
        StringBuffer sb = new StringBuffer("[ComplianceInformation |");
        sb.append(" complianceInformationUid=").append(getComplianceInformationUid());
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
        ret.put("complianceInformationUid", Integer.valueOf(getComplianceInformationUid()));
        return ret;
    }

}
