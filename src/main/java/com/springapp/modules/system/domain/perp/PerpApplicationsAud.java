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

@Entity(name="perp_applications_aud")
public class PerpApplicationsAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "paAudUid";

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
    @Column(name="PAAud_UID", unique=true, nullable=false, precision=10)
    private int paAudUid;
    @Column(name="Application_UID", nullable=false, precision=10)
    private int applicationUid;
    @Column(name="Company_UID", nullable=false, precision=10)
    private int companyUid;
    @Column(name="AssignedStaffUser_UID", precision=10)
    private int assignedStaffUserUid;
    @Column(name="AssignedStaffUser_Date")
    private Timestamp assignedStaffUserDate;
    @Column(name="AssignedEngineerUser_UID", precision=10)
    private int assignedEngineerUserUid;
    @Column(name="AssignedEngineerUser_Date")
    private Timestamp assignedEngineerUserDate;
    @Column(name="ResponsibleParty_UID", precision=10)
    private int responsiblePartyUid;
    @Column(name="AppStatus_UID", precision=10)
    private int appStatusUid;
    @Column(name="Location", length=128)
    private String location;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public PerpApplicationsAud() {
        super();
    }

    /**
     * Access method for paAudUid.
     *
     * @return the current value of paAudUid
     */
    public int getPaAudUid() {
        return paAudUid;
    }

    /**
     * Setter method for paAudUid.
     *
     * @param aPaAudUid the new value for paAudUid
     */
    public void setPaAudUid(int aPaAudUid) {
        paAudUid = aPaAudUid;
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
     * Access method for assignedStaffUserUid.
     *
     * @return the current value of assignedStaffUserUid
     */
    public int getAssignedStaffUserUid() {
        return assignedStaffUserUid;
    }

    /**
     * Setter method for assignedStaffUserUid.
     *
     * @param aAssignedStaffUserUid the new value for assignedStaffUserUid
     */
    public void setAssignedStaffUserUid(int aAssignedStaffUserUid) {
        assignedStaffUserUid = aAssignedStaffUserUid;
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
     * Access method for assignedEngineerUserUid.
     *
     * @return the current value of assignedEngineerUserUid
     */
    public int getAssignedEngineerUserUid() {
        return assignedEngineerUserUid;
    }

    /**
     * Setter method for assignedEngineerUserUid.
     *
     * @param aAssignedEngineerUserUid the new value for assignedEngineerUserUid
     */
    public void setAssignedEngineerUserUid(int aAssignedEngineerUserUid) {
        assignedEngineerUserUid = aAssignedEngineerUserUid;
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
     * Access method for responsiblePartyUid.
     *
     * @return the current value of responsiblePartyUid
     */
    public int getResponsiblePartyUid() {
        return responsiblePartyUid;
    }

    /**
     * Setter method for responsiblePartyUid.
     *
     * @param aResponsiblePartyUid the new value for responsiblePartyUid
     */
    public void setResponsiblePartyUid(int aResponsiblePartyUid) {
        responsiblePartyUid = aResponsiblePartyUid;
    }

    /**
     * Access method for appStatusUid.
     *
     * @return the current value of appStatusUid
     */
    public int getAppStatusUid() {
        return appStatusUid;
    }

    /**
     * Setter method for appStatusUid.
     *
     * @param aAppStatusUid the new value for appStatusUid
     */
    public void setAppStatusUid(int aAppStatusUid) {
        appStatusUid = aAppStatusUid;
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
     * Compares the key for this instance with another PerpApplicationsAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PerpApplicationsAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PerpApplicationsAud)) {
            return false;
        }
        PerpApplicationsAud that = (PerpApplicationsAud) other;
        if (this.getPaAudUid() != that.getPaAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PerpApplicationsAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PerpApplicationsAud)) return false;
        return this.equalKeys(other) && ((PerpApplicationsAud)other).equalKeys(this);
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
        i = getPaAudUid();
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
        StringBuffer sb = new StringBuffer("[PerpApplicationsAud |");
        sb.append(" paAudUid=").append(getPaAudUid());
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
        ret.put("paAudUid", Integer.valueOf(getPaAudUid()));
        return ret;
    }

}
