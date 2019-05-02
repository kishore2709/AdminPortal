// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="user_role")
public class UserRole implements Serializable {

    /** Primary key. */
    protected static final String PK = "UserRolePrimary";

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

    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="ROLES_UID", nullable=false)
    private Roles roles;
    @ManyToOne(optional=false)
    @JoinColumn(name="Users_UID", nullable=false)
    private Users users;

    /** Default constructor. */
    public UserRole() {
        super();
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

    /** Temporary value holder for group key fragment usersUsersUid */
    private transient int tempUsersUsersUid;

    /**
     * Gets the key fragment usersUid for member users.
     * If this.users is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setUsersUsersUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Users
     */
    public int getUsersUsersUid() {
        return (getUsers() == null ? tempUsersUsersUid : getUsers().getUsersUid());
    }

    /**
     * Sets the key fragment usersUid from member users.
     * If this.users is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getUsersUsersUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aUsersUid New value for the key fragment
     * @see Users
     */
    public void setUsersUsersUid(int aUsersUid) {
        if (getUsers() == null) {
            tempUsersUsersUid = aUsersUid;
        } else {
            getUsers().setUsersUid(aUsersUid);
        }
    }

    /** Temporary value holder for group key fragment rolesRolesUid */
    private transient int tempRolesRolesUid;

    /**
     * Gets the key fragment rolesUid for member roles.
     * If this.roles is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setRolesRolesUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Roles
     */
    public int getRolesRolesUid() {
        return (getRoles() == null ? tempRolesRolesUid : getRoles().getRolesUid());
    }

    /**
     * Sets the key fragment rolesUid from member roles.
     * If this.roles is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getRolesRolesUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aRolesUid New value for the key fragment
     * @see Roles
     */
    public void setRolesRolesUid(int aRolesUid) {
        if (getRoles() == null) {
            tempRolesRolesUid = aRolesUid;
        } else {
            getRoles().setRolesUid(aRolesUid);
        }
    }

    /**
     * Compares the key for this instance with another UserRole.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UserRole and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UserRole)) {
            return false;
        }
        UserRole that = (UserRole) other;
        if (this.getUsersUsersUid() != that.getUsersUsersUid()) {
            return false;
        }
        if (this.getRolesRolesUid() != that.getRolesRolesUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UserRole.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UserRole)) return false;
        return this.equalKeys(other) && ((UserRole)other).equalKeys(this);
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
        i = getUsersUsersUid();
        result = 37*result + i;
        i = getRolesRolesUid();
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
        StringBuffer sb = new StringBuffer("[UserRole |");
        sb.append(" usersUsersUid=").append(getUsersUsersUid());
        sb.append(" rolesRolesUid=").append(getRolesRolesUid());
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
        ret.put("usersUsersUid", Integer.valueOf(getUsersUsersUid()));
        ret.put("rolesRolesUid", Integer.valueOf(getRolesRolesUid()));
        return ret;
    }

}
