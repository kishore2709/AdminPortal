// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="regitem_req_attach_rel")
public class RegitemReqAttachRel implements Serializable {

    /** Primary key. */
    protected static final String PK = "riraRelUid";

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
    @Column(name="RIRARel_UID", unique=true, nullable=false, precision=10)
    private int riraRelUid;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne
    @JoinColumn(name="AttachementType_UID")
    private AttachmentType attachmentType;
    @ManyToOne
    @JoinColumn(name="Inspection_UID")
    private Inspections inspections;
    @ManyToOne
    @JoinColumn(name="Note_Attachment_UID")
    private NoteAttachment noteAttachment;
    @ManyToOne
    @JoinColumn(name="RegItem_UID")
    private RegistrationItems registrationItems;

    /** Default constructor. */
    public RegitemReqAttachRel() {
        super();
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
     * Access method for attachmentType.
     *
     * @return the current value of attachmentType
     */
    public AttachmentType getAttachmentType() {
        return attachmentType;
    }

    /**
     * Setter method for attachmentType.
     *
     * @param aAttachmentType the new value for attachmentType
     */
    public void setAttachmentType(AttachmentType aAttachmentType) {
        attachmentType = aAttachmentType;
    }

    /**
     * Access method for inspections.
     *
     * @return the current value of inspections
     */
    public Inspections getInspections() {
        return inspections;
    }

    /**
     * Setter method for inspections.
     *
     * @param aInspections the new value for inspections
     */
    public void setInspections(Inspections aInspections) {
        inspections = aInspections;
    }

    /**
     * Access method for noteAttachment.
     *
     * @return the current value of noteAttachment
     */
    public NoteAttachment getNoteAttachment() {
        return noteAttachment;
    }

    /**
     * Setter method for noteAttachment.
     *
     * @param aNoteAttachment the new value for noteAttachment
     */
    public void setNoteAttachment(NoteAttachment aNoteAttachment) {
        noteAttachment = aNoteAttachment;
    }

    /**
     * Access method for registrationItems.
     *
     * @return the current value of registrationItems
     */
    public RegistrationItems getRegistrationItems() {
        return registrationItems;
    }

    /**
     * Setter method for registrationItems.
     *
     * @param aRegistrationItems the new value for registrationItems
     */
    public void setRegistrationItems(RegistrationItems aRegistrationItems) {
        registrationItems = aRegistrationItems;
    }

    /**
     * Compares the key for this instance with another RegitemReqAttachRel.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RegitemReqAttachRel and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RegitemReqAttachRel)) {
            return false;
        }
        RegitemReqAttachRel that = (RegitemReqAttachRel) other;
        if (this.getRiraRelUid() != that.getRiraRelUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RegitemReqAttachRel.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RegitemReqAttachRel)) return false;
        return this.equalKeys(other) && ((RegitemReqAttachRel)other).equalKeys(this);
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
        i = getRiraRelUid();
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
        StringBuffer sb = new StringBuffer("[RegitemReqAttachRel |");
        sb.append(" riraRelUid=").append(getRiraRelUid());
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
        ret.put("riraRelUid", Integer.valueOf(getRiraRelUid()));
        return ret;
    }

}
