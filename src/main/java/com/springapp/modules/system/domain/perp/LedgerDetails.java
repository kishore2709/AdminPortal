// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="ledger_details")
public class LedgerDetails implements Serializable {

    /** Primary key. */
    protected static final String PK = "ledgerDetailsUid";

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
    @Column(name="LedgerDetails_UID", unique=true, nullable=false, precision=10)
    private int ledgerDetailsUid;
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
    @ManyToOne
    @JoinColumn(name="Accounting_Batch_UID")
    private AccountingBatch accountingBatch;
    @OneToMany(mappedBy="ledgerDetails")
    private Set<LedgerLedgerdetailsAssociation> ledgerLedgerdetailsAssociation;
    @ManyToOne(optional=false)
    @JoinColumn(name="PaymentStatus_UID", nullable=false)
    private PaymentStatus paymentStatus;
    @ManyToOne(optional=false)
    @JoinColumn(name="PaymentMethod_UID", nullable=false)
    private PaymentMethods paymentMethods;

    /** Default constructor. */
    public LedgerDetails() {
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

    /**
     * Access method for accountingBatch.
     *
     * @return the current value of accountingBatch
     */
    public AccountingBatch getAccountingBatch() {
        return accountingBatch;
    }

    /**
     * Setter method for accountingBatch.
     *
     * @param aAccountingBatch the new value for accountingBatch
     */
    public void setAccountingBatch(AccountingBatch aAccountingBatch) {
        accountingBatch = aAccountingBatch;
    }

    /**
     * Access method for ledgerLedgerdetailsAssociation.
     *
     * @return the current value of ledgerLedgerdetailsAssociation
     */
    public Set<LedgerLedgerdetailsAssociation> getLedgerLedgerdetailsAssociation() {
        return ledgerLedgerdetailsAssociation;
    }

    /**
     * Setter method for ledgerLedgerdetailsAssociation.
     *
     * @param aLedgerLedgerdetailsAssociation the new value for ledgerLedgerdetailsAssociation
     */
    public void setLedgerLedgerdetailsAssociation(Set<LedgerLedgerdetailsAssociation> aLedgerLedgerdetailsAssociation) {
        ledgerLedgerdetailsAssociation = aLedgerLedgerdetailsAssociation;
    }

    /**
     * Access method for paymentStatus.
     *
     * @return the current value of paymentStatus
     */
    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * Setter method for paymentStatus.
     *
     * @param aPaymentStatus the new value for paymentStatus
     */
    public void setPaymentStatus(PaymentStatus aPaymentStatus) {
        paymentStatus = aPaymentStatus;
    }

    /**
     * Access method for paymentMethods.
     *
     * @return the current value of paymentMethods
     */
    public PaymentMethods getPaymentMethods() {
        return paymentMethods;
    }

    /**
     * Setter method for paymentMethods.
     *
     * @param aPaymentMethods the new value for paymentMethods
     */
    public void setPaymentMethods(PaymentMethods aPaymentMethods) {
        paymentMethods = aPaymentMethods;
    }

    /**
     * Compares the key for this instance with another LedgerDetails.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class LedgerDetails and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof LedgerDetails)) {
            return false;
        }
        LedgerDetails that = (LedgerDetails) other;
        if (this.getLedgerDetailsUid() != that.getLedgerDetailsUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another LedgerDetails.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof LedgerDetails)) return false;
        return this.equalKeys(other) && ((LedgerDetails)other).equalKeys(this);
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
        i = getLedgerDetailsUid();
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
        StringBuffer sb = new StringBuffer("[LedgerDetails |");
        sb.append(" ledgerDetailsUid=").append(getLedgerDetailsUid());
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
        ret.put("ledgerDetailsUid", Integer.valueOf(getLedgerDetailsUid()));
        return ret;
    }

}
