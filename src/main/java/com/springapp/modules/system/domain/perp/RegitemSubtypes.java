// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
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

@Entity(name="regitem_subtypes")
public class RegitemSubtypes implements Serializable {

    /** Primary key. */
    protected static final String PK = "uid";

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
    @Column(name="UID", unique=true, nullable=false, precision=10)
    private int uid;
    @Column(name="Name", nullable=false, length=45)
    private String name;
    @Column(name="Display", nullable=false, length=80)
    private String display;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Identifier", nullable=false, length=45)
    private String identifier;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<FueltypeLookup> fueltypeLookup;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<EmissioncontroltypeLookup> emissioncontroltypeLookup;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<FueladditivetypeLookup> fueladditivetypeLookup;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<MonitoringmethodLookup> monitoringmethodLookup;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<MaterialtypeLookup> materialtypeLookup;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<RegitemcomptypeLookup> regitemcomptypeLookup;
    @ManyToOne(optional=false)
    @JoinColumn(name="RegItemType_UID", nullable=false)
    private RegitemTypes regitemTypes;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<RegistrationItems> registrationItems;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<RegitemSubsubtypes> regitemSubsubtypes;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<UomBrakehpLookup> uomBrakehpLookup;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<UomCoLookup> uomCoLookup;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<UomFuelconsumptionLookup> uomFuelconsumptionLookup;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<UomFlowrateLookup> uomFlowrateLookup;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<UomNozzlediameterLookup> uomNozzlediameterLookup;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<UomNoxLookup> uomNoxLookup;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<UomNozzlepresureLookup> uomNozzlepresureLookup;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<UomPm10Lookup> uomPm10Lookup;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<UomPowerratingLookup> uomPowerratingLookup;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<UomSoxLookup> uomSoxLookup;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<UomThroughputLookup> uomThroughputLookup;
    @OneToMany(mappedBy="regitemSubtypes")
    private Set<UomVocLookup> uomVocLookup;

    /** Default constructor. */
    public RegitemSubtypes() {
        super();
    }

