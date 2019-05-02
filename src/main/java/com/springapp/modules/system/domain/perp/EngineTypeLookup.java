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

@Entity(name="engine_type_lookup")
public class EngineTypeLookup implements Serializable {

    /** Primary key. */
    protected static final String PK = "engineTypeLookupUid";

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
    @Column(name="EngineTypeLookup_UID", unique=true, nullable=false, precision=10)
    private int engineTypeLookupUid;
    @Column(name="SparkOrCompression", nullable=false, precision=5)
    private short sparkOrCompression;
    @Column(name="Make", nullable=false, length=30)
    private String make;
    @Column(name="Model", nullable=false, length=30)
    private String model;
    @Column(name="Series", length=30)
    private String series;
    @Column(name="Ratedhp", precision=10)
    private int ratedhp;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="engineTypeLookup")
    private Set<RegitemDetails> regitemDetails;

    /** Default constructor. */
    public EngineTypeLookup() {
        super();
    }

    /**
     * Access method for engineTypeLookupUid.
     *
     * @return the current value of engineTypeLookupUid
     */
    public int getEngineTypeLookupUid() {
        return engineTypeLookupUid;
    }

    /**
     * Setter method for engineTypeLookupUid.
     *
     * @param aEngineTypeLookupUid the new value for engineTypeLookupUid
     */
    public void setEngineTypeLookupUid(int aEngineTypeLookupUid) {
        engineTypeLookupUid = aEngineTypeLookupUid;
    }

    /**
     * Access method for sparkOrCompression.
     *
     * @return the current value of sparkOrCompression
     */
    public short getSparkOrCompression() {
        return sparkOrCompression;
    }

    /**
     * Setter method for sparkOrCompression.
     *
     * @param aSparkOrCompression the new value for sparkOrCompression
     */
    public void setSparkOrCompression(short aSparkOrCompression) {
        sparkOrCompression = aSparkOrCompression;
    }

    /**
     * Access method for make.
     *
     * @return the current value of make
     */
    public String getMake() {
        return make;
    }

    /**
     * Setter method for make.
     *
     * @param aMake the new value for make
     */
    public void setMake(String aMake) {
        make = aMake;
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
     * Access method for ratedhp.
     *
     * @return the current value of ratedhp
     */
    public int getRatedhp() {
        return ratedhp;
    }

    /**
     * Setter method for ratedhp.
     *
     * @param aRatedhp the new value for ratedhp
     */
    public void setRatedhp(int aRatedhp) {
        ratedhp = aRatedhp;
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
     * Compares the key for this instance with another EngineTypeLookup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EngineTypeLookup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EngineTypeLookup)) {
            return false;
        }
        EngineTypeLookup that = (EngineTypeLookup) other;
        if (this.getEngineTypeLookupUid() != that.getEngineTypeLookupUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EngineTypeLookup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EngineTypeLookup)) return false;
        return this.equalKeys(other) && ((EngineTypeLookup)other).equalKeys(this);
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
        i = getEngineTypeLookupUid();
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
        StringBuffer sb = new StringBuffer("[EngineTypeLookup |");
        sb.append(" engineTypeLookupUid=").append(getEngineTypeLookupUid());
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
        ret.put("engineTypeLookupUid", Integer.valueOf(getEngineTypeLookupUid()));
        return ret;
    }

}
