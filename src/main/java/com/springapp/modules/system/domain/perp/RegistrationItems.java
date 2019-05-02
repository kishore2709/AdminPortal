// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.math.BigDecimal;
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

@Entity(name="registration_items")
public class RegistrationItems implements Serializable {

    /** Primary key. */
    protected static final String PK = "regItemUid";

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
    @Column(name="RegItem_UID", unique=true, nullable=false, precision=10)
    private int regItemUid;
    @Column(name="Additional_Info")
    private String additionalInfo;
    @Column(name="Cert_Description")
    private String certDescription;
    @Column(name="Add_Cert_Desc")
    private String addCertDesc;
    @Column(name="Certificate_No", precision=10)
    private int certificateNo;
    @Column(name="Certified_Flag", length=1)
    private String certifiedFlag;
    @Column(name="Created_Date")
    private Timestamp createdDate;
    @Column(name="Current_Flag", nullable=false, length=1)
    private String currentFlag;
    @Column(name="DistAppProof_Flag", length=1)
    private String distAppProofFlag;
    @Column(name="DistPermitProof_Flag", length=1)
    private String distPermitProofFlag;
    @Column(name="District_Permit_Flag", length=1)
    private String districtPermitFlag;
    @Column(name="EPA_Cert_No", length=50)
    private String epaCertNo;
    @Column(name="Est_Days_Per_Week", precision=5)
    private short estDaysPerWeek;
    @Column(name="Est_Hours_Per_Day", precision=5)
    private short estHoursPerDay;
    @Column(name="Est_Weeks_Per_Year", precision=5)
    private short estWeeksPerYear;
    @Column(name="Estimated_Fees", precision=10, scale=2)
    private BigDecimal estimatedFees;
    @Column(name="Expiration_Date")
    private Timestamp expirationDate;
    @Column(name="Flex_Eng_Proof_Flag", length=1)
    private String flexEngProofFlag;
    @Column(name="Flex_Eng_Request_Flag", length=1)
    private String flexEngRequestFlag;
    @Column(name="Fuel_Proof_Flag", length=1)
    private String fuelProofFlag;
    @Column(name="Fuel_Request_Flag", length=1)
    private String fuelRequestFlag;
    @Column(name="Initial_Eval", length=1)
    private String initialEval;
    @Column(name="Initial_Issuance_Date")
    private Timestamp initialIssuanceDate;
    @Column(name="Not_Going_To_Renew_Flag", length=1)
    private String notGoingToRenewFlag;
    @Column(name="Operational_Flag", length=1)
    private String operationalFlag;
    @Column(name="Operational_Indicator", length=1)
    private String operationalIndicator;
    @Column(name="PTO_App_Comp_Date")
    private Timestamp ptoAppCompDate;
    @Column(name="PTO_App_Date")
    private Timestamp ptoAppDate;
    @Column(name="PTO_App_DistID", precision=10)
    private int ptoAppDistId;
    @Column(name="PTO_Date")
    private Timestamp ptoDate;
    @Column(name="PTO_District_ID", precision=10)
    private int ptoDistrictId;
    @Column(name="PTO_No", length=20)
    private String ptoNo;
    @Column(name="Purchase_Date")
    private Timestamp purchaseDate;
    @Column(name="Renewal_Open_Flag", length=1)
    private String renewalOpenFlag;
    @Column(name="Rental_Flag", length=1)
    private String rentalFlag;
    @Column(name="Residency_Proof_Flag", length=1)
    private String residencyProofFlag;
    @Column(name="Residency_Request_Flag", length=1)
    private String residencyRequestFlag;
    @Column(name="Stolen_Flag", nullable=false, length=1)
    private String stolenFlag;
    @Column(name="Table1_STD_Proof_Flag", length=1)
    private String table1StdProofFlag;
    @Column(name="Table1_STD_Request_Flag", length=1)
    private String table1StdRequestFlag;
    @Column(name="Tracking_No", precision=10)
    private int trackingNo;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Expired_Renewal_Flag", length=1)
    private String expiredRenewalFlag;
    @Column(name="Reactivate_List_Flag", length=1)
    private String reactivateListFlag;
    @Column(name="Cutoff_Expire_Date_UID", precision=10)
    private int cutoffExpireDateUid;
    @Column(name="On_Hwy_Eng_Request_Flag", length=1)
    private String onHwyEngRequestFlag;
    @Column(name="Identical_Replacement_Flag", length=1)
    private String identicalReplacementFlag;
    @ManyToOne
    @JoinColumn(name="Company_UID")
    private Company company;
    @ManyToOne
    @JoinColumn(name="Discount_Type_UID")
    private DiscountTypes discountTypes;
    @ManyToOne
    @JoinColumn(name="District_UID")
    private DistrictCodes districtCodes;
    @ManyToOne
    @JoinColumn(name="Application_UID")
    private PerpApplications perpApplications;
    @OneToMany(mappedBy="registrationItems")
    private Set<ApptransRegRel> apptransRegRel;
    @OneToMany(mappedBy="registrationItems")
    private Set<EligibilityReasons> eligibilityReasons;
    @ManyToOne
    @JoinColumn(name="Expiration_Date_Type_UID")
    private ExpirationDateType expirationDateType;
    @OneToMany(mappedBy="registrationItems")
    private Set<FleetEmission> fleetEmission;
    @OneToMany(mappedBy="registrationItems")
    private Set<Inspections> inspections;
    @OneToMany(mappedBy="registrationItems")
    private Set<NoteAttachment> noteAttachment;
    @OneToMany(mappedBy="registrationItems")
    private Set<NoteComplaints> noteComplaints;
    @OneToMany(mappedBy="registrationItems")
    private Set<OpconRegitemRelation> opconRegitemRelation;
    @OneToMany(mappedBy="registrationItems")
    private Set<OperationalLimits> operationalLimits;
    @OneToMany(mappedBy="registrationItems")
    private Set<RegitemDetails> regitemDetails;
    @OneToMany(mappedBy="registrationItems2")
    private Set<RegistrationItems> registrationItems3;
    @ManyToOne
    @JoinColumn(name="Parent_UID")
    private RegistrationItems registrationItems2;
    @OneToMany(mappedBy="registrationItems")
    private Set<RegitemReqAttachRel> regitemReqAttachRel;
    @OneToMany(mappedBy="registrationItems")
    private Set<PerpAnnualReportItems> perpAnnualReportItems;
    @OneToMany(mappedBy="registrationItems")
    private Set<PerpdocumentItems> perpdocumentItems;
    @ManyToOne
    @JoinColumn(name="RegItemStatus_UID")
    private RegitemStatus regitemStatus;
    @ManyToOne(optional=false)
    @JoinColumn(name="RegItemType_UID", nullable=false)
    private RegitemTypes regitemTypes;
    @OneToMany(mappedBy="registrationItems4")
    private Set<RegistrationItems> registrationItems5;
    @ManyToOne
    @JoinColumn(name="ReplacedBy_RegItem_UID")
    private RegistrationItems registrationItems4;
    @ManyToOne
    @JoinColumn(name="RegItemSubSubTypes_UID")
    private RegitemSubsubtypes regitemSubsubtypes;
    @ManyToOne(optional=false)
    @JoinColumn(name="RegItemSubType_UID", nullable=false)
    private RegitemSubtypes regitemSubtypes;

