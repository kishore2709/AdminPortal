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

@Entity(name="batch_errors")
public class BatchErrors implements Serializable {

    /** Primary key. */
    protected static final String PK = "batchErrorsUid";

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
    @Column(name="Batch_Errors_UID", unique=true, nullable=false, precision=10)
    private int batchErrorsUid;
    @Column(name="Operation", length=45)
    private String operation;
    @Column(name="Error_Flag", length=45)
    private String errorFlag;
    @Column(name="Error", length=2000)
    private String error;
    @Column(name="Create_Modify_By", nullable=false, length=45)
    private String createModifyBy;
    @Column(name="Create_Modify_Date", nullable=false)
    private Timestamp createModifyDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Batch_Control_UID", nullable=false)
    private BatchControl batchControl;

    /** Default constructor. */
    public BatchErrors() {
        super();
    }

    /**
     * Access method for batchErrorsUid.
     *
     * @return the current value of batchErrorsUid
     */
    public int getBatchErrorsUid() {
        return batchErrorsUid;
    }

    /**
     * Setter method for batchErrorsUid.
     *
     * @param aBatchErrorsUid the new value for batchErrorsUid
     */
    public void setBatchErrorsUid(int aBatchErrorsUid) {
        batchErrorsUid = aBatchErrorsUid;
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
     * Access method for error.
     *
     * @return the current value of error
     */
    public String getError() {
        return error;
    }

    /**
     * Setter method for error.
     *
     * @param aError the new value for error
     */
    public void setError(String aError) {
        error = aError;
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
     * Compares the key for this instance with another BatchErrors.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class BatchErrors and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof BatchErrors)) {
            return false;
        }
        BatchErrors that = (BatchErrors) other;
        if (this.getBatchErrorsUid() != that.getBatchErrorsUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another BatchErrors.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof BatchErrors)) return false;
        return this.equalKeys(other) && ((BatchErrors)other).equalKeys(this);
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
        i = getBatchErrorsUid();
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
        StringBuffer sb = new StringBuffer("[BatchErrors |");
        sb.append(" batchErrorsUid=").append(getBatchErrorsUid());
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
        ret.put("batchErrorsUid", Integer.valueOf(getBatchErrorsUid()));
        return ret;
    }

}
