// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="batch_recovery")
public class BatchRecovery implements Serializable {

    /** Primary key. */
    protected static final String PK = "batchRecoveryUid";

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
    @Column(name="Batch_Recovery_UID", unique=true, nullable=false, precision=10)
    private int batchRecoveryUid;
    @Column(name="Element", nullable=false, length=45)
    private String element;
    @Column(name="Error_Flag", nullable=false, length=1)
    private String errorFlag;
    @Column(name="Error_Text", length=2000)
    private String errorText;
    @Column(name="TraceNum", precision=10)
    private int traceNum;
    @Column(name="Create_Modify_By", nullable=false, length=45)
    private String createModifyBy;
    @Column(name="Create_Modify_Date", nullable=false)
    private Timestamp createModifyDate;
    @ManyToOne
    @JoinColumn(name="Batch_Control_UID")
    private BatchControl batchControl;

    /** Default constructor. */
    public BatchRecovery() {
        super();
    }

    /**
     * Access method for batchRecoveryUid.
     *
     * @return the current value of batchRecoveryUid
     */
    public int getBatchRecoveryUid() {
        return batchRecoveryUid;
    }

    /**
     * Setter method for batchRecoveryUid.
     *
     * @param aBatchRecoveryUid the new value for batchRecoveryUid
     */
    public void setBatchRecoveryUid(int aBatchRecoveryUid) {
        batchRecoveryUid = aBatchRecoveryUid;
    }

    /**
     * Access method for element.
     *
     * @return the current value of element
     */
    public String getElement() {
        return element;
    }

    /**
     * Setter method for element.
     *
     * @param aElement the new value for element
     */
    public void setElement(String aElement) {
        element = aElement;
    }

    /**
     * Access method for errorFlag.
     *
     * @return the current value of errorFlag
     */
    public String getErrorFlag() {
        return errorFlag;
    }

    /**
     * Setter method for errorFlag.
     *
     * @param aErrorFlag the new value for errorFlag
     */
    public void setErrorFlag(String aErrorFlag) {
        errorFlag = aErrorFlag;
    }

    /**
     * Access method for errorText.
     *
     * @return the current value of errorText
     */
    public String getErrorText() {
        return errorText;
    }

    /**
     * Setter method for errorText.
     *
     * @param aErrorText the new value for errorText
     */
    public void setErrorText(String aErrorText) {
        errorText = aErrorText;
    }

    /**
     * Access method for traceNum.
     *
     * @return the current value of traceNum
     */
    public int getTraceNum() {
        return traceNum;
    }

    /**
     * Setter method for traceNum.
     *
     * @param aTraceNum the new value for traceNum
     */
    public void setTraceNum(int aTraceNum) {
        traceNum = aTraceNum;
    }

    /**
     * Access method for createModifyBy.
     *
     * @return the current value of createModifyBy
     */
    public String getCreateModifyBy() {
        return createModifyBy;
    }

    /**
     * Setter method for createModifyBy.
     *
     * @param aCreateModifyBy the new value for createModifyBy
     */
    public void setCreateModifyBy(String aCreateModifyBy) {
        createModifyBy = aCreateModifyBy;
    }

    /**
     * Access method for createModifyDate.
     *
     * @return the current value of createModifyDate
     */
    public Timestamp getCreateModifyDate() {
        return createModifyDate;
    }

    /**
     * Setter method for createModifyDate.
     *
     * @param aCreateModifyDate the new value for createModifyDate
     */
    public void setCreateModifyDate(Timestamp aCreateModifyDate) {
        createModifyDate = aCreateModifyDate;
    }

    /**
     * Access method for batchControl.
     *
     * @return the current value of batchControl
     */
    public BatchControl getBatchControl() {
        return batchControl;
    }

    /**
     * Setter method for batchControl.
     *
     * @param aBatchControl the new value for batchControl
     */
    public void setBatchControl(BatchControl aBatchControl) {
        batchControl = aBatchControl;
    }

    /**
     * Compares the key for this instance with another BatchRecovery.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BatchRecovery and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BatchRecovery)) {
            return false;
        }
        BatchRecovery that = (BatchRecovery) other;
        if (this.getBatchRecoveryUid() != that.getBatchRecoveryUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BatchRecovery.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BatchRecovery)) return false;
        return this.equalKeys(other) && ((BatchRecovery)other).equalKeys(this);
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
        i = getBatchRecoveryUid();
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
        StringBuffer sb = new StringBuffer("[BatchRecovery |");
        sb.append(" batchRecoveryUid=").append(getBatchRecoveryUid());
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
        ret.put("batchRecoveryUid", Integer.valueOf(getBatchRecoveryUid()));
        return ret;
    }

}
