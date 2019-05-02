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

@Entity(name="vehicle")
public class Vehicle implements Serializable {

    /** Primary key. */
    protected static final String PK = "vehicleUid";

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
    @Column(name="Vehicle_UID", unique=true, nullable=false, precision=10)
    private int vehicleUid;
    @Column(name="Vehicle_Model_Year", length=45)
    private String vehicleModelYear;
    @Column(name="Vehicle_ID", length=45)
    private String vehicleId;
    @Column(name="Vehicle_License_Plate_Num", length=45)
    private String vehicleLicensePlateNum;
    @Column(name="Engine_Family_Name", length=45)
    private String engineFamilyName;
    @Column(name="Engine_Model", length=45)
    private String engineModel;
    @Column(name="Request_Date")
    private Timestamp requestDate;
    @Column(name="Engine_Model_Year")
    private Date engineModelYear;
    @Column(name="Dtr_Number", length=45)
    private String dtrNumber;
    @Column(name="Drayage_Label_Request")
    private boolean drayageLabelRequest;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Other_Manufacturer", length=45)
    private String otherManufacturer;
    @Column(name="Other_Engine_Manufacturer", length=45)
    private String otherEngineManufacturer;
    @Column(name="Idn", length=9)
    private String idn;
    @Column(name="Fullfill_Date")
    private Timestamp fullfillDate;
    @Column(name="Vin_Validation_Status", length=45)
    private String vinValidationStatus;
    @ManyToOne(optional=false)
    @JoinColumn(name="Company_UID", nullable=false)
    private Company company;
    @ManyToOne
    @JoinColumn(name="Vehicle_Issu_Country_Code_UID")
    private CountryCode countryCode;
    @ManyToOne
    @JoinColumn(name="Vehicle_Manufacturer_UID")
    private ManufacturerType manufacturerType;
    @ManyToOne
    @JoinColumn(name="Engine_Manufacturer_UID")
    private ManufacturerType manufacturerType2;
    @ManyToOne
    @JoinColumn(name="Vehicle_Issuance_State_Prov_UID")
    private StateProvinceCode stateProvinceCode;
    @OneToMany(mappedBy="vehicle")
    private Set<NoteComplaints> noteComplaints;
    @ManyToOne(optional=false)
    @JoinColumn(name="Vehicle_Status_Type_UID", nullable=false)
    private VehicleStatusType vehicleStatusType;
    @OneToMany(mappedBy="vehicle")
    private Set<VehicleComplianceStatus> vehicleComplianceStatus;
    @OneToMany(mappedBy="vehicle")
    private Set<VehicleCoTransferRel> vehicleCoTransferRel;

