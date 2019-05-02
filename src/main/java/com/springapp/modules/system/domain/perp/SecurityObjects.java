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

@Entity(name="security_objects")
public class SecurityObjects implements Serializable {

    /** Primary key. */
    protected static final String PK = "soUid";

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
    @Column(name="SO_UID", unique=true, nullable=false, precision=10)
    private int soUid;
    @Column(name="SO_Name", nullable=false, length=45)
    private String soName;
    @Column(name="SO_Description", length=256)
    private String soDescription;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="securityObjects")
    private Set<Permissions> permissions;
    @OneToMany(mappedBy="securityObjects")
    private Set<AppregitemactionSoRel> appregitemactionSoRel;
    @OneToMany(mappedBy="securityObjects")
    private Set<NoteComplaints> noteComplaints;

    /** Default constructor. */
    public SecurityObjects() {
        super();
    }

    /**
     * Access method for soUid.
     *
     * @return the current value of soUid
     */
    public int getSoUid() {
        return soUid;
    }

    /**
     * Setter method for soUid.
     *
     * @param aSoUid the new value for soUid
     */
    public void setSoUid(int aSoUid) {
        soUid = aSoUid;
    }

    /**
     * Access method for soName.
     *
     * @return the current value of soName
     */
    public String getSoName() {
        return soName;
    }

    /**
     * Setter method for soName.
     *
     * @param aSoName the new value for soName
     */
    public void setSoName(String aSoName) {
        soName = aSoName;
    }

    /**
     * Access method for soDescription.
     *
     * @return the current value of soDescription
     */
    public String getSoDescription() {
        return soDescription;
    }

    /**
     * Setter method for soDescription.
     *
     * @param aSoDescription the new value for soDescription
     */
    public void setSoDescription(String aSoDescription) {
        soDescription = aSoDescription;
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
     * Access method for permissions.
     *
     * @return the current value of permissions
     */
    public Set<Permissions> getPermissions() {
        return permissions;
    }

    /**
     * Setter method for permissions.
     *
     * @param aPermissions the new value for permissions
     */
    public void setPermissions(Set<Permissions> aPermissions) {
        permissions = aPermissions;
    }

    /**
     * Access method for appregitemactionSoRel.
     *
     * @return the current value of appregitemactionSoRel
     */
    public Set<AppregitemactionSoRel> getAppregitemactionSoRel() {
        return appregitemactionSoRel;
    }

    /**
     * Setter method for appregitemactionSoRel.
     *
     * @param aAppregitemactionSoRel the new value for appregitemactionSoRel
     */
    public void setAppregitemactionSoRel(Set<AppregitemactionSoRel> aAppregitemactionSoRel) {
        appregitemactionSoRel = aAppregitemactionSoRel;
    }

    /**
     * Access method for noteComplaints.
     *
     * @return the current value of noteComplaints
     */
    public Set<NoteComplaints> getNoteComplaints() {
        return noteComplaints;
    }

    /**
     * Setter method for noteComplaints.
     *
     * @param aNoteComplaints the new value for noteComplaints
     */
    public void setNoteComplaints(Set<NoteComplaints> aNoteComplaints) {
        noteComplaints = aNoteComplaints;
    }

    /**
     * Compares the key for this instance with another SecurityObjects.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class SecurityObjects and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof SecurityObjects)) {
            return false;
        }
        SecurityObjects that = (SecurityObjects) other;
        if (this.getSoUid() != that.getSoUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another SecurityObjects.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SecurityObjects)) return false;
        return this.equalKeys(other) && ((SecurityObjects)other).equalKeys(this);
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
        i = getSoUid();
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
        StringBuffer sb = new StringBuffer("[SecurityObjects |");
        sb.append(" soUid=").append(getSoUid());
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
        ret.put("soUid", Integer.valueOf(getSoUid()));
        return ret;
    }

}
