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

@Entity(name="app_trans_association_aud")
public class AppTransAssociationAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "ataAudUid";

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
    @Column(name="ATAAud_UID", unique=true, nullable=false, precision=10)
    private int ataAudUid;
    @Column(name="AppTransAssoc_UID", nullable=false, precision=10)
    private int appTransAssocUid;
    @Column(name="Application_UID", nullable=false, precision=10)
    private int applicationUid;
    @Column(name="AppTrans_UID", nullable=false, precision=10)
    private int appTransUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public AppTransAssociationAud() {
        super();
    }

    /**
     * Access method for ataAudUid.
     *
     * @return the current value of ataAudUid
     */
    public int getAtaAudUid() {
        return ataAudUid;
    }

    /**
     * Setter method for ataAudUid.
     *
     * @param aAtaAudUid the new value for ataAudUid
     */
    public void setAtaAudUid(int aAtaAudUid) {
        ataAudUid = aAtaAudUid;
    }

    /**
     * Access method for appTransAssocUid.
     *
     * @return the current value of appTransAssocUid
     */
    public int getAppTransAssocUid() {
        return appTransAssocUid;
    }

    /**
     * Setter method for appTransAssocUid.
     *
     * @param aAppTransAssocUid the new value for appTransAssocUid
     */
    public void setAppTransAssocUid(int aAppTransAssocUid) {
        appTransAssocUid = aAppTransAssocUid;
    }

    /**
     * Access method for applicationUid.
     *
     * @return the current value of applicationUid
     */
    public int getApplicationUid() {
        return applicationUid;
    }

    /**
     * Setter method for applicationUid.
     *
     * @param aApplicationUid the new value for applicationUid
     */
    public void setApplicationUid(int aApplicationUid) {
        applicationUid = aApplicationUid;
    }

    /**
     * Access method for appTransUid.
     *
     * @return the current value of appTransUid
     */
    public int getAppTransUid() {
        return appTransUid;
    }

    /**
     * Setter method for appTransUid.
     *
     * @param aAppTransUid the new value for appTransUid
     */
    public void setAppTransUid(int aAppTransUid) {
        appTransUid = aAppTransUid;
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
     * Compares the key for this instance with another AppTransAssociationAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AppTransAssociationAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AppTransAssociationAud)) {
            return false;
        }
        AppTransAssociationAud that = (AppTransAssociationAud) other;
        if (this.getAtaAudUid() != that.getAtaAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AppTransAssociationAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AppTransAssociationAud)) return false;
        return this.equalKeys(other) && ((AppTransAssociationAud)other).equalKeys(this);
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
        i = getAtaAudUid();
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
        StringBuffer sb = new StringBuffer("[AppTransAssociationAud |");
        sb.append(" ataAudUid=").append(getAtaAudUid());
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
        ret.put("ataAudUid", Integer.valueOf(getAtaAudUid()));
        return ret;
    }

}
