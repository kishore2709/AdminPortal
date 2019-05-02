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

@Entity(name="note_complaints")
public class NoteComplaints implements Serializable {

    /** Primary key. */
    protected static final String PK = "noteComplaintUid";

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
    @Column(name="NoteComplaint_UID", unique=true, nullable=false, precision=10)
    private int noteComplaintUid;
    @Column(name="Subject", length=128)
    private String subject;
    @Column(name="Note_Text", nullable=false, length=2000)
    private String noteText;
    @Column(name="Msg_Start_Datetime")
    private Timestamp msgStartDatetime;
    @Column(name="Msg_End_Datetime")
    private Timestamp msgEndDatetime;
    @Column(name="Email_Address", length=128)
    private String emailAddress;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne
    @JoinColumn(name="AppTrans_UID")
    private AppTransactions appTransactions;
    @ManyToOne
    @JoinColumn(name="Company_UID")
    private Company company;
    @ManyToOne
    @JoinColumn(name="Complaint_Priority_Type_UID")
    private ComplaintPriorityType complaintPriorityType;
    @ManyToOne
    @JoinColumn(name="Complaint_Status_UID")
    private ComplaintStatus complaintStatus;
    @ManyToOne
    @JoinColumn(name="Complaint_Topics_UID")
    private ComplaintTopics complaintTopics;
    @ManyToOne(optional=false)
    @JoinColumn(name="Note_Category_UID", nullable=false)
    private NoteCategory noteCategory;
    @OneToMany(mappedBy="noteComplaints")
    private Set<NoteAttachment> noteAttachment;
    @OneToMany(mappedBy="noteComplaints2")
    private Set<NoteComplaints> noteComplaints3;
    @ManyToOne
    @JoinColumn(name="Parent_UID")
    private NoteComplaints noteComplaints2;
    @ManyToOne(optional=false)
    @JoinColumn(name="Note_Type_UID", nullable=false)
    private NoteType noteType;
    @ManyToOne
    @JoinColumn(name="Application_UID")
    private PerpApplications perpApplications;
    @ManyToOne
    @JoinColumn(name="RegItem_UID")
    private RegistrationItems registrationItems;
    @ManyToOne
    @JoinColumn(name="SO_UID")
    private SecurityObjects securityObjects;
    @ManyToOne
    @JoinColumn(name="Terminal_UID")
    private Terminal terminal;
    @ManyToOne
    @JoinColumn(name="Vehicle_UID")
    private Vehicle vehicle;

