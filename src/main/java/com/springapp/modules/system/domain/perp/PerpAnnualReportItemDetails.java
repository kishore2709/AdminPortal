// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="perp_annual_report_item_details")
public class PerpAnnualReportItemDetails implements Serializable {

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
    @Column(name="District", length=80)
    private String district;
    @Column(name="Throughput", precision=10)
    private int throughput;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne
    @JoinColumn(name="District_UID")
    private DistrictCodes districtCodes;
    @ManyToOne(optional=false)
    @JoinColumn(name="Perp_Annual_Report_Item_UID", nullable=false)
    private PerpAnnualReportItems perpAnnualReportItems;

    /** Default constructor. */
    public PerpAnnualReportItemDetails() {
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
     * Access method for district.
     *
     * @return the current value of district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * Setter method for district.
     *
     * @param aDistrict the new value for district
     */
    public void setDistrict(String aDistrict) {
        district = aDistrict;
    }

    /**
     * Access method for throughput.
     *
     * @return the current value of throughput
     */
    public int getThroughput() {
        return throughput;
    }

    /**
     * Setter method for throughput.
     *
     * @param aThroughput the new value for throughput
     */
    public void setThroughput(int aThroughput) {
        throughput = aThroughput;
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
     * Access method for districtCodes.
     *
     * @return the current value of districtCodes
     */
    public DistrictCodes getDistrictCodes() {
        return districtCodes;
    }

    /**
     * Setter method for districtCodes.
     *
     * @param aDistrictCodes the new value for districtCodes
     */
    public void setDistrictCodes(DistrictCodes aDistrictCodes) {
        districtCodes = aDistrictCodes;
    }

    /**
     * Access method for perpAnnualReportItems.
     *
     * @return the current value of perpAnnualReportItems
     */
    public PerpAnnualReportItems getPerpAnnualReportItems() {
        return perpAnnualReportItems;
    }

    /**
     * Setter method for perpAnnualReportItems.
     *
     * @param aPerpAnnualReportItems the new value for perpAnnualReportItems
     */
    public void setPerpAnnualReportItems(PerpAnnualReportItems aPerpAnnualReportItems) {
        perpAnnualReportItems = aPerpAnnualReportItems;
    }

    /**
     * Compares the key for this instance with another PerpAnnualReportItemDetails.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PerpAnnualReportItemDetails and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PerpAnnualReportItemDetails)) {
            return false;
        }
        PerpAnnualReportItemDetails that = (PerpAnnualReportItemDetails) other;
        if (this.getUid() != that.getUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PerpAnnualReportItemDetails.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PerpAnnualReportItemDetails)) return false;
        return this.equalKeys(other) && ((PerpAnnualReportItemDetails)other).equalKeys(this);
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
        StringBuffer sb = new StringBuffer("[PerpAnnualReportItemDetails |");
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
