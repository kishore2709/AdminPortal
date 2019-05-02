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
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="unit_of_measures")
public class UnitOfMeasures implements Serializable {

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
    @Column(name="Display", nullable=false, length=45)
    private String display;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Identifier", nullable=false, length=45)
    private String identifier;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="unitOfMeasures")
    private Set<RegitemDetails> regitemDetails;
    @OneToMany(mappedBy="unitOfMeasures2")
    private Set<RegitemDetails> regitemDetails2;
    @OneToMany(mappedBy="unitOfMeasures3")
    private Set<RegitemDetails> regitemDetails3;
    @OneToMany(mappedBy="unitOfMeasures4")
    private Set<RegitemDetails> regitemDetails4;
    @OneToMany(mappedBy="unitOfMeasures7")
    private Set<RegitemDetails> regitemDetails7;
    @OneToMany(mappedBy="unitOfMeasures5")
    private Set<RegitemDetails> regitemDetails5;
    @OneToMany(mappedBy="unitOfMeasures6")
    private Set<RegitemDetails> regitemDetails6;
    @OneToMany(mappedBy="unitOfMeasures8")
    private Set<RegitemDetails> regitemDetails8;
    @OneToMany(mappedBy="unitOfMeasures9")
    private Set<RegitemDetails> regitemDetails9;
    @OneToMany(mappedBy="unitOfMeasures10")
    private Set<RegitemDetails> regitemDetails10;
    @OneToMany(mappedBy="unitOfMeasures11")
    private Set<RegitemDetails> regitemDetails11;
    @OneToMany(mappedBy="unitOfMeasures")
    private Set<UomBrakehpLookup> uomBrakehpLookup;
    @OneToMany(mappedBy="unitOfMeasures")
    private Set<UomCoLookup> uomCoLookup;
    @OneToMany(mappedBy="unitOfMeasures")
    private Set<UomFuelconsumptionLookup> uomFuelconsumptionLookup;
    @OneToMany(mappedBy="unitOfMeasures")
    private Set<UomFlowrateLookup> uomFlowrateLookup;
    @OneToMany(mappedBy="unitOfMeasures")
    private Set<UomNozzlediameterLookup> uomNozzlediameterLookup;
    @OneToMany(mappedBy="unitOfMeasures")
    private Set<UomNoxLookup> uomNoxLookup;
    @OneToMany(mappedBy="unitOfMeasures")
    private Set<UomNozzlepresureLookup> uomNozzlepresureLookup;
    @OneToMany(mappedBy="unitOfMeasures")
    private Set<UomPm10Lookup> uomPm10Lookup;
    @OneToMany(mappedBy="unitOfMeasures")
    private Set<UomPowerratingLookup> uomPowerratingLookup;
    @OneToMany(mappedBy="unitOfMeasures")
    private Set<UomSoxLookup> uomSoxLookup;
    @OneToMany(mappedBy="unitOfMeasures")
    private Set<UomThroughputLookup> uomThroughputLookup;
    @OneToMany(mappedBy="unitOfMeasures")
    private Set<UomVocLookup> uomVocLookup;
    @OneToMany(mappedBy="unitOfMeasures12")
    private Set<RegitemDetails> regitemDetails12;

    /** Default constructor. */
    public UnitOfMeasures() {
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
     * Access method for regitemDetails2.
     *
     * @return the current value of regitemDetails2
     */
    public Set<RegitemDetails> getRegitemDetails2() {
        return regitemDetails2;
    }

    /**
     * Setter method for regitemDetails2.
     *
     * @param aRegitemDetails2 the new value for regitemDetails2
     */
    public void setRegitemDetails2(Set<RegitemDetails> aRegitemDetails2) {
        regitemDetails2 = aRegitemDetails2;
    }

    /**
     * Access method for regitemDetails3.
     *
     * @return the current value of regitemDetails3
     */
    public Set<RegitemDetails> getRegitemDetails3() {
        return regitemDetails3;
    }

    /**
     * Setter method for regitemDetails3.
     *
     * @param aRegitemDetails3 the new value for regitemDetails3
     */
    public void setRegitemDetails3(Set<RegitemDetails> aRegitemDetails3) {
        regitemDetails3 = aRegitemDetails3;
    }

    /**
     * Access method for regitemDetails4.
     *
     * @return the current value of regitemDetails4
     */
    public Set<RegitemDetails> getRegitemDetails4() {
        return regitemDetails4;
    }

    /**
     * Setter method for regitemDetails4.
     *
     * @param aRegitemDetails4 the new value for regitemDetails4
     */
    public void setRegitemDetails4(Set<RegitemDetails> aRegitemDetails4) {
        regitemDetails4 = aRegitemDetails4;
    }

    /**
     * Access method for regitemDetails7.
     *
     * @return the current value of regitemDetails7
     */
    public Set<RegitemDetails> getRegitemDetails7() {
        return regitemDetails7;
    }

    /**
     * Setter method for regitemDetails7.
     *
     * @param aRegitemDetails7 the new value for regitemDetails7
     */
    public void setRegitemDetails7(Set<RegitemDetails> aRegitemDetails7) {
        regitemDetails7 = aRegitemDetails7;
    }

    /**
     * Access method for regitemDetails5.
     *
     * @return the current value of regitemDetails5
     */
    public Set<RegitemDetails> getRegitemDetails5() {
        return regitemDetails5;
    }

    /**
     * Setter method for regitemDetails5.
     *
     * @param aRegitemDetails5 the new value for regitemDetails5
     */
    public void setRegitemDetails5(Set<RegitemDetails> aRegitemDetails5) {
        regitemDetails5 = aRegitemDetails5;
    }

    /**
     * Access method for regitemDetails6.
     *
     * @return the current value of regitemDetails6
     */
    public Set<RegitemDetails> getRegitemDetails6() {
        return regitemDetails6;
    }

    /**
     * Setter method for regitemDetails6.
     *
     * @param aRegitemDetails6 the new value for regitemDetails6
     */
    public void setRegitemDetails6(Set<RegitemDetails> aRegitemDetails6) {
        regitemDetails6 = aRegitemDetails6;
    }

    /**
     * Access method for regitemDetails8.
     *
     * @return the current value of regitemDetails8
     */
    public Set<RegitemDetails> getRegitemDetails8() {
        return regitemDetails8;
    }

    /**
     * Setter method for regitemDetails8.
     *
     * @param aRegitemDetails8 the new value for regitemDetails8
     */
    public void setRegitemDetails8(Set<RegitemDetails> aRegitemDetails8) {
        regitemDetails8 = aRegitemDetails8;
    }

    /**
     * Access method for regitemDetails9.
     *
     * @return the current value of regitemDetails9
     */
    public Set<RegitemDetails> getRegitemDetails9() {
        return regitemDetails9;
    }

    /**
     * Setter method for regitemDetails9.
     *
     * @param aRegitemDetails9 the new value for regitemDetails9
     */
    public void setRegitemDetails9(Set<RegitemDetails> aRegitemDetails9) {
        regitemDetails9 = aRegitemDetails9;
    }

    /**
     * Access method for regitemDetails10.
     *
     * @return the current value of regitemDetails10
     */
    public Set<RegitemDetails> getRegitemDetails10() {
        return regitemDetails10;
    }

    /**
     * Setter method for regitemDetails10.
     *
     * @param aRegitemDetails10 the new value for regitemDetails10
     */
    public void setRegitemDetails10(Set<RegitemDetails> aRegitemDetails10) {
        regitemDetails10 = aRegitemDetails10;
    }

    /**
     * Access method for regitemDetails11.
     *
     * @return the current value of regitemDetails11
     */
    public Set<RegitemDetails> getRegitemDetails11() {
        return regitemDetails11;
    }

    /**
     * Setter method for regitemDetails11.
     *
     * @param aRegitemDetails11 the new value for regitemDetails11
     */
    public void setRegitemDetails11(Set<RegitemDetails> aRegitemDetails11) {
        regitemDetails11 = aRegitemDetails11;
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
     * Access method for regitemDetails12.
     *
     * @return the current value of regitemDetails12
     */
    public Set<RegitemDetails> getRegitemDetails12() {
        return regitemDetails12;
    }

    /**
     * Setter method for regitemDetails12.
     *
     * @param aRegitemDetails12 the new value for regitemDetails12
     */
    public void setRegitemDetails12(Set<RegitemDetails> aRegitemDetails12) {
        regitemDetails12 = aRegitemDetails12;
    }

    /**
     * Compares the key for this instance with another UnitOfMeasures.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UnitOfMeasures and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UnitOfMeasures)) {
            return false;
        }
        UnitOfMeasures that = (UnitOfMeasures) other;
        if (this.getUid() != that.getUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UnitOfMeasures.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UnitOfMeasures)) return false;
        return this.equalKeys(other) && ((UnitOfMeasures)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[UnitOfMeasures |");
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
