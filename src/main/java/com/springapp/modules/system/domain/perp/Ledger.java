// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
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

@Entity(name="ledger")
public class Ledger implements Serializable {

    /** Primary key. */
    protected static final String PK = "ledgerUid";

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
    @Column(name="Ledger_UID", unique=true, nullable=false, precision=10)
    private int ledgerUid;
    @Column(name="Referenced_pid", length=45)
    private String referencedPid;
    @Column(name="Refund_PID", length=45)
    private String refundPid;
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
    @ManyToOne(optional=false)
    @JoinColumn(name="AppTrans_UID", nullable=false)
    private AppTransactions appTransactions;
    @ManyToOne(optional=false)
    @JoinColumn(name="Company_UID", nullable=false)
    private Company company;
    @ManyToOne
    @JoinColumn(name="Invoice_UID")
    private Invoices invoices;
    @ManyToOne(optional=false)
    @JoinColumn(name="LedgerActionType_UID", nullable=false)
    private LedgerActionTypes ledgerActionTypes;
    @OneToMany(mappedBy="ledger")
    private Set<LedgerLedgerdetailsAssociation> ledgerLedgerdetailsAssociation;
    @OneToMany(mappedBy="ledger2")
    private Set<Ledger> ledger3;
    @ManyToOne
    @JoinColumn(name="Payment_UID")
    private Ledger ledger2;
    @ManyToOne
    @JoinColumn(name="PaymentStatus_UID")
    private PaymentStatus paymentStatus;
    @ManyToOne
    @JoinColumn(name="PaymentMethod_UID")
    private PaymentMethods paymentMethods;

    /** Default constructor. */
    public Ledger() {
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

    /**
     * Access method for appTransactions.
     *
     * @return the current value of appTransactions
     */
    public AppTransactions getAppTransactions() {
        return appTransactions;
    }

    /**
     * Setter method for appTransactions.
     *
     * @param aAppTransactions the new value for appTransactions
     */
    public void setAppTransactions(AppTransactions aAppTransactions) {
        appTransactions = aAppTransactions;
    }

    /**
     * Access method for company.
     *
     * @return the current value of company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Setter method for company.
     *
     * @param aCompany the new value for company
     */
    public void setCompany(Company aCompany) {
        company = aCompany;
    }

    /**
     * Access method for invoices.
     *
     * @return the current value of invoices
     */
    public Invoices getInvoices() {
        return invoices;
    }

    /**
     * Setter method for invoices.
     *
     * @param aInvoices the new value for invoices
     */
    public void setInvoices(Invoices aInvoices) {
        invoices = aInvoices;
    }

    /**
     * Access method for ledgerActionTypes.
     *
     * @return the current value of ledgerActionTypes
     */
    public LedgerActionTypes getLedgerActionTypes() {
        return ledgerActionTypes;
    }

    /**
     * Setter method for ledgerActionTypes.
     *
     * @param aLedgerActionTypes the new value for ledgerActionTypes
     */
    public void setLedgerActionTypes(LedgerActionTypes aLedgerActionTypes) {
        ledgerActionTypes = aLedgerActionTypes;
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
     * Access method for ledger3.
     *
     * @return the current value of ledger3
     */
    public Set<Ledger> getLedger3() {
        return ledger3;
    }

    /**
     * Setter method for ledger3.
     *
     * @param aLedger3 the new value for ledger3
     */
    public void setLedger3(Set<Ledger> aLedger3) {
        ledger3 = aLedger3;
    }

    /**
     * Access method for ledger2.
     *
     * @return the current value of ledger2
     */
    public Ledger getLedger2() {
        return ledger2;
    }

    /**
     * Setter method for ledger2.
     *
     * @param aLedger2 the new value for ledger2
     */
    public void setLedger2(Ledger aLedger2) {
        ledger2 = aLedger2;
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
     * Compares the key for this instance with another Ledger.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Ledger and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Ledger)) {
            return false;
        }
        Ledger that = (Ledger) other;
        if (this.getLedgerUid() != that.getLedgerUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Ledger.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Ledger)) return false;
        return this.equalKeys(other) && ((Ledger)other).equalKeys(this);
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
        i = getLedgerUid();
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
        StringBuffer sb = new StringBuffer("[Ledger |");
        sb.append(" ledgerUid=").append(getLedgerUid());
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
        ret.put("ledgerUid", Integer.valueOf(getLedgerUid()));
        return ret;
    }

}
