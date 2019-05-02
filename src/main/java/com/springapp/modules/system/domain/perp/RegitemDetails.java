// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.math.BigDecimal;
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

@Entity(name="regitem_details")
public class RegitemDetails implements Serializable {

    /** Primary key. */
    protected static final String PK = "regItemDetUid";

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
    @Column(name="RegItemDet_UID", unique=true, nullable=false, precision=10)
    private int regItemDetUid;
    @Column(name="Adjusted_PM_Factor", precision=10, scale=2)
    private BigDecimal adjustedPmFactor;
    @Column(name="APCE_ExecOrderNo", length=20)
    private String apceExecOrderNo;
    @Column(name="Aux_Engine_Flag", length=1)
    private String auxEngineFlag;
    @Column(name="BrakeHPValue", precision=10)
    private int brakeHpValue;
    @Column(name="CARB_Cert_PM_Factor_Override", precision=10, scale=2)
    private BigDecimal carbCertPmFactorOverride;
    @Column(name="CCTS_OnHighway", precision=5)
    private short cctsOnHighway;
    @Column(name="CO", precision=10, scale=4)
    private BigDecimal co;
    @Column(name="CO_Other_Units", length=12)
    private String coOtherUnits;
    @Column(name="Company_Unit_ID", length=60)
    private String companyUnitId;
    @Column(name="Crusher_Equiped_Flag", length=1)
    private String crusherEquipedFlag;
    @Column(name="Description")
    private String description;
    @Column(name="Electrification_Percent", precision=10)
    private int electrificationPercent;
    @Column(name="Emission_Points")
    private String emissionPoints;
    @Column(name="Engine_Family", length=12)
    private String engineFamily;
    @Column(name="EnginePowersOther")
    private String enginePowersOther;
    @Column(name="Equipment_ID", length=70)
    private String equipmentId;
    @Column(name="Flowrate", length=20)
    private String flowrate;
    @Column(name="FuelAdd_ExecOrderNo", length=20)
    private String fuelAddExecOrderNo;
    @Column(name="Fuel_Consumption_Rate", precision=15, scale=5)
    private BigDecimal fuelConsumptionRate;
    @Column(name="List_Description")
    private String listDescription;
    @Column(name="Manufacturer_Other", length=60)
    private String manufacturerOther;
    @Column(name="Model", length=45)
    private String model;
    @Column(name="Monitoring_Other", length=50)
    private String monitoringOther;
    @Column(name="Name_Other_Emis_Data", length=40)
    private String nameOtherEmisData;
    @Column(name="Name_Src_Test_Emis_Data", length=40)
    private String nameSrcTestEmisData;
    @Column(name="NOx", precision=10, scale=4)
    private BigDecimal nOx;
    @Column(name="NOx_Other_Units", length=12)
    private String nOxOtherUnits;
    @Column(name="Nozzle_Diameter", length=15)
    private String nozzleDiameter;
    @Column(name="Nozzle_Pressure", length=15)
    private String nozzlePressure;
    @Column(name="Number_Of_Units", precision=5)
    private short numberOfUnits;
    @Column(name="PM_Control_Efficiency", precision=10)
    private int pmControlEfficiency;
    @Column(name="PM10", precision=10, scale=4)
    private BigDecimal pm10;
    @Column(name="PM10_Other_Units", length=12)
    private String pm10OtherUnits;
    @Column(name="Power_Rating", precision=15, scale=5)
    private BigDecimal powerRating;
    @Column(name="Pressure_Gauge_Flag", length=1)
    private String pressureGaugeFlag;
    @Column(name="Primary_Component_Indicator", nullable=false, length=10)
    private String primaryComponentIndicator;
    @Column(name="RegItemCompType_Other", length=60)
    private String regItemCompTypeOther;
    @Column(name="Resident", length=2)
    private String resident;
    @Column(name="Resident_1995", length=2)
    private String resident1995;
    @Column(name="Self_Propelled_Flag", length=1)
    private String selfPropelledFlag;
    @Column(name="Serial_No", length=30)
    private String serialNo;
    @Column(name="Series", length=20)
    private String series;
    @Column(name="Silo_Crusher_Count", precision=10)
    private int siloCrusherCount;
    @Column(name="Silo_Crushers")
    private String siloCrushers;
    @Column(name="Source_Emissions_Data", length=10)
    private String sourceEmissionsData;
    @Column(name="SOx", precision=10, scale=4)
    private BigDecimal sOx;
    @Column(name="SOx_Other_Units", length=12)
    private String sOxOtherUnits;
    @Column(name="Throughput_Rating", length=40)
    private String throughputRating;
    @Column(name="Transfer_Points")
    private String transferPoints;
    @Column(name="Truck_CentralMix_Flag", length=1)
    private String truckCentralMixFlag;
    @Column(name="VOC", precision=10, scale=4)
    private BigDecimal voc;
    @Column(name="VOC_Other_Units", length=12)
    private String vocOtherUnits;
    @Column(name="Wet_Blasting_Percentage", precision=10)
    private int wetBlastingPercentage;
    @Column(name="WoodProcAck_Date")
    private Date woodProcAckDate;
    @Column(name="WoodProcAck_Flag", length=1)
    private String woodProcAckFlag;
    @Column(name="WoodProcAck_User", length=45)
    private String woodProcAckUser;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Legacy_AbrasiveFlowRate", length=20)
    private String legacyAbrasiveFlowRate;
    @Column(name="Legacy_NozzleDiameter", length=15)
    private String legacyNozzleDiameter;
    @Column(name="Legacy_NozzlePressure", length=15)
    private String legacyNozzlePressure;
    @Column(name="Legacy_AbrasiveTypes", length=60)
    private String legacyAbrasiveTypes;
    @Column(name="Legacy_SandType", length=20)
    private String legacySandType;
    @Column(name="Legacy_OtherBlasting")
    private String legacyOtherBlasting;
    @Column(name="Legacy_EmissionControls")
    private String legacyEmissionControls;
    @Column(name="Legacy_PmControlEfficency", precision=10)
    private int legacyPmControlEfficency;
    @Column(name="Legacy_ThroughPutRating", length=40)
    private String legacyThroughPutRating;
    @Column(name="Legacy_MaterialsProcessed")
    private String legacyMaterialsProcessed;
    @Column(name="Legacy_EmissionPoints")
    private String legacyEmissionPoints;
    @Column(name="Legacy_TransferPoints")
    private String legacyTransferPoints;
    @Column(name="Legacy_SilosCrushers")
    private String legacySilosCrushers;
    @Column(name="Legacy_FuelConsumptionRate", precision=7, scale=2)
    private double legacyFuelConsumptionRate;
    @Column(name="Legacy_FuelConsumptionUnits", length=15)
    private String legacyFuelConsumptionUnits;
    @Column(name="Legacy_Resident", length=60)
    private String legacyResident;
    @Column(name="Legacy_Resident1995")
    private String legacyResident1995;
    @Column(name="Legacy_MonitoringMethods", length=60)
    private String legacyMonitoringMethods;
    @Column(name="Legacy_EngineFamily", length=20)
    private String legacyEngineFamily;
    @Column(name="Administrative_Bypass_Flag", length=1)
    private String administrativeBypassFlag;
    @Column(name="Administrative_Bypass_Reason")
    private String administrativeBypassReason;
    @ManyToOne
    @JoinColumn(name="AddEquipInforType_UID")
    private AdditionalEquipInfoType additionalEquipInfoType;
    @ManyToOne
    @JoinColumn(name="FuelAdditive_UID")
    private FuelAdditiveTypes fuelAdditiveTypes;
    @ManyToOne
    @JoinColumn(name="APCEFilterType_UID")
    private ApceFilterTypes apceFilterTypes;
    @ManyToOne
    @JoinColumn(name="BrakeHPRanges_UID")
    private BrakeHpRanges brakeHpRanges;
    @ManyToOne
    @JoinColumn(name="CurrentTier_UID")
    private Tiers tiers;
    @ManyToOne
    @JoinColumn(name="EnginePowersType_UID")
    private EnginePowersTypes enginePowersTypes;
    @ManyToOne
    @JoinColumn(name="EngineTypeLookup_UID")
    private EngineTypeLookup engineTypeLookup;
    @ManyToOne
    @JoinColumn(name="EngineUseType_UID")
    private EngineUseTypes engineUseTypes;
    @ManyToOne
    @JoinColumn(name="FuelTypeUsed_UID")
    private FuelTypes fuelTypes;
    @ManyToOne
    @JoinColumn(name="Manufacturer_UID")
    private ManufacturerType manufacturerType;
    @ManyToOne
    @JoinColumn(name="ModelYears_UID")
    private ModelYears modelYears;
    @ManyToOne
    @JoinColumn(name="MonitoringMethods_UID")
    private MonitoringMethods monitoringMethods;
    @OneToMany(mappedBy="regitemDetails")
    private Set<AbrasiveRelations> abrasiveRelations;
    @OneToMany(mappedBy="regitemDetails")
    private Set<BlastingtypeRelations> blastingtypeRelations;
    @OneToMany(mappedBy="regitemDetails")
    private Set<EmissioncontrolRelations> emissioncontrolRelations;
    @OneToMany(mappedBy="regitemDetails")
    private Set<MaterialtypeRelations> materialtypeRelations;
    @OneToMany(mappedBy="regitemDetails")
    private Set<SandTypeRelations> sandTypeRelations;
    @ManyToOne(optional=false)
    @JoinColumn(name="RegItem_UID", nullable=false)
    private RegistrationItems registrationItems;
    @ManyToOne
    @JoinColumn(name="RegItemCompType_UID")
    private RegitemcomponentTypes regitemcomponentTypes;
    @ManyToOne
    @JoinColumn(name="STWTypes_UID")
    private StwTypes stwTypes;
    @ManyToOne
    @JoinColumn(name="Tier_UID")
    private Tiers tiers2;
    @ManyToOne
    @JoinColumn(name="BrakeHPRanges_Units_UID")
    private UnitOfMeasures unitOfMeasures;
    @ManyToOne
    @JoinColumn(name="CO_Units_UID")
    private UnitOfMeasures unitOfMeasures2;
    @ManyToOne
    @JoinColumn(name="FlowRate_Units_UID")
    private UnitOfMeasures unitOfMeasures3;
    @ManyToOne
    @JoinColumn(name="FuelConsumption_Units_UID")
    private UnitOfMeasures unitOfMeasures4;
    @ManyToOne
    @JoinColumn(name="NosslePressure_Units_UID")
    private UnitOfMeasures unitOfMeasures7;
    @ManyToOne
    @JoinColumn(name="NOx_Units_UID")
    private UnitOfMeasures unitOfMeasures5;
    @ManyToOne
    @JoinColumn(name="NozzleDiameter_Units_UID")
    private UnitOfMeasures unitOfMeasures6;
    @ManyToOne
    @JoinColumn(name="PM10_Units_UID")
    private UnitOfMeasures unitOfMeasures8;
    @ManyToOne
    @JoinColumn(name="PowerUoM_UID")
    private UnitOfMeasures unitOfMeasures9;
    @ManyToOne
    @JoinColumn(name="SOx_Units_UID")
    private UnitOfMeasures unitOfMeasures10;
    @ManyToOne
    @JoinColumn(name="ThroughputRating_Units_UID")
    private UnitOfMeasures unitOfMeasures11;
    @ManyToOne
    @JoinColumn(name="VOC_Units_UID")
    private UnitOfMeasures unitOfMeasures12;

