// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="perpfeelookup_dates")
public class PerpfeelookupDates implements Serializable {

    /** Primary key. */
    protected static final String PK = "pflDatesUid";

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
    @Column(name="PFLDates_UID", unique=true, nullable=false, precision=10)
    private int pflDatesUid;
    @Column(name="Start_Date")
    private Date startDate;
    @Column(name="End_Date")
    private Date endDate;
    @Column(name="Fee_Amount", nullable=false, precision=10, scale=2)
    private BigDecimal feeAmount;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="PerpFeeLookup_UID", nullable=false)
    private PerpFeesLookup perpFeesLookup;

    /** Default constructor. */
    public PerpfeelookupDates() {
        super();
    }

    /**
     * Access method for pflDatesUid.
     *
     * @return the current value of pflDatesUid
     */
    public int getPflDatesUid() {
        return pflDatesUid;
    }

    /**
     * Setter method for pflDatesUid.
     *
     * @param aPflDatesUid the new value for pflDatesUid
     */
    public void setPflDatesUid(int aPflDatesUid) {
        pflDatesUid = aPflDatesUid;
    }

    /**
     * Access method for startDate.
     *
     * @return the current value of startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Setter method for startDate.
     *
     * @param aStartDate the new value for startDate
     */
    public void setStartDate(Date aStartDate) {
        startDate = aStartDate;
    }

    /**
     * Access method for endDate.
     *
     * @return the current value of endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Setter method for endDate.
     *
     * @param aEndDate the new value for endDate
     */
    public void setEndDate(Date aEndDate) {
        endDate = aEndDate;
    }

    /**
     * Access method for feeAmount.
     *
     * @return the current value of feeAmount
     */
    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    /**
     * Setter method for feeAmount.
     *
     * @param aFeeAmount the new value for feeAmount
     */
    public void setFeeAmount(BigDecimal aFeeAmount) {
        feeAmount = aFeeAmount;
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
     * Access method for perpFeesLookup.
     *
     * @return the current value of perpFeesLookup
     */
    public PerpFeesLookup getPerpFeesLookup() {
        return perpFeesLookup;
    }

    /**
     * Setter method for perpFeesLookup.
     *
     * @param aPerpFeesLookup the new value for perpFeesLookup
     */
    public void setPerpFeesLookup(PerpFeesLookup aPerpFeesLookup) {
        perpFeesLookup = aPerpFeesLookup;
    }

    /**
     * Compares the key for this instance with another PerpfeelookupDates.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PerpfeelookupDates and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PerpfeelookupDates)) {
            return false;
        }
        PerpfeelookupDates that = (PerpfeelookupDates) other;
        if (this.getPflDatesUid() != that.getPflDatesUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PerpfeelookupDates.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PerpfeelookupDates)) return false;
        return this.equalKeys(other) && ((PerpfeelookupDates)other).equalKeys(this);
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
        i = getPflDatesUid();
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
        StringBuffer sb = new StringBuffer("[PerpfeelookupDates |");
        sb.append(" pflDatesUid=").append(getPflDatesUid());
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
        ret.put("pflDatesUid", Integer.valueOf(getPflDatesUid()));
        return ret;
    }

}
