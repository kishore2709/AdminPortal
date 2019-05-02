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

@Entity(name="company_aka")
public class CompanyAka implements Serializable {

    /** Primary key. */
    protected static final String PK = "coAkaUid";

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
    @Column(name="CoAKA_UID", unique=true, nullable=false, precision=10)
    private int coAkaUid;
    @Column(name="AKA_URL", length=50)
    private String akaUrl;
    @Column(name="AKA_Text")
    private String akaText;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Company_UID", nullable=false)
    private Company company;

    /** Default constructor. */
    public CompanyAka() {
        super();
    }

    /**
     * Access method for coAkaUid.
     *
     * @return the current value of coAkaUid
     */
    public int getCoAkaUid() {
        return coAkaUid;
    }

    /**
     * Setter method for coAkaUid.
     *
     * @param aCoAkaUid the new value for coAkaUid
     */
    public void setCoAkaUid(int aCoAkaUid) {
        coAkaUid = aCoAkaUid;
    }

    /**
     * Access method for akaUrl.
     *
     * @return the current value of akaUrl
     */
    public String getAkaUrl() {
        return akaUrl;
    }

    /**
     * Setter method for akaUrl.
     *
     * @param aAkaUrl the new value for akaUrl
     */
    public void setAkaUrl(String aAkaUrl) {
        akaUrl = aAkaUrl;
    }

    /**
     * Access method for akaText.
     *
     * @return the current value of akaText
     */
    public String getAkaText() {
        return akaText;
    }

    /**
     * Setter method for akaText.
     *
     * @param aAkaText the new value for akaText
     */
    public void setAkaText(String aAkaText) {
        akaText = aAkaText;
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
     * Compares the key for this instance with another CompanyAka.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CompanyAka and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CompanyAka)) {
            return false;
        }
        CompanyAka that = (CompanyAka) other;
        if (this.getCoAkaUid() != that.getCoAkaUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CompanyAka.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CompanyAka)) return false;
        return this.equalKeys(other) && ((CompanyAka)other).equalKeys(this);
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
        i = getCoAkaUid();
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
        StringBuffer sb = new StringBuffer("[CompanyAka |");
        sb.append(" coAkaUid=").append(getCoAkaUid());
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
        ret.put("coAkaUid", Integer.valueOf(getCoAkaUid()));
        return ret;
    }

}
