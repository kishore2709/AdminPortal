// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="ledger_ledgerdetails_association_aud")
public class LedgerLedgerdetailsAssociationAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "lldaAudUid";

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
    @Column(name="LLDAAud_UID", unique=true, nullable=false, precision=10)
    private int lldaAudUid;
    @Column(name="Payment_Amt", precision=10, scale=2)
    private BigDecimal paymentAmt;
    @Column(name="Ledger_UID", nullable=false, precision=10)
    private int ledgerUid;
    @Column(name="LedgerDetails_UID", nullable=false, precision=10)
    private int ledgerDetailsUid;
    @Column(name="Group_ID", precision=10)
    private int groupId;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public LedgerLedgerdetailsAssociationAud() {
        super();
    }

    /**
     * Access method for lldaAudUid.
     *
     * @return the current value of lldaAudUid
     */
    public int getLldaAudUid() {
        return lldaAudUid;
    }

    /**
     * Setter method for lldaAudUid.
     *
     * @param aLldaAudUid the new value for lldaAudUid
     */
    public void setLldaAudUid(int aLldaAudUid) {
        lldaAudUid = aLldaAudUid;
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
     * Compares the key for this instance with another LedgerLedgerdetailsAssociationAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class LedgerLedgerdetailsAssociationAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof LedgerLedgerdetailsAssociationAud)) {
            return false;
        }
        LedgerLedgerdetailsAssociationAud that = (LedgerLedgerdetailsAssociationAud) other;
        if (this.getLldaAudUid() != that.getLldaAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another LedgerLedgerdetailsAssociationAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof LedgerLedgerdetailsAssociationAud)) return false;
        return this.equalKeys(other) && ((LedgerLedgerdetailsAssociationAud)other).equalKeys(this);
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
        i = getLldaAudUid();
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
        StringBuffer sb = new StringBuffer("[LedgerLedgerdetailsAssociationAud |");
        sb.append(" lldaAudUid=").append(getLldaAudUid());
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
        ret.put("lldaAudUid", Integer.valueOf(getLldaAudUid()));
        return ret;
    }

}
