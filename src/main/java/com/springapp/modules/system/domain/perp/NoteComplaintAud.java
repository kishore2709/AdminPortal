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

@Entity(name="note_complaint_aud")
public class NoteComplaintAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "noteComplaintAudUid";

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
    @Column(name="NoteComplaint_Aud_UID", unique=true, nullable=false, precision=10)
    private int noteComplaintAudUid;
    @Column(name="NoteComplaint_UID", nullable=false, precision=10)
    private int noteComplaintUid;
    @Column(name="Note_Category_UID", precision=10)
    private int noteCategoryUid;
    @Column(name="Note_Type_UID", precision=10)
    private int noteTypeUid;
    @Column(name="Complaint_Topics_UID", precision=10)
    private int complaintTopicsUid;
    @Column(name="Complaint_Status_UID", precision=10)
    private int complaintStatusUid;
    @Column(name="Complaint_Priority_Type_UID", precision=10)
    private int complaintPriorityTypeUid;
    @Column(name="Parent_UID", precision=10)
    private int parentUid;
    @Column(name="Subject", length=128)
    private String subject;
    @Column(name="Note_Text", length=2000)
    private String noteText;
    @Column(name="Msg_Start_Datetime")
    private Timestamp msgStartDatetime;
    @Column(name="Msg_End_Datetime")
    private Timestamp msgEndDatetime;
    @Column(name="Terminal_UID", precision=10)
    private int terminalUid;
    @Column(name="Company_UID", precision=10)
    private int companyUid;
    @Column(name="TRU_UID", precision=10)
    private int truUid;
    @Column(name="Vehicle_UID", precision=10)
    private int vehicleUid;
    @Column(name="SO_UID", precision=10)
    private int soUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;
    @Column(name="RegItem_UID", precision=10)
    private int regItemUid;

    /** Default constructor. */
    public NoteComplaintAud() {
        super();
    }

    /**
     * Access method for noteComplaintAudUid.
     *
     * @return the current value of noteComplaintAudUid
     */
    public int getNoteComplaintAudUid() {
        return noteComplaintAudUid;
    }

    /**
     * Setter method for noteComplaintAudUid.
     *
     * @param aNoteComplaintAudUid the new value for noteComplaintAudUid
     */
    public void setNoteComplaintAudUid(int aNoteComplaintAudUid) {
        noteComplaintAudUid = aNoteComplaintAudUid;
    }

    /**
     * Access method for noteComplaintUid.
     *
     * @return the current value of noteComplaintUid
     */
    public int getNoteComplaintUid() {
        return noteComplaintUid;
    }

    /**
     * Setter method for noteComplaintUid.
     *
     * @param aNoteComplaintUid the new value for noteComplaintUid
     */
    public void setNoteComplaintUid(int aNoteComplaintUid) {
        noteComplaintUid = aNoteComplaintUid;
    }

    /**
     * Access method for noteCategoryUid.
     *
     * @return the current value of noteCategoryUid
     */
    public int getNoteCategoryUid() {
        return noteCategoryUid;
    }

    /**
     * Setter method for noteCategoryUid.
     *
     * @param aNoteCategoryUid the new value for noteCategoryUid
     */
    public void setNoteCategoryUid(int aNoteCategoryUid) {
        noteCategoryUid = aNoteCategoryUid;
    }

    /**
     * Access method for noteTypeUid.
     *
     * @return the current value of noteTypeUid
     */
    public int getNoteTypeUid() {
        return noteTypeUid;
    }

    /**
     * Setter method for noteTypeUid.
     *
     * @param aNoteTypeUid the new value for noteTypeUid
     */
    public void setNoteTypeUid(int aNoteTypeUid) {
        noteTypeUid = aNoteTypeUid;
    }

    /**
     * Access method for complaintTopicsUid.
     *
     * @return the current value of complaintTopicsUid
     */
    public int getComplaintTopicsUid() {
        return complaintTopicsUid;
    }

    /**
     * Setter method for complaintTopicsUid.
     *
     * @param aComplaintTopicsUid the new value for complaintTopicsUid
     */
    public void setComplaintTopicsUid(int aComplaintTopicsUid) {
        complaintTopicsUid = aComplaintTopicsUid;
    }

    /**
     * Access method for complaintStatusUid.
     *
     * @return the current value of complaintStatusUid
     */
    public int getComplaintStatusUid() {
        return complaintStatusUid;
    }

    /**
     * Setter method for complaintStatusUid.
     *
     * @param aComplaintStatusUid the new value for complaintStatusUid
     */
    public void setComplaintStatusUid(int aComplaintStatusUid) {
        complaintStatusUid = aComplaintStatusUid;
    }

    /**
     * Access method for complaintPriorityTypeUid.
     *
     * @return the current value of complaintPriorityTypeUid
     */
    public int getComplaintPriorityTypeUid() {
        return complaintPriorityTypeUid;
    }

    /**
     * Setter method for complaintPriorityTypeUid.
     *
     * @param aComplaintPriorityTypeUid the new value for complaintPriorityTypeUid
     */
    public void setComplaintPriorityTypeUid(int aComplaintPriorityTypeUid) {
        complaintPriorityTypeUid = aComplaintPriorityTypeUid;
    }

    /**
     * Access method for parentUid.
     *
     * @return the current value of parentUid
     */
    public int getParentUid() {
        return parentUid;
    }

    /**
     * Setter method for parentUid.
     *
     * @param aParentUid the new value for parentUid
     */
    public void setParentUid(int aParentUid) {
        parentUid = aParentUid;
    }

    /**
     * Access method for subject.
     *
     * @return the current value of subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Setter method for subject.
     *
     * @param aSubject the new value for subject
     */
    public void setSubject(String aSubject) {
        subject = aSubject;
    }

    /**
     * Access method for noteText.
     *
     * @return the current value of noteText
     */
    public String getNoteText() {
        return noteText;
    }

    /**
     * Setter method for noteText.
     *
     * @param aNoteText the new value for noteText
     */
    public void setNoteText(String aNoteText) {
        noteText = aNoteText;
    }

    /**
     * Access method for msgStartDatetime.
     *
     * @return the current value of msgStartDatetime
     */
    public Timestamp getMsgStartDatetime() {
        return msgStartDatetime;
    }

    /**
     * Setter method for msgStartDatetime.
     *
     * @param aMsgStartDatetime the new value for msgStartDatetime
     */
    public void setMsgStartDatetime(Timestamp aMsgStartDatetime) {
        msgStartDatetime = aMsgStartDatetime;
    }

    /**
     * Access method for msgEndDatetime.
     *
     * @return the current value of msgEndDatetime
     */
    public Timestamp getMsgEndDatetime() {
        return msgEndDatetime;
    }

    /**
     * Setter method for msgEndDatetime.
     *
     * @param aMsgEndDatetime the new value for msgEndDatetime
     */
    public void setMsgEndDatetime(Timestamp aMsgEndDatetime) {
        msgEndDatetime = aMsgEndDatetime;
    }

    /**
     * Access method for terminalUid.
     *
     * @return the current value of terminalUid
     */
    public int getTerminalUid() {
        return terminalUid;
    }

    /**
     * Setter method for terminalUid.
     *
     * @param aTerminalUid the new value for terminalUid
     */
    public void setTerminalUid(int aTerminalUid) {
        terminalUid = aTerminalUid;
    }

    /**
     * Access method for companyUid.
     *
     * @return the current value of companyUid
     */
    public int getCompanyUid() {
        return companyUid;
    }

    /**
     * Setter method for companyUid.
     *
     * @param aCompanyUid the new value for companyUid
     */
    public void setCompanyUid(int aCompanyUid) {
        companyUid = aCompanyUid;
    }

    /**
     * Access method for truUid.
     *
     * @return the current value of truUid
     */
    public int getTruUid() {
        return truUid;
    }

    /**
     * Setter method for truUid.
     *
     * @param aTruUid the new value for truUid
     */
    public void setTruUid(int aTruUid) {
        truUid = aTruUid;
    }

    /**
     * Access method for vehicleUid.
     *
     * @return the current value of vehicleUid
     */
    public int getVehicleUid() {
        return vehicleUid;
    }

    /**
     * Setter method for vehicleUid.
     *
     * @param aVehicleUid the new value for vehicleUid
     */
    public void setVehicleUid(int aVehicleUid) {
        vehicleUid = aVehicleUid;
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
     * Compares the key for this instance with another NoteComplaintAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class NoteComplaintAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof NoteComplaintAud)) {
            return false;
        }
        NoteComplaintAud that = (NoteComplaintAud) other;
        if (this.getNoteComplaintAudUid() != that.getNoteComplaintAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another NoteComplaintAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof NoteComplaintAud)) return false;
        return this.equalKeys(other) && ((NoteComplaintAud)other).equalKeys(this);
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
        i = getNoteComplaintAudUid();
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
        StringBuffer sb = new StringBuffer("[NoteComplaintAud |");
        sb.append(" noteComplaintAudUid=").append(getNoteComplaintAudUid());
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
        ret.put("noteComplaintAudUid", Integer.valueOf(getNoteComplaintAudUid()));
        return ret;
    }

}
