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

@Entity(name="materialtype_relations")
public class MaterialtypeRelations implements Serializable {

    /** Primary key. */
    protected static final String PK = "MaterialtypeRelationsPrimary";

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

    @Column(name="Other_Type_Text", length=255)
    private String otherTypeText;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="MaterialType_UID", nullable=false)
    private MaterialTypes materialTypes;
    @ManyToOne(optional=false)
    @JoinColumn(name="RegItemDet_UID", nullable=false)
    private RegitemDetails regitemDetails;

    /** Default constructor. */
    public MaterialtypeRelations() {
        super();
    }

    /**
     * Access method for otherTypeText.
     *
     * @return the current value of otherTypeText
     */
    public String getOtherTypeText() {
        return otherTypeText;
    }

    /**
     * Setter method for otherTypeText.
     *
     * @param aOtherTypeText the new value for otherTypeText
     */
    public void setOtherTypeText(String aOtherTypeText) {
        otherTypeText = aOtherTypeText;
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
     * Access method for materialTypes.
     *
     * @return the current value of materialTypes
     */
    public MaterialTypes getMaterialTypes() {
        return materialTypes;
    }

    /**
     * Setter method for materialTypes.
     *
     * @param aMaterialTypes the new value for materialTypes
     */
    public void setMaterialTypes(MaterialTypes aMaterialTypes) {
        materialTypes = aMaterialTypes;
    }

    /**
     * Access method for regitemDetails.
     *
     * @return the current value of regitemDetails
     */
    public RegitemDetails getRegitemDetails() {
        return regitemDetails;
    }

    /**
     * Setter method for regitemDetails.
     *
     * @param aRegitemDetails the new value for regitemDetails
     */
    public void setRegitemDetails(RegitemDetails aRegitemDetails) {
        regitemDetails = aRegitemDetails;
    }

    /** Temporary value holder for group key fragment materialTypesUid */
    private transient int tempMaterialTypesUid;

    /**
     * Gets the key fragment uid for member materialTypes.
     * If this.materialTypes is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setMaterialTypesUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see MaterialTypes
     */
    public int getMaterialTypesUid() {
        return (getMaterialTypes() == null ? tempMaterialTypesUid : getMaterialTypes().getUid());
    }

    /**
     * Sets the key fragment uid from member materialTypes.
     * If this.materialTypes is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getMaterialTypesUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aUid New value for the key fragment
     * @see MaterialTypes
     */
    public void setMaterialTypesUid(int aUid) {
        if (getMaterialTypes() == null) {
            tempMaterialTypesUid = aUid;
        } else {
            getMaterialTypes().setUid(aUid);
        }
    }

    /** Temporary value holder for group key fragment regitemDetailsRegItemDetUid */
    private transient int tempRegitemDetailsRegItemDetUid;

    /**
     * Gets the key fragment regItemDetUid for member regitemDetails.
     * If this.regitemDetails is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setRegitemDetailsRegItemDetUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see RegitemDetails
     */
    public int getRegitemDetailsRegItemDetUid() {
        return (getRegitemDetails() == null ? tempRegitemDetailsRegItemDetUid : getRegitemDetails().getRegItemDetUid());
    }

    /**
     * Sets the key fragment regItemDetUid from member regitemDetails.
     * If this.regitemDetails is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getRegitemDetailsRegItemDetUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aRegItemDetUid New value for the key fragment
     * @see RegitemDetails
     */
    public void setRegitemDetailsRegItemDetUid(int aRegItemDetUid) {
        if (getRegitemDetails() == null) {
            tempRegitemDetailsRegItemDetUid = aRegItemDetUid;
        } else {
            getRegitemDetails().setRegItemDetUid(aRegItemDetUid);
        }
    }

    /**
     * Compares the key for this instance with another MaterialtypeRelations.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class MaterialtypeRelations and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof MaterialtypeRelations)) {
            return false;
        }
        MaterialtypeRelations that = (MaterialtypeRelations) other;
        if (this.getMaterialTypesUid() != that.getMaterialTypesUid()) {
            return false;
        }
        if (this.getRegitemDetailsRegItemDetUid() != that.getRegitemDetailsRegItemDetUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another MaterialtypeRelations.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof MaterialtypeRelations)) return false;
        return this.equalKeys(other) && ((MaterialtypeRelations)other).equalKeys(this);
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
        i = getMaterialTypesUid();
        result = 37*result + i;
        i = getRegitemDetailsRegItemDetUid();
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
        StringBuffer sb = new StringBuffer("[MaterialtypeRelations |");
        sb.append(" materialTypesUid=").append(getMaterialTypesUid());
        sb.append(" regitemDetailsRegItemDetUid=").append(getRegitemDetailsRegItemDetUid());
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
        ret.put("materialTypesUid", Integer.valueOf(getMaterialTypesUid()));
        ret.put("regitemDetailsRegItemDetUid", Integer.valueOf(getRegitemDetailsRegItemDetUid()));
        return ret;
    }

}
