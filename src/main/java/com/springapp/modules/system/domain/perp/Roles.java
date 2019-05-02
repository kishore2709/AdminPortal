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

@Entity(name="roles")
public class Roles implements Serializable {

    /** Primary key. */
    protected static final String PK = "rolesUid";

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
    @Column(name="ROLES_UID", unique=true, nullable=false, precision=10)
    private int rolesUid;
    @Column(name="Role_Name", length=60)
    private String roleName;
    @Column(name="Role_Description", length=256)
    private String roleDescription;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="roles2")
    private Set<RoleRelations> roleRelations2;
    @OneToMany(mappedBy="roles")
    private Set<RoleRelations> roleRelations;
    @ManyToOne
    @JoinColumn(name="Programs_UID")
    private Programs programs;
    @OneToMany(mappedBy="roles")
    private Set<RolePermissionRelation> rolePermissionRelation;
    @OneToMany(mappedBy="roles")
    private Set<UserRole> userRole;
    @ManyToOne(optional=false)
    @JoinColumn(name="Role_Type_UID", nullable=false)
    private RoleType roleType;

    /** Default constructor. */
    public Roles() {
        super();
    }

    /**
     * Access method for rolesUid.
     *
     * @return the current value of rolesUid
     */
    public int getRolesUid() {
        return rolesUid;
    }

    /**
     * Setter method for rolesUid.
     *
     * @param aRolesUid the new value for rolesUid
     */
    public void setRolesUid(int aRolesUid) {
        rolesUid = aRolesUid;
    }

    /**
     * Access method for roleName.
     *
     * @return the current value of roleName
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Setter method for roleName.
     *
     * @param aRoleName the new value for roleName
     */
    public void setRoleName(String aRoleName) {
        roleName = aRoleName;
    }

    /**
     * Access method for roleDescription.
     *
     * @return the current value of roleDescription
     */
    public String getRoleDescription() {
        return roleDescription;
    }

    /**
     * Setter method for roleDescription.
     *
     * @param aRoleDescription the new value for roleDescription
     */
    public void setRoleDescription(String aRoleDescription) {
        roleDescription = aRoleDescription;
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
     * Access method for roleRelations2.
     *
     * @return the current value of roleRelations2
     */
    public Set<RoleRelations> getRoleRelations2() {
        return roleRelations2;
    }

    /**
     * Setter method for roleRelations2.
     *
     * @param aRoleRelations2 the new value for roleRelations2
     */
    public void setRoleRelations2(Set<RoleRelations> aRoleRelations2) {
        roleRelations2 = aRoleRelations2;
    }

    /**
     * Access method for roleRelations.
     *
     * @return the current value of roleRelations
     */
    public Set<RoleRelations> getRoleRelations() {
        return roleRelations;
    }

    /**
     * Setter method for roleRelations.
     *
     * @param aRoleRelations the new value for roleRelations
     */
    public void setRoleRelations(Set<RoleRelations> aRoleRelations) {
        roleRelations = aRoleRelations;
    }

    /**
     * Access method for programs.
     *
     * @return the current value of programs
     */
    public Programs getPrograms() {
        return programs;
    }

    /**
     * Setter method for programs.
     *
     * @param aPrograms the new value for programs
     */
    public void setPrograms(Programs aPrograms) {
        programs = aPrograms;
    }

    /**
     * Access method for rolePermissionRelation.
     *
     * @return the current value of rolePermissionRelation
     */
    public Set<RolePermissionRelation> getRolePermissionRelation() {
        return rolePermissionRelation;
    }

    /**
     * Setter method for rolePermissionRelation.
     *
     * @param aRolePermissionRelation the new value for rolePermissionRelation
     */
    public void setRolePermissionRelation(Set<RolePermissionRelation> aRolePermissionRelation) {
        rolePermissionRelation = aRolePermissionRelation;
    }

    /**
     * Access method for userRole.
     *
     * @return the current value of userRole
     */
    public Set<UserRole> getUserRole() {
        return userRole;
    }

    /**
     * Setter method for userRole.
     *
     * @param aUserRole the new value for userRole
     */
    public void setUserRole(Set<UserRole> aUserRole) {
        userRole = aUserRole;
    }

    /**
     * Access method for roleType.
     *
     * @return the current value of roleType
     */
    public RoleType getRoleType() {
        return roleType;
    }

    /**
     * Setter method for roleType.
     *
     * @param aRoleType the new value for roleType
     */
    public void setRoleType(RoleType aRoleType) {
        roleType = aRoleType;
    }

    /**
     * Compares the key for this instance with another Roles.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Roles and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Roles)) {
            return false;
        }
        Roles that = (Roles) other;
        if (this.getRolesUid() != that.getRolesUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Roles.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Roles)) return false;
        return this.equalKeys(other) && ((Roles)other).equalKeys(this);
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
        i = getRolesUid();
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
        StringBuffer sb = new StringBuffer("[Roles |");
        sb.append(" rolesUid=").append(getRolesUid());
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
        ret.put("rolesUid", Integer.valueOf(getRolesUid()));
        return ret;
    }

}
