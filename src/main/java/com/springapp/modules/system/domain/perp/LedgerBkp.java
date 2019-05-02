// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Version;

@Entity(name="ledger_bkp")
public class LedgerBkp implements Serializable {

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

    @Column(name="Ledger_UID", nullable=false, precision=10)
    private int ledgerUid;
    @Column(name="LedgerActionType_UID", nullable=false, precision=10)
    private int ledgerActionTypeUid;
    @Column(name="Company_UID", nullable=false, precision=10)
    private int companyUid;
    @Column(name="AppTrans_UID", nullable=false, precision=10)
    private int appTransUid;
    @Column(name="Referenced_pid", length=45)
    private String referencedPid;
    @Column(name="Refund_PID", length=45)
    private String refundPid;
    @Column(name="Invoice_UID", precision=10)
    private int invoiceUid;
    @Column(name="PaymentStatus_UID", precision=10)
    private int paymentStatusUid;
    @Column(name="PaymentMethod_UID", precision=10)
    private int paymentMethodUid;
    @Column(name="Payment_UID", precision=10)
    private int paymentUid;
    @Column(name="Amount", nullable=false, precision=10, scale=2)
    private BigDecimal amount;
    @Column(name="Creation_Date")
    private Date creationDate;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;

    /** Default constructor. */
    public LedgerBkp() {
        super();
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
     * Access method for ledgerActionTypeUid.
     *
     * @return the current value of ledgerActionTypeUid
     */
    public int getLedgerActionTypeUid() {
        return ledgerActionTypeUid;
    }

    /**
     * Setter method for ledgerActionTypeUid.
     *
     * @param aLedgerActionTypeUid the new value for ledgerActionTypeUid
     */
    public void setLedgerActionTypeUid(int aLedgerActionTypeUid) {
        ledgerActionTypeUid = aLedgerActionTypeUid;
    }

    /**
     * Access method for companyUid.
     *
     * @return the current value of companyUid
     */
    public int getCompanyUid() {
        return companyUid;
    }

    /**
     * Setter method for companyUid.
     *
     * @param aCompanyUid the new value for companyUid
     */
    public void setCompanyUid(int aCompanyUid) {
        companyUid = aCompanyUid;
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
     * Access method for referencedPid.
     *
     * @return the current value of referencedPid
     */
    public String getReferencedPid() {
        return referencedPid;
    }

    /**
     * Setter method for referencedPid.
     *
     * @param aReferencedPid the new value for referencedPid
     */
    public void setReferencedPid(String aReferencedPid) {
        referencedPid = aReferencedPid;
    }

    /**
     * Access method for refundPid.
     *
     * @return the current value of refundPid
     */
    public String getRefundPid() {
        return refundPid;
    }

    /**
     * Setter method for refundPid.
     *
     * @param aRefundPid the new value for refundPid
     */
    public void setRefundPid(String aRefundPid) {
        refundPid = aRefundPid;
    }

    /**
     * Access method for invoiceUid.
     *
     * @return the current value of invoiceUid
     */
    public int getInvoiceUid() {
        return invoiceUid;
    }

    /**
     * Setter method for invoiceUid.
     *
     * @param aInvoiceUid the new value for invoiceUid
     */
    public void setInvoiceUid(int aInvoiceUid) {
        invoiceUid = aInvoiceUid;
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
     * Access method for paymentUid.
     *
     * @return the current value of paymentUid
     */
    public int getPaymentUid() {
        return paymentUid;
    }

    /**
     * Setter method for paymentUid.
     *
     * @param aPaymentUid the new value for paymentUid
     */
    public void setPaymentUid(int aPaymentUid) {
        paymentUid = aPaymentUid;
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
     * Access method for creationDate.
     *
     * @return the current value of creationDate
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * Setter method for creationDate.
     *
     * @param aCreationDate the new value for creationDate
     */
    public void setCreationDate(Date aCreationDate) {
        creationDate = aCreationDate;
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