    /** Default constructor. */
    public RegitemDetails() {
        super();
    }

    /**
     * Access method for regItemDetUid.
     *
     * @return the current value of regItemDetUid
     */
    public int getRegItemDetUid() {
        return regItemDetUid;
    }

    /**
     * Setter method for regItemDetUid.
     *
     * @param aRegItemDetUid the new value for regItemDetUid
     */
    public void setRegItemDetUid(int aRegItemDetUid) {
        regItemDetUid = aRegItemDetUid;
    }

    /**
     * Access method for adjustedPmFactor.
     *
     * @return the current value of adjustedPmFactor
     */
    public BigDecimal getAdjustedPmFactor() {
        return adjustedPmFactor;
    }

    /**
     * Setter method for adjustedPmFactor.
     *
     * @param aAdjustedPmFactor the new value for adjustedPmFactor
     */
    public void setAdjustedPmFactor(BigDecimal aAdjustedPmFactor) {
        adjustedPmFactor = aAdjustedPmFactor;
    }

    /**
     * Access method for apceExecOrderNo.
     *
     * @return the current value of apceExecOrderNo
     */
    public String getApceExecOrderNo() {
        return apceExecOrderNo;
    }

    /**
     * Setter method for apceExecOrderNo.
     *
     * @param aApceExecOrderNo the new value for apceExecOrderNo
     */
    public void setApceExecOrderNo(String aApceExecOrderNo) {
        apceExecOrderNo = aApceExecOrderNo;
    }

    /**
     * Access method for auxEngineFlag.
     *
     * @return the current value of auxEngineFlag
     */
    public String getAuxEngineFlag() {
        return auxEngineFlag;
    }

