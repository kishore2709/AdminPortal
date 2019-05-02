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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="note_attachment")
public class NoteAttachment implements Serializable {

    /** Primary key. */
    protected static final String PK = "noteAttachmentUid";

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
    @Column(name="Note_Attachment_UID", unique=true, nullable=false, precision=10)
    private int noteAttachmentUid;
    @Column(name="Attach_Name", nullable=false, length=256)
    private String attachName;
    @Column(name="Attach_file_size", nullable=false, length=45)
    private String attachFileSize;
    @Column(name="Attach_File_Ext", length=45)
    private String attachFileExt;
    @Column(name="Attach_Obj", nullable=false)
    private byte[] attachObj;
    @Column(name="Description", length=128)
    private String description;
    @Column(name="Uploaded_By", nullable=false, length=45)
    private String uploadedBy;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Uploaded_Date", nullable=false)
    private Timestamp uploadedDate;
    @ManyToOne
    @JoinColumn(name="Attachment_Type_UID")
    private AttachmentType attachmentType;
    @OneToMany(mappedBy="noteAttachment")
    private Set<RegitemReqAttachRel> regitemReqAttachRel;
    @ManyToOne
    @JoinColumn(name="NoteComplaint_UID")
    private NoteComplaints noteComplaints;
    @ManyToOne
    @JoinColumn(name="RegItem_UID")
    private RegistrationItems registrationItems;

    /** Default constructor. */
    public NoteAttachment() {
        super();
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
     * Access method for attachName.
     *
     * @return the current value of attachName
     */
    public String getAttachName() {
        return attachName;
    }

    /**
     * Setter method for attachName.
     *
     * @param aAttachName the new value for attachName
     */
    public void setAttachName(String aAttachName) {
        attachName = aAttachName;
    }

    /**
     * Access method for attachFileSize.
     *
     * @return the current value of attachFileSize
     */
    public String getAttachFileSize() {
        return attachFileSize;
    }

    /**
     * Setter method for attachFileSize.
     *
     * @param aAttachFileSize the new value for attachFileSize
     */
    public void setAttachFileSize(String aAttachFileSize) {
        attachFileSize = aAttachFileSize;
    }

    /**
     * Access method for attachFileExt.
     *
     * @return the current value of attachFileExt
     */
    public String getAttachFileExt() {
        return attachFileExt;
    }

    /**
     * Setter method for attachFileExt.
     *
     * @param aAttachFileExt the new value for attachFileExt
     */
    public void setAttachFileExt(String aAttachFileExt) {
        attachFileExt = aAttachFileExt;
    }

    /**
     * Access method for attachObj.
     *
     * @return the current value of attachObj
     */
    public byte[] getAttachObj() {
        return attachObj;
    }

    /**
     * Setter method for attachObj.
     *
     * @param aAttachObj the new value for attachObj
     */
    public void setAttachObj(byte[] aAttachObj) {
        attachObj = aAttachObj;
    }

    /**
     * Access method for description.
     *
     * @return the current value of description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for description.
     *
     * @param aDescription the new value for description
     */
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    /**
     * Access method for uploadedBy.
     *
     * @return the current value of uploadedBy
     */
    public String getUploadedBy() {
        return uploadedBy;
    }

    /**
     * Setter method for uploadedBy.
     *
     * @param aUploadedBy the new value for uploadedBy
     */
    public void setUploadedBy(String aUploadedBy) {
        uploadedBy = aUploadedBy;
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
     * Access method for uploadedDate.
     *
     * @return the current value of uploadedDate
     */
    public Timestamp getUploadedDate() {
        return uploadedDate;
    }

    /**
     * Setter method for uploadedDate.
     *
     * @param aUploadedDate the new value for uploadedDate
     */
    public void setUploadedDate(Timestamp aUploadedDate) {
        uploadedDate = aUploadedDate;
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
     * Access method for regitemReqAttachRel.
     *
     * @return the current value of regitemReqAttachRel
     */
    public Set<RegitemReqAttachRel> getRegitemReqAttachRel() {
        return regitemReqAttachRel;
    }

    /**
     * Setter method for regitemReqAttachRel.
     *
     * @param aRegitemReqAttachRel the new value for regitemReqAttachRel
     */
    public void setRegitemReqAttachRel(Set<RegitemReqAttachRel> aRegitemReqAttachRel) {
        regitemReqAttachRel = aRegitemReqAttachRel;
    }

    /**
     * Access method for noteComplaints.
     *
     * @return the current value of noteComplaints
     */
    public NoteComplaints getNoteComplaints() {
        return noteComplaints;
    }

    /**
     * Setter method for noteComplaints.
     *
     * @param aNoteComplaints the new value for noteComplaints
     */
    public void setNoteComplaints(NoteComplaints aNoteComplaints) {
        noteComplaints = aNoteComplaints;
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
     * Compares the key for this instance with another NoteAttachment.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class NoteAttachment and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof NoteAttachment)) {
            return false;
        }
        NoteAttachment that = (NoteAttachment) other;
        if (this.getNoteAttachmentUid() != that.getNoteAttachmentUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another NoteAttachment.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof NoteAttachment)) return false;
        return this.equalKeys(other) && ((NoteAttachment)other).equalKeys(this);
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
        i = getNoteAttachmentUid();
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
        StringBuffer sb = new StringBuffer("[NoteAttachment |");
        sb.append(" noteAttachmentUid=").append(getNoteAttachmentUid());
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
        ret.put("noteAttachmentUid", Integer.valueOf(getNoteAttachmentUid()));
        return ret;
    }

}