    /** Default constructor. */
    public Vehicle() {
        super();
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
     * Access method for vehicleModelYear.
     *
     * @return the current value of vehicleModelYear
     */
    public String getVehicleModelYear() {
        return vehicleModelYear;
    }

    /**
     * Setter method for vehicleModelYear.
     *
     * @param aVehicleModelYear the new value for vehicleModelYear
     */
    public void setVehicleModelYear(String aVehicleModelYear) {
        vehicleModelYear = aVehicleModelYear;
    }

    /**
     * Access method for vehicleId.
     *
     * @return the current value of vehicleId
     */
    public String getVehicleId() {
        return vehicleId;
    }

    /**
     * Setter method for vehicleId.
     *
     * @param aVehicleId the new value for vehicleId
     */
    public void setVehicleId(String aVehicleId) {
        vehicleId = aVehicleId;
    }

    /**
     * Access method for vehicleLicensePlateNum.
     *
     * @return the current value of vehicleLicensePlateNum
     */
    public String getVehicleLicensePlateNum() {
        return vehicleLicensePlateNum;
    }

    /**
     * Setter method for vehicleLicensePlateNum.
     *
     * @param aVehicleLicensePlateNum the new value for vehicleLicensePlateNum
     */
    public void setVehicleLicensePlateNum(String aVehicleLicensePlateNum) {
        vehicleLicensePlateNum = aVehicleLicensePlateNum;
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
     * Access method for engineModel.
     *
     * @return the current value of engineModel
     */
    public String getEngineModel() {
        return engineModel;
    }

    /**
     * Setter method for engineModel.
     *
     * @param aEngineModel the new value for engineModel
     */
    public void setEngineModel(String aEngineModel) {
        engineModel = aEngineModel;
    }

    /**
     * Access method for requestDate.
     *
     * @return the current value of requestDate
     */
    public Timestamp getRequestDate() {
        return requestDate;
    }

    /**
     * Setter method for requestDate.
     *
     * @param aRequestDate the new value for requestDate
     */
    public void setRequestDate(Timestamp aRequestDate) {
        requestDate = aRequestDate;
    }

    /**
     * Access method for engineModelYear.
     *
     * @return the current value of engineModelYear
     */
    public Date getEngineModelYear() {
        return engineModelYear;
    }

    /**
     * Setter method for engineModelYear.
     *
     * @param aEngineModelYear the new value for engineModelYear
     */
    public void setEngineModelYear(Date aEngineModelYear) {
        engineModelYear = aEngineModelYear;
    }

    /**
     * Access method for dtrNumber.
     *
     * @return the current value of dtrNumber
     */
    public String getDtrNumber() {
        return dtrNumber;
    }

    /**
     * Setter method for dtrNumber.
     *
     * @param aDtrNumber the new value for dtrNumber
     */
    public void setDtrNumber(String aDtrNumber) {
        dtrNumber = aDtrNumber;
    }

    /**
     * Access method for drayageLabelRequest.
     *
     * @return true if and only if drayageLabelRequest is currently true
     */
    public boolean getDrayageLabelRequest() {
        return drayageLabelRequest;
    }

    /**
     * Setter method for drayageLabelRequest.
     *
     * @param aDrayageLabelRequest the new value for drayageLabelRequest
     */
    public void setDrayageLabelRequest(boolean aDrayageLabelRequest) {
        drayageLabelRequest = aDrayageLabelRequest;
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
     * Access method for otherManufacturer.
     *
     * @return the current value of otherManufacturer
     */
    public String getOtherManufacturer() {
        return otherManufacturer;
    }

    /**
     * Setter method for otherManufacturer.
     *
     * @param aOtherManufacturer the new value for otherManufacturer
     */
    public void setOtherManufacturer(String aOtherManufacturer) {
        otherManufacturer = aOtherManufacturer;
    }

    /**
     * Access method for otherEngineManufacturer.
     *
     * @return the current value of otherEngineManufacturer
     */
    public String getOtherEngineManufacturer() {
        return otherEngineManufacturer;
    }

    /**
     * Setter method for otherEngineManufacturer.
     *
     * @param aOtherEngineManufacturer the new value for otherEngineManufacturer
     */
    public void setOtherEngineManufacturer(String aOtherEngineManufacturer) {
        otherEngineManufacturer = aOtherEngineManufacturer;
    }

    /**
     * Access method for idn.
     *
     * @return the current value of idn
     */
    public String getIdn() {
        return idn;
    }

    /**
     * Setter method for idn.
     *
     * @param aIdn the new value for idn
     */
    public void setIdn(String aIdn) {
        idn = aIdn;
    }

    /**
     * Access method for fullfillDate.
     *
     * @return the current value of fullfillDate
     */
    public Timestamp getFullfillDate() {
        return fullfillDate;
    }

    /**
     * Setter method for fullfillDate.
     *
     * @param aFullfillDate the new value for fullfillDate
     */
    public void setFullfillDate(Timestamp aFullfillDate) {
        fullfillDate = aFullfillDate;
    }

    /**
     * Access method for vinValidationStatus.
     *
     * @return the current value of vinValidationStatus
     */
    public String getVinValidationStatus() {
        return vinValidationStatus;
    }

    /**
     * Setter method for vinValidationStatus.
     *
     * @param aVinValidationStatus the new value for vinValidationStatus
     */
    public void setVinValidationStatus(String aVinValidationStatus) {
        vinValidationStatus = aVinValidationStatus;
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
     * Access method for countryCode.
     *
     * @return the current value of countryCode
     */
    public CountryCode getCountryCode() {
        return countryCode;
    }

    /**
     * Setter method for countryCode.
     *
     * @param aCountryCode the new value for countryCode
     */
    public void setCountryCode(CountryCode aCountryCode) {
        countryCode = aCountryCode;
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
     * Access method for manufacturerType2.
     *
     * @return the current value of manufacturerType2
     */
    public ManufacturerType getManufacturerType2() {
        return manufacturerType2;
    }

    /**
     * Setter method for manufacturerType2.
     *
     * @param aManufacturerType2 the new value for manufacturerType2
     */
    public void setManufacturerType2(ManufacturerType aManufacturerType2) {
        manufacturerType2 = aManufacturerType2;
    }

    /**
     * Access method for stateProvinceCode.
     *
     * @return the current value of stateProvinceCode
     */
    public StateProvinceCode getStateProvinceCode() {
        return stateProvinceCode;
    }

    /**
     * Setter method for stateProvinceCode.
     *
     * @param aStateProvinceCode the new value for stateProvinceCode
     */
    public void setStateProvinceCode(StateProvinceCode aStateProvinceCode) {
        stateProvinceCode = aStateProvinceCode;
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
     * Access method for vehicleStatusType.
     *
     * @return the current value of vehicleStatusType
     */
    public VehicleStatusType getVehicleStatusType() {
        return vehicleStatusType;
    }

    /**
     * Setter method for vehicleStatusType.
     *
     * @param aVehicleStatusType the new value for vehicleStatusType
     */
    public void setVehicleStatusType(VehicleStatusType aVehicleStatusType) {
        vehicleStatusType = aVehicleStatusType;
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
     * Access method for vehicleCoTransferRel.
     *
     * @return the current value of vehicleCoTransferRel
     */
    public Set<VehicleCoTransferRel> getVehicleCoTransferRel() {
        return vehicleCoTransferRel;
    }

    /**
     * Setter method for vehicleCoTransferRel.
     *
     * @param aVehicleCoTransferRel the new value for vehicleCoTransferRel
     */
    public void setVehicleCoTransferRel(Set<VehicleCoTransferRel> aVehicleCoTransferRel) {
        vehicleCoTransferRel = aVehicleCoTransferRel;
    }

    /**
     * Compares the key for this instance with another Vehicle.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Vehicle and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Vehicle)) {
            return false;
        }
        Vehicle that = (Vehicle) other;
        if (this.getVehicleUid() != that.getVehicleUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Vehicle.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Vehicle)) return false;
        return this.equalKeys(other) && ((Vehicle)other).equalKeys(this);
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
        i = getVehicleUid();
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
        StringBuffer sb = new StringBuffer("[Vehicle |");
        sb.append(" vehicleUid=").append(getVehicleUid());
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
        ret.put("vehicleUid", Integer.valueOf(getVehicleUid()));
        return ret;
    }

}
