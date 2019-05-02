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

@Entity(name="role_type")
public class RoleType implements Serializable {

    /** Primary key. */
    protected static final String PK = "roleTypeUid";

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
    @Column(name="Role_Type_UID", unique=true, nullable=false, precision=10)
    private int roleTypeUid;
    @Column(name="Role_Type", nullable=false, length=45)
    private String roleType;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="roleType")
    private Set<Roles> roles;

    /** Default constructor. */
    public RoleType() {
        super();
    }

    /**
     * Access method for roleTypeUid.
     *
     * @return the current value of roleTypeUid
     */
    public int getRoleTypeUid() {
        return roleTypeUid;
    }

    /**
     * Setter method for roleTypeUid.
     *
     * @param aRoleTypeUid the new value for roleTypeUid
     */
    public void setRoleTypeUid(int aRoleTypeUid) {
        roleTypeUid = aRoleTypeUid;
    }

    /**
     * Access method for roleType.
     *
     * @return the current value of roleType
     */
    public String getRoleType() {
        return roleType;
    }

    /**
     * Setter method for roleType.
     *
     * @param aRoleType the new value for roleType
     */
    public void setRoleType(String aRoleType) {
        roleType = aRoleType;
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
     * Access method for roles.
     *
     * @return the current value of roles
     */
    public Set<Roles> getRoles() {
        return roles;
    }

    /**
     * Setter method for roles.
     *
     * @param aRoles the new value for roles
     */
    public void setRoles(Set<Roles> aRoles) {
        roles = aRoles;
    }

    /**
     * Compares the key for this instance with another RoleType.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RoleType and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RoleType)) {
            return false;
        }
        RoleType that = (RoleType) other;
        if (this.getRoleTypeUid() != that.getRoleTypeUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RoleType.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RoleType)) return false;
        return this.equalKeys(other) && ((RoleType)other).equalKeys(this);
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
        i = getRoleTypeUid();
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
        StringBuffer sb = new StringBuffer("[RoleType |");
        sb.append(" roleTypeUid=").append(getRoleTypeUid());
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
        ret.put("roleTypeUid", Integer.valueOf(getRoleTypeUid()));
        return ret;
    }

}
