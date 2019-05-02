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

@Entity(name="company_relations_aud")
public class CompanyRelationsAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "companyRelationsAudUid";

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
    @Column(name="Company_Relations_Aud_UID", unique=true, nullable=false, precision=10)
    private int companyRelationsAudUid;
    @Column(name="Company_Relations_UID", nullable=false, precision=10)
    private int companyRelationsUid;
    @Column(name="Company_Rel_Type_UID", nullable=false, precision=10)
    private int companyRelTypeUid;
    @Column(name="Company_UID", nullable=false, precision=10)
    private int companyUid;
    @Column(name="Parent_UID", nullable=false, precision=10)
    private int parentUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public CompanyRelationsAud() {
        super();
    }

    /**
     * Access method for companyRelationsAudUid.
     *
     * @return the current value of companyRelationsAudUid
     */
    public int getCompanyRelationsAudUid() {
        return companyRelationsAudUid;
    }

    /**
     * Setter method for companyRelationsAudUid.
     *
     * @param aCompanyRelationsAudUid the new value for companyRelationsAudUid
     */
    public void setCompanyRelationsAudUid(int aCompanyRelationsAudUid) {
        companyRelationsAudUid = aCompanyRelationsAudUid;
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
     * Access method for companyRelTypeUid.
     *
     * @return the current value of companyRelTypeUid
     */
    public int getCompanyRelTypeUid() {
        return companyRelTypeUid;
    }

    /**
     * Setter method for companyRelTypeUid.
     *
     * @param aCompanyRelTypeUid the new value for companyRelTypeUid
     */
    public void setCompanyRelTypeUid(int aCompanyRelTypeUid) {
        companyRelTypeUid = aCompanyRelTypeUid;
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
     * Access method for parentUid.
     *
     * @return the current value of parentUid
     */
    public int getParentUid() {
        return parentUid;
    }

    /**
     * Setter method for parentUid.
     *
     * @param aParentUid the new value for parentUid
     */
    public void setParentUid(int aParentUid) {
        parentUid = aParentUid;
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
     * Compares the key for this instance with another CompanyRelationsAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class CompanyRelationsAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof CompanyRelationsAud)) {
            return false;
        }
        CompanyRelationsAud that = (CompanyRelationsAud) other;
        if (this.getCompanyRelationsAudUid() != that.getCompanyRelationsAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another CompanyRelationsAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof CompanyRelationsAud)) return false;
        return this.equalKeys(other) && ((CompanyRelationsAud)other).equalKeys(this);
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
        i = getCompanyRelationsAudUid();
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
        StringBuffer sb = new StringBuffer("[CompanyRelationsAud |");
        sb.append(" companyRelationsAudUid=").append(getCompanyRelationsAudUid());
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
        ret.put("companyRelationsAudUid", Integer.valueOf(getCompanyRelationsAudUid()));
        return ret;
    }

}