    /**
     * Access method for uid.
     *
     * @return the current value of uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * Setter method for uid.
     *
     * @param aUid the new value for uid
     */
    public void setUid(int aUid) {
        uid = aUid;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for display.
     *
     * @return the current value of display
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Setter method for display.
     *
     * @param aDisplay the new value for display
     */
    public void setDisplay(String aDisplay) {
        display = aDisplay;
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
     * Access method for identifier.
     *
     * @return the current value of identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Setter method for identifier.
     *
     * @param aIdentifier the new value for identifier
     */
    public void setIdentifier(String aIdentifier) {
        identifier = aIdentifier;
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
     * Access method for fueltypeLookup.
     *
     * @return the current value of fueltypeLookup
     */
    public Set<FueltypeLookup> getFueltypeLookup() {
        return fueltypeLookup;
    }

    /**
     * Setter method for fueltypeLookup.
     *
     * @param aFueltypeLookup the new value for fueltypeLookup
     */
    public void setFueltypeLookup(Set<FueltypeLookup> aFueltypeLookup) {
        fueltypeLookup = aFueltypeLookup;
    }

    /**
     * Access method for emissioncontroltypeLookup.
     *
     * @return the current value of emissioncontroltypeLookup
     */
    public Set<EmissioncontroltypeLookup> getEmissioncontroltypeLookup() {
        return emissioncontroltypeLookup;
    }

    /**
     * Setter method for emissioncontroltypeLookup.
     *
     * @param aEmissioncontroltypeLookup the new value for emissioncontroltypeLookup
     */
    public void setEmissioncontroltypeLookup(Set<EmissioncontroltypeLookup> aEmissioncontroltypeLookup) {
        emissioncontroltypeLookup = aEmissioncontroltypeLookup;
    }

    /**
     * Access method for fueladditivetypeLookup.
     *
     * @return the current value of fueladditivetypeLookup
     */
    public Set<FueladditivetypeLookup> getFueladditivetypeLookup() {
        return fueladditivetypeLookup;
    }

    /**
     * Setter method for fueladditivetypeLookup.
     *
     * @param aFueladditivetypeLookup the new value for fueladditivetypeLookup
     */
    public void setFueladditivetypeLookup(Set<FueladditivetypeLookup> aFueladditivetypeLookup) {
        fueladditivetypeLookup = aFueladditivetypeLookup;
    }

    /**
     * Access method for monitoringmethodLookup.
     *
     * @return the current value of monitoringmethodLookup
     */
    public Set<MonitoringmethodLookup> getMonitoringmethodLookup() {
        return monitoringmethodLookup;
    }

    /**
     * Setter method for monitoringmethodLookup.
     *
     * @param aMonitoringmethodLookup the new value for monitoringmethodLookup
     */
    public void setMonitoringmethodLookup(Set<MonitoringmethodLookup> aMonitoringmethodLookup) {
        monitoringmethodLookup = aMonitoringmethodLookup;
    }

    /**
     * Access method for materialtypeLookup.
     *
     * @return the current value of materialtypeLookup
     */
    public Set<MaterialtypeLookup> getMaterialtypeLookup() {
        return materialtypeLookup;
    }

    /**
     * Setter method for materialtypeLookup.
     *
     * @param aMaterialtypeLookup the new value for materialtypeLookup
     */
    public void setMaterialtypeLookup(Set<MaterialtypeLookup> aMaterialtypeLookup) {
        materialtypeLookup = aMaterialtypeLookup;
    }

    /**
     * Access method for regitemcomptypeLookup.
     *
     * @return the current value of regitemcomptypeLookup
     */
    public Set<RegitemcomptypeLookup> getRegitemcomptypeLookup() {
        return regitemcomptypeLookup;
    }

    /**
     * Setter method for regitemcomptypeLookup.
     *
     * @param aRegitemcomptypeLookup the new value for regitemcomptypeLookup
     */
    public void setRegitemcomptypeLookup(Set<RegitemcomptypeLookup> aRegitemcomptypeLookup) {
        regitemcomptypeLookup = aRegitemcomptypeLookup;
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
     * Access method for registrationItems.
     *
     * @return the current value of registrationItems
     */
    public Set<RegistrationItems> getRegistrationItems() {
        return registrationItems;
    }

    /**
     * Setter method for registrationItems.
     *
     * @param aRegistrationItems the new value for registrationItems
     */
    public void setRegistrationItems(Set<RegistrationItems> aRegistrationItems) {
        registrationItems = aRegistrationItems;
    }

    /**
     * Access method for regitemSubsubtypes.
     *
     * @return the current value of regitemSubsubtypes
     */
    public Set<RegitemSubsubtypes> getRegitemSubsubtypes() {
        return regitemSubsubtypes;
    }

    /**
     * Setter method for regitemSubsubtypes.
     *
     * @param aRegitemSubsubtypes the new value for regitemSubsubtypes
     */
    public void setRegitemSubsubtypes(Set<RegitemSubsubtypes> aRegitemSubsubtypes) {
        regitemSubsubtypes = aRegitemSubsubtypes;
    }

    /**
     * Access method for uomBrakehpLookup.
     *
     * @return the current value of uomBrakehpLookup
     */
    public Set<UomBrakehpLookup> getUomBrakehpLookup() {
        return uomBrakehpLookup;
    }

    /**
     * Setter method for uomBrakehpLookup.
     *
     * @param aUomBrakehpLookup the new value for uomBrakehpLookup
     */
    public void setUomBrakehpLookup(Set<UomBrakehpLookup> aUomBrakehpLookup) {
        uomBrakehpLookup = aUomBrakehpLookup;
    }

    /**
     * Access method for uomCoLookup.
     *
     * @return the current value of uomCoLookup
     */
    public Set<UomCoLookup> getUomCoLookup() {
        return uomCoLookup;
    }

    /**
     * Setter method for uomCoLookup.
     *
     * @param aUomCoLookup the new value for uomCoLookup
     */
    public void setUomCoLookup(Set<UomCoLookup> aUomCoLookup) {
        uomCoLookup = aUomCoLookup;
    }

    /**
     * Access method for uomFuelconsumptionLookup.
     *
     * @return the current value of uomFuelconsumptionLookup
     */
    public Set<UomFuelconsumptionLookup> getUomFuelconsumptionLookup() {
        return uomFuelconsumptionLookup;
    }

    /**
     * Setter method for uomFuelconsumptionLookup.
     *
     * @param aUomFuelconsumptionLookup the new value for uomFuelconsumptionLookup
     */
    public void setUomFuelconsumptionLookup(Set<UomFuelconsumptionLookup> aUomFuelconsumptionLookup) {
        uomFuelconsumptionLookup = aUomFuelconsumptionLookup;
    }

    /**
     * Access method for uomFlowrateLookup.
     *
     * @return the current value of uomFlowrateLookup
     */
    public Set<UomFlowrateLookup> getUomFlowrateLookup() {
        return uomFlowrateLookup;
    }

    /**
     * Setter method for uomFlowrateLookup.
     *
     * @param aUomFlowrateLookup the new value for uomFlowrateLookup
     */
    public void setUomFlowrateLookup(Set<UomFlowrateLookup> aUomFlowrateLookup) {
        uomFlowrateLookup = aUomFlowrateLookup;
    }

    /**
     * Access method for uomNozzlediameterLookup.
     *
     * @return the current value of uomNozzlediameterLookup
     */
    public Set<UomNozzlediameterLookup> getUomNozzlediameterLookup() {
        return uomNozzlediameterLookup;
    }

    /**
     * Setter method for uomNozzlediameterLookup.
     *
     * @param aUomNozzlediameterLookup the new value for uomNozzlediameterLookup
     */
    public void setUomNozzlediameterLookup(Set<UomNozzlediameterLookup> aUomNozzlediameterLookup) {
        uomNozzlediameterLookup = aUomNozzlediameterLookup;
    }

    /**
     * Access method for uomNoxLookup.
     *
     * @return the current value of uomNoxLookup
     */
    public Set<UomNoxLookup> getUomNoxLookup() {
        return uomNoxLookup;
    }

    /**
     * Setter method for uomNoxLookup.
     *
     * @param aUomNoxLookup the new value for uomNoxLookup
     */
    public void setUomNoxLookup(Set<UomNoxLookup> aUomNoxLookup) {
        uomNoxLookup = aUomNoxLookup;
    }

    /**
     * Access method for uomNozzlepresureLookup.
     *
     * @return the current value of uomNozzlepresureLookup
     */
    public Set<UomNozzlepresureLookup> getUomNozzlepresureLookup() {
        return uomNozzlepresureLookup;
    }

    /**
     * Setter method for uomNozzlepresureLookup.
     *
     * @param aUomNozzlepresureLookup the new value for uomNozzlepresureLookup
     */
    public void setUomNozzlepresureLookup(Set<UomNozzlepresureLookup> aUomNozzlepresureLookup) {
        uomNozzlepresureLookup = aUomNozzlepresureLookup;
    }

    /**
     * Access method for uomPm10Lookup.
     *
     * @return the current value of uomPm10Lookup
     */
    public Set<UomPm10Lookup> getUomPm10Lookup() {
        return uomPm10Lookup;
    }

    /**
     * Setter method for uomPm10Lookup.
     *
     * @param aUomPm10Lookup the new value for uomPm10Lookup
     */
    public void setUomPm10Lookup(Set<UomPm10Lookup> aUomPm10Lookup) {
        uomPm10Lookup = aUomPm10Lookup;
    }

    /**
     * Access method for uomPowerratingLookup.
     *
     * @return the current value of uomPowerratingLookup
     */
    public Set<UomPowerratingLookup> getUomPowerratingLookup() {
        return uomPowerratingLookup;
    }

    /**
     * Setter method for uomPowerratingLookup.
     *
     * @param aUomPowerratingLookup the new value for uomPowerratingLookup
     */
    public void setUomPowerratingLookup(Set<UomPowerratingLookup> aUomPowerratingLookup) {
        uomPowerratingLookup = aUomPowerratingLookup;
    }

    /**
     * Access method for uomSoxLookup.
     *
     * @return the current value of uomSoxLookup
     */
    public Set<UomSoxLookup> getUomSoxLookup() {
        return uomSoxLookup;
    }

    /**
     * Setter method for uomSoxLookup.
     *
     * @param aUomSoxLookup the new value for uomSoxLookup
     */
    public void setUomSoxLookup(Set<UomSoxLookup> aUomSoxLookup) {
        uomSoxLookup = aUomSoxLookup;
    }

    /**
     * Access method for uomThroughputLookup.
     *
     * @return the current value of uomThroughputLookup
     */
    public Set<UomThroughputLookup> getUomThroughputLookup() {
        return uomThroughputLookup;
    }

    /**
     * Setter method for uomThroughputLookup.
     *
     * @param aUomThroughputLookup the new value for uomThroughputLookup
     */
    public void setUomThroughputLookup(Set<UomThroughputLookup> aUomThroughputLookup) {
        uomThroughputLookup = aUomThroughputLookup;
    }

    /**
     * Access method for uomVocLookup.
     *
     * @return the current value of uomVocLookup
     */
    public Set<UomVocLookup> getUomVocLookup() {
        return uomVocLookup;
    }

    /**
     * Setter method for uomVocLookup.
     *
     * @param aUomVocLookup the new value for uomVocLookup
     */
    public void setUomVocLookup(Set<UomVocLookup> aUomVocLookup) {
        uomVocLookup = aUomVocLookup;
    }

    /**
     * Compares the key for this instance with another RegitemSubtypes.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RegitemSubtypes and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RegitemSubtypes)) {
            return false;
        }
        RegitemSubtypes that = (RegitemSubtypes) other;
        if (this.getUid() != that.getUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RegitemSubtypes.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RegitemSubtypes)) return false;
        return this.equalKeys(other) && ((RegitemSubtypes)other).equalKeys(this);
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
        i = getUid();
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
        StringBuffer sb = new StringBuffer("[RegitemSubtypes |");
        sb.append(" uid=").append(getUid());
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
        ret.put("uid", Integer.valueOf(getUid()));
        return ret;
    }

}
