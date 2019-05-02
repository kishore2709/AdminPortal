// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="ledger_ledgerdetails_association")
public class LedgerLedgerdetailsAssociation implements Serializable {

    /** Primary key. */
    protected static final String PK = "LedgerLedgerdetailsAssociationPrimary";

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

    @Column(name="Group_ID", precision=10)
    private int groupId;
    @Column(name="Payment_Amt", precision=10, scale=2)
    private BigDecimal paymentAmt;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="LedgerDetails_UID", nullable=false)
    private LedgerDetails ledgerDetails;
    @ManyToOne(optional=false)
    @JoinColumn(name="Ledger_UID", nullable=false)
    private Ledger ledger;

    /** Default constructor. */
    public LedgerLedgerdetailsAssociation() {
        super();
    }

    /**
     * Access method for groupId.
     *
     * @return the current value of groupId
     */
    public int getGroupId() {
        return groupId;
    }

    /**
     * Setter method for groupId.
     *
     * @param aGroupId the new value for groupId
     */
    public void setGroupId(int aGroupId) {
        groupId = aGroupId;
    }

    /**
     * Access method for paymentAmt.
     *
     * @return the current value of paymentAmt
     */
    public BigDecimal getPaymentAmt() {
        return paymentAmt;
    }

    /**
     * Setter method for paymentAmt.
     *
     * @param aPaymentAmt the new value for paymentAmt
     */
    public void setPaymentAmt(BigDecimal aPaymentAmt) {
        paymentAmt = aPaymentAmt;
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
    public LedgerDetails getLedgerDetails() {
        return ledgerDetails;
    }

    /**
     * Setter method for ledgerDetails.
     *
     * @param aLedgerDetails the new value for ledgerDetails
     */
    public void setLedgerDetails(LedgerDetails aLedgerDetails) {
        ledgerDetails = aLedgerDetails;
    }

    /**
     * Access method for ledger.
     *
     * @return the current value of ledger
     */
    public Ledger getLedger() {
        return ledger;
    }

    /**
     * Setter method for ledger.
     *
     * @param aLedger the new value for ledger
     */
    public void setLedger(Ledger aLedger) {
        ledger = aLedger;
    }

    /** Temporary value holder for group key fragment ledgerLedgerUid */
    private transient int tempLedgerLedgerUid;

    /**
     * Gets the key fragment ledgerUid for member ledger.
     * If this.ledger is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setLedgerLedgerUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Ledger
     */
    public int getLedgerLedgerUid() {
        return (getLedger() == null ? tempLedgerLedgerUid : getLedger().getLedgerUid());
    }

    /**
     * Sets the key fragment ledgerUid from member ledger.
     * If this.ledger is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getLedgerLedgerUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aLedgerUid New value for the key fragment
     * @see Ledger
     */
    public void setLedgerLedgerUid(int aLedgerUid) {
        if (getLedger() == null) {
            tempLedgerLedgerUid = aLedgerUid;
        } else {
            getLedger().setLedgerUid(aLedgerUid);
        }
    }

    /** Temporary value holder for group key fragment ledgerDetailsLedgerDetailsUid */
    private transient int tempLedgerDetailsLedgerDetailsUid;

    /**
     * Gets the key fragment ledgerDetailsUid for member ledgerDetails.
     * If this.ledgerDetails is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setLedgerDetailsLedgerDetailsUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see LedgerDetails
     */
    public int getLedgerDetailsLedgerDetailsUid() {
        return (getLedgerDetails() == null ? tempLedgerDetailsLedgerDetailsUid : getLedgerDetails().getLedgerDetailsUid());
    }

    /**
     * Sets the key fragment ledgerDetailsUid from member ledgerDetails.
     * If this.ledgerDetails is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getLedgerDetailsLedgerDetailsUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aLedgerDetailsUid New value for the key fragment
     * @see LedgerDetails
     */
    public void setLedgerDetailsLedgerDetailsUid(int aLedgerDetailsUid) {
        if (getLedgerDetails() == null) {
            tempLedgerDetailsLedgerDetailsUid = aLedgerDetailsUid;
        } else {
            getLedgerDetails().setLedgerDetailsUid(aLedgerDetailsUid);
        }
    }

    /**
     * Compares the key for this instance with another LedgerLedgerdetailsAssociation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class LedgerLedgerdetailsAssociation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof LedgerLedgerdetailsAssociation)) {
            return false;
        }
        LedgerLedgerdetailsAssociation that = (LedgerLedgerdetailsAssociation) other;
        if (this.getLedgerLedgerUid() != that.getLedgerLedgerUid()) {
            return false;
        }
        if (this.getLedgerDetailsLedgerDetailsUid() != that.getLedgerDetailsLedgerDetailsUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another LedgerLedgerdetailsAssociation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof LedgerLedgerdetailsAssociation)) return false;
        return this.equalKeys(other) && ((LedgerLedgerdetailsAssociation)other).equalKeys(this);
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
        i = getLedgerLedgerUid();
        result = 37*result + i;
        i = getLedgerDetailsLedgerDetailsUid();
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
        StringBuffer sb = new StringBuffer("[LedgerLedgerdetailsAssociation |");
        sb.append(" ledgerLedgerUid=").append(getLedgerLedgerUid());
        sb.append(" ledgerDetailsLedgerDetailsUid=").append(getLedgerDetailsLedgerDetailsUid());
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
        ret.put("ledgerLedgerUid", Integer.valueOf(getLedgerLedgerUid()));
        ret.put("ledgerDetailsLedgerDetailsUid", Integer.valueOf(getLedgerDetailsLedgerDetailsUid()));
        return ret;
    }

}
