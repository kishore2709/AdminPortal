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

@Entity(name="contact")
public class Contact implements Serializable {

    /** Primary key. */
    protected static final String PK = "contactUid";

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
    @Column(name="Contact_UID", unique=true, nullable=false, precision=10)
    private int contactUid;
    @Column(name="Contact_Name", nullable=false, length=60)
    private String contactName;
    @Column(name="First_Name", length=20)
    private String firstName;
    @Column(name="Last_Name", length=40)
    private String lastName;
    @Column(name="Contact_Title", length=60)
    private String contactTitle;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne
    @JoinColumn(name="Company_UID")
    private Company company;
    @ManyToOne
    @JoinColumn(name="Compliance_Information_UID")
    private ComplianceInformation complianceInformation;
    @OneToMany(mappedBy="contact")
    private Set<Address> address;
    @OneToMany(mappedBy="contact")
    private Set<Email> email;
    @OneToMany(mappedBy="contact")
    private Set<Phone> phone;
    @ManyToOne(optional=false)
    @JoinColumn(name="Contact_Type_UID", nullable=false)
    private ContactType contactType;
    @OneToMany(mappedBy="contact")
    private Set<AppTransactions> appTransactions;
    @ManyToOne
    @JoinColumn(name="District_UID")
    private DistrictCodes districtCodes;
    @OneToMany(mappedBy="contact")
    private Set<PerpApplications> perpApplications;
    @ManyToOne
    @JoinColumn(name="Salutation_Type_UID")
    private SalutationType salutationType;
    @ManyToOne
    @JoinColumn(name="Sold_UID")
    private Sold sold;
    @ManyToOne
    @JoinColumn(name="Terminal_UID")
    private Terminal terminal;

    /** Default constructor. */
    public Contact() {
        super();
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
     * Access method for complianceInformation.
     *
     * @return the current value of complianceInformation
     */
    public ComplianceInformation getComplianceInformation() {
        return complianceInformation;
    }

    /**
     * Setter method for complianceInformation.
     *
     * @param aComplianceInformation the new value for complianceInformation
     */
    public void setComplianceInformation(ComplianceInformation aComplianceInformation) {
        complianceInformation = aComplianceInformation;
    }

    /**
     * Access method for address.
     *
     * @return the current value of address
     */
    public Set<Address> getAddress() {
        return address;
    }

    /**
     * Setter method for address.
     *
     * @param aAddress the new value for address
     */
    public void setAddress(Set<Address> aAddress) {
        address = aAddress;
    }

    /**
     * Access method for email.
     *
     * @return the current value of email
     */
    public Set<Email> getEmail() {
        return email;
    }

    /**
     * Setter method for email.
     *
     * @param aEmail the new value for email
     */
    public void setEmail(Set<Email> aEmail) {
        email = aEmail;
    }

    /**
     * Access method for phone.
     *
     * @return the current value of phone
     */
    public Set<Phone> getPhone() {
        return phone;
    }

    /**
     * Setter method for phone.
     *
     * @param aPhone the new value for phone
     */
    public void setPhone(Set<Phone> aPhone) {
        phone = aPhone;
    }

    /**
     * Access method for contactType.
     *
     * @return the current value of contactType
     */
    public ContactType getContactType() {
        return contactType;
    }

    /**
     * Setter method for contactType.
     *
     * @param aContactType the new value for contactType
     */
    public void setContactType(ContactType aContactType) {
        contactType = aContactType;
    }

    /**
     * Access method for appTransactions.
     *
     * @return the current value of appTransactions
     */
    public Set<AppTransactions> getAppTransactions() {
        return appTransactions;
    }

    /**
     * Setter method for appTransactions.
     *
     * @param aAppTransactions the new value for appTransactions
     */
    public void setAppTransactions(Set<AppTransactions> aAppTransactions) {
        appTransactions = aAppTransactions;
    }

    /**
     * Access method for districtCodes.
     *
     * @return the current value of districtCodes
     */
    public DistrictCodes getDistrictCodes() {
        return districtCodes;
    }

    /**
     * Setter method for districtCodes.
     *
     * @param aDistrictCodes the new value for districtCodes
     */
    public void setDistrictCodes(DistrictCodes aDistrictCodes) {
        districtCodes = aDistrictCodes;
    }

    /**
     * Access method for perpApplications.
     *
     * @return the current value of perpApplications
     */
    public Set<PerpApplications> getPerpApplications() {
        return perpApplications;
    }

    /**
     * Setter method for perpApplications.
     *
     * @param aPerpApplications the new value for perpApplications
     */
    public void setPerpApplications(Set<PerpApplications> aPerpApplications) {
        perpApplications = aPerpApplications;
    }

    /**
     * Access method for salutationType.
     *
     * @return the current value of salutationType
     */
    public SalutationType getSalutationType() {
        return salutationType;
    }

    /**
     * Setter method for salutationType.
     *
     * @param aSalutationType the new value for salutationType
     */
    public void setSalutationType(SalutationType aSalutationType) {
        salutationType = aSalutationType;
    }

    /**
     * Access method for sold.
     *
     * @return the current value of sold
     */
    public Sold getSold() {
        return sold;
    }

    /**
     * Setter method for sold.
     *
     * @param aSold the new value for sold
     */
    public void setSold(Sold aSold) {
        sold = aSold;
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
     * Compares the key for this instance with another Contact.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Contact and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Contact)) {
            return false;
        }
        Contact that = (Contact) other;
        if (this.getContactUid() != that.getContactUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Contact.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Contact)) return false;
        return this.equalKeys(other) && ((Contact)other).equalKeys(this);
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
        i = getContactUid();
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
        StringBuffer sb = new StringBuffer("[Contact |");
        sb.append(" contactUid=").append(getContactUid());
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
        ret.put("contactUid", Integer.valueOf(getContactUid()));
        return ret;
    }

}
