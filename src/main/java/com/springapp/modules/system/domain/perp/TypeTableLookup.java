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

@Entity(name="type_table_lookup")
public class TypeTableLookup implements Serializable {

    /** Primary key. */
    protected static final String PK = "uid";

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
    @Column(name="UID", unique=true, nullable=false, precision=10)
    private int uid;
    @Column(name="Table_Name", nullable=false, length=45)
    private String tableName;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Identifier", nullable=false, length=45)
    private String identifier;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Table_Description", length=256)
    private String tableDescription;
    @Column(name="Viewable", nullable=false, length=1)
    private String viewable;
    @Column(name="Addable", nullable=false, length=1)
    private String addable;
    @Column(name="Editable", nullable=false, length=1)
    private String editable;
    @Column(name="Deactivatable", nullable=false, length=1)
    private String deactivatable;
    @OneToMany(mappedBy="typeTableLookup")
    private Set<TypeTableAssociations> typeTableAssociations;
    @OneToMany(mappedBy="typeTableLookup")
    private Set<TypeTableAssociation> typeTableAssociation;
    @OneToMany(mappedBy="typeTableLookup2")
    private Set<TypeTableAssociation> typeTableAssociation2;
    @OneToMany(mappedBy="typeTableLookup2")
    private Set<TypeTableAssociations> typeTableAssociations2;

    /** Default constructor. */
    public TypeTableLookup() {
        super();
    }

    /**
     * Access method for uid.
     *
     * @return the current value of uid
     */
    public int getUid() {
        return uid;
    }

    /**
     * Setter method for uid.
     *
     * @param aUid the new value for uid
     */
    public void setUid(int aUid) {
        uid = aUid;
    }

    /**
     * Access method for tableName.
     *
     * @return the current value of tableName
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Setter method for tableName.
     *
     * @param aTableName the new value for tableName
     */
    public void setTableName(String aTableName) {
        tableName = aTableName;
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
     * Access method for identifier.
     *
     * @return the current value of identifier
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Setter method for identifier.
     *
     * @param aIdentifier the new value for identifier
     */
    public void setIdentifier(String aIdentifier) {
        identifier = aIdentifier;
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
     * Access method for tableDescription.
     *
     * @return the current value of tableDescription
     */
    public String getTableDescription() {
        return tableDescription;
    }

    /**
     * Setter method for tableDescription.
     *
     * @param aTableDescription the new value for tableDescription
     */
    public void setTableDescription(String aTableDescription) {
        tableDescription = aTableDescription;
    }

    /**
     * Access method for viewable.
     *
     * @return the current value of viewable
     */
    public String getViewable() {
        return viewable;
    }

    /**
     * Setter method for viewable.
     *
     * @param aViewable the new value for viewable
     */
    public void setViewable(String aViewable) {
        viewable = aViewable;
    }

    /**
     * Access method for addable.
     *
     * @return the current value of addable
     */
    public String getAddable() {
        return addable;
    }

    /**
     * Setter method for addable.
     *
     * @param aAddable the new value for addable
     */
    public void setAddable(String aAddable) {
        addable = aAddable;
    }

    /**
     * Access method for editable.
     *
     * @return the current value of editable
     */
    public String getEditable() {
        return editable;
    }

    /**
     * Setter method for editable.
     *
     * @param aEditable the new value for editable
     */
    public void setEditable(String aEditable) {
        editable = aEditable;
    }

    /**
     * Access method for deactivatable.
     *
     * @return the current value of deactivatable
     */
    public String getDeactivatable() {
        return deactivatable;
    }

    /**
     * Setter method for deactivatable.
     *
     * @param aDeactivatable the new value for deactivatable
     */
    public void setDeactivatable(String aDeactivatable) {
        deactivatable = aDeactivatable;
    }

    /**
     * Access method for typeTableAssociations.
     *
     * @return the current value of typeTableAssociations
     */
    public Set<TypeTableAssociations> getTypeTableAssociations() {
        return typeTableAssociations;
    }

    /**
     * Setter method for typeTableAssociations.
     *
     * @param aTypeTableAssociations the new value for typeTableAssociations
     */
    public void setTypeTableAssociations(Set<TypeTableAssociations> aTypeTableAssociations) {
        typeTableAssociations = aTypeTableAssociations;
    }

    /**
     * Access method for typeTableAssociation.
     *
     * @return the current value of typeTableAssociation
     */
    public Set<TypeTableAssociation> getTypeTableAssociation() {
        return typeTableAssociation;
    }

    /**
     * Setter method for typeTableAssociation.
     *
     * @param aTypeTableAssociation the new value for typeTableAssociation
     */
    public void setTypeTableAssociation(Set<TypeTableAssociation> aTypeTableAssociation) {
        typeTableAssociation = aTypeTableAssociation;
    }

    /**
     * Access method for typeTableAssociation2.
     *
     * @return the current value of typeTableAssociation2
     */
    public Set<TypeTableAssociation> getTypeTableAssociation2() {
        return typeTableAssociation2;
    }

    /**
     * Setter method for typeTableAssociation2.
     *
     * @param aTypeTableAssociation2 the new value for typeTableAssociation2
     */
    public void setTypeTableAssociation2(Set<TypeTableAssociation> aTypeTableAssociation2) {
        typeTableAssociation2 = aTypeTableAssociation2;
    }

    /**
     * Access method for typeTableAssociations2.
     *
     * @return the current value of typeTableAssociations2
     */
    public Set<TypeTableAssociations> getTypeTableAssociations2() {
        return typeTableAssociations2;
    }

    /**
     * Setter method for typeTableAssociations2.
     *
     * @param aTypeTableAssociations2 the new value for typeTableAssociations2
     */
    public void setTypeTableAssociations2(Set<TypeTableAssociations> aTypeTableAssociations2) {
        typeTableAssociations2 = aTypeTableAssociations2;
    }

    /**
     * Compares the key for this instance with another TypeTableLookup.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TypeTableLookup and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TypeTableLookup)) {
            return false;
        }
        TypeTableLookup that = (TypeTableLookup) other;
        if (this.getUid() != that.getUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TypeTableLookup.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TypeTableLookup)) return false;
        return this.equalKeys(other) && ((TypeTableLookup)other).equalKeys(this);
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
        i = getUid();
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
        StringBuffer sb = new StringBuffer("[TypeTableLookup |");
        sb.append(" uid=").append(getUid());
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
        ret.put("uid", Integer.valueOf(getUid()));
        return ret;
    }

}