    /**
     * Setter method for auxEngineFlag.
     *
     * @param aAuxEngineFlag the new value for auxEngineFlag
     */
    public void setAuxEngineFlag(String aAuxEngineFlag) {
        auxEngineFlag = aAuxEngineFlag;
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
     * Access method for carbCertPmFactorOverride.
     *
     * @return the current value of carbCertPmFactorOverride
     */
    public BigDecimal getCarbCertPmFactorOverride() {
        return carbCertPmFactorOverride;
    }

    /**
     * Setter method for carbCertPmFactorOverride.
     *
     * @param aCarbCertPmFactorOverride the new value for carbCertPmFactorOverride
     */
    public void setCarbCertPmFactorOverride(BigDecimal aCarbCertPmFactorOverride) {
        carbCertPmFactorOverride = aCarbCertPmFactorOverride;
    }

    /**
     * Access method for cctsOnHighway.
     *
     * @return the current value of cctsOnHighway
     */
    public short getCctsOnHighway() {
        return cctsOnHighway;
    }

    /**
     * Setter method for cctsOnHighway.
     *
     * @param aCctsOnHighway the new value for cctsOnHighway
     */
    public void setCctsOnHighway(short aCctsOnHighway) {
        cctsOnHighway = aCctsOnHighway;
    }

    /**
     * Access method for co.
     *
     * @return the current value of co
     */
    public BigDecimal getCo() {
        return co;
    }

    /**
     * Setter method for co.
     *
     * @param aCo the new value for co
     */
    public void setCo(BigDecimal aCo) {
        co = aCo;
    }

    /**
     * Access method for coOtherUnits.
     *
     * @return the current value of coOtherUnits
     */
    public String getCoOtherUnits() {
        return coOtherUnits;
    }

    /**
     * Setter method for coOtherUnits.
     *
     * @param aCoOtherUnits the new value for coOtherUnits
     */
    public void setCoOtherUnits(String aCoOtherUnits) {
        coOtherUnits = aCoOtherUnits;
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
     * Access method for crusherEquipedFlag.
     *
     * @return the current value of crusherEquipedFlag
     */
    public String getCrusherEquipedFlag() {
        return crusherEquipedFlag;
    }

    /**
     * Setter method for crusherEquipedFlag.
     *
     * @param aCrusherEquipedFlag the new value for crusherEquipedFlag
     */
    public void setCrusherEquipedFlag(String aCrusherEquipedFlag) {
        crusherEquipedFlag = aCrusherEquipedFlag;
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
     * Access method for electrificationPercent.
     *
     * @return the current value of electrificationPercent
     */
    public int getElectrificationPercent() {
        return electrificationPercent;
    }

    /**
     * Setter method for electrificationPercent.
     *
     * @param aElectrificationPercent the new value for electrificationPercent
     */
    public void setElectrificationPercent(int aElectrificationPercent) {
        electrificationPercent = aElectrificationPercent;
    }

    /**
     * Access method for emissionPoints.
     *
     * @return the current value of emissionPoints
     */
    public String getEmissionPoints() {
        return emissionPoints;
    }

    /**
     * Setter method for emissionPoints.
     *
     * @param aEmissionPoints the new value for emissionPoints
     */
    public void setEmissionPoints(String aEmissionPoints) {
        emissionPoints = aEmissionPoints;
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
     * Access method for enginePowersOther.
     *
     * @return the current value of enginePowersOther
     */
    public String getEnginePowersOther() {
        return enginePowersOther;
    }

    /**
     * Setter method for enginePowersOther.
     *
     * @param aEnginePowersOther the new value for enginePowersOther
     */
    public void setEnginePowersOther(String aEnginePowersOther) {
        enginePowersOther = aEnginePowersOther;
    }

    /**
     * Access method for equipmentId.
     *
     * @return the current value of equipmentId
     */
    public String getEquipmentId() {
        return equipmentId;
    }

    /**
     * Setter method for equipmentId.
     *
     * @param aEquipmentId the new value for equipmentId
     */
    public void setEquipmentId(String aEquipmentId) {
        equipmentId = aEquipmentId;
    }

    /**
     * Access method for flowrate.
     *
     * @return the current value of flowrate
     */
    public String getFlowrate() {
        return flowrate;
    }

    /**
     * Setter method for flowrate.
     *
     * @param aFlowrate the new value for flowrate
     */
    public void setFlowrate(String aFlowrate) {
        flowrate = aFlowrate;
    }

    /**
     * Access method for fuelAddExecOrderNo.
     *
     * @return the current value of fuelAddExecOrderNo
     */
    public String getFuelAddExecOrderNo() {
        return fuelAddExecOrderNo;
    }

    /**
     * Setter method for fuelAddExecOrderNo.
     *
     * @param aFuelAddExecOrderNo the new value for fuelAddExecOrderNo
     */
    public void setFuelAddExecOrderNo(String aFuelAddExecOrderNo) {
        fuelAddExecOrderNo = aFuelAddExecOrderNo;
    }

    /**
     * Access method for fuelConsumptionRate.
     *
     * @return the current value of fuelConsumptionRate
     */
    public BigDecimal getFuelConsumptionRate() {
        return fuelConsumptionRate;
    }

    /**
     * Setter method for fuelConsumptionRate.
     *
     * @param aFuelConsumptionRate the new value for fuelConsumptionRate
     */
    public void setFuelConsumptionRate(BigDecimal aFuelConsumptionRate) {
        fuelConsumptionRate = aFuelConsumptionRate;
    }

    /**
     * Access method for listDescription.
     *
     * @return the current value of listDescription
     */
    public String getListDescription() {
        return listDescription;
    }

    /**
     * Setter method for listDescription.
     *
     * @param aListDescription the new value for listDescription
     */
    public void setListDescription(String aListDescription) {
        listDescription = aListDescription;
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
     * Access method for monitoringOther.
     *
     * @return the current value of monitoringOther
     */
    public String getMonitoringOther() {
        return monitoringOther;
    }

    /**
     * Setter method for monitoringOther.
     *
     * @param aMonitoringOther the new value for monitoringOther
     */
    public void setMonitoringOther(String aMonitoringOther) {
        monitoringOther = aMonitoringOther;
    }

    /**
     * Access method for nameOtherEmisData.
     *
     * @return the current value of nameOtherEmisData
     */
    public String getNameOtherEmisData() {
        return nameOtherEmisData;
    }

    /**
     * Setter method for nameOtherEmisData.
     *
     * @param aNameOtherEmisData the new value for nameOtherEmisData
     */
    public void setNameOtherEmisData(String aNameOtherEmisData) {
        nameOtherEmisData = aNameOtherEmisData;
    }

    /**
     * Access method for nameSrcTestEmisData.
     *
     * @return the current value of nameSrcTestEmisData
     */
    public String getNameSrcTestEmisData() {
        return nameSrcTestEmisData;
    }

    /**
     * Setter method for nameSrcTestEmisData.
     *
     * @param aNameSrcTestEmisData the new value for nameSrcTestEmisData
     */
    public void setNameSrcTestEmisData(String aNameSrcTestEmisData) {
        nameSrcTestEmisData = aNameSrcTestEmisData;
    }

    /**
     * Access method for nOx.
     *
     * @return the current value of nOx
     */
    public BigDecimal getNOx() {
        return nOx;
    }

    /**
     * Setter method for nOx.
     *
     * @param aNOx the new value for nOx
     */
    public void setNOx(BigDecimal aNOx) {
        nOx = aNOx;
    }

    /**
     * Access method for nOxOtherUnits.
     *
     * @return the current value of nOxOtherUnits
     */
    public String getNOxOtherUnits() {
        return nOxOtherUnits;
    }

    /**
     * Setter method for nOxOtherUnits.
     *
     * @param aNOxOtherUnits the new value for nOxOtherUnits
     */
    public void setNOxOtherUnits(String aNOxOtherUnits) {
        nOxOtherUnits = aNOxOtherUnits;
    }

    /**
     * Access method for nozzleDiameter.
     *
     * @return the current value of nozzleDiameter
     */
    public String getNozzleDiameter() {
        return nozzleDiameter;
    }

    /**
     * Setter method for nozzleDiameter.
     *
     * @param aNozzleDiameter the new value for nozzleDiameter
     */
    public void setNozzleDiameter(String aNozzleDiameter) {
        nozzleDiameter = aNozzleDiameter;
    }

    /**
     * Access method for nozzlePressure.
     *
     * @return the current value of nozzlePressure
     */
    public String getNozzlePressure() {
        return nozzlePressure;
    }

    /**
     * Setter method for nozzlePressure.
     *
     * @param aNozzlePressure the new value for nozzlePressure
     */
    public void setNozzlePressure(String aNozzlePressure) {
        nozzlePressure = aNozzlePressure;
    }

    /**
     * Access method for numberOfUnits.
     *
     * @return the current value of numberOfUnits
     */
    public short getNumberOfUnits() {
        return numberOfUnits;
    }

    /**
     * Setter method for numberOfUnits.
     *
     * @param aNumberOfUnits the new value for numberOfUnits
     */
    public void setNumberOfUnits(short aNumberOfUnits) {
        numberOfUnits = aNumberOfUnits;
    }

    /**
     * Access method for pmControlEfficiency.
     *
     * @return the current value of pmControlEfficiency
     */
    public int getPmControlEfficiency() {
        return pmControlEfficiency;
    }

    /**
     * Setter method for pmControlEfficiency.
     *
     * @param aPmControlEfficiency the new value for pmControlEfficiency
     */
    public void setPmControlEfficiency(int aPmControlEfficiency) {
        pmControlEfficiency = aPmControlEfficiency;
    }

    /**
     * Access method for pm10.
     *
     * @return the current value of pm10
     */
    public BigDecimal getPm10() {
        return pm10;
    }

    /**
     * Setter method for pm10.
     *
     * @param aPm10 the new value for pm10
     */
    public void setPm10(BigDecimal aPm10) {
        pm10 = aPm10;
    }

    /**
     * Access method for pm10OtherUnits.
     *
     * @return the current value of pm10OtherUnits
     */
    public String getPm10OtherUnits() {
        return pm10OtherUnits;
    }

    /**
     * Setter method for pm10OtherUnits.
     *
     * @param aPm10OtherUnits the new value for pm10OtherUnits
     */
    public void setPm10OtherUnits(String aPm10OtherUnits) {
        pm10OtherUnits = aPm10OtherUnits;
    }

    /**
     * Access method for powerRating.
     *
     * @return the current value of powerRating
     */
    public BigDecimal getPowerRating() {
        return powerRating;
    }

    /**
     * Setter method for powerRating.
     *
     * @param aPowerRating the new value for powerRating
     */
    public void setPowerRating(BigDecimal aPowerRating) {
        powerRating = aPowerRating;
    }

    /**
     * Access method for pressureGaugeFlag.
     *
     * @return the current value of pressureGaugeFlag
     */
    public String getPressureGaugeFlag() {
        return pressureGaugeFlag;
    }

    /**
     * Setter method for pressureGaugeFlag.
     *
     * @param aPressureGaugeFlag the new value for pressureGaugeFlag
     */
    public void setPressureGaugeFlag(String aPressureGaugeFlag) {
        pressureGaugeFlag = aPressureGaugeFlag;
    }

    /**
     * Access method for primaryComponentIndicator.
     *
     * @return the current value of primaryComponentIndicator
     */
    public String getPrimaryComponentIndicator() {
        return primaryComponentIndicator;
    }

    /**
     * Setter method for primaryComponentIndicator.
     *
     * @param aPrimaryComponentIndicator the new value for primaryComponentIndicator
     */
    public void setPrimaryComponentIndicator(String aPrimaryComponentIndicator) {
        primaryComponentIndicator = aPrimaryComponentIndicator;
    }

    /**
     * Access method for regItemCompTypeOther.
     *
     * @return the current value of regItemCompTypeOther
     */
    public String getRegItemCompTypeOther() {
        return regItemCompTypeOther;
    }

    /**
     * Setter method for regItemCompTypeOther.
     *
     * @param aRegItemCompTypeOther the new value for regItemCompTypeOther
     */
    public void setRegItemCompTypeOther(String aRegItemCompTypeOther) {
        regItemCompTypeOther = aRegItemCompTypeOther;
    }

    /**
     * Access method for resident.
     *
     * @return the current value of resident
     */
    public String getResident() {
        return resident;
    }

    /**
     * Setter method for resident.
     *
     * @param aResident the new value for resident
     */
    public void setResident(String aResident) {
        resident = aResident;
    }

    /**
     * Access method for resident1995.
     *
     * @return the current value of resident1995
     */
    public String getResident1995() {
        return resident1995;
    }

    /**
     * Setter method for resident1995.
     *
     * @param aResident1995 the new value for resident1995
     */
    public void setResident1995(String aResident1995) {
        resident1995 = aResident1995;
    }

    /**
     * Access method for selfPropelledFlag.
     *
     * @return the current value of selfPropelledFlag
     */
    public String getSelfPropelledFlag() {
        return selfPropelledFlag;
    }

    /**
     * Setter method for selfPropelledFlag.
     *
     * @param aSelfPropelledFlag the new value for selfPropelledFlag
     */
    public void setSelfPropelledFlag(String aSelfPropelledFlag) {
        selfPropelledFlag = aSelfPropelledFlag;
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
     * Access method for series.
     *
     * @return the current value of series
     */
    public String getSeries() {
        return series;
    }

    /**
     * Setter method for series.
     *
     * @param aSeries the new value for series
     */
    public void setSeries(String aSeries) {
        series = aSeries;
    }

    /**
     * Access method for siloCrusherCount.
     *
     * @return the current value of siloCrusherCount
     */
    public int getSiloCrusherCount() {
        return siloCrusherCount;
    }

    /**
     * Setter method for siloCrusherCount.
     *
     * @param aSiloCrusherCount the new value for siloCrusherCount
     */
    public void setSiloCrusherCount(int aSiloCrusherCount) {
        siloCrusherCount = aSiloCrusherCount;
    }

    /**
     * Access method for siloCrushers.
     *
     * @return the current value of siloCrushers
     */
    public String getSiloCrushers() {
        return siloCrushers;
    }

    /**
     * Setter method for siloCrushers.
     *
     * @param aSiloCrushers the new value for siloCrushers
     */
    public void setSiloCrushers(String aSiloCrushers) {
        siloCrushers = aSiloCrushers;
    }

    /**
     * Access method for sourceEmissionsData.
     *
     * @return the current value of sourceEmissionsData
     */
    public String getSourceEmissionsData() {
        return sourceEmissionsData;
    }

    /**
     * Setter method for sourceEmissionsData.
     *
     * @param aSourceEmissionsData the new value for sourceEmissionsData
     */
    public void setSourceEmissionsData(String aSourceEmissionsData) {
        sourceEmissionsData = aSourceEmissionsData;
    }

    /**
     * Access method for sOx.
     *
     * @return the current value of sOx
     */
    public BigDecimal getSOx() {
        return sOx;
    }

    /**
     * Setter method for sOx.
     *
     * @param aSOx the new value for sOx
     */
    public void setSOx(BigDecimal aSOx) {
        sOx = aSOx;
    }

    /**
     * Access method for sOxOtherUnits.
     *
     * @return the current value of sOxOtherUnits
     */
    public String getSOxOtherUnits() {
        return sOxOtherUnits;
    }

    /**
     * Setter method for sOxOtherUnits.
     *
     * @param aSOxOtherUnits the new value for sOxOtherUnits
     */
    public void setSOxOtherUnits(String aSOxOtherUnits) {
        sOxOtherUnits = aSOxOtherUnits;
    }

    /**
     * Access method for throughputRating.
     *
     * @return the current value of throughputRating
     */
    public String getThroughputRating() {
        return throughputRating;
    }

    /**
     * Setter method for throughputRating.
     *
     * @param aThroughputRating the new value for throughputRating
     */
    public void setThroughputRating(String aThroughputRating) {
        throughputRating = aThroughputRating;
    }

    /**
     * Access method for transferPoints.
     *
     * @return the current value of transferPoints
     */
    public String getTransferPoints() {
        return transferPoints;
    }

    /**
     * Setter method for transferPoints.
     *
     * @param aTransferPoints the new value for transferPoints
     */
    public void setTransferPoints(String aTransferPoints) {
        transferPoints = aTransferPoints;
    }

    /**
     * Access method for truckCentralMixFlag.
     *
     * @return the current value of truckCentralMixFlag
     */
    public String getTruckCentralMixFlag() {
        return truckCentralMixFlag;
    }

    /**
     * Setter method for truckCentralMixFlag.
     *
     * @param aTruckCentralMixFlag the new value for truckCentralMixFlag
     */
    public void setTruckCentralMixFlag(String aTruckCentralMixFlag) {
        truckCentralMixFlag = aTruckCentralMixFlag;
    }

    /**
     * Access method for voc.
     *
     * @return the current value of voc
     */
    public BigDecimal getVoc() {
        return voc;
    }

    /**
     * Setter method for voc.
     *
     * @param aVoc the new value for voc
     */
    public void setVoc(BigDecimal aVoc) {
        voc = aVoc;
    }

    /**
     * Access method for vocOtherUnits.
     *
     * @return the current value of vocOtherUnits
     */
    public String getVocOtherUnits() {
        return vocOtherUnits;
    }

    /**
     * Setter method for vocOtherUnits.
     *
     * @param aVocOtherUnits the new value for vocOtherUnits
     */
    public void setVocOtherUnits(String aVocOtherUnits) {
        vocOtherUnits = aVocOtherUnits;
    }

    /**
     * Access method for wetBlastingPercentage.
     *
     * @return the current value of wetBlastingPercentage
     */
    public int getWetBlastingPercentage() {
        return wetBlastingPercentage;
    }

    /**
     * Setter method for wetBlastingPercentage.
     *
     * @param aWetBlastingPercentage the new value for wetBlastingPercentage
     */
    public void setWetBlastingPercentage(int aWetBlastingPercentage) {
        wetBlastingPercentage = aWetBlastingPercentage;
    }

    /**
     * Access method for woodProcAckDate.
     *
     * @return the current value of woodProcAckDate
     */
    public Date getWoodProcAckDate() {
        return woodProcAckDate;
    }

    /**
     * Setter method for woodProcAckDate.
     *
     * @param aWoodProcAckDate the new value for woodProcAckDate
     */
    public void setWoodProcAckDate(Date aWoodProcAckDate) {
        woodProcAckDate = aWoodProcAckDate;
    }

    /**
     * Access method for woodProcAckFlag.
     *
     * @return the current value of woodProcAckFlag
     */
    public String getWoodProcAckFlag() {
        return woodProcAckFlag;
    }

    /**
     * Setter method for woodProcAckFlag.
     *
     * @param aWoodProcAckFlag the new value for woodProcAckFlag
     */
    public void setWoodProcAckFlag(String aWoodProcAckFlag) {
        woodProcAckFlag = aWoodProcAckFlag;
    }

    /**
     * Access method for woodProcAckUser.
     *
     * @return the current value of woodProcAckUser
     */
    public String getWoodProcAckUser() {
        return woodProcAckUser;
    }

    /**
     * Setter method for woodProcAckUser.
     *
     * @param aWoodProcAckUser the new value for woodProcAckUser
     */
    public void setWoodProcAckUser(String aWoodProcAckUser) {
        woodProcAckUser = aWoodProcAckUser;
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
     * Access method for legacyAbrasiveFlowRate.
     *
     * @return the current value of legacyAbrasiveFlowRate
     */
    public String getLegacyAbrasiveFlowRate() {
        return legacyAbrasiveFlowRate;
    }

    /**
     * Setter method for legacyAbrasiveFlowRate.
     *
     * @param aLegacyAbrasiveFlowRate the new value for legacyAbrasiveFlowRate
     */
    public void setLegacyAbrasiveFlowRate(String aLegacyAbrasiveFlowRate) {
        legacyAbrasiveFlowRate = aLegacyAbrasiveFlowRate;
    }

    /**
     * Access method for legacyNozzleDiameter.
     *
     * @return the current value of legacyNozzleDiameter
     */
    public String getLegacyNozzleDiameter() {
        return legacyNozzleDiameter;
    }

    /**
     * Setter method for legacyNozzleDiameter.
     *
     * @param aLegacyNozzleDiameter the new value for legacyNozzleDiameter
     */
    public void setLegacyNozzleDiameter(String aLegacyNozzleDiameter) {
        legacyNozzleDiameter = aLegacyNozzleDiameter;
    }

    /**
     * Access method for legacyNozzlePressure.
     *
     * @return the current value of legacyNozzlePressure
     */
    public String getLegacyNozzlePressure() {
        return legacyNozzlePressure;
    }

    /**
     * Setter method for legacyNozzlePressure.
     *
     * @param aLegacyNozzlePressure the new value for legacyNozzlePressure
     */
    public void setLegacyNozzlePressure(String aLegacyNozzlePressure) {
        legacyNozzlePressure = aLegacyNozzlePressure;
    }

    /**
     * Access method for legacyAbrasiveTypes.
     *
     * @return the current value of legacyAbrasiveTypes
     */
    public String getLegacyAbrasiveTypes() {
        return legacyAbrasiveTypes;
    }

    /**
     * Setter method for legacyAbrasiveTypes.
     *
     * @param aLegacyAbrasiveTypes the new value for legacyAbrasiveTypes
     */
    public void setLegacyAbrasiveTypes(String aLegacyAbrasiveTypes) {
        legacyAbrasiveTypes = aLegacyAbrasiveTypes;
    }

    /**
     * Access method for legacySandType.
     *
     * @return the current value of legacySandType
     */
    public String getLegacySandType() {
        return legacySandType;
    }

    /**
     * Setter method for legacySandType.
     *
     * @param aLegacySandType the new value for legacySandType
     */
    public void setLegacySandType(String aLegacySandType) {
        legacySandType = aLegacySandType;
    }

    /**
     * Access method for legacyOtherBlasting.
     *
     * @return the current value of legacyOtherBlasting
     */
    public String getLegacyOtherBlasting() {
        return legacyOtherBlasting;
    }

    /**
     * Setter method for legacyOtherBlasting.
     *
     * @param aLegacyOtherBlasting the new value for legacyOtherBlasting
     */
    public void setLegacyOtherBlasting(String aLegacyOtherBlasting) {
        legacyOtherBlasting = aLegacyOtherBlasting;
    }

    /**
     * Access method for legacyEmissionControls.
     *
     * @return the current value of legacyEmissionControls
     */
    public String getLegacyEmissionControls() {
        return legacyEmissionControls;
    }

    /**
     * Setter method for legacyEmissionControls.
     *
     * @param aLegacyEmissionControls the new value for legacyEmissionControls
     */
    public void setLegacyEmissionControls(String aLegacyEmissionControls) {
        legacyEmissionControls = aLegacyEmissionControls;
    }

    /**
     * Access method for legacyPmControlEfficency.
     *
     * @return the current value of legacyPmControlEfficency
     */
    public int getLegacyPmControlEfficency() {
        return legacyPmControlEfficency;
    }

    /**
     * Setter method for legacyPmControlEfficency.
     *
     * @param aLegacyPmControlEfficency the new value for legacyPmControlEfficency
     */
    public void setLegacyPmControlEfficency(int aLegacyPmControlEfficency) {
        legacyPmControlEfficency = aLegacyPmControlEfficency;
    }

    /**
     * Access method for legacyThroughPutRating.
     *
     * @return the current value of legacyThroughPutRating
     */
    public String getLegacyThroughPutRating() {
        return legacyThroughPutRating;
    }

    /**
     * Setter method for legacyThroughPutRating.
     *
     * @param aLegacyThroughPutRating the new value for legacyThroughPutRating
     */
    public void setLegacyThroughPutRating(String aLegacyThroughPutRating) {
        legacyThroughPutRating = aLegacyThroughPutRating;
    }

    /**
     * Access method for legacyMaterialsProcessed.
     *
     * @return the current value of legacyMaterialsProcessed
     */
    public String getLegacyMaterialsProcessed() {
        return legacyMaterialsProcessed;
    }

    /**
     * Setter method for legacyMaterialsProcessed.
     *
     * @param aLegacyMaterialsProcessed the new value for legacyMaterialsProcessed
     */
    public void setLegacyMaterialsProcessed(String aLegacyMaterialsProcessed) {
        legacyMaterialsProcessed = aLegacyMaterialsProcessed;
    }

    /**
     * Access method for legacyEmissionPoints.
     *
     * @return the current value of legacyEmissionPoints
     */
    public String getLegacyEmissionPoints() {
        return legacyEmissionPoints;
    }

    /**
     * Setter method for legacyEmissionPoints.
     *
     * @param aLegacyEmissionPoints the new value for legacyEmissionPoints
     */
    public void setLegacyEmissionPoints(String aLegacyEmissionPoints) {
        legacyEmissionPoints = aLegacyEmissionPoints;
    }

    /**
     * Access method for legacyTransferPoints.
     *
     * @return the current value of legacyTransferPoints
     */
    public String getLegacyTransferPoints() {
        return legacyTransferPoints;
    }

    /**
     * Setter method for legacyTransferPoints.
     *
     * @param aLegacyTransferPoints the new value for legacyTransferPoints
     */
    public void setLegacyTransferPoints(String aLegacyTransferPoints) {
        legacyTransferPoints = aLegacyTransferPoints;
    }

    /**
     * Access method for legacySilosCrushers.
     *
     * @return the current value of legacySilosCrushers
     */
    public String getLegacySilosCrushers() {
        return legacySilosCrushers;
    }

    /**
     * Setter method for legacySilosCrushers.
     *
     * @param aLegacySilosCrushers the new value for legacySilosCrushers
     */
    public void setLegacySilosCrushers(String aLegacySilosCrushers) {
        legacySilosCrushers = aLegacySilosCrushers;
    }

    /**
     * Access method for legacyFuelConsumptionRate.
     *
     * @return the current value of legacyFuelConsumptionRate
     */
    public double getLegacyFuelConsumptionRate() {
        return legacyFuelConsumptionRate;
    }

    /**
     * Setter method for legacyFuelConsumptionRate.
     *
     * @param aLegacyFuelConsumptionRate the new value for legacyFuelConsumptionRate
     */
    public void setLegacyFuelConsumptionRate(double aLegacyFuelConsumptionRate) {
        legacyFuelConsumptionRate = aLegacyFuelConsumptionRate;
    }

    /**
     * Access method for legacyFuelConsumptionUnits.
     *
     * @return the current value of legacyFuelConsumptionUnits
     */
    public String getLegacyFuelConsumptionUnits() {
        return legacyFuelConsumptionUnits;
    }

    /**
     * Setter method for legacyFuelConsumptionUnits.
     *
     * @param aLegacyFuelConsumptionUnits the new value for legacyFuelConsumptionUnits
     */
    public void setLegacyFuelConsumptionUnits(String aLegacyFuelConsumptionUnits) {
        legacyFuelConsumptionUnits = aLegacyFuelConsumptionUnits;
    }

    /**
     * Access method for legacyResident.
     *
     * @return the current value of legacyResident
     */
    public String getLegacyResident() {
        return legacyResident;
    }

    /**
     * Setter method for legacyResident.
     *
     * @param aLegacyResident the new value for legacyResident
     */
    public void setLegacyResident(String aLegacyResident) {
        legacyResident = aLegacyResident;
    }

    /**
     * Access method for legacyResident1995.
     *
     * @return the current value of legacyResident1995
     */
    public String getLegacyResident1995() {
        return legacyResident1995;
    }

    /**
     * Setter method for legacyResident1995.
     *
     * @param aLegacyResident1995 the new value for legacyResident1995
     */
    public void setLegacyResident1995(String aLegacyResident1995) {
        legacyResident1995 = aLegacyResident1995;
    }

    /**
     * Access method for legacyMonitoringMethods.
     *
     * @return the current value of legacyMonitoringMethods
     */
    public String getLegacyMonitoringMethods() {
        return legacyMonitoringMethods;
    }

    /**
     * Setter method for legacyMonitoringMethods.
     *
     * @param aLegacyMonitoringMethods the new value for legacyMonitoringMethods
     */
    public void setLegacyMonitoringMethods(String aLegacyMonitoringMethods) {
        legacyMonitoringMethods = aLegacyMonitoringMethods;
    }

    /**
     * Access method for legacyEngineFamily.
     *
     * @return the current value of legacyEngineFamily
     */
    public String getLegacyEngineFamily() {
        return legacyEngineFamily;
    }

    /**
     * Setter method for legacyEngineFamily.
     *
     * @param aLegacyEngineFamily the new value for legacyEngineFamily
     */
    public void setLegacyEngineFamily(String aLegacyEngineFamily) {
        legacyEngineFamily = aLegacyEngineFamily;
    }

    /**
     * Access method for administrativeBypassFlag.
     *
     * @return the current value of administrativeBypassFlag
     */
    public String getAdministrativeBypassFlag() {
        return administrativeBypassFlag;
    }

    /**
     * Setter method for administrativeBypassFlag.
     *
     * @param aAdministrativeBypassFlag the new value for administrativeBypassFlag
     */
    public void setAdministrativeBypassFlag(String aAdministrativeBypassFlag) {
        administrativeBypassFlag = aAdministrativeBypassFlag;
    }

    /**
     * Access method for administrativeBypassReason.
     *
     * @return the current value of administrativeBypassReason
     */
    public String getAdministrativeBypassReason() {
        return administrativeBypassReason;
    }

    /**
     * Setter method for administrativeBypassReason.
     *
     * @param aAdministrativeBypassReason the new value for administrativeBypassReason
     */
    public void setAdministrativeBypassReason(String aAdministrativeBypassReason) {
        administrativeBypassReason = aAdministrativeBypassReason;
    }

    /**
     * Access method for additionalEquipInfoType.
     *
     * @return the current value of additionalEquipInfoType
     */
    public AdditionalEquipInfoType getAdditionalEquipInfoType() {
        return additionalEquipInfoType;
    }

    /**
     * Setter method for additionalEquipInfoType.
     *
     * @param aAdditionalEquipInfoType the new value for additionalEquipInfoType
     */
    public void setAdditionalEquipInfoType(AdditionalEquipInfoType aAdditionalEquipInfoType) {
        additionalEquipInfoType = aAdditionalEquipInfoType;
    }

    /**
     * Access method for fuelAdditiveTypes.
     *
     * @return the current value of fuelAdditiveTypes
     */
    public FuelAdditiveTypes getFuelAdditiveTypes() {
        return fuelAdditiveTypes;
    }

    /**
     * Setter method for fuelAdditiveTypes.
     *
     * @param aFuelAdditiveTypes the new value for fuelAdditiveTypes
     */
    public void setFuelAdditiveTypes(FuelAdditiveTypes aFuelAdditiveTypes) {
        fuelAdditiveTypes = aFuelAdditiveTypes;
    }

    /**
     * Access method for apceFilterTypes.
     *
     * @return the current value of apceFilterTypes
     */
    public ApceFilterTypes getApceFilterTypes() {
        return apceFilterTypes;
    }

    /**
     * Setter method for apceFilterTypes.
     *
     * @param aApceFilterTypes the new value for apceFilterTypes
     */
    public void setApceFilterTypes(ApceFilterTypes aApceFilterTypes) {
        apceFilterTypes = aApceFilterTypes;
    }

    /**
     * Access method for brakeHpRanges.
     *
     * @return the current value of brakeHpRanges
     */
    public BrakeHpRanges getBrakeHpRanges() {
        return brakeHpRanges;
    }

    /**
     * Setter method for brakeHpRanges.
     *
     * @param aBrakeHpRanges the new value for brakeHpRanges
     */
    public void setBrakeHpRanges(BrakeHpRanges aBrakeHpRanges) {
        brakeHpRanges = aBrakeHpRanges;
    }

    /**
     * Access method for tiers.
     *
     * @return the current value of tiers
     */
    public Tiers getTiers() {
        return tiers;
    }

    /**
     * Setter method for tiers.
     *
     * @param aTiers the new value for tiers
     */
    public void setTiers(Tiers aTiers) {
        tiers = aTiers;
    }

    /**
     * Access method for enginePowersTypes.
     *
     * @return the current value of enginePowersTypes
     */
    public EnginePowersTypes getEnginePowersTypes() {
        return enginePowersTypes;
    }

    /**
     * Setter method for enginePowersTypes.
     *
     * @param aEnginePowersTypes the new value for enginePowersTypes
     */
    public void setEnginePowersTypes(EnginePowersTypes aEnginePowersTypes) {
        enginePowersTypes = aEnginePowersTypes;
    }

    /**
     * Access method for engineTypeLookup.
     *
     * @return the current value of engineTypeLookup
     */
    public EngineTypeLookup getEngineTypeLookup() {
        return engineTypeLookup;
    }

    /**
     * Setter method for engineTypeLookup.
     *
     * @param aEngineTypeLookup the new value for engineTypeLookup
     */
    public void setEngineTypeLookup(EngineTypeLookup aEngineTypeLookup) {
        engineTypeLookup = aEngineTypeLookup;
    }

    /**
     * Access method for engineUseTypes.
     *
     * @return the current value of engineUseTypes
     */
    public EngineUseTypes getEngineUseTypes() {
        return engineUseTypes;
    }

    /**
     * Setter method for engineUseTypes.
     *
     * @param aEngineUseTypes the new value for engineUseTypes
     */
    public void setEngineUseTypes(EngineUseTypes aEngineUseTypes) {
        engineUseTypes = aEngineUseTypes;
    }

    /**
     * Access method for fuelTypes.
     *
     * @return the current value of fuelTypes
     */
    public FuelTypes getFuelTypes() {
        return fuelTypes;
    }

    /**
     * Setter method for fuelTypes.
     *
     * @param aFuelTypes the new value for fuelTypes
     */
    public void setFuelTypes(FuelTypes aFuelTypes) {
        fuelTypes = aFuelTypes;
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
     * Access method for modelYears.
     *
     * @return the current value of modelYears
     */
    public ModelYears getModelYears() {
        return modelYears;
    }

    /**
     * Setter method for modelYears.
     *
     * @param aModelYears the new value for modelYears
     */
    public void setModelYears(ModelYears aModelYears) {
        modelYears = aModelYears;
    }

    /**
     * Access method for monitoringMethods.
     *
     * @return the current value of monitoringMethods
     */
    public MonitoringMethods getMonitoringMethods() {
        return monitoringMethods;
    }

    /**
     * Setter method for monitoringMethods.
     *
     * @param aMonitoringMethods the new value for monitoringMethods
     */
    public void setMonitoringMethods(MonitoringMethods aMonitoringMethods) {
        monitoringMethods = aMonitoringMethods;
    }

    /**
     * Access method for abrasiveRelations.
     *
     * @return the current value of abrasiveRelations
     */
    public Set<AbrasiveRelations> getAbrasiveRelations() {
        return abrasiveRelations;
    }

    /**
     * Setter method for abrasiveRelations.
     *
     * @param aAbrasiveRelations the new value for abrasiveRelations
     */
    public void setAbrasiveRelations(Set<AbrasiveRelations> aAbrasiveRelations) {
        abrasiveRelations = aAbrasiveRelations;
    }

    /**
     * Access method for blastingtypeRelations.
     *
     * @return the current value of blastingtypeRelations
     */
    public Set<BlastingtypeRelations> getBlastingtypeRelations() {
        return blastingtypeRelations;
    }

    /**
     * Setter method for blastingtypeRelations.
     *
     * @param aBlastingtypeRelations the new value for blastingtypeRelations
     */
    public void setBlastingtypeRelations(Set<BlastingtypeRelations> aBlastingtypeRelations) {
        blastingtypeRelations = aBlastingtypeRelations;
    }

    /**
     * Access method for emissioncontrolRelations.
     *
     * @return the current value of emissioncontrolRelations
     */
    public Set<EmissioncontrolRelations> getEmissioncontrolRelations() {
        return emissioncontrolRelations;
    }

    /**
     * Setter method for emissioncontrolRelations.
     *
     * @param aEmissioncontrolRelations the new value for emissioncontrolRelations
     */
    public void setEmissioncontrolRelations(Set<EmissioncontrolRelations> aEmissioncontrolRelations) {
        emissioncontrolRelations = aEmissioncontrolRelations;
    }

    /**
     * Access method for materialtypeRelations.
     *
     * @return the current value of materialtypeRelations
     */
    public Set<MaterialtypeRelations> getMaterialtypeRelations() {
        return materialtypeRelations;
    }

    /**
     * Setter method for materialtypeRelations.
     *
     * @param aMaterialtypeRelations the new value for materialtypeRelations
     */
    public void setMaterialtypeRelations(Set<MaterialtypeRelations> aMaterialtypeRelations) {
        materialtypeRelations = aMaterialtypeRelations;
    }

    /**
     * Access method for sandTypeRelations.
     *
     * @return the current value of sandTypeRelations
     */
    public Set<SandTypeRelations> getSandTypeRelations() {
        return sandTypeRelations;
    }

    /**
     * Setter method for sandTypeRelations.
     *
     * @param aSandTypeRelations the new value for sandTypeRelations
     */
    public void setSandTypeRelations(Set<SandTypeRelations> aSandTypeRelations) {
        sandTypeRelations = aSandTypeRelations;
    }

    /**
     * Access method for registrationItems.
     *
     * @return the current value of registrationItems
     */
    public RegistrationItems getRegistrationItems() {
        return registrationItems;
    }

    /**
     * Setter method for registrationItems.
     *
     * @param aRegistrationItems the new value for registrationItems
     */
    public void setRegistrationItems(RegistrationItems aRegistrationItems) {
        registrationItems = aRegistrationItems;
    }

    /**
     * Access method for regitemcomponentTypes.
     *
     * @return the current value of regitemcomponentTypes
     */
    public RegitemcomponentTypes getRegitemcomponentTypes() {
        return regitemcomponentTypes;
    }

    /**
     * Setter method for regitemcomponentTypes.
     *
     * @param aRegitemcomponentTypes the new value for regitemcomponentTypes
     */
    public void setRegitemcomponentTypes(RegitemcomponentTypes aRegitemcomponentTypes) {
        regitemcomponentTypes = aRegitemcomponentTypes;
    }

    /**
     * Access method for stwTypes.
     *
     * @return the current value of stwTypes
     */
    public StwTypes getStwTypes() {
        return stwTypes;
    }

    /**
     * Setter method for stwTypes.
     *
     * @param aStwTypes the new value for stwTypes
     */
    public void setStwTypes(StwTypes aStwTypes) {
        stwTypes = aStwTypes;
    }

    /**
     * Access method for tiers2.
     *
     * @return the current value of tiers2
     */
    public Tiers getTiers2() {
        return tiers2;
    }

    /**
     * Setter method for tiers2.
     *
     * @param aTiers2 the new value for tiers2
     */
    public void setTiers2(Tiers aTiers2) {
        tiers2 = aTiers2;
    }

    /**
     * Access method for unitOfMeasures.
     *
     * @return the current value of unitOfMeasures
     */
    public UnitOfMeasures getUnitOfMeasures() {
        return unitOfMeasures;
    }

    /**
     * Setter method for unitOfMeasures.
     *
     * @param aUnitOfMeasures the new value for unitOfMeasures
     */
    public void setUnitOfMeasures(UnitOfMeasures aUnitOfMeasures) {
        unitOfMeasures = aUnitOfMeasures;
    }

    /**
     * Access method for unitOfMeasures2.
     *
     * @return the current value of unitOfMeasures2
     */
    public UnitOfMeasures getUnitOfMeasures2() {
        return unitOfMeasures2;
    }

    /**
     * Setter method for unitOfMeasures2.
     *
     * @param aUnitOfMeasures2 the new value for unitOfMeasures2
     */
    public void setUnitOfMeasures2(UnitOfMeasures aUnitOfMeasures2) {
        unitOfMeasures2 = aUnitOfMeasures2;
    }

    /**
     * Access method for unitOfMeasures3.
     *
     * @return the current value of unitOfMeasures3
     */
    public UnitOfMeasures getUnitOfMeasures3() {
        return unitOfMeasures3;
    }

    /**
     * Setter method for unitOfMeasures3.
     *
     * @param aUnitOfMeasures3 the new value for unitOfMeasures3
     */
    public void setUnitOfMeasures3(UnitOfMeasures aUnitOfMeasures3) {
        unitOfMeasures3 = aUnitOfMeasures3;
    }

    /**
     * Access method for unitOfMeasures4.
     *
     * @return the current value of unitOfMeasures4
     */
    public UnitOfMeasures getUnitOfMeasures4() {
        return unitOfMeasures4;
    }

    /**
     * Setter method for unitOfMeasures4.
     *
     * @param aUnitOfMeasures4 the new value for unitOfMeasures4
     */
    public void setUnitOfMeasures4(UnitOfMeasures aUnitOfMeasures4) {
        unitOfMeasures4 = aUnitOfMeasures4;
    }

    /**
     * Access method for unitOfMeasures7.
     *
     * @return the current value of unitOfMeasures7
     */
    public UnitOfMeasures getUnitOfMeasures7() {
        return unitOfMeasures7;
    }

    /**
     * Setter method for unitOfMeasures7.
     *
     * @param aUnitOfMeasures7 the new value for unitOfMeasures7
     */
    public void setUnitOfMeasures7(UnitOfMeasures aUnitOfMeasures7) {
        unitOfMeasures7 = aUnitOfMeasures7;
    }

    /**
     * Access method for unitOfMeasures5.
     *
     * @return the current value of unitOfMeasures5
     */
    public UnitOfMeasures getUnitOfMeasures5() {
        return unitOfMeasures5;
    }

    /**
     * Setter method for unitOfMeasures5.
     *
     * @param aUnitOfMeasures5 the new value for unitOfMeasures5
     */
    public void setUnitOfMeasures5(UnitOfMeasures aUnitOfMeasures5) {
        unitOfMeasures5 = aUnitOfMeasures5;
    }

    /**
     * Access method for unitOfMeasures6.
     *
     * @return the current value of unitOfMeasures6
     */
    public UnitOfMeasures getUnitOfMeasures6() {
        return unitOfMeasures6;
    }

    /**
     * Setter method for unitOfMeasures6.
     *
     * @param aUnitOfMeasures6 the new value for unitOfMeasures6
     */
    public void setUnitOfMeasures6(UnitOfMeasures aUnitOfMeasures6) {
        unitOfMeasures6 = aUnitOfMeasures6;
    }

    /**
     * Access method for unitOfMeasures8.
     *
     * @return the current value of unitOfMeasures8
     */
    public UnitOfMeasures getUnitOfMeasures8() {
        return unitOfMeasures8;
    }

    /**
     * Setter method for unitOfMeasures8.
     *
     * @param aUnitOfMeasures8 the new value for unitOfMeasures8
     */
    public void setUnitOfMeasures8(UnitOfMeasures aUnitOfMeasures8) {
        unitOfMeasures8 = aUnitOfMeasures8;
    }

    /**
     * Access method for unitOfMeasures9.
     *
     * @return the current value of unitOfMeasures9
     */
    public UnitOfMeasures getUnitOfMeasures9() {
        return unitOfMeasures9;
    }

    /**
     * Setter method for unitOfMeasures9.
     *
     * @param aUnitOfMeasures9 the new value for unitOfMeasures9
     */
    public void setUnitOfMeasures9(UnitOfMeasures aUnitOfMeasures9) {
        unitOfMeasures9 = aUnitOfMeasures9;
    }

    /**
     * Access method for unitOfMeasures10.
     *
     * @return the current value of unitOfMeasures10
     */
    public UnitOfMeasures getUnitOfMeasures10() {
        return unitOfMeasures10;
    }

    /**
     * Setter method for unitOfMeasures10.
     *
     * @param aUnitOfMeasures10 the new value for unitOfMeasures10
     */
    public void setUnitOfMeasures10(UnitOfMeasures aUnitOfMeasures10) {
        unitOfMeasures10 = aUnitOfMeasures10;
    }

    /**
     * Access method for unitOfMeasures11.
     *
     * @return the current value of unitOfMeasures11
     */
    public UnitOfMeasures getUnitOfMeasures11() {
        return unitOfMeasures11;
    }

    /**
     * Setter method for unitOfMeasures11.
     *
     * @param aUnitOfMeasures11 the new value for unitOfMeasures11
     */
    public void setUnitOfMeasures11(UnitOfMeasures aUnitOfMeasures11) {
        unitOfMeasures11 = aUnitOfMeasures11;
    }

    /**
     * Access method for unitOfMeasures12.
     *
     * @return the current value of unitOfMeasures12
     */
    public UnitOfMeasures getUnitOfMeasures12() {
        return unitOfMeasures12;
    }

    /**
     * Setter method for unitOfMeasures12.
     *
     * @param aUnitOfMeasures12 the new value for unitOfMeasures12
     */
    public void setUnitOfMeasures12(UnitOfMeasures aUnitOfMeasures12) {
        unitOfMeasures12 = aUnitOfMeasures12;
    }

    /**
     * Compares the key for this instance with another RegitemDetails.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RegitemDetails and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RegitemDetails)) {
            return false;
        }
        RegitemDetails that = (RegitemDetails) other;
        if (this.getRegItemDetUid() != that.getRegItemDetUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RegitemDetails.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RegitemDetails)) return false;
        return this.equalKeys(other) && ((RegitemDetails)other).equalKeys(this);
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
        i = getRegItemDetUid();
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
        StringBuffer sb = new StringBuffer("[RegitemDetails |");
        sb.append(" regItemDetUid=").append(getRegItemDetUid());
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
        ret.put("regItemDetUid", Integer.valueOf(getRegItemDetUid()));
        return ret;
    }

}
