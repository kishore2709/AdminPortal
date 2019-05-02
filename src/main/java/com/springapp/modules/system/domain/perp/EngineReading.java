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

@Entity(name="engine_reading")
public class EngineReading implements Serializable {

    /** Primary key. */
    protected static final String PK = "erUid";

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
    @Column(name="er_uid", unique=true, nullable=false, precision=10)
    private int erUid;
    @Column(name="hour_meter_reading", nullable=false, precision=10)
    private int hourMeterReading;
    @Column(name="reading_date", nullable=false)
    private Timestamp readingDate;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Created_Date", nullable=false)
    private Timestamp createdDate;
    @Column(name="Serial_No", length=30)
    private String serialNo;

    /** Default constructor. */
    public EngineReading() {
        super();
    }

    /**
     * Access method for erUid.
     *
     * @return the current value of erUid
     */
    public int getErUid() {
        return erUid;
    }

    /**
     * Setter method for erUid.
     *
     * @param aErUid the new value for erUid
     */
    public void setErUid(int aErUid) {
        erUid = aErUid;
    }

    /**
     * Access method for hourMeterReading.
     *
     * @return the current value of hourMeterReading
     */
    public int getHourMeterReading() {
        return hourMeterReading;
    }

    /**
     * Setter method for hourMeterReading.
     *
     * @param aHourMeterReading the new value for hourMeterReading
     */
    public void setHourMeterReading(int aHourMeterReading) {
        hourMeterReading = aHourMeterReading;
    }

    /**
     * Access method for readingDate.
     *
     * @return the current value of readingDate
     */
    public Timestamp getReadingDate() {
        return readingDate;
    }

    /**
     * Setter method for readingDate.
     *
     * @param aReadingDate the new value for readingDate
     */
    public void setReadingDate(Timestamp aReadingDate) {
        readingDate = aReadingDate;
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
     * Compares the key for this instance with another EngineReading.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EngineReading and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EngineReading)) {
            return false;
        }
        EngineReading that = (EngineReading) other;
        if (this.getErUid() != that.getErUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EngineReading.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EngineReading)) return false;
        return this.equalKeys(other) && ((EngineReading)other).equalKeys(this);
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
        i = getErUid();
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
        StringBuffer sb = new StringBuffer("[EngineReading |");
        sb.append(" erUid=").append(getErUid());
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
        ret.put("erUid", Integer.valueOf(getErUid()));
        return ret;
    }

}
