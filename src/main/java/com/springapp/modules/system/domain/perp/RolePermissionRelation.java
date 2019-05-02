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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="role_permission_relation")
public class RolePermissionRelation implements Serializable {

    /** Primary key. */
    protected static final String PK = "rolePermissionRelationUid";

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
    @Column(name="Role_Permission_Relation_UID", unique=true, nullable=false, precision=10)
    private int rolePermissionRelationUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @ManyToOne
    @JoinColumn(name="Roles_UID")
    private Roles roles;
    @ManyToOne
    @JoinColumns({@JoinColumn(name="Permission_Codes_UID"), @JoinColumn(name="Permissions_SO_UID")})
    private Permissions permissions;

    /** Default constructor. */
    public RolePermissionRelation() {
        super();
    }

    /**
     * Access method for rolePermissionRelationUid.
     *
     * @return the current value of rolePermissionRelationUid
     */
    public int getRolePermissionRelationUid() {
        return rolePermissionRelationUid;
    }

    /**
     * Setter method for rolePermissionRelationUid.
     *
     * @param aRolePermissionRelationUid the new value for rolePermissionRelationUid
     */
    public void setRolePermissionRelationUid(int aRolePermissionRelationUid) {
        rolePermissionRelationUid = aRolePermissionRelationUid;
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
     * Access method for roles.
     *
     * @return the current value of roles
     */
    public Roles getRoles() {
        return roles;
    }

    /**
     * Setter method for roles.
     *
     * @param aRoles the new value for roles
     */
    public void setRoles(Roles aRoles) {
        roles = aRoles;
    }

    /**
     * Access method for permissions.
     *
     * @return the current value of permissions
     */
    public Permissions getPermissions() {
        return permissions;
    }

    /**
     * Setter method for permissions.
     *
     * @param aPermissions the new value for permissions
     */
    public void setPermissions(Permissions aPermissions) {
        permissions = aPermissions;
    }

    /**
     * Compares the key for this instance with another RolePermissionRelation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RolePermissionRelation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RolePermissionRelation)) {
            return false;
        }
        RolePermissionRelation that = (RolePermissionRelation) other;
        if (this.getRolePermissionRelationUid() != that.getRolePermissionRelationUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RolePermissionRelation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RolePermissionRelation)) return false;
        return this.equalKeys(other) && ((RolePermissionRelation)other).equalKeys(this);
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
        i = getRolePermissionRelationUid();
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
        StringBuffer sb = new StringBuffer("[RolePermissionRelation |");
        sb.append(" rolePermissionRelationUid=").append(getRolePermissionRelationUid());
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
        ret.put("rolePermissionRelationUid", Integer.valueOf(getRolePermissionRelationUid()));
        return ret;
    }

}
