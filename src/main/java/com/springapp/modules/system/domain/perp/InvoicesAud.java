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

@Entity(name="invoices_aud")
public class InvoicesAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "iAudUid";

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
    @Column(name="IAud_UID", unique=true, nullable=false, precision=10)
    private int iAudUid;
    @Column(name="Invoice_UID", nullable=false, precision=10)
    private int invoiceUid;
    @Column(name="Company_UID", nullable=false, precision=10)
    private int companyUid;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public InvoicesAud() {
        super();
    }

    /**
     * Access method for iAudUid.
     *
     * @return the current value of iAudUid
     */
    public int getIAudUid() {
        return iAudUid;
    }

    /**
     * Setter method for iAudUid.
     *
     * @param aIAudUid the new value for iAudUid
     */
    public void setIAudUid(int aIAudUid) {
        iAudUid = aIAudUid;
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
     * Compares the key for this instance with another InvoicesAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class InvoicesAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof InvoicesAud)) {
            return false;
        }
        InvoicesAud that = (InvoicesAud) other;
        if (this.getIAudUid() != that.getIAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another InvoicesAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof InvoicesAud)) return false;
        return this.equalKeys(other) && ((InvoicesAud)other).equalKeys(this);
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
        i = getIAudUid();
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
        StringBuffer sb = new StringBuffer("[InvoicesAud |");
        sb.append(" iAudUid=").append(getIAudUid());
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
        ret.put("iAudUid", Integer.valueOf(getIAudUid()));
        return ret;
    }

}
