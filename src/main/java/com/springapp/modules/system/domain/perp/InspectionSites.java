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
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="inspection_sites")
public class InspectionSites implements Serializable {

    /** Primary key. */
    protected static final String PK = "inspectionSiteUid";

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
    @Column(name="InspectionSite_UID", unique=true, nullable=false, precision=10)
    private int inspectionSiteUid;
    @Column(length=75)
    private String inspSiteRepName;
    @Column(length=75)
    private String inspSiteRepTitle;
    @Column(length=100)
    private String inspSiteAddress;
    @Column(length=20)
    private String inspSitePhone;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="inspectionSites")
    private Set<Inspections> inspections;

    /** Default constructor. */
    public InspectionSites() {
        super();
    }

    /**
     * Access method for inspectionSiteUid.
     *
     * @return the current value of inspectionSiteUid
     */
    public int getInspectionSiteUid() {
        return inspectionSiteUid;
    }

    /**
     * Setter method for inspectionSiteUid.
     *
     * @param aInspectionSiteUid the new value for inspectionSiteUid
     */
    public void setInspectionSiteUid(int aInspectionSiteUid) {
        inspectionSiteUid = aInspectionSiteUid;
    }

    /**
     * Access method for inspSiteRepName.
     *
     * @return the current value of inspSiteRepName
     */
    public String getInspSiteRepName() {
        return inspSiteRepName;
    }

    /**
     * Setter method for inspSiteRepName.
     *
     * @param aInspSiteRepName the new value for inspSiteRepName
     */
    public void setInspSiteRepName(String aInspSiteRepName) {
        inspSiteRepName = aInspSiteRepName;
    }

    /**
     * Access method for inspSiteRepTitle.
     *
     * @return the current value of inspSiteRepTitle
     */
    public String getInspSiteRepTitle() {
        return inspSiteRepTitle;
    }

    /**
     * Setter method for inspSiteRepTitle.
     *
     * @param aInspSiteRepTitle the new value for inspSiteRepTitle
     */
    public void setInspSiteRepTitle(String aInspSiteRepTitle) {
        inspSiteRepTitle = aInspSiteRepTitle;
    }

    /**
     * Access method for inspSiteAddress.
     *
     * @return the current value of inspSiteAddress
     */
    public String getInspSiteAddress() {
        return inspSiteAddress;
    }

    /**
     * Setter method for inspSiteAddress.
     *
     * @param aInspSiteAddress the new value for inspSiteAddress
     */
    public void setInspSiteAddress(String aInspSiteAddress) {
        inspSiteAddress = aInspSiteAddress;
    }

    /**
     * Access method for inspSitePhone.
     *
     * @return the current value of inspSitePhone
     */
    public String getInspSitePhone() {
        return inspSitePhone;
    }

    /**
     * Setter method for inspSitePhone.
     *
     * @param aInspSitePhone the new value for inspSitePhone
     */
    public void setInspSitePhone(String aInspSitePhone) {
        inspSitePhone = aInspSitePhone;
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
     * Access method for inspections.
     *
     * @return the current value of inspections
     */
    public Set<Inspections> getInspections() {
        return inspections;
    }

    /**
     * Setter method for inspections.
     *
     * @param aInspections the new value for inspections
     */
    public void setInspections(Set<Inspections> aInspections) {
        inspections = aInspections;
    }

    /**
     * Compares the key for this instance with another InspectionSites.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class InspectionSites and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof InspectionSites)) {
            return false;
        }
        InspectionSites that = (InspectionSites) other;
        if (this.getInspectionSiteUid() != that.getInspectionSiteUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another InspectionSites.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof InspectionSites)) return false;
        return this.equalKeys(other) && ((InspectionSites)other).equalKeys(this);
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
        i = getInspectionSiteUid();
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
        StringBuffer sb = new StringBuffer("[InspectionSites |");
        sb.append(" inspectionSiteUid=").append(getInspectionSiteUid());
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
        ret.put("inspectionSiteUid", Integer.valueOf(getInspectionSiteUid()));
        return ret;
    }

}
