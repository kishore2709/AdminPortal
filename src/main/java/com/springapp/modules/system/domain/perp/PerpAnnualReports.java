// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
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

@Entity(name="perp_annual_reports")
public class PerpAnnualReports implements Serializable {

    /** Primary key. */
    protected static final String PK = "uid";

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
    @Column(name="UID", unique=true, nullable=false, precision=10)
    private int uid;
    @Column(name="Report_Year", precision=10)
    private int reportYear;
    @Column(name="Export_Date")
    private Timestamp exportDate;
    @Column(name="Owner_Certified", nullable=false, length=1)
    private String ownerCertified;
    @Column(name="Accepted_as_Final", nullable=false, length=1)
    private String acceptedAsFinal;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Company_UID", nullable=false)
    private Company company;
    @OneToMany(mappedBy="perpAnnualReports")
    private Set<PerpAnnualReportItems> perpAnnualReportItems;

    /** Default constructor. */
    public PerpAnnualReports() {
        super();
    }

    /**
     * Access method for uid.
     *
     * @return the current value of uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * Setter method for uid.
     *
     * @param aUid the new value for uid
     */
    public void setUid(int aUid) {
        uid = aUid;
    }

    /**
     * Access method for reportYear.
     *
     * @return the current value of reportYear
     */
    public int getReportYear() {
        return reportYear;
    }

    /**
     * Setter method for reportYear.
     *
     * @param aReportYear the new value for reportYear
     */
    public void setReportYear(int aReportYear) {
        reportYear = aReportYear;
    }

    /**
     * Access method for exportDate.
     *
     * @return the current value of exportDate
     */
    public Timestamp getExportDate() {
        return exportDate;
    }

    /**
     * Setter method for exportDate.
     *
     * @param aExportDate the new value for exportDate
     */
    public void setExportDate(Timestamp aExportDate) {
        exportDate = aExportDate;
    }

    /**
     * Access method for ownerCertified.
     *
     * @return the current value of ownerCertified
     */
    public String getOwnerCertified() {
        return ownerCertified;
    }

    /**
     * Setter method for ownerCertified.
     *
     * @param aOwnerCertified the new value for ownerCertified
     */
    public void setOwnerCertified(String aOwnerCertified) {
        ownerCertified = aOwnerCertified;
    }

    /**
     * Access method for acceptedAsFinal.
     *
     * @return the current value of acceptedAsFinal
     */
    public String getAcceptedAsFinal() {
        return acceptedAsFinal;
    }

    /**
     * Setter method for acceptedAsFinal.
     *
     * @param aAcceptedAsFinal the new value for acceptedAsFinal
     */
    public void setAcceptedAsFinal(String aAcceptedAsFinal) {
        acceptedAsFinal = aAcceptedAsFinal;
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
     * Access method for perpAnnualReportItems.
     *
     * @return the current value of perpAnnualReportItems
     */
    public Set<PerpAnnualReportItems> getPerpAnnualReportItems() {
        return perpAnnualReportItems;
    }

    /**
     * Setter method for perpAnnualReportItems.
     *
     * @param aPerpAnnualReportItems the new value for perpAnnualReportItems
     */
    public void setPerpAnnualReportItems(Set<PerpAnnualReportItems> aPerpAnnualReportItems) {
        perpAnnualReportItems = aPerpAnnualReportItems;
    }

    /**
     * Compares the key for this instance with another PerpAnnualReports.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PerpAnnualReports and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PerpAnnualReports)) {
            return false;
        }
        PerpAnnualReports that = (PerpAnnualReports) other;
        if (this.getUid() != that.getUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PerpAnnualReports.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PerpAnnualReports)) return false;
        return this.equalKeys(other) && ((PerpAnnualReports)other).equalKeys(this);
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
        i = getUid();
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
        StringBuffer sb = new StringBuffer("[PerpAnnualReports |");
        sb.append(" uid=").append(getUid());
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
        ret.put("uid", Integer.valueOf(getUid()));
        return ret;
    }

}
