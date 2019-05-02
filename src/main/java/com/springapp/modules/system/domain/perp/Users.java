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

@Entity(name="users")
public class Users implements Serializable {

    /** Primary key. */
    protected static final String PK = "usersUid";

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
    @Column(name="Users_UID", unique=true, nullable=false, precision=10)
    private int usersUid;
    @Column(name="Username", nullable=false, length=45)
    private String username;
    @Column(name="Password", nullable=false, length=64)
    private String password;
    @Column(name="Fullname", nullable=false, length=60)
    private String fullname;
    @Column(name="First_name", nullable=false, length=20)
    private String firstName;
    @Column(name="Last_name", nullable=false, length=40)
    private String lastName;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="company_name", length=145)
    private String companyName;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="WS_Status", precision=10)
    private int wsStatus;
    @Column(name="WS_Last_Called_Date")
    private Timestamp wsLastCalledDate;
    @Column(name="Engineer_Flag", nullable=false, length=1)
    private String engineerFlag;
    @Column(name="Processor_Flag", nullable=false, length=1)
    private String processorFlag;
    @OneToMany(mappedBy="users")
    private Set<PerpApplications> perpApplications;
    @OneToMany(mappedBy="users2")
    private Set<PerpApplications> perpApplications2;
    @ManyToOne
    @JoinColumn(name="Company_UID")
    private Company company;
    @ManyToOne
    @JoinColumn(name="District_UID")
    private DistrictCodes districtCodes;
    @ManyToOne
    @JoinColumn(name="Salutation_Type_UID")
    private SalutationType salutationType;
    @OneToMany(mappedBy="users2")
    private Set<ComplianceInformation> complianceInformation2;
    @OneToMany(mappedBy="users")
    private Set<Address> address;
    @OneToMany(mappedBy="users2")
    private Set<Inspections> inspections2;
    @OneToMany(mappedBy="users")
    private Set<ComplianceInformation> complianceInformation;
    @OneToMany(mappedBy="users")
    private Set<Email> email;
    @OneToMany(mappedBy="users")
    private Set<Inspections> inspections;
    @OneToMany(mappedBy="users")
    private Set<PerpDocuments> perpDocuments;
    @OneToMany(mappedBy="users")
    private Set<Phone> phone;
    @OneToMany(mappedBy="users")
    private Set<UserCompanyPrograms> userCompanyPrograms;
    @OneToMany(mappedBy="users")
    private Set<UserRole> userRole;
    @OneToMany(mappedBy="users")
    private Set<UserSecurity> userSecurity;
    @ManyToOne(optional=false)
    @JoinColumn(name="User_Type_UID", nullable=false)
    private UserType userType;

    /** Default constructor. */
    public Users() {
        super();
    }

    /**
     * Access method for usersUid.
     *
     * @return the current value of usersUid
     */
    public int getUsersUid() {
        return usersUid;
    }

    /**
     * Setter method for usersUid.
     *
     * @param aUsersUid the new value for usersUid
     */
    public void setUsersUid(int aUsersUid) {
        usersUid = aUsersUid;
    }

    /**
     * Access method for username.
     *
     * @return the current value of username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Setter method for username.
     *
     * @param aUsername the new value for username
     */
    public void setUsername(String aUsername) {
        username = aUsername;
    }

    /**
     * Access method for password.
     *
     * @return the current value of password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setter method for password.
     *
     * @param aPassword the new value for password
     */
    public void setPassword(String aPassword) {
        password = aPassword;
    }

    /**
     * Access method for fullname.
     *
     * @return the current value of fullname
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * Setter method for fullname.
     *
     * @param aFullname the new value for fullname
     */
    public void setFullname(String aFullname) {
        fullname = aFullname;
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
     * Access method for companyName.
     *
     * @return the current value of companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Setter method for companyName.
     *
     * @param aCompanyName the new value for companyName
     */
    public void setCompanyName(String aCompanyName) {
        companyName = aCompanyName;
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
     * Access method for wsStatus.
     *
     * @return the current value of wsStatus
     */
    public int getWsStatus() {
        return wsStatus;
    }

    /**
     * Setter method for wsStatus.
     *
     * @param aWsStatus the new value for wsStatus
     */
    public void setWsStatus(int aWsStatus) {
        wsStatus = aWsStatus;
    }

    /**
     * Access method for wsLastCalledDate.
     *
     * @return the current value of wsLastCalledDate
     */
    public Timestamp getWsLastCalledDate() {
        return wsLastCalledDate;
    }

    /**
     * Setter method for wsLastCalledDate.
     *
     * @param aWsLastCalledDate the new value for wsLastCalledDate
     */
    public void setWsLastCalledDate(Timestamp aWsLastCalledDate) {
        wsLastCalledDate = aWsLastCalledDate;
    }

    /**
     * Access method for engineerFlag.
     *
     * @return the current value of engineerFlag
     */
    public String getEngineerFlag() {
        return engineerFlag;
    }

    /**
     * Setter method for engineerFlag.
     *
     * @param aEngineerFlag the new value for engineerFlag
     */
    public void setEngineerFlag(String aEngineerFlag) {
        engineerFlag = aEngineerFlag;
    }

    /**
     * Access method for processorFlag.
     *
     * @return the current value of processorFlag
     */
    public String getProcessorFlag() {
        return processorFlag;
    }

    /**
     * Setter method for processorFlag.
     *
     * @param aProcessorFlag the new value for processorFlag
     */
    public void setProcessorFlag(String aProcessorFlag) {
        processorFlag = aProcessorFlag;
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
     * Access method for perpApplications2.
     *
     * @return the current value of perpApplications2
     */
    public Set<PerpApplications> getPerpApplications2() {
        return perpApplications2;
    }

    /**
     * Setter method for perpApplications2.
     *
     * @param aPerpApplications2 the new value for perpApplications2
     */
    public void setPerpApplications2(Set<PerpApplications> aPerpApplications2) {
        perpApplications2 = aPerpApplications2;
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
     * Access method for complianceInformation2.
     *
     * @return the current value of complianceInformation2
     */
    public Set<ComplianceInformation> getComplianceInformation2() {
        return complianceInformation2;
    }

    /**
     * Setter method for complianceInformation2.
     *
     * @param aComplianceInformation2 the new value for complianceInformation2
     */
    public void setComplianceInformation2(Set<ComplianceInformation> aComplianceInformation2) {
        complianceInformation2 = aComplianceInformation2;
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
     * Access method for inspections2.
     *
     * @return the current value of inspections2
     */
    public Set<Inspections> getInspections2() {
        return inspections2;
    }

    /**
     * Setter method for inspections2.
     *
     * @param aInspections2 the new value for inspections2
     */
    public void setInspections2(Set<Inspections> aInspections2) {
        inspections2 = aInspections2;
    }

    /**
     * Access method for complianceInformation.
     *
     * @return the current value of complianceInformation
     */
    public Set<ComplianceInformation> getComplianceInformation() {
        return complianceInformation;
    }

    /**
     * Setter method for complianceInformation.
     *
     * @param aComplianceInformation the new value for complianceInformation
     */
    public void setComplianceInformation(Set<ComplianceInformation> aComplianceInformation) {
        complianceInformation = aComplianceInformation;
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
     * Access method for inspections.
     *
     * @return the current value of inspections
     */
    public Set<Inspections> getInspections() {
        return inspections;
    }

    /**
     * Setter method for inspections.
     *
     * @param aInspections the new value for inspections
     */
    public void setInspections(Set<Inspections> aInspections) {
        inspections = aInspections;
    }

    /**
     * Access method for perpDocuments.
     *
     * @return the current value of perpDocuments
     */
    public Set<PerpDocuments> getPerpDocuments() {
        return perpDocuments;
    }

    /**
     * Setter method for perpDocuments.
     *
     * @param aPerpDocuments the new value for perpDocuments
     */
    public void setPerpDocuments(Set<PerpDocuments> aPerpDocuments) {
        perpDocuments = aPerpDocuments;
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
     * Access method for userCompanyPrograms.
     *
     * @return the current value of userCompanyPrograms
     */
    public Set<UserCompanyPrograms> getUserCompanyPrograms() {
        return userCompanyPrograms;
    }

    /**
     * Setter method for userCompanyPrograms.
     *
     * @param aUserCompanyPrograms the new value for userCompanyPrograms
     */
    public void setUserCompanyPrograms(Set<UserCompanyPrograms> aUserCompanyPrograms) {
        userCompanyPrograms = aUserCompanyPrograms;
    }

    /**
     * Access method for userRole.
     *
     * @return the current value of userRole
     */
    public Set<UserRole> getUserRole() {
        return userRole;
    }

    /**
     * Setter method for userRole.
     *
     * @param aUserRole the new value for userRole
     */
    public void setUserRole(Set<UserRole> aUserRole) {
        userRole = aUserRole;
    }

    /**
     * Access method for userSecurity.
     *
     * @return the current value of userSecurity
     */
    public Set<UserSecurity> getUserSecurity() {
        return userSecurity;
    }

    /**
     * Setter method for userSecurity.
     *
     * @param aUserSecurity the new value for userSecurity
     */
    public void setUserSecurity(Set<UserSecurity> aUserSecurity) {
        userSecurity = aUserSecurity;
    }

    /**
     * Access method for userType.
     *
     * @return the current value of userType
     */
    public UserType getUserType() {
        return userType;
    }

    /**
     * Setter method for userType.
     *
     * @param aUserType the new value for userType
     */
    public void setUserType(UserType aUserType) {
        userType = aUserType;
    }

    /**
     * Compares the key for this instance with another Users.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Users and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Users)) {
            return false;
        }
        Users that = (Users) other;
        if (this.getUsersUid() != that.getUsersUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Users.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Users)) return false;
        return this.equalKeys(other) && ((Users)other).equalKeys(this);
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
        i = getUsersUid();
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
        StringBuffer sb = new StringBuffer("[Users |");
        sb.append(" usersUid=").append(getUsersUid());
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
        ret.put("usersUid", Integer.valueOf(getUsersUid()));
        return ret;
    }

}
