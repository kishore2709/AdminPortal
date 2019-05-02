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

@Entity(name="terminal")
public class Terminal implements Serializable {

    /** Primary key. */
    protected static final String PK = "terminalUid";

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
    @Column(name="Terminal_UID", unique=true, nullable=false, precision=10)
    private int terminalUid;
    @Column(name="Terminal_Name", nullable=false, length=45)
    private String terminalName;
    @Column(name="Terminal_Description", length=256)
    private String terminalDescription;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Company_UID", nullable=false)
    private Company company;
    @OneToMany(mappedBy="terminal")
    private Set<Address> address;
    @OneToMany(mappedBy="terminal")
    private Set<Contact> contact;
    @OneToMany(mappedBy="terminal")
    private Set<NoteComplaints> noteComplaints;
    @OneToMany(mappedBy="terminal")
    private Set<TerminalTruRelation> terminalTruRelation;
    @ManyToOne
    @JoinColumn(name="Terminal_Type_UID")
    private TerminalType terminalType;

    /** Default constructor. */
    public Terminal() {
        super();
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
     * Access method for terminalName.
     *
     * @return the current value of terminalName
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * Setter method for terminalName.
     *
     * @param aTerminalName the new value for terminalName
     */
    public void setTerminalName(String aTerminalName) {
        terminalName = aTerminalName;
    }

    /**
     * Access method for terminalDescription.
     *
     * @return the current value of terminalDescription
     */
    public String getTerminalDescription() {
        return terminalDescription;
    }

    /**
     * Setter method for terminalDescription.
     *
     * @param aTerminalDescription the new value for terminalDescription
     */
    public void setTerminalDescription(String aTerminalDescription) {
        terminalDescription = aTerminalDescription;
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
     * Access method for contact.
     *
     * @return the current value of contact
     */
    public Set<Contact> getContact() {
        return contact;
    }

    /**
     * Setter method for contact.
     *
     * @param aContact the new value for contact
     */
    public void setContact(Set<Contact> aContact) {
        contact = aContact;
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
     * Access method for terminalTruRelation.
     *
     * @return the current value of terminalTruRelation
     */
    public Set<TerminalTruRelation> getTerminalTruRelation() {
        return terminalTruRelation;
    }

    /**
     * Setter method for terminalTruRelation.
     *
     * @param aTerminalTruRelation the new value for terminalTruRelation
     */
    public void setTerminalTruRelation(Set<TerminalTruRelation> aTerminalTruRelation) {
        terminalTruRelation = aTerminalTruRelation;
    }

    /**
     * Access method for terminalType.
     *
     * @return the current value of terminalType
     */
    public TerminalType getTerminalType() {
        return terminalType;
    }

    /**
     * Setter method for terminalType.
     *
     * @param aTerminalType the new value for terminalType
     */
    public void setTerminalType(TerminalType aTerminalType) {
        terminalType = aTerminalType;
    }

    /**
     * Compares the key for this instance with another Terminal.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Terminal and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Terminal)) {
            return false;
        }
        Terminal that = (Terminal) other;
        if (this.getTerminalUid() != that.getTerminalUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Terminal.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Terminal)) return false;
        return this.equalKeys(other) && ((Terminal)other).equalKeys(this);
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
        i = getTerminalUid();
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
        StringBuffer sb = new StringBuffer("[Terminal |");
        sb.append(" terminalUid=").append(getTerminalUid());
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
        ret.put("terminalUid", Integer.valueOf(getTerminalUid()));
        return ret;
    }

}
