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

@Entity(name="perp_applications")
public class PerpApplications implements Serializable {

    /** Primary key. */
    protected static final String PK = "applicationUid";

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
    @Column(name="Application_UID", unique=true, nullable=false, precision=10)
    private int applicationUid;
    @Column(name="AssignedStaffUser_Date")
    private Timestamp assignedStaffUserDate;
    @Column(name="AssignedEngineerUser_Date")
    private Timestamp assignedEngineerUserDate;
    @Column(name="Location", length=128)
    private String location;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne
    @JoinColumn(name="AppStatus_UID")
    private ApplicationStatus applicationStatus;
    @ManyToOne
    @JoinColumn(name="AssignedStaffUser_UID")
    private Users users;
    @ManyToOne
    @JoinColumn(name="AssignedEngineerUser_UID")
    private Users users2;
    @ManyToOne(optional=false)
    @JoinColumn(name="Company_UID", nullable=false)
    private Company company;
    @OneToMany(mappedBy="perpApplications")
    private Set<AppTransAssociation> appTransAssociation;
    @OneToMany(mappedBy="perpApplications")
    private Set<NoteComplaints> noteComplaints;
    @OneToMany(mappedBy="perpApplications")
    private Set<RegistrationItems> registrationItems;
    @ManyToOne
    @JoinColumn(name="ResponsibleParty_UID")
    private Contact contact;

    /** Default constructor. */
    public PerpApplications() {
        super();
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
     * Access method for assignedStaffUserDate.
     *
     * @return the current value of assignedStaffUserDate
     */
    public Timestamp getAssignedStaffUserDate() {
        return assignedStaffUserDate;
    }

    /**
     * Setter method for assignedStaffUserDate.
     *
     * @param aAssignedStaffUserDate the new value for assignedStaffUserDate
     */
    public void setAssignedStaffUserDate(Timestamp aAssignedStaffUserDate) {
        assignedStaffUserDate = aAssignedStaffUserDate;
    }

    /**
     * Access method for assignedEngineerUserDate.
     *
     * @return the current value of assignedEngineerUserDate
     */
    public Timestamp getAssignedEngineerUserDate() {
        return assignedEngineerUserDate;
    }

    /**
     * Setter method for assignedEngineerUserDate.
     *
     * @param aAssignedEngineerUserDate the new value for assignedEngineerUserDate
     */
    public void setAssignedEngineerUserDate(Timestamp aAssignedEngineerUserDate) {
        assignedEngineerUserDate = aAssignedEngineerUserDate;
    }

    /**
     * Access method for location.
     *
     * @return the current value of location
     */
    public String getLocation() {
        return location;
    }

    /**
     * Setter method for location.
     *
     * @param aLocation the new value for location
     */
    public void setLocation(String aLocation) {
        location = aLocation;
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
     * Access method for applicationStatus.
     *
     * @return the current value of applicationStatus
     */
    public ApplicationStatus getApplicationStatus() {
        return applicationStatus;
    }

    /**
     * Setter method for applicationStatus.
     *
     * @param aApplicationStatus the new value for applicationStatus
     */
    public void setApplicationStatus(ApplicationStatus aApplicationStatus) {
        applicationStatus = aApplicationStatus;
    }

    /**
     * Access method for users.
     *
     * @return the current value of users
     */
    public Users getUsers() {
        return users;
    }

    /**
     * Setter method for users.
     *
     * @param aUsers the new value for users
     */
    public void setUsers(Users aUsers) {
        users = aUsers;
    }

    /**
     * Access method for users2.
     *
     * @return the current value of users2
     */
    public Users getUsers2() {
        return users2;
    }

    /**
     * Setter method for users2.
     *
     * @param aUsers2 the new value for users2
     */
    public void setUsers2(Users aUsers2) {
        users2 = aUsers2;
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
     * Access method for appTransAssociation.
     *
     * @return the current value of appTransAssociation
     */
    public Set<AppTransAssociation> getAppTransAssociation() {
        return appTransAssociation;
    }

    /**
     * Setter method for appTransAssociation.
     *
     * @param aAppTransAssociation the new value for appTransAssociation
     */
    public void setAppTransAssociation(Set<AppTransAssociation> aAppTransAssociation) {
        appTransAssociation = aAppTransAssociation;
    }

    /**
     * Access method for noteComplaints.
     *
     * @return the current value of noteComplaints
     */
    public Set<NoteComplaints> getNoteComplaints() {
        return noteComplaints;
    }

    /**
     * Setter method for noteComplaints.
     *
     * @param aNoteComplaints the new value for noteComplaints
     */
    public void setNoteComplaints(Set<NoteComplaints> aNoteComplaints) {
        noteComplaints = aNoteComplaints;
    }

    /**
     * Access method for registrationItems.
     *
     * @return the current value of registrationItems
     */
    public Set<RegistrationItems> getRegistrationItems() {
        return registrationItems;
    }

    /**
     * Setter method for registrationItems.
     *
     * @param aRegistrationItems the new value for registrationItems
     */
    public void setRegistrationItems(Set<RegistrationItems> aRegistrationItems) {
        registrationItems = aRegistrationItems;
    }

    /**
     * Access method for contact.
     *
     * @return the current value of contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Setter method for contact.
     *
     * @param aContact the new value for contact
     */
    public void setContact(Contact aContact) {
        contact = aContact;
    }

    /**
     * Compares the key for this instance with another PerpApplications.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PerpApplications and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PerpApplications)) {
            return false;
        }
        PerpApplications that = (PerpApplications) other;
        if (this.getApplicationUid() != that.getApplicationUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PerpApplications.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PerpApplications)) return false;
        return this.equalKeys(other) && ((PerpApplications)other).equalKeys(this);
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
        i = getApplicationUid();
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
        StringBuffer sb = new StringBuffer("[PerpApplications |");
        sb.append(" applicationUid=").append(getApplicationUid());
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
        ret.put("applicationUid", Integer.valueOf(getApplicationUid()));
        return ret;
    }

}