    /** Default constructor. */
    public NoteComplaints() {
        super();
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
     * Access method for emailAddress.
     *
     * @return the current value of emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Setter method for emailAddress.
     *
     * @param aEmailAddress the new value for emailAddress
     */
    public void setEmailAddress(String aEmailAddress) {
        emailAddress = aEmailAddress;
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
     * Access method for appTransactions.
     *
     * @return the current value of appTransactions
     */
    public AppTransactions getAppTransactions() {
        return appTransactions;
    }

    /**
     * Setter method for appTransactions.
     *
     * @param aAppTransactions the new value for appTransactions
     */
    public void setAppTransactions(AppTransactions aAppTransactions) {
        appTransactions = aAppTransactions;
    }

    /**
     * Access method for company.
     *
     * @return the current value of company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Setter method for company.
     *
     * @param aCompany the new value for company
     */
    public void setCompany(Company aCompany) {
        company = aCompany;
    }

    /**
     * Access method for complaintPriorityType.
     *
     * @return the current value of complaintPriorityType
     */
    public ComplaintPriorityType getComplaintPriorityType() {
        return complaintPriorityType;
    }

    /**
     * Setter method for complaintPriorityType.
     *
     * @param aComplaintPriorityType the new value for complaintPriorityType
     */
    public void setComplaintPriorityType(ComplaintPriorityType aComplaintPriorityType) {
        complaintPriorityType = aComplaintPriorityType;
    }

    /**
     * Access method for complaintStatus.
     *
     * @return the current value of complaintStatus
     */
    public ComplaintStatus getComplaintStatus() {
        return complaintStatus;
    }

    /**
     * Setter method for complaintStatus.
     *
     * @param aComplaintStatus the new value for complaintStatus
     */
    public void setComplaintStatus(ComplaintStatus aComplaintStatus) {
        complaintStatus = aComplaintStatus;
    }

    /**
     * Access method for complaintTopics.
     *
     * @return the current value of complaintTopics
     */
    public ComplaintTopics getComplaintTopics() {
        return complaintTopics;
    }

    /**
     * Setter method for complaintTopics.
     *
     * @param aComplaintTopics the new value for complaintTopics
     */
    public void setComplaintTopics(ComplaintTopics aComplaintTopics) {
        complaintTopics = aComplaintTopics;
    }

    /**
     * Access method for noteCategory.
     *
     * @return the current value of noteCategory
     */
    public NoteCategory getNoteCategory() {
        return noteCategory;
    }

    /**
     * Setter method for noteCategory.
     *
     * @param aNoteCategory the new value for noteCategory
     */
    public void setNoteCategory(NoteCategory aNoteCategory) {
        noteCategory = aNoteCategory;
    }

    /**
     * Access method for noteAttachment.
     *
     * @return the current value of noteAttachment
     */
    public Set<NoteAttachment> getNoteAttachment() {
        return noteAttachment;
    }

    /**
     * Setter method for noteAttachment.
     *
     * @param aNoteAttachment the new value for noteAttachment
     */
    public void setNoteAttachment(Set<NoteAttachment> aNoteAttachment) {
        noteAttachment = aNoteAttachment;
    }

    /**
     * Access method for noteComplaints3.
     *
     * @return the current value of noteComplaints3
     */
    public Set<NoteComplaints> getNoteComplaints3() {
        return noteComplaints3;
    }

    /**
     * Setter method for noteComplaints3.
     *
     * @param aNoteComplaints3 the new value for noteComplaints3
     */
    public void setNoteComplaints3(Set<NoteComplaints> aNoteComplaints3) {
        noteComplaints3 = aNoteComplaints3;
    }

    /**
     * Access method for noteComplaints2.
     *
     * @return the current value of noteComplaints2
     */
    public NoteComplaints getNoteComplaints2() {
        return noteComplaints2;
    }

    /**
     * Setter method for noteComplaints2.
     *
     * @param aNoteComplaints2 the new value for noteComplaints2
     */
    public void setNoteComplaints2(NoteComplaints aNoteComplaints2) {
        noteComplaints2 = aNoteComplaints2;
    }

    /**
     * Access method for noteType.
     *
     * @return the current value of noteType
     */
    public NoteType getNoteType() {
        return noteType;
    }

    /**
     * Setter method for noteType.
     *
     * @param aNoteType the new value for noteType
     */
    public void setNoteType(NoteType aNoteType) {
        noteType = aNoteType;
    }

    /**
     * Access method for perpApplications.
     *
     * @return the current value of perpApplications
     */
    public PerpApplications getPerpApplications() {
        return perpApplications;
    }

    /**
     * Setter method for perpApplications.
     *
     * @param aPerpApplications the new value for perpApplications
     */
    public void setPerpApplications(PerpApplications aPerpApplications) {
        perpApplications = aPerpApplications;
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
     * Access method for securityObjects.
     *
     * @return the current value of securityObjects
     */
    public SecurityObjects getSecurityObjects() {
        return securityObjects;
    }

    /**
     * Setter method for securityObjects.
     *
     * @param aSecurityObjects the new value for securityObjects
     */
    public void setSecurityObjects(SecurityObjects aSecurityObjects) {
        securityObjects = aSecurityObjects;
    }

    /**
     * Access method for terminal.
     *
     * @return the current value of terminal
     */
    public Terminal getTerminal() {
        return terminal;
    }

    /**
     * Setter method for terminal.
     *
     * @param aTerminal the new value for terminal
     */
    public void setTerminal(Terminal aTerminal) {
        terminal = aTerminal;
    }

    /**
     * Access method for vehicle.
     *
     * @return the current value of vehicle
     */
    public Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * Setter method for vehicle.
     *
     * @param aVehicle the new value for vehicle
     */
    public void setVehicle(Vehicle aVehicle) {
        vehicle = aVehicle;
    }

    /**
     * Compares the key for this instance with another NoteComplaints.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class NoteComplaints and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof NoteComplaints)) {
            return false;
        }
        NoteComplaints that = (NoteComplaints) other;
        if (this.getNoteComplaintUid() != that.getNoteComplaintUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another NoteComplaints.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof NoteComplaints)) return false;
        return this.equalKeys(other) && ((NoteComplaints)other).equalKeys(this);
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
        i = getNoteComplaintUid();
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
        StringBuffer sb = new StringBuffer("[NoteComplaints |");
        sb.append(" noteComplaintUid=").append(getNoteComplaintUid());
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
        ret.put("noteComplaintUid", Integer.valueOf(getNoteComplaintUid()));
        return ret;
    }

}
