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

@Entity(name="user_company_programs")
public class UserCompanyPrograms implements Serializable {

    /** Primary key. */
    protected static final String PK = "userCOmpanyProgramsUid";

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
    @Column(name="User_COmpany_Programs_UID", unique=true, nullable=false, precision=10)
    private int userCOmpanyProgramsUid;
    @Column(name="Company_Programs_UID", precision=10)
    private int companyProgramsUid;
    @Column(name="User_Program_Pref", precision=10)
    private int userProgramPref;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Users_UID", nullable=false)
    private Users users;

    /** Default constructor. */
    public UserCompanyPrograms() {
        super();
    }

    /**
     * Access method for userCOmpanyProgramsUid.
     *
     * @return the current value of userCOmpanyProgramsUid
     */
    public int getUserCOmpanyProgramsUid() {
        return userCOmpanyProgramsUid;
    }

    /**
     * Setter method for userCOmpanyProgramsUid.
     *
     * @param aUserCOmpanyProgramsUid the new value for userCOmpanyProgramsUid
     */
    public void setUserCOmpanyProgramsUid(int aUserCOmpanyProgramsUid) {
        userCOmpanyProgramsUid = aUserCOmpanyProgramsUid;
    }

    /**
     * Access method for companyProgramsUid.
     *
     * @return the current value of companyProgramsUid
     */
    public int getCompanyProgramsUid() {
        return companyProgramsUid;
    }

    /**
     * Setter method for companyProgramsUid.
     *
     * @param aCompanyProgramsUid the new value for companyProgramsUid
     */
    public void setCompanyProgramsUid(int aCompanyProgramsUid) {
        companyProgramsUid = aCompanyProgramsUid;
    }

    /**
     * Access method for userProgramPref.
     *
     * @return the current value of userProgramPref
     */
    public int getUserProgramPref() {
        return userProgramPref;
    }

    /**
     * Setter method for userProgramPref.
     *
     * @param aUserProgramPref the new value for userProgramPref
     */
    public void setUserProgramPref(int aUserProgramPref) {
        userProgramPref = aUserProgramPref;
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
     * Access method for users.
     *
     * @return the current value of users
     */
    public Users getUsers() {
        return users;
    }

    /**
     * Setter method for users.
     *
     * @param aUsers the new value for users
     */
    public void setUsers(Users aUsers) {
        users = aUsers;
    }

    /**
     * Compares the key for this instance with another UserCompanyPrograms.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UserCompanyPrograms and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UserCompanyPrograms)) {
            return false;
        }
        UserCompanyPrograms that = (UserCompanyPrograms) other;
        if (this.getUserCOmpanyProgramsUid() != that.getUserCOmpanyProgramsUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UserCompanyPrograms.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UserCompanyPrograms)) return false;
        return this.equalKeys(other) && ((UserCompanyPrograms)other).equalKeys(this);
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
        i = getUserCOmpanyProgramsUid();
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
        StringBuffer sb = new StringBuffer("[UserCompanyPrograms |");
        sb.append(" userCOmpanyProgramsUid=").append(getUserCOmpanyProgramsUid());
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
        ret.put("userCOmpanyProgramsUid", Integer.valueOf(getUserCOmpanyProgramsUid()));
        return ret;
    }

}
