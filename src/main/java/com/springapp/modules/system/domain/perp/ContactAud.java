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

@Entity(name="contact_aud")
public class ContactAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "contactAudUid";

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
    @Column(name="Contact_Aud_UID", unique=true, nullable=false, precision=10)
    private int contactAudUid;
    @Column(name="Contact_UID", nullable=false, precision=10)
    private int contactUid;
    @Column(name="Contact_Type_UID", nullable=false, precision=10)
    private int contactTypeUid;
    @Column(name="Company_UID", precision=10)
    private int companyUid;
    @Column(name="Terminal_UID", precision=10)
    private int terminalUid;
    @Column(name="Compliance_Information_UID", precision=10)
    private int complianceInformationUid;
    @Column(name="Sold_UID", precision=10)
    private int soldUid;
    @Column(name="Contact_Name", nullable=false, length=60)
    private String contactName;
    @Column(name="First_Name", length=20)
    private String firstName;
    @Column(name="Last_Name", length=40)
    private String lastName;
    @Column(name="Contact_Title", length=60)
    private String contactTitle;
    @Column(name="Salutation_Type_UID", length=5)
    private String salutationTypeUid;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;
    @Column(name="District_UID", precision=10)
    private int districtUid;

    /** Default constructor. */
    public ContactAud() {
        super();
    }

    /**
     * Access method for contactAudUid.
     *
     * @return the current value of contactAudUid
     */
    public int getContactAudUid() {
        return contactAudUid;
    }

    /**
     * Setter method for contactAudUid.
     *
     * @param aContactAudUid the new value for contactAudUid
     */
    public void setContactAudUid(int aContactAudUid) {
        contactAudUid = aContactAudUid;
    }

    /**
     * Access method for contactUid.
     *
     * @return the current value of contactUid
     */
    public int getContactUid() {
        return contactUid;
    }

    /**
     * Setter method for contactUid.
     *
     * @param aContactUid the new value for contactUid
     */
    public void setContactUid(int aContactUid) {
        contactUid = aContactUid;
    }

    /**
     * Access method for contactTypeUid.
     *
     * @return the current value of contactTypeUid
     */
    public int getContactTypeUid() {
        return contactTypeUid;
    }

    /**
     * Setter method for contactTypeUid.
     *
     * @param aContactTypeUid the new value for contactTypeUid
     */
    public void setContactTypeUid(int aContactTypeUid) {
        contactTypeUid = aContactTypeUid;
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
     * Access method for complianceInformationUid.
     *
     * @return the current value of complianceInformationUid
     */
    public int getComplianceInformationUid() {
        return complianceInformationUid;
    }

    /**
     * Setter method for complianceInformationUid.
     *
     * @param aComplianceInformationUid the new value for complianceInformationUid
     */
    public void setComplianceInformationUid(int aComplianceInformationUid) {
        complianceInformationUid = aComplianceInformationUid;
    }

    /**
     * Access method for soldUid.
     *
     * @return the current value of soldUid
     */
    public int getSoldUid() {
        return soldUid;
    }

    /**
     * Setter method for soldUid.
     *
     * @param aSoldUid the new value for soldUid
     */
    public void setSoldUid(int aSoldUid) {
        soldUid = aSoldUid;
    }

    /**
     * Access method for contactName.
     *
     * @return the current value of contactName
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Setter method for contactName.
     *
     * @param aContactName the new value for contactName
     */
    public void setContactName(String aContactName) {
        contactName = aContactName;
    }

    /**
     * Access method for firstName.
     *
     * @return the current value of firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter method for firstName.
     *
     * @param aFirstName the new value for firstName
     */
    public void setFirstName(String aFirstName) {
        firstName = aFirstName;
    }

    /**
     * Access method for lastName.
     *
     * @return the current value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter method for lastName.
     *
     * @param aLastName the new value for lastName
     */
    public void setLastName(String aLastName) {
        lastName = aLastName;
    }

    /**
     * Access method for contactTitle.
     *
     * @return the current value of contactTitle
     */
    public String getContactTitle() {
        return contactTitle;
    }

    /**
     * Setter method for contactTitle.
     *
     * @param aContactTitle the new value for contactTitle
     */
    public void setContactTitle(String aContactTitle) {
        contactTitle = aContactTitle;
    }

    /**
     * Access method for salutationTypeUid.
     *
     * @return the current value of salutationTypeUid
     */
    public String getSalutationTypeUid() {
        return salutationTypeUid;
    }

    /**
     * Setter method for salutationTypeUid.
     *
     * @param aSalutationTypeUid the new value for salutationTypeUid
     */
    public void setSalutationTypeUid(String aSalutationTypeUid) {
        salutationTypeUid = aSalutationTypeUid;
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
     * Access method for districtUid.
     *
     * @return the current value of districtUid
     */
    public int getDistrictUid() {
        return districtUid;
    }

    /**
     * Setter method for districtUid.
     *
     * @param aDistrictUid the new value for districtUid
     */
    public void setDistrictUid(int aDistrictUid) {
        districtUid = aDistrictUid;
    }

    /**
     * Compares the key for this instance with another ContactAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ContactAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ContactAud)) {
            return false;
        }
        ContactAud that = (ContactAud) other;
        if (this.getContactAudUid() != that.getContactAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ContactAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ContactAud)) return false;
        return this.equalKeys(other) && ((ContactAud)other).equalKeys(this);
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
        i = getContactAudUid();
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
        StringBuffer sb = new StringBuffer("[ContactAud |");
        sb.append(" contactAudUid=").append(getContactAudUid());
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
        ret.put("contactAudUid", Integer.valueOf(getContactAudUid()));
        return ret;
    }

}
