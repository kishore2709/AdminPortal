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

@Entity(name="opcon_association")
public class OpconAssociation implements Serializable {

    /** Primary key. */
    protected static final String PK = "OpconAssociationPrimary";

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

    @Column(name="OpCon_UID", nullable=false, precision=10)
    private int opConUid;
    @Column(name="Create_Modified_By", length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date")
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="RTSTRel_UID", nullable=false)
    private RegtypesSectitlesRel regtypesSectitlesRel;

    /** Default constructor. */
    public OpconAssociation() {
        super();
    }

    /**
     * Access method for opConUid.
     *
     * @return the current value of opConUid
     */
    public int getOpConUid() {
        return opConUid;
    }

    /**
     * Setter method for opConUid.
     *
     * @param aOpConUid the new value for opConUid
     */
    public void setOpConUid(int aOpConUid) {
        opConUid = aOpConUid;
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
     * Access method for regtypesSectitlesRel.
     *
     * @return the current value of regtypesSectitlesRel
     */
    public RegtypesSectitlesRel getRegtypesSectitlesRel() {
        return regtypesSectitlesRel;
    }

    /**
     * Setter method for regtypesSectitlesRel.
     *
     * @param aRegtypesSectitlesRel the new value for regtypesSectitlesRel
     */
    public void setRegtypesSectitlesRel(RegtypesSectitlesRel aRegtypesSectitlesRel) {
        regtypesSectitlesRel = aRegtypesSectitlesRel;
    }

    /** Temporary value holder for group key fragment regtypesSectitlesRelRtstRelUid */
    private transient int tempRegtypesSectitlesRelRtstRelUid;

    /**
     * Gets the key fragment rtstRelUid for member regtypesSectitlesRel.
     * If this.regtypesSectitlesRel is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setRegtypesSectitlesRelRtstRelUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see RegtypesSectitlesRel
     */
    public int getRegtypesSectitlesRelRtstRelUid() {
        return (getRegtypesSectitlesRel() == null ? tempRegtypesSectitlesRelRtstRelUid : getRegtypesSectitlesRel().getRtstRelUid());
    }

    /**
     * Sets the key fragment rtstRelUid from member regtypesSectitlesRel.
     * If this.regtypesSectitlesRel is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getRegtypesSectitlesRelRtstRelUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aRtstRelUid New value for the key fragment
     * @see RegtypesSectitlesRel
     */
    public void setRegtypesSectitlesRelRtstRelUid(int aRtstRelUid) {
        if (getRegtypesSectitlesRel() == null) {
            tempRegtypesSectitlesRelRtstRelUid = aRtstRelUid;
        } else {
            getRegtypesSectitlesRel().setRtstRelUid(aRtstRelUid);
        }
    }

    /**
     * Compares the key for this instance with another OpconAssociation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OpconAssociation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OpconAssociation)) {
            return false;
        }
        OpconAssociation that = (OpconAssociation) other;
        if (this.getOpConUid() != that.getOpConUid()) {
            return false;
        }
        if (this.getRegtypesSectitlesRelRtstRelUid() != that.getRegtypesSectitlesRelRtstRelUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OpconAssociation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OpconAssociation)) return false;
        return this.equalKeys(other) && ((OpconAssociation)other).equalKeys(this);
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
        i = getOpConUid();
        result = 37*result + i;
        i = getRegtypesSectitlesRelRtstRelUid();
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
        StringBuffer sb = new StringBuffer("[OpconAssociation |");
        sb.append(" opConUid=").append(getOpConUid());
        sb.append(" regtypesSectitlesRelRtstRelUid=").append(getRegtypesSectitlesRelRtstRelUid());
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
        ret.put("opConUid", Integer.valueOf(getOpConUid()));
        ret.put("regtypesSectitlesRelRtstRelUid", Integer.valueOf(getRegtypesSectitlesRelRtstRelUid()));
        return ret;
    }

}
