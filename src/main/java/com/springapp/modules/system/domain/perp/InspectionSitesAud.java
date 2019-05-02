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

@Entity(name="inspection_sites_aud")
public class InspectionSitesAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "isAudUid";

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
    @Column(name="ISAud_UID", unique=true, nullable=false, precision=10)
    private int isAudUid;
    @Column(name="InspectionSite_UID", nullable=false, precision=10)
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
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public InspectionSitesAud() {
        super();
    }

    /**
     * Access method for isAudUid.
     *
     * @return the current value of isAudUid
     */
    public int getIsAudUid() {
        return isAudUid;
    }

    /**
     * Setter method for isAudUid.
     *
     * @param aIsAudUid the new value for isAudUid
     */
    public void setIsAudUid(int aIsAudUid) {
        isAudUid = aIsAudUid;
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
     * Compares the key for this instance with another InspectionSitesAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class InspectionSitesAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof InspectionSitesAud)) {
            return false;
        }
        InspectionSitesAud that = (InspectionSitesAud) other;
        if (this.getIsAudUid() != that.getIsAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another InspectionSitesAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof InspectionSitesAud)) return false;
        return this.equalKeys(other) && ((InspectionSitesAud)other).equalKeys(this);
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
        i = getIsAudUid();
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
        StringBuffer sb = new StringBuffer("[InspectionSitesAud |");
        sb.append(" isAudUid=").append(getIsAudUid());
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
        ret.put("isAudUid", Integer.valueOf(getIsAudUid()));
        return ret;
    }

}
