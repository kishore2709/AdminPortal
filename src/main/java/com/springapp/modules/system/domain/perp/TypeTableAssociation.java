// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="type_table_association")
public class TypeTableAssociation implements Serializable {

    /** Primary key. */
    protected static final String PK = "ttaUid";

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
    @Column(name="TTA_UID", unique=true, nullable=false, precision=10)
    private int ttaUid;
    @Column(name="Order_by", nullable=false, precision=10)
    private int orderBy;
    @ManyToOne(optional=false)
    @JoinColumn(name="Type_Table_Lookup_UID", nullable=false)
    private TypeTableLookup typeTableLookup;
    @ManyToOne(optional=false)
    @JoinColumn(name="Dependent_On_UID", nullable=false)
    private TypeTableLookup typeTableLookup2;

    /** Default constructor. */
    public TypeTableAssociation() {
        super();
    }

    /**
     * Access method for ttaUid.
     *
     * @return the current value of ttaUid
     */
    public int getTtaUid() {
        return ttaUid;
    }

    /**
     * Setter method for ttaUid.
     *
     * @param aTtaUid the new value for ttaUid
     */
    public void setTtaUid(int aTtaUid) {
        ttaUid = aTtaUid;
    }

    /**
     * Access method for orderBy.
     *
     * @return the current value of orderBy
     */
    public int getOrderBy() {
        return orderBy;
    }

    /**
     * Setter method for orderBy.
     *
     * @param aOrderBy the new value for orderBy
     */
    public void setOrderBy(int aOrderBy) {
        orderBy = aOrderBy;
    }

    /**
     * Access method for typeTableLookup.
     *
     * @return the current value of typeTableLookup
     */
    public TypeTableLookup getTypeTableLookup() {
        return typeTableLookup;
    }

    /**
     * Setter method for typeTableLookup.
     *
     * @param aTypeTableLookup the new value for typeTableLookup
     */
    public void setTypeTableLookup(TypeTableLookup aTypeTableLookup) {
        typeTableLookup = aTypeTableLookup;
    }

    /**
     * Access method for typeTableLookup2.
     *
     * @return the current value of typeTableLookup2
     */
    public TypeTableLookup getTypeTableLookup2() {
        return typeTableLookup2;
    }

    /**
     * Setter method for typeTableLookup2.
     *
     * @param aTypeTableLookup2 the new value for typeTableLookup2
     */
    public void setTypeTableLookup2(TypeTableLookup aTypeTableLookup2) {
        typeTableLookup2 = aTypeTableLookup2;
    }

    /**
     * Compares the key for this instance with another TypeTableAssociation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TypeTableAssociation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TypeTableAssociation)) {
            return false;
        }
        TypeTableAssociation that = (TypeTableAssociation) other;
        if (this.getTtaUid() != that.getTtaUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TypeTableAssociation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TypeTableAssociation)) return false;
        return this.equalKeys(other) && ((TypeTableAssociation)other).equalKeys(this);
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
        i = getTtaUid();
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
        StringBuffer sb = new StringBuffer("[TypeTableAssociation |");
        sb.append(" ttaUid=").append(getTtaUid());
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
        ret.put("ttaUid", Integer.valueOf(getTtaUid()));
        return ret;
    }

}
