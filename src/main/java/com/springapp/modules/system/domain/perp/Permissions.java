// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="permissions")
public class Permissions implements Serializable {

    /** Primary key. */
    protected static final String PK = "PermissionsPrimary";

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
    @JoinColumn(name="Permission_Codes_UID", nullable=false)
    private PermissionCodes permissionCodes;
    @ManyToOne(optional=false)
    @JoinColumn(name="SO_UID", nullable=false)
    private SecurityObjects securityObjects;
    @OneToMany(mappedBy="permissions")
    private Set<RolePermissionRelation> rolePermissionRelation;

    /** Default constructor. */
    public Permissions() {
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
     * Access method for permissionCodes.
     *
     * @return the current value of permissionCodes
     */
    public PermissionCodes getPermissionCodes() {
        return permissionCodes;
    }

    /**
     * Setter method for permissionCodes.
     *
     * @param aPermissionCodes the new value for permissionCodes
     */
    public void setPermissionCodes(PermissionCodes aPermissionCodes) {
        permissionCodes = aPermissionCodes;
    }

    /**
     * Access method for securityObjects.
     *
     * @return the current value of securityObjects
     */
    public SecurityObjects getSecurityObjects() {
        return securityObjects;
    }

    /**
     * Setter method for securityObjects.
     *
     * @param aSecurityObjects the new value for securityObjects
     */
    public void setSecurityObjects(SecurityObjects aSecurityObjects) {
        securityObjects = aSecurityObjects;
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

    /** Temporary value holder for group key fragment permissionCodesPermissionCodesUid */
    private transient int tempPermissionCodesPermissionCodesUid;

    /**
     * Gets the key fragment permissionCodesUid for member permissionCodes.
     * If this.permissionCodes is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setPermissionCodesPermissionCodesUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see PermissionCodes
     */
    public int getPermissionCodesPermissionCodesUid() {
        return (getPermissionCodes() == null ? tempPermissionCodesPermissionCodesUid : getPermissionCodes().getPermissionCodesUid());
    }

    /**
     * Sets the key fragment permissionCodesUid from member permissionCodes.
     * If this.permissionCodes is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getPermissionCodesPermissionCodesUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aPermissionCodesUid New value for the key fragment
     * @see PermissionCodes
     */
    public void setPermissionCodesPermissionCodesUid(int aPermissionCodesUid) {
        if (getPermissionCodes() == null) {
            tempPermissionCodesPermissionCodesUid = aPermissionCodesUid;
        } else {
            getPermissionCodes().setPermissionCodesUid(aPermissionCodesUid);
        }
    }

    /** Temporary value holder for group key fragment securityObjectsSoUid */
    private transient int tempSecurityObjectsSoUid;

    /**
     * Gets the key fragment soUid for member securityObjects.
     * If this.securityObjects is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setSecurityObjectsSoUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see SecurityObjects
     */
    public int getSecurityObjectsSoUid() {
        return (getSecurityObjects() == null ? tempSecurityObjectsSoUid : getSecurityObjects().getSoUid());
    }

    /**
     * Sets the key fragment soUid from member securityObjects.
     * If this.securityObjects is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getSecurityObjectsSoUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aSoUid New value for the key fragment
     * @see SecurityObjects
     */
    public void setSecurityObjectsSoUid(int aSoUid) {
        if (getSecurityObjects() == null) {
            tempSecurityObjectsSoUid = aSoUid;
        } else {
            getSecurityObjects().setSoUid(aSoUid);
        }
    }

    /**
     * Compares the key for this instance with another Permissions.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Permissions and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Permissions)) {
            return false;
        }
        Permissions that = (Permissions) other;
        if (this.getPermissionCodesPermissionCodesUid() != that.getPermissionCodesPermissionCodesUid()) {
            return false;
        }
        if (this.getSecurityObjectsSoUid() != that.getSecurityObjectsSoUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Permissions.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Permissions)) return false;
        return this.equalKeys(other) && ((Permissions)other).equalKeys(this);
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
        i = getPermissionCodesPermissionCodesUid();
        result = 37*result + i;
        i = getSecurityObjectsSoUid();
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
        StringBuffer sb = new StringBuffer("[Permissions |");
        sb.append(" permissionCodesPermissionCodesUid=").append(getPermissionCodesPermissionCodesUid());
        sb.append(" securityObjectsSoUid=").append(getSecurityObjectsSoUid());
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
        ret.put("permissionCodesPermissionCodesUid", Integer.valueOf(getPermissionCodesPermissionCodesUid()));
        ret.put("securityObjectsSoUid", Integer.valueOf(getSecurityObjectsSoUid()));
        return ret;
    }

}
