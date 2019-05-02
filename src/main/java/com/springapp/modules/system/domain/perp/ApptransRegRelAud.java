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
import javax.persistence.Version;

@Entity(name="apptrans_reg_rel_aud")
public class ApptransRegRelAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "atrrAudUid";

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
    @Column(name="ATRRAud_UID", unique=true, nullable=false, precision=10)
    private int atrrAudUid;
    @Column(name="AppTransRegRel_UID", nullable=false, precision=10)
    private int appTransRegRelUid;
    @Column(name="AppTrans_UID", nullable=false, precision=10)
    private int appTransUid;
    @Column(name="AppRegItemStatus_UID", nullable=false, precision=10)
    private int appRegItemStatusUid;
    @Column(name="RegItem_UID", nullable=false, precision=10)
    private int regItemUid;
    @Column(name="RequestActions_UID", nullable=false, precision=10)
    private int requestActionsUid;
    @Column(name="DecisionAction_UID", precision=10)
    private int decisionActionUid;
    @Column(name="Decision_Date")
    private Date decisionDate;
    @Column(name="FulFilled_Flag", length=1)
    private String fulFilledFlag;
    @Column(name="RegItem_Amount", nullable=false, precision=10, scale=2)
    private BigDecimal regItemAmount;
    @Column(name="Fee_Adjust_Amount", precision=10, scale=2)
    private BigDecimal feeAdjustAmount;
    @Column(name="Calulated_Expiration")
    private Date calulatedExpiration;
    @Column(name="Token_Allow_Count", precision=10)
    private int tokenAllowCount;
    @Column(name="Token_Count", precision=10)
    private int tokenCount;
    @Column(name="Token_Exp_Date")
    private Date tokenExpDate;
    @Column(name="Issuance_Date")
    private Timestamp issuanceDate;
    @Column(name="Withdraw_Request_Flag", length=1)
    private String withdrawRequestFlag;
    @Column(name="Withdraw_Request_Date")
    private Timestamp withdrawRequestDate;
    @Column(name="Placard_Request_Flag", length=1)
    private String placardRequestFlag;
    @Column(name="Sticker_Request_Flag", length=1)
    private String stickerRequestFlag;
    @Column(name="Action_Requested_Date")
    private Date actionRequestedDate;
    @Column(name="Action_Requested_By", length=45)
    private String actionRequestedBy;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public ApptransRegRelAud() {
        super();
    }

    /**
     * Access method for atrrAudUid.
     *
     * @return the current value of atrrAudUid
     */
    public int getAtrrAudUid() {
        return atrrAudUid;
    }

    /**
     * Setter method for atrrAudUid.
     *
     * @param aAtrrAudUid the new value for atrrAudUid
     */
    public void setAtrrAudUid(int aAtrrAudUid) {
        atrrAudUid = aAtrrAudUid;
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
     * Access method for appTransUid.
     *
     * @return the current value of appTransUid
     */
    public int getAppTransUid() {
        return appTransUid;
    }

    /**
     * Setter method for appTransUid.
     *
     * @param aAppTransUid the new value for appTransUid
     */
    public void setAppTransUid(int aAppTransUid) {
        appTransUid = aAppTransUid;
    }

    /**
     * Access method for appRegItemStatusUid.
     *
     * @return the current value of appRegItemStatusUid
     */
    public int getAppRegItemStatusUid() {
        return appRegItemStatusUid;
    }

    /**
     * Setter method for appRegItemStatusUid.
     *
     * @param aAppRegItemStatusUid the new value for appRegItemStatusUid
     */
    public void setAppRegItemStatusUid(int aAppRegItemStatusUid) {
        appRegItemStatusUid = aAppRegItemStatusUid;
    }

    /**
     * Access method for regItemUid.
     *
     * @return the current value of regItemUid
     */
    public int getRegItemUid() {
        return regItemUid;
    }

    /**
     * Setter method for regItemUid.
     *
     * @param aRegItemUid the new value for regItemUid
     */
    public void setRegItemUid(int aRegItemUid) {
        regItemUid = aRegItemUid;
    }

    /**
     * Access method for requestActionsUid.
     *
     * @return the current value of requestActionsUid
     */
    public int getRequestActionsUid() {
        return requestActionsUid;
    }

    /**
     * Setter method for requestActionsUid.
     *
     * @param aRequestActionsUid the new value for requestActionsUid
     */
    public void setRequestActionsUid(int aRequestActionsUid) {
        requestActionsUid = aRequestActionsUid;
    }

    /**
     * Access method for decisionActionUid.
     *
     * @return the current value of decisionActionUid
     */
    public int getDecisionActionUid() {
        return decisionActionUid;
    }

    /**
     * Setter method for decisionActionUid.
     *
     * @param aDecisionActionUid the new value for decisionActionUid
     */
    public void setDecisionActionUid(int aDecisionActionUid) {
        decisionActionUid = aDecisionActionUid;
    }

    /**
     * Access method for decisionDate.
     *
     * @return the current value of decisionDate
     */
    public Date getDecisionDate() {
        return decisionDate;
    }

    /**
     * Setter method for decisionDate.
     *
     * @param aDecisionDate the new value for decisionDate
     */
    public void setDecisionDate(Date aDecisionDate) {
        decisionDate = aDecisionDate;
    }

    /**
     * Access method for fulFilledFlag.
     *
     * @return the current value of fulFilledFlag
     */
    public String getFulFilledFlag() {
        return fulFilledFlag;
    }

    /**
     * Setter method for fulFilledFlag.
     *
     * @param aFulFilledFlag the new value for fulFilledFlag
     */
    public void setFulFilledFlag(String aFulFilledFlag) {
        fulFilledFlag = aFulFilledFlag;
    }

    /**
     * Access method for regItemAmount.
     *
     * @return the current value of regItemAmount
     */
    public BigDecimal getRegItemAmount() {
        return regItemAmount;
    }

    /**
     * Setter method for regItemAmount.
     *
     * @param aRegItemAmount the new value for regItemAmount
     */
    public void setRegItemAmount(BigDecimal aRegItemAmount) {
        regItemAmount = aRegItemAmount;
    }

    /**
     * Access method for feeAdjustAmount.
     *
     * @return the current value of feeAdjustAmount
     */
    public BigDecimal getFeeAdjustAmount() {
        return feeAdjustAmount;
    }

    /**
     * Setter method for feeAdjustAmount.
     *
     * @param aFeeAdjustAmount the new value for feeAdjustAmount
     */
    public void setFeeAdjustAmount(BigDecimal aFeeAdjustAmount) {
        feeAdjustAmount = aFeeAdjustAmount;
    }

    /**
     * Access method for calulatedExpiration.
     *
     * @return the current value of calulatedExpiration
     */
    public Date getCalulatedExpiration() {
        return calulatedExpiration;
    }

    /**
     * Setter method for calulatedExpiration.
     *
     * @param aCalulatedExpiration the new value for calulatedExpiration
     */
    public void setCalulatedExpiration(Date aCalulatedExpiration) {
        calulatedExpiration = aCalulatedExpiration;
    }

    /**
     * Access method for tokenAllowCount.
     *
     * @return the current value of tokenAllowCount
     */
    public int getTokenAllowCount() {
        return tokenAllowCount;
    }

    /**
     * Setter method for tokenAllowCount.
     *
     * @param aTokenAllowCount the new value for tokenAllowCount
     */
    public void setTokenAllowCount(int aTokenAllowCount) {
        tokenAllowCount = aTokenAllowCount;
    }

    /**
     * Access method for tokenCount.
     *
     * @return the current value of tokenCount
     */
    public int getTokenCount() {
        return tokenCount;
    }

    /**
     * Setter method for tokenCount.
     *
     * @param aTokenCount the new value for tokenCount
     */
    public void setTokenCount(int aTokenCount) {
        tokenCount = aTokenCount;
    }

    /**
     * Access method for tokenExpDate.
     *
     * @return the current value of tokenExpDate
     */
    public Date getTokenExpDate() {
        return tokenExpDate;
    }

    /**
     * Setter method for tokenExpDate.
     *
     * @param aTokenExpDate the new value for tokenExpDate
     */
    public void setTokenExpDate(Date aTokenExpDate) {
        tokenExpDate = aTokenExpDate;
    }

    /**
     * Access method for issuanceDate.
     *
     * @return the current value of issuanceDate
     */
    public Timestamp getIssuanceDate() {
        return issuanceDate;
    }

    /**
     * Setter method for issuanceDate.
     *
     * @param aIssuanceDate the new value for issuanceDate
     */
    public void setIssuanceDate(Timestamp aIssuanceDate) {
        issuanceDate = aIssuanceDate;
    }

    /**
     * Access method for withdrawRequestFlag.
     *
     * @return the current value of withdrawRequestFlag
     */
    public String getWithdrawRequestFlag() {
        return withdrawRequestFlag;
    }

    /**
     * Setter method for withdrawRequestFlag.
     *
     * @param aWithdrawRequestFlag the new value for withdrawRequestFlag
     */
    public void setWithdrawRequestFlag(String aWithdrawRequestFlag) {
        withdrawRequestFlag = aWithdrawRequestFlag;
    }

    /**
     * Access method for withdrawRequestDate.
     *
     * @return the current value of withdrawRequestDate
     */
    public Timestamp getWithdrawRequestDate() {
        return withdrawRequestDate;
    }

    /**
     * Setter method for withdrawRequestDate.
     *
     * @param aWithdrawRequestDate the new value for withdrawRequestDate
     */
    public void setWithdrawRequestDate(Timestamp aWithdrawRequestDate) {
        withdrawRequestDate = aWithdrawRequestDate;
    }

    /**
     * Access method for placardRequestFlag.
     *
     * @return the current value of placardRequestFlag
     */
    public String getPlacardRequestFlag() {
        return placardRequestFlag;
    }

    /**
     * Setter method for placardRequestFlag.
     *
     * @param aPlacardRequestFlag the new value for placardRequestFlag
     */
    public void setPlacardRequestFlag(String aPlacardRequestFlag) {
        placardRequestFlag = aPlacardRequestFlag;
    }

    /**
     * Access method for stickerRequestFlag.
     *
     * @return the current value of stickerRequestFlag
     */
    public String getStickerRequestFlag() {
        return stickerRequestFlag;
    }

    /**
     * Setter method for stickerRequestFlag.
     *
     * @param aStickerRequestFlag the new value for stickerRequestFlag
     */
    public void setStickerRequestFlag(String aStickerRequestFlag) {
        stickerRequestFlag = aStickerRequestFlag;
    }

    /**
     * Access method for actionRequestedDate.
     *
     * @return the current value of actionRequestedDate
     */
    public Date getActionRequestedDate() {
        return actionRequestedDate;
    }

    /**
     * Setter method for actionRequestedDate.
     *
     * @param aActionRequestedDate the new value for actionRequestedDate
     */
    public void setActionRequestedDate(Date aActionRequestedDate) {
        actionRequestedDate = aActionRequestedDate;
    }

    /**
     * Access method for actionRequestedBy.
     *
     * @return the current value of actionRequestedBy
     */
    public String getActionRequestedBy() {
        return actionRequestedBy;
    }

    /**
     * Setter method for actionRequestedBy.
     *
     * @param aActionRequestedBy the new value for actionRequestedBy
     */
    public void setActionRequestedBy(String aActionRequestedBy) {
        actionRequestedBy = aActionRequestedBy;
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
     * Compares the key for this instance with another ApptransRegRelAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ApptransRegRelAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ApptransRegRelAud)) {
            return false;
        }
        ApptransRegRelAud that = (ApptransRegRelAud) other;
        if (this.getAtrrAudUid() != that.getAtrrAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ApptransRegRelAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ApptransRegRelAud)) return false;
        return this.equalKeys(other) && ((ApptransRegRelAud)other).equalKeys(this);
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
        i = getAtrrAudUid();
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
        StringBuffer sb = new StringBuffer("[ApptransRegRelAud |");
        sb.append(" atrrAudUid=").append(getAtrrAudUid());
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
        ret.put("atrrAudUid", Integer.valueOf(getAtrrAudUid()));
        return ret;
    }

}
