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

@Entity(name="type_table_ddl")
public class TypeTableDdl implements Serializable {

    /** Primary key. */
    protected static final String PK = "typeTableDdlUid";

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
    @Column(name="Type_Table_DDL_UID", unique=true, nullable=false, precision=10)
    private int typeTableDdlUid;
    @Column(name="Table_Name", nullable=false, length=45)
    private String tableName;
    @Column(name="Col_Name", nullable=false, length=128)
    private String colName;
    @Column(name="Col_Datatype", nullable=false, length=45)
    private String colDatatype;
    @Column(name="Col_Label", nullable=false, length=128)
    private String colLabel;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;

    /** Default constructor. */
    public TypeTableDdl() {
        super();
    }

    /**
     * Access method for typeTableDdlUid.
     *
     * @return the current value of typeTableDdlUid
     */
    public int getTypeTableDdlUid() {
        return typeTableDdlUid;
    }

    /**
     * Setter method for typeTableDdlUid.
     *
     * @param aTypeTableDdlUid the new value for typeTableDdlUid
     */
    public void setTypeTableDdlUid(int aTypeTableDdlUid) {
        typeTableDdlUid = aTypeTableDdlUid;
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
     * Access method for colName.
     *
     * @return the current value of colName
     */
    public String getColName() {
        return colName;
    }

    /**
     * Setter method for colName.
     *
     * @param aColName the new value for colName
     */
    public void setColName(String aColName) {
        colName = aColName;
    }

    /**
     * Access method for colDatatype.
     *
     * @return the current value of colDatatype
     */
    public String getColDatatype() {
        return colDatatype;
    }

    /**
     * Setter method for colDatatype.
     *
     * @param aColDatatype the new value for colDatatype
     */
    public void setColDatatype(String aColDatatype) {
        colDatatype = aColDatatype;
    }

    /**
     * Access method for colLabel.
     *
     * @return the current value of colLabel
     */
    public String getColLabel() {
        return colLabel;
    }

    /**
     * Setter method for colLabel.
     *
     * @param aColLabel the new value for colLabel
     */
    public void setColLabel(String aColLabel) {
        colLabel = aColLabel;
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
     * Compares the key for this instance with another TypeTableDdl.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TypeTableDdl and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TypeTableDdl)) {
            return false;
        }
        TypeTableDdl that = (TypeTableDdl) other;
        if (this.getTypeTableDdlUid() != that.getTypeTableDdlUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TypeTableDdl.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TypeTableDdl)) return false;
        return this.equalKeys(other) && ((TypeTableDdl)other).equalKeys(this);
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
        i = getTypeTableDdlUid();
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
        StringBuffer sb = new StringBuffer("[TypeTableDdl |");
        sb.append(" typeTableDdlUid=").append(getTypeTableDdlUid());
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
        ret.put("typeTableDdlUid", Integer.valueOf(getTypeTableDdlUid()));
        return ret;
    }

}
