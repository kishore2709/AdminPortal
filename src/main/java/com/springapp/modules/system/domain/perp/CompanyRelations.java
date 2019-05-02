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

@Entity(name="company_relations")
public class CompanyRelations implements Serializable {

    /** Primary key. */
    protected static final String PK = "companyRelationsUid";

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
    @Column(name="Company_Relations_UID", unique=true, nullable=false, precision=10)
    private int companyRelationsUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Parent_UID", nullable=false)
    private Company company2;
    @ManyToOne(optional=false)
    @JoinColumn(name="Company_UID", nullable=false)
    private Company company;
    @ManyToOne(optional=false)
    @JoinColumn(name="Company_Rel_Type_UID", nullable=false)
    private CompanyRelationType companyRelationType;

    /** Default constructor. */
    public CompanyRelations() {
        super();
    }

    /**
     * Access method for companyRelationsUid.
     *
     * @return the current value of companyRelationsUid
     */
    public int getCompanyRelationsUid() {
        return companyRelationsUid;
    }

    /**
     * Setter method for companyRelationsUid.
     *
     * @param aCompanyRelationsUid the new value for companyRelationsUid
     */
    public void setCompanyRelationsUid(int aCompanyRelationsUid) {
        companyRelationsUid = aCompanyRelationsUid;
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
     * Access method for company2.
     *
     * @return the current value of company2
     */
    public Company getCompany2() {
        return company2;
    }

    /**
     * Setter method for company2.
     *
     * @param aCompany2 the new value for company2
     */
    public void setCompany2(Company aCompany2) {
        company2 = aCompany2;
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
     * Access method for companyRelationType.
     *
     * @return the current value of companyRelationType
     */
    public CompanyRelationType getCompanyRelationType() {
        return companyRelationType;
    }

    /**
     * Setter method for companyRelationType.
     *
     * @param aCompanyRelationType the new value for companyRelationType
     */
    public void setCompanyRelationType(CompanyRelationType aCompanyRelationType) {
        companyRelationType = aCompanyRelationType;
    }

    /**
     * Compares the key for this instance with another CompanyRelations.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CompanyRelations and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CompanyRelations)) {
            return false;
        }
        CompanyRelations that = (CompanyRelations) other;
        if (this.getCompanyRelationsUid() != that.getCompanyRelationsUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CompanyRelations.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CompanyRelations)) return false;
        return this.equalKeys(other) && ((CompanyRelations)other).equalKeys(this);
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
        i = getCompanyRelationsUid();
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
        StringBuffer sb = new StringBuffer("[CompanyRelations |");
        sb.append(" companyRelationsUid=").append(getCompanyRelationsUid());
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
        ret.put("companyRelationsUid", Integer.valueOf(getCompanyRelationsUid()));
        return ret;
    }

}
