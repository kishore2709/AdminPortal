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

@Entity(name="user_role_aud")
public class UserRoleAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "userRoleAudUid";

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
    @Column(name="User_Role_Aud_UID", unique=true, nullable=false, precision=10)
    private int userRoleAudUid;
    @Column(name="Users_UID", nullable=false, precision=10)
    private int usersUid;
    @Column(name="ROLES_UID", nullable=false, precision=10)
    private int rolesUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public UserRoleAud() {
        super();
    }

    /**
     * Access method for userRoleAudUid.
     *
     * @return the current value of userRoleAudUid
     */
    public int getUserRoleAudUid() {
        return userRoleAudUid;
    }

    /**
     * Setter method for userRoleAudUid.
     *
     * @param aUserRoleAudUid the new value for userRoleAudUid
     */
    public void setUserRoleAudUid(int aUserRoleAudUid) {
        userRoleAudUid = aUserRoleAudUid;
    }

    /**
     * Access method for usersUid.
     *
     * @return the current value of usersUid
     */
    public int getUsersUid() {
        return usersUid;
    }

    /**
     * Setter method for usersUid.
     *
     * @param aUsersUid the new value for usersUid
     */
    public void setUsersUid(int aUsersUid) {
        usersUid = aUsersUid;
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
     * Compares the key for this instance with another UserRoleAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UserRoleAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UserRoleAud)) {
            return false;
        }
        UserRoleAud that = (UserRoleAud) other;
        if (this.getUserRoleAudUid() != that.getUserRoleAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UserRoleAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UserRoleAud)) return false;
        return this.equalKeys(other) && ((UserRoleAud)other).equalKeys(this);
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
        i = getUserRoleAudUid();
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
        StringBuffer sb = new StringBuffer("[UserRoleAud |");
        sb.append(" userRoleAudUid=").append(getUserRoleAudUid());
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
        ret.put("userRoleAudUid", Integer.valueOf(getUserRoleAudUid()));
        return ret;
    }

}
