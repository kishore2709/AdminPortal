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

@Entity(name="perp_upload_recovery")
public class PerpUploadRecovery implements Serializable {

    /** Primary key. */
    protected static final String PK = "perpUploadRecoveryUid";

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
    @Column(name="PERP_Upload_Recovery_UID", unique=true, nullable=false, precision=10)
    private int perpUploadRecoveryUid;
    @Column(name="PERP_UPLOAD_CONTROL_UID", precision=10)
    private int perpUploadControlUid;
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

    /** Default constructor. */
    public PerpUploadRecovery() {
        super();
    }

    /**
     * Access method for perpUploadRecoveryUid.
     *
     * @return the current value of perpUploadRecoveryUid
     */
    public int getPerpUploadRecoveryUid() {
        return perpUploadRecoveryUid;
    }

    /**
     * Setter method for perpUploadRecoveryUid.
     *
     * @param aPerpUploadRecoveryUid the new value for perpUploadRecoveryUid
     */
    public void setPerpUploadRecoveryUid(int aPerpUploadRecoveryUid) {
        perpUploadRecoveryUid = aPerpUploadRecoveryUid;
    }

    /**
     * Access method for perpUploadControlUid.
     *
     * @return the current value of perpUploadControlUid
     */
    public int getPerpUploadControlUid() {
        return perpUploadControlUid;
    }

    /**
     * Setter method for perpUploadControlUid.
     *
     * @param aPerpUploadControlUid the new value for perpUploadControlUid
     */
    public void setPerpUploadControlUid(int aPerpUploadControlUid) {
        perpUploadControlUid = aPerpUploadControlUid;
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
     * Compares the key for this instance with another PerpUploadRecovery.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PerpUploadRecovery and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PerpUploadRecovery)) {
            return false;
        }
        PerpUploadRecovery that = (PerpUploadRecovery) other;
        if (this.getPerpUploadRecoveryUid() != that.getPerpUploadRecoveryUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PerpUploadRecovery.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PerpUploadRecovery)) return false;
        return this.equalKeys(other) && ((PerpUploadRecovery)other).equalKeys(this);
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
        i = getPerpUploadRecoveryUid();
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
        StringBuffer sb = new StringBuffer("[PerpUploadRecovery |");
        sb.append(" perpUploadRecoveryUid=").append(getPerpUploadRecoveryUid());
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
        ret.put("perpUploadRecoveryUid", Integer.valueOf(getPerpUploadRecoveryUid()));
        return ret;
    }

}
