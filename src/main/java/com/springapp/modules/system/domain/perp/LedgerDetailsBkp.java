// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Version;

@Entity(name="ledger_details_bkp")
public class LedgerDetailsBkp implements Serializable {

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

    @Column(name="LedgerDetails_UID", nullable=false, precision=10)
    private int ledgerDetailsUid;
    @Column(name="PaymentStatus_UID", nullable=false, precision=10)
    private int paymentStatusUid;
    @Column(name="Accounting_Batch_UID", precision=10)
    private int accountingBatchUid;
    @Column(name="PaymentMethod_UID", nullable=false, precision=10)
    private int paymentMethodUid;
    @Column(name="Payment_Number", length=45)
    private String paymentNumber;
    @Column(name="Check_No", length=20)
    private String checkNo;
    @Column(name="Amount", nullable=false, precision=10, scale=2)
    private BigDecimal amount;
    @Column(name="Received_By", length=45)
    private String receivedBy;
    @Column(name="Received_Date")
    private Timestamp receivedDate;
    @Column(name="Payment_Confirmation_No", length=80)
    private String paymentConfirmationNo;
    @Column(name="Payment_Mailed_In_Flag", nullable=false, length=1)
    private String paymentMailedInFlag;
    @Column(name="LedgerDet_Comment", length=256)
    private String ledgerDetComment;
    @Column(name="App_Summary_Desc", length=256)
    private String appSummaryDesc;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;

    /** Default constructor. */
    public LedgerDetailsBkp() {
        super();
    }

    /**
     * Access method for ledgerDetailsUid.
     *
     * @return the current value of ledgerDetailsUid
     */
    public int getLedgerDetailsUid() {
        return ledgerDetailsUid;
    }

    /**
     * Setter method for ledgerDetailsUid.
     *
     * @param aLedgerDetailsUid the new value for ledgerDetailsUid
     */
    public void setLedgerDetailsUid(int aLedgerDetailsUid) {
        ledgerDetailsUid = aLedgerDetailsUid;
    }

    /**
     * Access method for paymentStatusUid.
     *
     * @return the current value of paymentStatusUid
     */
    public int getPaymentStatusUid() {
        return paymentStatusUid;
    }

    /**
     * Setter method for paymentStatusUid.
     *
     * @param aPaymentStatusUid the new value for paymentStatusUid
     */
    public void setPaymentStatusUid(int aPaymentStatusUid) {
        paymentStatusUid = aPaymentStatusUid;
    }

    /**
     * Access method for accountingBatchUid.
     *
     * @return the current value of accountingBatchUid
     */
    public int getAccountingBatchUid() {
        return accountingBatchUid;
    }

    /**
     * Setter method for accountingBatchUid.
     *
     * @param aAccountingBatchUid the new value for accountingBatchUid
     */
    public void setAccountingBatchUid(int aAccountingBatchUid) {
        accountingBatchUid = aAccountingBatchUid;
    }

    /**
     * Access method for paymentMethodUid.
     *
     * @return the current value of paymentMethodUid
     */
    public int getPaymentMethodUid() {
        return paymentMethodUid;
    }

    /**
     * Setter method for paymentMethodUid.
     *
     * @param aPaymentMethodUid the new value for paymentMethodUid
     */
    public void setPaymentMethodUid(int aPaymentMethodUid) {
        paymentMethodUid = aPaymentMethodUid;
    }

    /**
     * Access method for paymentNumber.
     *
     * @return the current value of paymentNumber
     */
    public String getPaymentNumber() {
        return paymentNumber;
    }

    /**
     * Setter method for paymentNumber.
     *
     * @param aPaymentNumber the new value for paymentNumber
     */
    public void setPaymentNumber(String aPaymentNumber) {
        paymentNumber = aPaymentNumber;
    }

    /**
     * Access method for checkNo.
     *
     * @return the current value of checkNo
     */
    public String getCheckNo() {
        return checkNo;
    }

    /**
     * Setter method for checkNo.
     *
     * @param aCheckNo the new value for checkNo
     */
    public void setCheckNo(String aCheckNo) {
        checkNo = aCheckNo;
    }

    /**
     * Access method for amount.
     *
     * @return the current value of amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Setter method for amount.
     *
     * @param aAmount the new value for amount
     */
    public void setAmount(BigDecimal aAmount) {
        amount = aAmount;
    }

    /**
     * Access method for receivedBy.
     *
     * @return the current value of receivedBy
     */
    public String getReceivedBy() {
        return receivedBy;
    }

    /**
     * Setter method for receivedBy.
     *
     * @param aReceivedBy the new value for receivedBy
     */
    public void setReceivedBy(String aReceivedBy) {
        receivedBy = aReceivedBy;
    }

    /**
     * Access method for receivedDate.
     *
     * @return the current value of receivedDate
     */
    public Timestamp getReceivedDate() {
        return receivedDate;
    }

    /**
     * Setter method for receivedDate.
     *
     * @param aReceivedDate the new value for receivedDate
     */
    public void setReceivedDate(Timestamp aReceivedDate) {
        receivedDate = aReceivedDate;
    }

    /**
     * Access method for paymentConfirmationNo.
     *
     * @return the current value of paymentConfirmationNo
     */
    public String getPaymentConfirmationNo() {
        return paymentConfirmationNo;
    }

    /**
     * Setter method for paymentConfirmationNo.
     *
     * @param aPaymentConfirmationNo the new value for paymentConfirmationNo
     */
    public void setPaymentConfirmationNo(String aPaymentConfirmationNo) {
        paymentConfirmationNo = aPaymentConfirmationNo;
    }

    /**
     * Access method for paymentMailedInFlag.
     *
     * @return the current value of paymentMailedInFlag
     */
    public String getPaymentMailedInFlag() {
        return paymentMailedInFlag;
    }

    /**
     * Setter method for paymentMailedInFlag.
     *
     * @param aPaymentMailedInFlag the new value for paymentMailedInFlag
     */
    public void setPaymentMailedInFlag(String aPaymentMailedInFlag) {
        paymentMailedInFlag = aPaymentMailedInFlag;
    }

    /**
     * Access method for ledgerDetComment.
     *
     * @return the current value of ledgerDetComment
     */
    public String getLedgerDetComment() {
        return ledgerDetComment;
    }

    /**
     * Setter method for ledgerDetComment.
     *
     * @param aLedgerDetComment the new value for ledgerDetComment
     */
    public void setLedgerDetComment(String aLedgerDetComment) {
        ledgerDetComment = aLedgerDetComment;
    }

    /**
     * Access method for appSummaryDesc.
     *
     * @return the current value of appSummaryDesc
     */
    public String getAppSummaryDesc() {
        return appSummaryDesc;
    }

    /**
     * Setter method for appSummaryDesc.
     *
     * @param aAppSummaryDesc the new value for appSummaryDesc
     */
    public void setAppSummaryDesc(String aAppSummaryDesc) {
        appSummaryDesc = aAppSummaryDesc;
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

}
