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

@Entity(name="accounting_batch")
public class AccountingBatch implements Serializable {

    /** Primary key. */
    protected static final String PK = "accountingBatchUid";

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
    @Column(name="Accounting_Batch_UID", unique=true, nullable=false, precision=10)
    private int accountingBatchUid;
    @Column(name="Batch_Date")
    private Timestamp batchDate;
    @Column(name="Batch_Payment_Total", precision=15, scale=5)
    private BigDecimal batchPaymentTotal;
    @Column(name="Batch_Status", precision=5)
    private short batchStatus;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="accountingBatch")
    private Set<LedgerDetails> ledgerDetails;
    @ManyToOne(optional=false)
    @JoinColumn(name="PaymentMethod_UID", nullable=false)
    private PaymentMethods paymentMethods;

    /** Default constructor. */
    public AccountingBatch() {
        super();
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
     * Access method for batchDate.
     *
     * @return the current value of batchDate
     */
    public Timestamp getBatchDate() {
        return batchDate;
    }

    /**
     * Setter method for batchDate.
     *
     * @param aBatchDate the new value for batchDate
     */
    public void setBatchDate(Timestamp aBatchDate) {
        batchDate = aBatchDate;
    }

    /**
     * Access method for batchPaymentTotal.
     *
     * @return the current value of batchPaymentTotal
     */
    public BigDecimal getBatchPaymentTotal() {
        return batchPaymentTotal;
    }

    /**
     * Setter method for batchPaymentTotal.
     *
     * @param aBatchPaymentTotal the new value for batchPaymentTotal
     */
    public void setBatchPaymentTotal(BigDecimal aBatchPaymentTotal) {
        batchPaymentTotal = aBatchPaymentTotal;
    }

    /**
     * Access method for batchStatus.
     *
     * @return the current value of batchStatus
     */
    public short getBatchStatus() {
        return batchStatus;
    }

    /**
     * Setter method for batchStatus.
     *
     * @param aBatchStatus the new value for batchStatus
     */
    public void setBatchStatus(short aBatchStatus) {
        batchStatus = aBatchStatus;
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
     * Access method for ledgerDetails.
     *
     * @return the current value of ledgerDetails
     */
    public Set<LedgerDetails> getLedgerDetails() {
        return ledgerDetails;
    }

    /**
     * Setter method for ledgerDetails.
     *
     * @param aLedgerDetails the new value for ledgerDetails
     */
    public void setLedgerDetails(Set<LedgerDetails> aLedgerDetails) {
        ledgerDetails = aLedgerDetails;
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
     * Compares the key for this instance with another AccountingBatch.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AccountingBatch and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AccountingBatch)) {
            return false;
        }
        AccountingBatch that = (AccountingBatch) other;
        if (this.getAccountingBatchUid() != that.getAccountingBatchUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AccountingBatch.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AccountingBatch)) return false;
        return this.equalKeys(other) && ((AccountingBatch)other).equalKeys(this);
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
        i = getAccountingBatchUid();
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
        StringBuffer sb = new StringBuffer("[AccountingBatch |");
        sb.append(" accountingBatchUid=").append(getAccountingBatchUid());
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
        ret.put("accountingBatchUid", Integer.valueOf(getAccountingBatchUid()));
        return ret;
    }

}