    /** Default constructor. */
    public RegistrationItems() {
        super();
    }

    /**
     * Access method for regItemUid.
     *
     * @return the current value of regItemUid
     */
    public int getRegItemUid() {
        return regItemUid;
    }

    /**
     * Setter method for regItemUid.
     *
     * @param aRegItemUid the new value for regItemUid
     */
    public void setRegItemUid(int aRegItemUid) {
        regItemUid = aRegItemUid;
    }

    /**
     * Access method for additionalInfo.
     *
     * @return the current value of additionalInfo
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Setter method for additionalInfo.
     *
     * @param aAdditionalInfo the new value for additionalInfo
     */
    public void setAdditionalInfo(String aAdditionalInfo) {
        additionalInfo = aAdditionalInfo;
    }

    /**
     * Access method for certDescription.
     *
     * @return the current value of certDescription
     */
    public String getCertDescription() {
        return certDescription;
    }

    /**
     * Setter method for certDescription.
     *
     * @param aCertDescription the new value for certDescription
     */
    public void setCertDescription(String aCertDescription) {
        certDescription = aCertDescription;
    }

    /**
     * Access method for addCertDesc.
     *
     * @return the current value of addCertDesc
     */
    public String getAddCertDesc() {
        return addCertDesc;
    }

    /**
     * Setter method for addCertDesc.
     *
     * @param aAddCertDesc the new value for addCertDesc
     */
    public void setAddCertDesc(String aAddCertDesc) {
        addCertDesc = aAddCertDesc;
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
     * Access method for certifiedFlag.
     *
     * @return the current value of certifiedFlag
     */
    public String getCertifiedFlag() {
        return certifiedFlag;
    }

    /**
     * Setter method for certifiedFlag.
     *
     * @param aCertifiedFlag the new value for certifiedFlag
     */
    public void setCertifiedFlag(String aCertifiedFlag) {
        certifiedFlag = aCertifiedFlag;
    }

    /**
     * Access method for createdDate.
     *
     * @return the current value of createdDate
     */
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    /**
     * Setter method for createdDate.
     *
     * @param aCreatedDate the new value for createdDate
     */
    public void setCreatedDate(Timestamp aCreatedDate) {
        createdDate = aCreatedDate;
    }

    /**
     * Access method for currentFlag.
     *
     * @return the current value of currentFlag
     */
    public String getCurrentFlag() {
        return currentFlag;
    }

    /**
     * Setter method for currentFlag.
     *
     * @param aCurrentFlag the new value for currentFlag
     */
    public void setCurrentFlag(String aCurrentFlag) {
        currentFlag = aCurrentFlag;
    }

    /**
     * Access method for distAppProofFlag.
     *
     * @return the current value of distAppProofFlag
     */
    public String getDistAppProofFlag() {
        return distAppProofFlag;
    }

    /**
     * Setter method for distAppProofFlag.
     *
     * @param aDistAppProofFlag the new value for distAppProofFlag
     */
    public void setDistAppProofFlag(String aDistAppProofFlag) {
        distAppProofFlag = aDistAppProofFlag;
    }

    /**
     * Access method for distPermitProofFlag.
     *
     * @return the current value of distPermitProofFlag
     */
    public String getDistPermitProofFlag() {
        return distPermitProofFlag;
    }

    /**
     * Setter method for distPermitProofFlag.
     *
     * @param aDistPermitProofFlag the new value for distPermitProofFlag
     */
    public void setDistPermitProofFlag(String aDistPermitProofFlag) {
        distPermitProofFlag = aDistPermitProofFlag;
    }

    /**
     * Access method for districtPermitFlag.
     *
     * @return the current value of districtPermitFlag
     */
    public String getDistrictPermitFlag() {
        return districtPermitFlag;
    }

    /**
     * Setter method for districtPermitFlag.
     *
     * @param aDistrictPermitFlag the new value for districtPermitFlag
     */
    public void setDistrictPermitFlag(String aDistrictPermitFlag) {
        districtPermitFlag = aDistrictPermitFlag;
    }

    /**
     * Access method for epaCertNo.
     *
     * @return the current value of epaCertNo
     */
    public String getEpaCertNo() {
        return epaCertNo;
    }

    /**
     * Setter method for epaCertNo.
     *
     * @param aEpaCertNo the new value for epaCertNo
     */
    public void setEpaCertNo(String aEpaCertNo) {
        epaCertNo = aEpaCertNo;
    }

    /**
     * Access method for estDaysPerWeek.
     *
     * @return the current value of estDaysPerWeek
     */
    public short getEstDaysPerWeek() {
        return estDaysPerWeek;
    }

    /**
     * Setter method for estDaysPerWeek.
     *
     * @param aEstDaysPerWeek the new value for estDaysPerWeek
     */
    public void setEstDaysPerWeek(short aEstDaysPerWeek) {
        estDaysPerWeek = aEstDaysPerWeek;
    }

    /**
     * Access method for estHoursPerDay.
     *
     * @return the current value of estHoursPerDay
     */
    public short getEstHoursPerDay() {
        return estHoursPerDay;
    }

    /**
     * Setter method for estHoursPerDay.
     *
     * @param aEstHoursPerDay the new value for estHoursPerDay
     */
    public void setEstHoursPerDay(short aEstHoursPerDay) {
        estHoursPerDay = aEstHoursPerDay;
    }

    /**
     * Access method for estWeeksPerYear.
     *
     * @return the current value of estWeeksPerYear
     */
    public short getEstWeeksPerYear() {
        return estWeeksPerYear;
    }

    /**
     * Setter method for estWeeksPerYear.
     *
     * @param aEstWeeksPerYear the new value for estWeeksPerYear
     */
    public void setEstWeeksPerYear(short aEstWeeksPerYear) {
        estWeeksPerYear = aEstWeeksPerYear;
    }

    /**
     * Access method for estimatedFees.
     *
     * @return the current value of estimatedFees
     */
    public BigDecimal getEstimatedFees() {
        return estimatedFees;
    }

    /**
     * Setter method for estimatedFees.
     *
     * @param aEstimatedFees the new value for estimatedFees
     */
    public void setEstimatedFees(BigDecimal aEstimatedFees) {
        estimatedFees = aEstimatedFees;
    }

    /**
     * Access method for expirationDate.
     *
     * @return the current value of expirationDate
     */
    public Timestamp getExpirationDate() {
        return expirationDate;
    }

    /**
     * Setter method for expirationDate.
     *
     * @param aExpirationDate the new value for expirationDate
     */
    public void setExpirationDate(Timestamp aExpirationDate) {
        expirationDate = aExpirationDate;
    }

    /**
     * Access method for flexEngProofFlag.
     *
     * @return the current value of flexEngProofFlag
     */
    public String getFlexEngProofFlag() {
        return flexEngProofFlag;
    }

    /**
     * Setter method for flexEngProofFlag.
     *
     * @param aFlexEngProofFlag the new value for flexEngProofFlag
     */
    public void setFlexEngProofFlag(String aFlexEngProofFlag) {
        flexEngProofFlag = aFlexEngProofFlag;
    }

    /**
     * Access method for flexEngRequestFlag.
     *
     * @return the current value of flexEngRequestFlag
     */
    public String getFlexEngRequestFlag() {
        return flexEngRequestFlag;
    }

    /**
     * Setter method for flexEngRequestFlag.
     *
     * @param aFlexEngRequestFlag the new value for flexEngRequestFlag
     */
    public void setFlexEngRequestFlag(String aFlexEngRequestFlag) {
        flexEngRequestFlag = aFlexEngRequestFlag;
    }

    /**
     * Access method for fuelProofFlag.
     *
     * @return the current value of fuelProofFlag
     */
    public String getFuelProofFlag() {
        return fuelProofFlag;
    }

    /**
     * Setter method for fuelProofFlag.
     *
     * @param aFuelProofFlag the new value for fuelProofFlag
     */
    public void setFuelProofFlag(String aFuelProofFlag) {
        fuelProofFlag = aFuelProofFlag;
    }

    /**
     * Access method for fuelRequestFlag.
     *
     * @return the current value of fuelRequestFlag
     */
    public String getFuelRequestFlag() {
        return fuelRequestFlag;
    }

    /**
     * Setter method for fuelRequestFlag.
     *
     * @param aFuelRequestFlag the new value for fuelRequestFlag
     */
    public void setFuelRequestFlag(String aFuelRequestFlag) {
        fuelRequestFlag = aFuelRequestFlag;
    }

    /**
     * Access method for initialEval.
     *
     * @return the current value of initialEval
     */
    public String getInitialEval() {
        return initialEval;
    }

    /**
     * Setter method for initialEval.
     *
     * @param aInitialEval the new value for initialEval
     */
    public void setInitialEval(String aInitialEval) {
        initialEval = aInitialEval;
    }

    /**
     * Access method for initialIssuanceDate.
     *
     * @return the current value of initialIssuanceDate
     */
    public Timestamp getInitialIssuanceDate() {
        return initialIssuanceDate;
    }

    /**
     * Setter method for initialIssuanceDate.
     *
     * @param aInitialIssuanceDate the new value for initialIssuanceDate
     */
    public void setInitialIssuanceDate(Timestamp aInitialIssuanceDate) {
        initialIssuanceDate = aInitialIssuanceDate;
    }

    /**
     * Access method for notGoingToRenewFlag.
     *
     * @return the current value of notGoingToRenewFlag
     */
    public String getNotGoingToRenewFlag() {
        return notGoingToRenewFlag;
    }

    /**
     * Setter method for notGoingToRenewFlag.
     *
     * @param aNotGoingToRenewFlag the new value for notGoingToRenewFlag
     */
    public void setNotGoingToRenewFlag(String aNotGoingToRenewFlag) {
        notGoingToRenewFlag = aNotGoingToRenewFlag;
    }

    /**
     * Access method for operationalFlag.
     *
     * @return the current value of operationalFlag
     */
    public String getOperationalFlag() {
        return operationalFlag;
    }

    /**
     * Setter method for operationalFlag.
     *
     * @param aOperationalFlag the new value for operationalFlag
     */
    public void setOperationalFlag(String aOperationalFlag) {
        operationalFlag = aOperationalFlag;
    }

    /**
     * Access method for operationalIndicator.
     *
     * @return the current value of operationalIndicator
     */
    public String getOperationalIndicator() {
        return operationalIndicator;
    }

    /**
     * Setter method for operationalIndicator.
     *
     * @param aOperationalIndicator the new value for operationalIndicator
     */
    public void setOperationalIndicator(String aOperationalIndicator) {
        operationalIndicator = aOperationalIndicator;
    }

    /**
     * Access method for ptoAppCompDate.
     *
     * @return the current value of ptoAppCompDate
     */
    public Timestamp getPtoAppCompDate() {
        return ptoAppCompDate;
    }

    /**
     * Setter method for ptoAppCompDate.
     *
     * @param aPtoAppCompDate the new value for ptoAppCompDate
     */
    public void setPtoAppCompDate(Timestamp aPtoAppCompDate) {
        ptoAppCompDate = aPtoAppCompDate;
    }

    /**
     * Access method for ptoAppDate.
     *
     * @return the current value of ptoAppDate
     */
    public Timestamp getPtoAppDate() {
        return ptoAppDate;
    }

    /**
     * Setter method for ptoAppDate.
     *
     * @param aPtoAppDate the new value for ptoAppDate
     */
    public void setPtoAppDate(Timestamp aPtoAppDate) {
        ptoAppDate = aPtoAppDate;
    }

    /**
     * Access method for ptoAppDistId.
     *
     * @return the current value of ptoAppDistId
     */
    public int getPtoAppDistId() {
        return ptoAppDistId;
    }

    /**
     * Setter method for ptoAppDistId.
     *
     * @param aPtoAppDistId the new value for ptoAppDistId
     */
    public void setPtoAppDistId(int aPtoAppDistId) {
        ptoAppDistId = aPtoAppDistId;
    }

    /**
     * Access method for ptoDate.
     *
     * @return the current value of ptoDate
     */
    public Timestamp getPtoDate() {
        return ptoDate;
    }

    /**
     * Setter method for ptoDate.
     *
     * @param aPtoDate the new value for ptoDate
     */
    public void setPtoDate(Timestamp aPtoDate) {
        ptoDate = aPtoDate;
    }

    /**
     * Access method for ptoDistrictId.
     *
     * @return the current value of ptoDistrictId
     */
    public int getPtoDistrictId() {
        return ptoDistrictId;
    }

    /**
     * Setter method for ptoDistrictId.
     *
     * @param aPtoDistrictId the new value for ptoDistrictId
     */
    public void setPtoDistrictId(int aPtoDistrictId) {
        ptoDistrictId = aPtoDistrictId;
    }

    /**
     * Access method for ptoNo.
     *
     * @return the current value of ptoNo
     */
    public String getPtoNo() {
        return ptoNo;
    }

    /**
     * Setter method for ptoNo.
     *
     * @param aPtoNo the new value for ptoNo
     */
    public void setPtoNo(String aPtoNo) {
        ptoNo = aPtoNo;
    }

    /**
     * Access method for purchaseDate.
     *
     * @return the current value of purchaseDate
     */
    public Timestamp getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Setter method for purchaseDate.
     *
     * @param aPurchaseDate the new value for purchaseDate
     */
    public void setPurchaseDate(Timestamp aPurchaseDate) {
        purchaseDate = aPurchaseDate;
    }

    /**
     * Access method for renewalOpenFlag.
     *
     * @return the current value of renewalOpenFlag
     */
    public String getRenewalOpenFlag() {
        return renewalOpenFlag;
    }

    /**
     * Setter method for renewalOpenFlag.
     *
     * @param aRenewalOpenFlag the new value for renewalOpenFlag
     */
    public void setRenewalOpenFlag(String aRenewalOpenFlag) {
        renewalOpenFlag = aRenewalOpenFlag;
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
     * Access method for residencyProofFlag.
     *
     * @return the current value of residencyProofFlag
     */
    public String getResidencyProofFlag() {
        return residencyProofFlag;
    }

    /**
     * Setter method for residencyProofFlag.
     *
     * @param aResidencyProofFlag the new value for residencyProofFlag
     */
    public void setResidencyProofFlag(String aResidencyProofFlag) {
        residencyProofFlag = aResidencyProofFlag;
    }

    /**
     * Access method for residencyRequestFlag.
     *
     * @return the current value of residencyRequestFlag
     */
    public String getResidencyRequestFlag() {
        return residencyRequestFlag;
    }

    /**
     * Setter method for residencyRequestFlag.
     *
     * @param aResidencyRequestFlag the new value for residencyRequestFlag
     */
    public void setResidencyRequestFlag(String aResidencyRequestFlag) {
        residencyRequestFlag = aResidencyRequestFlag;
    }

    /**
     * Access method for stolenFlag.
     *
     * @return the current value of stolenFlag
     */
    public String getStolenFlag() {
        return stolenFlag;
    }

    /**
     * Setter method for stolenFlag.
     *
     * @param aStolenFlag the new value for stolenFlag
     */
    public void setStolenFlag(String aStolenFlag) {
        stolenFlag = aStolenFlag;
    }

    /**
     * Access method for table1StdProofFlag.
     *
     * @return the current value of table1StdProofFlag
     */
    public String getTable1StdProofFlag() {
        return table1StdProofFlag;
    }

    /**
     * Setter method for table1StdProofFlag.
     *
     * @param aTable1StdProofFlag the new value for table1StdProofFlag
     */
    public void setTable1StdProofFlag(String aTable1StdProofFlag) {
        table1StdProofFlag = aTable1StdProofFlag;
    }

    /**
     * Access method for table1StdRequestFlag.
     *
     * @return the current value of table1StdRequestFlag
     */
    public String getTable1StdRequestFlag() {
        return table1StdRequestFlag;
    }

    /**
     * Setter method for table1StdRequestFlag.
     *
     * @param aTable1StdRequestFlag the new value for table1StdRequestFlag
     */
    public void setTable1StdRequestFlag(String aTable1StdRequestFlag) {
        table1StdRequestFlag = aTable1StdRequestFlag;
    }

    /**
     * Access method for trackingNo.
     *
     * @return the current value of trackingNo
     */
    public int getTrackingNo() {
        return trackingNo;
    }

    /**
     * Setter method for trackingNo.
     *
     * @param aTrackingNo the new value for trackingNo
     */
    public void setTrackingNo(int aTrackingNo) {
        trackingNo = aTrackingNo;
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
     * Access method for expiredRenewalFlag.
     *
     * @return the current value of expiredRenewalFlag
     */
    public String getExpiredRenewalFlag() {
        return expiredRenewalFlag;
    }

    /**
     * Setter method for expiredRenewalFlag.
     *
     * @param aExpiredRenewalFlag the new value for expiredRenewalFlag
     */
    public void setExpiredRenewalFlag(String aExpiredRenewalFlag) {
        expiredRenewalFlag = aExpiredRenewalFlag;
    }

    /**
     * Access method for reactivateListFlag.
     *
     * @return the current value of reactivateListFlag
     */
    public String getReactivateListFlag() {
        return reactivateListFlag;
    }

    /**
     * Setter method for reactivateListFlag.
     *
     * @param aReactivateListFlag the new value for reactivateListFlag
     */
    public void setReactivateListFlag(String aReactivateListFlag) {
        reactivateListFlag = aReactivateListFlag;
    }

    /**
     * Access method for cutoffExpireDateUid.
     *
     * @return the current value of cutoffExpireDateUid
     */
    public int getCutoffExpireDateUid() {
        return cutoffExpireDateUid;
    }

    /**
     * Setter method for cutoffExpireDateUid.
     *
     * @param aCutoffExpireDateUid the new value for cutoffExpireDateUid
     */
    public void setCutoffExpireDateUid(int aCutoffExpireDateUid) {
        cutoffExpireDateUid = aCutoffExpireDateUid;
    }

    /**
     * Access method for onHwyEngRequestFlag.
     *
     * @return the current value of onHwyEngRequestFlag
     */
    public String getOnHwyEngRequestFlag() {
        return onHwyEngRequestFlag;
    }

    /**
     * Setter method for onHwyEngRequestFlag.
     *
     * @param aOnHwyEngRequestFlag the new value for onHwyEngRequestFlag
     */
    public void setOnHwyEngRequestFlag(String aOnHwyEngRequestFlag) {
        onHwyEngRequestFlag = aOnHwyEngRequestFlag;
    }

    /**
     * Access method for identicalReplacementFlag.
     *
     * @return the current value of identicalReplacementFlag
     */
    public String getIdenticalReplacementFlag() {
        return identicalReplacementFlag;
    }

    /**
     * Setter method for identicalReplacementFlag.
     *
     * @param aIdenticalReplacementFlag the new value for identicalReplacementFlag
     */
    public void setIdenticalReplacementFlag(String aIdenticalReplacementFlag) {
        identicalReplacementFlag = aIdenticalReplacementFlag;
    }

    /**
     * Access method for company.
     *
     * @return the current value of company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Setter method for company.
     *
     * @param aCompany the new value for company
     */
    public void setCompany(Company aCompany) {
        company = aCompany;
    }

    /**
     * Access method for discountTypes.
     *
     * @return the current value of discountTypes
     */
    public DiscountTypes getDiscountTypes() {
        return discountTypes;
    }

    /**
     * Setter method for discountTypes.
     *
     * @param aDiscountTypes the new value for discountTypes
     */
    public void setDiscountTypes(DiscountTypes aDiscountTypes) {
        discountTypes = aDiscountTypes;
    }

    /**
     * Access method for districtCodes.
     *
     * @return the current value of districtCodes
     */
    public DistrictCodes getDistrictCodes() {
        return districtCodes;
    }

    /**
     * Setter method for districtCodes.
     *
     * @param aDistrictCodes the new value for districtCodes
     */
    public void setDistrictCodes(DistrictCodes aDistrictCodes) {
        districtCodes = aDistrictCodes;
    }

    /**
     * Access method for perpApplications.
     *
     * @return the current value of perpApplications
     */
    public PerpApplications getPerpApplications() {
        return perpApplications;
    }

    /**
     * Setter method for perpApplications.
     *
     * @param aPerpApplications the new value for perpApplications
     */
    public void setPerpApplications(PerpApplications aPerpApplications) {
        perpApplications = aPerpApplications;
    }

    /**
     * Access method for apptransRegRel.
     *
     * @return the current value of apptransRegRel
     */
    public Set<ApptransRegRel> getApptransRegRel() {
        return apptransRegRel;
    }

    /**
     * Setter method for apptransRegRel.
     *
     * @param aApptransRegRel the new value for apptransRegRel
     */
    public void setApptransRegRel(Set<ApptransRegRel> aApptransRegRel) {
        apptransRegRel = aApptransRegRel;
    }

    /**
     * Access method for eligibilityReasons.
     *
     * @return the current value of eligibilityReasons
     */
    public Set<EligibilityReasons> getEligibilityReasons() {
        return eligibilityReasons;
    }

    /**
     * Setter method for eligibilityReasons.
     *
     * @param aEligibilityReasons the new value for eligibilityReasons
     */
    public void setEligibilityReasons(Set<EligibilityReasons> aEligibilityReasons) {
        eligibilityReasons = aEligibilityReasons;
    }

    /**
     * Access method for expirationDateType.
     *
     * @return the current value of expirationDateType
     */
    public ExpirationDateType getExpirationDateType() {
        return expirationDateType;
    }

    /**
     * Setter method for expirationDateType.
     *
     * @param aExpirationDateType the new value for expirationDateType
     */
    public void setExpirationDateType(ExpirationDateType aExpirationDateType) {
        expirationDateType = aExpirationDateType;
    }

    /**
     * Access method for fleetEmission.
     *
     * @return the current value of fleetEmission
     */
    public Set<FleetEmission> getFleetEmission() {
        return fleetEmission;
    }

    /**
     * Setter method for fleetEmission.
     *
     * @param aFleetEmission the new value for fleetEmission
     */
    public void setFleetEmission(Set<FleetEmission> aFleetEmission) {
        fleetEmission = aFleetEmission;
    }

    /**
     * Access method for inspections.
     *
     * @return the current value of inspections
     */
    public Set<Inspections> getInspections() {
        return inspections;
    }

    /**
     * Setter method for inspections.
     *
     * @param aInspections the new value for inspections
     */
    public void setInspections(Set<Inspections> aInspections) {
        inspections = aInspections;
    }

    /**
     * Access method for noteAttachment.
     *
     * @return the current value of noteAttachment
     */
    public Set<NoteAttachment> getNoteAttachment() {
        return noteAttachment;
    }

    /**
     * Setter method for noteAttachment.
     *
     * @param aNoteAttachment the new value for noteAttachment
     */
    public void setNoteAttachment(Set<NoteAttachment> aNoteAttachment) {
        noteAttachment = aNoteAttachment;
    }

    /**
     * Access method for noteComplaints.
     *
     * @return the current value of noteComplaints
     */
    public Set<NoteComplaints> getNoteComplaints() {
        return noteComplaints;
    }

    /**
     * Setter method for noteComplaints.
     *
     * @param aNoteComplaints the new value for noteComplaints
     */
    public void setNoteComplaints(Set<NoteComplaints> aNoteComplaints) {
        noteComplaints = aNoteComplaints;
    }

    /**
     * Access method for opconRegitemRelation.
     *
     * @return the current value of opconRegitemRelation
     */
    public Set<OpconRegitemRelation> getOpconRegitemRelation() {
        return opconRegitemRelation;
    }

    /**
     * Setter method for opconRegitemRelation.
     *
     * @param aOpconRegitemRelation the new value for opconRegitemRelation
     */
    public void setOpconRegitemRelation(Set<OpconRegitemRelation> aOpconRegitemRelation) {
        opconRegitemRelation = aOpconRegitemRelation;
    }

    /**
     * Access method for operationalLimits.
     *
     * @return the current value of operationalLimits
     */
    public Set<OperationalLimits> getOperationalLimits() {
        return operationalLimits;
    }

    /**
     * Setter method for operationalLimits.
     *
     * @param aOperationalLimits the new value for operationalLimits
     */
    public void setOperationalLimits(Set<OperationalLimits> aOperationalLimits) {
        operationalLimits = aOperationalLimits;
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
     * Access method for registrationItems3.
     *
     * @return the current value of registrationItems3
     */
    public Set<RegistrationItems> getRegistrationItems3() {
        return registrationItems3;
    }

    /**
     * Setter method for registrationItems3.
     *
     * @param aRegistrationItems3 the new value for registrationItems3
     */
    public void setRegistrationItems3(Set<RegistrationItems> aRegistrationItems3) {
        registrationItems3 = aRegistrationItems3;
    }

    /**
     * Access method for registrationItems2.
     *
     * @return the current value of registrationItems2
     */
    public RegistrationItems getRegistrationItems2() {
        return registrationItems2;
    }

    /**
     * Setter method for registrationItems2.
     *
     * @param aRegistrationItems2 the new value for registrationItems2
     */
    public void setRegistrationItems2(RegistrationItems aRegistrationItems2) {
        registrationItems2 = aRegistrationItems2;
    }

    /**
     * Access method for regitemReqAttachRel.
     *
     * @return the current value of regitemReqAttachRel
     */
    public Set<RegitemReqAttachRel> getRegitemReqAttachRel() {
        return regitemReqAttachRel;
    }

    /**
     * Setter method for regitemReqAttachRel.
     *
     * @param aRegitemReqAttachRel the new value for regitemReqAttachRel
     */
    public void setRegitemReqAttachRel(Set<RegitemReqAttachRel> aRegitemReqAttachRel) {
        regitemReqAttachRel = aRegitemReqAttachRel;
    }

    /**
     * Access method for perpAnnualReportItems.
     *
     * @return the current value of perpAnnualReportItems
     */
    public Set<PerpAnnualReportItems> getPerpAnnualReportItems() {
        return perpAnnualReportItems;
    }

    /**
     * Setter method for perpAnnualReportItems.
     *
     * @param aPerpAnnualReportItems the new value for perpAnnualReportItems
     */
    public void setPerpAnnualReportItems(Set<PerpAnnualReportItems> aPerpAnnualReportItems) {
        perpAnnualReportItems = aPerpAnnualReportItems;
    }

    /**
     * Access method for perpdocumentItems.
     *
     * @return the current value of perpdocumentItems
     */
    public Set<PerpdocumentItems> getPerpdocumentItems() {
        return perpdocumentItems;
    }

    /**
     * Setter method for perpdocumentItems.
     *
     * @param aPerpdocumentItems the new value for perpdocumentItems
     */
    public void setPerpdocumentItems(Set<PerpdocumentItems> aPerpdocumentItems) {
        perpdocumentItems = aPerpdocumentItems;
    }

    /**
     * Access method for regitemStatus.
     *
     * @return the current value of regitemStatus
     */
    public RegitemStatus getRegitemStatus() {
        return regitemStatus;
    }

    /**
     * Setter method for regitemStatus.
     *
     * @param aRegitemStatus the new value for regitemStatus
     */
    public void setRegitemStatus(RegitemStatus aRegitemStatus) {
        regitemStatus = aRegitemStatus;
    }

    /**
     * Access method for regitemTypes.
     *
     * @return the current value of regitemTypes
     */
    public RegitemTypes getRegitemTypes() {
        return regitemTypes;
    }

    /**
     * Setter method for regitemTypes.
     *
     * @param aRegitemTypes the new value for regitemTypes
     */
    public void setRegitemTypes(RegitemTypes aRegitemTypes) {
        regitemTypes = aRegitemTypes;
    }

    /**
     * Access method for registrationItems5.
     *
     * @return the current value of registrationItems5
     */
    public Set<RegistrationItems> getRegistrationItems5() {
        return registrationItems5;
    }

    /**
     * Setter method for registrationItems5.
     *
     * @param aRegistrationItems5 the new value for registrationItems5
     */
    public void setRegistrationItems5(Set<RegistrationItems> aRegistrationItems5) {
        registrationItems5 = aRegistrationItems5;
    }

    /**
     * Access method for registrationItems4.
     *
     * @return the current value of registrationItems4
     */
    public RegistrationItems getRegistrationItems4() {
        return registrationItems4;
    }

    /**
     * Setter method for registrationItems4.
     *
     * @param aRegistrationItems4 the new value for registrationItems4
     */
    public void setRegistrationItems4(RegistrationItems aRegistrationItems4) {
        registrationItems4 = aRegistrationItems4;
    }

    /**
     * Access method for regitemSubsubtypes.
     *
     * @return the current value of regitemSubsubtypes
     */
    public RegitemSubsubtypes getRegitemSubsubtypes() {
        return regitemSubsubtypes;
    }

    /**
     * Setter method for regitemSubsubtypes.
     *
     * @param aRegitemSubsubtypes the new value for regitemSubsubtypes
     */
    public void setRegitemSubsubtypes(RegitemSubsubtypes aRegitemSubsubtypes) {
        regitemSubsubtypes = aRegitemSubsubtypes;
    }

    /**
     * Access method for regitemSubtypes.
     *
     * @return the current value of regitemSubtypes
     */
    public RegitemSubtypes getRegitemSubtypes() {
        return regitemSubtypes;
    }

    /**
     * Setter method for regitemSubtypes.
     *
     * @param aRegitemSubtypes the new value for regitemSubtypes
     */
    public void setRegitemSubtypes(RegitemSubtypes aRegitemSubtypes) {
        regitemSubtypes = aRegitemSubtypes;
    }

    /**
     * Compares the key for this instance with another RegistrationItems.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RegistrationItems and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RegistrationItems)) {
            return false;
        }
        RegistrationItems that = (RegistrationItems) other;
        if (this.getRegItemUid() != that.getRegItemUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RegistrationItems.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RegistrationItems)) return false;
        return this.equalKeys(other) && ((RegistrationItems)other).equalKeys(this);
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
        i = getRegItemUid();
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
        StringBuffer sb = new StringBuffer("[RegistrationItems |");
        sb.append(" regItemUid=").append(getRegItemUid());
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
        ret.put("regItemUid", Integer.valueOf(getRegItemUid()));
        return ret;
    }

}
