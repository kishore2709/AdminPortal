// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="apptranreg_fees_aud")
public class ApptranregFeesAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "atrfAudUid";

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
    @Column(name="ATRFAud_UID", unique=true, nullable=false, precision=10)
    private int atrfAudUid;
    @Column(name="AppTransRegFee_UID", nullable=false, precision=10)
    private int appTransRegFeeUid;
    @Column(name="AppTransRegRel_UID", nullable=false, precision=10)
    private int appTransRegRelUid;
    @Column(name="FeeName_UID", nullable=false, precision=10)
    private int feeNameUid;
    @Column(name="DistrictFeeType_UID", nullable=false, precision=10)
    private int districtFeeTypeUid;
    @Column(name="DiscountTypes_UID", nullable=false, precision=10)
    private int discountTypesUid;
    @Column(name="BackFee_Flag", nullable=false, length=1)
    private String backFeeFlag;
    @Column(name="Actual_Amt", nullable=false, precision=10, scale=2)
    private BigDecimal actualAmt;
    @Column(name="Calculate_Amt", nullable=false, precision=10, scale=2)
    private BigDecimal calculateAmt;
    @Column(name="Override_Comment", length=128)
    private String overrideComment;
    @Column(name="AdjustmentFee_Flag", nullable=false, length=1)
    private String adjustmentFeeFlag;
    @Column(name="Ledger_UID", precision=10)
    private int ledgerUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public ApptranregFeesAud() {
        super();
    }

    /**
     * Access method for atrfAudUid.
     *
     * @return the current value of atrfAudUid
     */
    public int getAtrfAudUid() {
        return atrfAudUid;
    }

    /**
     * Setter method for atrfAudUid.
     *
     * @param aAtrfAudUid the new value for atrfAudUid
     */
    public void setAtrfAudUid(int aAtrfAudUid) {
        atrfAudUid = aAtrfAudUid;
    }

    /**
     * Access method for appTransRegFeeUid.
     *
     * @return the current value of appTransRegFeeUid
     */
    public int getAppTransRegFeeUid() {
        return appTransRegFeeUid;
    }

    /**
     * Setter method for appTransRegFeeUid.
     *
     * @param aAppTransRegFeeUid the new value for appTransRegFeeUid
     */
    public void setAppTransRegFeeUid(int aAppTransRegFeeUid) {
        appTransRegFeeUid = aAppTransRegFeeUid;
    }

    /**
     * Access method for appTransRegRelUid.
     *
     * @return the current value of appTransRegRelUid
     */
    public int getAppTransRegRelUid() {
        return appTransRegRelUid;
    }

    /**
     * Setter method for appTransRegRelUid.
     *
     * @param aAppTransRegRelUid the new value for appTransRegRelUid
     */
    public void setAppTransRegRelUid(int aAppTransRegRelUid) {
        appTransRegRelUid = aAppTransRegRelUid;
    }

    /**
     * Access method for feeNameUid.
     *
     * @return the current value of feeNameUid
     */
    public int getFeeNameUid() {
        return feeNameUid;
    }

    /**
     * Setter method for feeNameUid.
     *
     * @param aFeeNameUid the new value for feeNameUid
     */
    public void setFeeNameUid(int aFeeNameUid) {
        feeNameUid = aFeeNameUid;
    }

    /**
     * Access method for districtFeeTypeUid.
     *
     * @return the current value of districtFeeTypeUid
     */
    public int getDistrictFeeTypeUid() {
        return districtFeeTypeUid;
    }

    /**
     * Setter method for districtFeeTypeUid.
     *
     * @param aDistrictFeeTypeUid the new value for districtFeeTypeUid
     */
    public void setDistrictFeeTypeUid(int aDistrictFeeTypeUid) {
        districtFeeTypeUid = aDistrictFeeTypeUid;
    }

    /**
     * Access method for discountTypesUid.
     *
     * @return the current value of discountTypesUid
     */
    public int getDiscountTypesUid() {
        return discountTypesUid;
    }

    /**
     * Setter method for discountTypesUid.
     *
     * @param aDiscountTypesUid the new value for discountTypesUid
     */
    public void setDiscountTypesUid(int aDiscountTypesUid) {
        discountTypesUid = aDiscountTypesUid;
    }

    /**
     * Access method for backFeeFlag.
     *
     * @return the current value of backFeeFlag
     */
    public String getBackFeeFlag() {
        return backFeeFlag;
    }

    /**
     * Setter method for backFeeFlag.
     *
     * @param aBackFeeFlag the new value for backFeeFlag
     */
    public void setBackFeeFlag(String aBackFeeFlag) {
        backFeeFlag = aBackFeeFlag;
    }

    /**
     * Access method for actualAmt.
     *
     * @return the current value of actualAmt
     */
    public BigDecimal getActualAmt() {
        return actualAmt;
    }

    /**
     * Setter method for actualAmt.
     *
     * @param aActualAmt the new value for actualAmt
     */
    public void setActualAmt(BigDecimal aActualAmt) {
        actualAmt = aActualAmt;
    }

    /**
     * Access method for calculateAmt.
     *
     * @return the current value of calculateAmt
     */
    public BigDecimal getCalculateAmt() {
        return calculateAmt;
    }

    /**
     * Setter method for calculateAmt.
     *
     * @param aCalculateAmt the new value for calculateAmt
     */
    public void setCalculateAmt(BigDecimal aCalculateAmt) {
        calculateAmt = aCalculateAmt;
    }

    /**
     * Access method for overrideComment.
     *
     * @return the current value of overrideComment
     */
    public String getOverrideComment() {
        return overrideComment;
    }

    /**
     * Setter method for overrideComment.
     *
     * @param aOverrideComment the new value for overrideComment
     */
    public void setOverrideComment(String aOverrideComment) {
        overrideComment = aOverrideComment;
    }

    /**
     * Access method for adjustmentFeeFlag.
     *
     * @return the current value of adjustmentFeeFlag
     */
    public String getAdjustmentFeeFlag() {
        return adjustmentFeeFlag;
    }

    /**
     * Setter method for adjustmentFeeFlag.
     *
     * @param aAdjustmentFeeFlag the new value for adjustmentFeeFlag
     */
    public void setAdjustmentFeeFlag(String aAdjustmentFeeFlag) {
        adjustmentFeeFlag = aAdjustmentFeeFlag;
    }

    /**
     * Access method for ledgerUid.
     *
     * @return the current value of ledgerUid
     */
    public int getLedgerUid() {
        return ledgerUid;
    }

    /**
     * Setter method for ledgerUid.
     *
     * @param aLedgerUid the new value for ledgerUid
     */
    public void setLedgerUid(int aLedgerUid) {
        ledgerUid = aLedgerUid;
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
     * Compares the key for this instance with another ApptranregFeesAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ApptranregFeesAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ApptranregFeesAud)) {
            return false;
        }
        ApptranregFeesAud that = (ApptranregFeesAud) other;
        if (this.getAtrfAudUid() != that.getAtrfAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ApptranregFeesAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ApptranregFeesAud)) return false;
        return this.equalKeys(other) && ((ApptranregFeesAud)other).equalKeys(this);
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
        i = getAtrfAudUid();
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
        StringBuffer sb = new StringBuffer("[ApptranregFeesAud |");
        sb.append(" atrfAudUid=").append(getAtrfAudUid());
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
        ret.put("atrfAudUid", Integer.valueOf(getAtrfAudUid()));
        return ret;
    }

}
