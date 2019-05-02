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

@Entity(name="regitem_req_attach_rel_aud")
public class RegitemReqAttachRelAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "rirarAudUid";

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
    @Column(name="RIRARAud_UID", unique=true, nullable=false, precision=10)
    private int rirarAudUid;
    @Column(name="RIRARel_UID", nullable=false, precision=10)
    private int riraRelUid;
    @Column(name="RegItem_UID", precision=10)
    private int regItemUid;
    @Column(name="AttachementType_UID", precision=10)
    private int attachementTypeUid;
    @Column(name="Note_Attachment_UID", precision=10)
    private int noteAttachmentUid;
    @Column(name="Inspection_UID", precision=10)
    private int inspectionUid;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public RegitemReqAttachRelAud() {
        super();
    }

    /**
     * Access method for rirarAudUid.
     *
     * @return the current value of rirarAudUid
     */
    public int getRirarAudUid() {
        return rirarAudUid;
    }

    /**
     * Setter method for rirarAudUid.
     *
     * @param aRirarAudUid the new value for rirarAudUid
     */
    public void setRirarAudUid(int aRirarAudUid) {
        rirarAudUid = aRirarAudUid;
    }

    /**
     * Access method for riraRelUid.
     *
     * @return the current value of riraRelUid
     */
    public int getRiraRelUid() {
        return riraRelUid;
    }

    /**
     * Setter method for riraRelUid.
     *
     * @param aRiraRelUid the new value for riraRelUid
     */
    public void setRiraRelUid(int aRiraRelUid) {
        riraRelUid = aRiraRelUid;
    }

    /**
     * Access method for regItemUid.
     *
     * @return the current value of regItemUid
     */
    public int getRegItemUid() {
        return regItemUid;
    }

    /**
     * Setter method for regItemUid.
     *
     * @param aRegItemUid the new value for regItemUid
     */
    public void setRegItemUid(int aRegItemUid) {
        regItemUid = aRegItemUid;
    }

    /**
     * Access method for attachementTypeUid.
     *
     * @return the current value of attachementTypeUid
     */
    public int getAttachementTypeUid() {
        return attachementTypeUid;
    }

    /**
     * Setter method for attachementTypeUid.
     *
     * @param aAttachementTypeUid the new value for attachementTypeUid
     */
    public void setAttachementTypeUid(int aAttachementTypeUid) {
        attachementTypeUid = aAttachementTypeUid;
    }

    /**
     * Access method for noteAttachmentUid.
     *
     * @return the current value of noteAttachmentUid
     */
    public int getNoteAttachmentUid() {
        return noteAttachmentUid;
    }

    /**
     * Setter method for noteAttachmentUid.
     *
     * @param aNoteAttachmentUid the new value for noteAttachmentUid
     */
    public void setNoteAttachmentUid(int aNoteAttachmentUid) {
        noteAttachmentUid = aNoteAttachmentUid;
    }

    /**
     * Access method for inspectionUid.
     *
     * @return the current value of inspectionUid
     */
    public int getInspectionUid() {
        return inspectionUid;
    }

    /**
     * Setter method for inspectionUid.
     *
     * @param aInspectionUid the new value for inspectionUid
     */
    public void setInspectionUid(int aInspectionUid) {
        inspectionUid = aInspectionUid;
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
     * Compares the key for this instance with another RegitemReqAttachRelAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RegitemReqAttachRelAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RegitemReqAttachRelAud)) {
            return false;
        }
        RegitemReqAttachRelAud that = (RegitemReqAttachRelAud) other;
        if (this.getRirarAudUid() != that.getRirarAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RegitemReqAttachRelAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RegitemReqAttachRelAud)) return false;
        return this.equalKeys(other) && ((RegitemReqAttachRelAud)other).equalKeys(this);
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
        i = getRirarAudUid();
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
        StringBuffer sb = new StringBuffer("[RegitemReqAttachRelAud |");
        sb.append(" rirarAudUid=").append(getRirarAudUid());
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
        ret.put("rirarAudUid", Integer.valueOf(getRirarAudUid()));
        return ret;
    }

}
