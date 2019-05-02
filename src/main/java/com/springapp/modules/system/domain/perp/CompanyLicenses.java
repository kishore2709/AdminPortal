// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="company_licenses")
public class CompanyLicenses implements Serializable {

    /** Primary key. */
    protected static final String PK = "coLicenseUid";

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
    @Column(name="CoLicense_UID", unique=true, nullable=false, precision=10)
    private int coLicenseUid;
    @Column(name="License_No", nullable=false, length=30)
    private String licenseNo;
    @Column(name="Exp_Date")
    private Date expDate;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Company_UID", nullable=false)
    private Company company;
    @ManyToOne(optional=false)
    @JoinColumn(name="License_Type_UID", nullable=false)
    private LicenseTypes licenseTypes;

    /** Default constructor. */
    public CompanyLicenses() {
        super();
    }

    /**
     * Access method for coLicenseUid.
     *
     * @return the current value of coLicenseUid
     */
    public int getCoLicenseUid() {
        return coLicenseUid;
    }

    /**
     * Setter method for coLicenseUid.
     *
     * @param aCoLicenseUid the new value for coLicenseUid
     */
    public void setCoLicenseUid(int aCoLicenseUid) {
        coLicenseUid = aCoLicenseUid;
    }

    /**
     * Access method for licenseNo.
     *
     * @return the current value of licenseNo
     */
    public String getLicenseNo() {
        return licenseNo;
    }

    /**
     * Setter method for licenseNo.
     *
     * @param aLicenseNo the new value for licenseNo
     */
    public void setLicenseNo(String aLicenseNo) {
        licenseNo = aLicenseNo;
    }

    /**
     * Access method for expDate.
     *
     * @return the current value of expDate
     */
    public Date getExpDate() {
        return expDate;
    }

    /**
     * Setter method for expDate.
     *
     * @param aExpDate the new value for expDate
     */
    public void setExpDate(Date aExpDate) {
        expDate = aExpDate;
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
     * Access method for licenseTypes.
     *
     * @return the current value of licenseTypes
     */
    public LicenseTypes getLicenseTypes() {
        return licenseTypes;
    }

    /**
     * Setter method for licenseTypes.
     *
     * @param aLicenseTypes the new value for licenseTypes
     */
    public void setLicenseTypes(LicenseTypes aLicenseTypes) {
        licenseTypes = aLicenseTypes;
    }

    /**
     * Compares the key for this instance with another CompanyLicenses.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CompanyLicenses and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CompanyLicenses)) {
            return false;
        }
        CompanyLicenses that = (CompanyLicenses) other;
        if (this.getCoLicenseUid() != that.getCoLicenseUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CompanyLicenses.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CompanyLicenses)) return false;
        return this.equalKeys(other) && ((CompanyLicenses)other).equalKeys(this);
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
        i = getCoLicenseUid();
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
        StringBuffer sb = new StringBuffer("[CompanyLicenses |");
        sb.append(" coLicenseUid=").append(getCoLicenseUid());
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
        ret.put("coLicenseUid", Integer.valueOf(getCoLicenseUid()));
        return ret;
    }

}
