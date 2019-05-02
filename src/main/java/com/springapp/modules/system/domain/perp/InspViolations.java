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

@Entity(name="insp_violations")
public class InspViolations implements Serializable {

    /** Primary key. */
    protected static final String PK = "inspViolationUid";

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
    @Column(name="InspViolation_UID", unique=true, nullable=false, precision=10)
    private int inspViolationUid;
    @Column(name="Compliance_Flag", length=1)
    private String complianceFlag;
    @Column(name="Sections", length=50)
    private String sections;
    @Column(name="Section_Numbers", length=50)
    private String sectionNumbers;
    @Column(name="Violation_Description", length=512)
    private String violationDescription;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne
    @JoinColumn(name="Inspection_UID")
    private Inspections inspections;
    @ManyToOne
    @JoinColumn(name="InspViolationType_UID")
    private InspViolationTypes inspViolationTypes;

    /** Default constructor. */
    public InspViolations() {
        super();
    }

    /**
     * Access method for inspViolationUid.
     *
     * @return the current value of inspViolationUid
     */
    public int getInspViolationUid() {
        return inspViolationUid;
    }

    /**
     * Setter method for inspViolationUid.
     *
     * @param aInspViolationUid the new value for inspViolationUid
     */
    public void setInspViolationUid(int aInspViolationUid) {
        inspViolationUid = aInspViolationUid;
    }

    /**
     * Access method for complianceFlag.
     *
     * @return the current value of complianceFlag
     */
    public String getComplianceFlag() {
        return complianceFlag;
    }

    /**
     * Setter method for complianceFlag.
     *
     * @param aComplianceFlag the new value for complianceFlag
     */
    public void setComplianceFlag(String aComplianceFlag) {
        complianceFlag = aComplianceFlag;
    }

    /**
     * Access method for sections.
     *
     * @return the current value of sections
     */
    public String getSections() {
        return sections;
    }

    /**
     * Setter method for sections.
     *
     * @param aSections the new value for sections
     */
    public void setSections(String aSections) {
        sections = aSections;
    }

    /**
     * Access method for sectionNumbers.
     *
     * @return the current value of sectionNumbers
     */
    public String getSectionNumbers() {
        return sectionNumbers;
    }

    /**
     * Setter method for sectionNumbers.
     *
     * @param aSectionNumbers the new value for sectionNumbers
     */
    public void setSectionNumbers(String aSectionNumbers) {
        sectionNumbers = aSectionNumbers;
    }

    /**
     * Access method for violationDescription.
     *
     * @return the current value of violationDescription
     */
    public String getViolationDescription() {
        return violationDescription;
    }

    /**
     * Setter method for violationDescription.
     *
     * @param aViolationDescription the new value for violationDescription
     */
    public void setViolationDescription(String aViolationDescription) {
        violationDescription = aViolationDescription;
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
     * Access method for inspViolationTypes.
     *
     * @return the current value of inspViolationTypes
     */
    public InspViolationTypes getInspViolationTypes() {
        return inspViolationTypes;
    }

    /**
     * Setter method for inspViolationTypes.
     *
     * @param aInspViolationTypes the new value for inspViolationTypes
     */
    public void setInspViolationTypes(InspViolationTypes aInspViolationTypes) {
        inspViolationTypes = aInspViolationTypes;
    }

    /**
     * Compares the key for this instance with another InspViolations.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class InspViolations and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof InspViolations)) {
            return false;
        }
        InspViolations that = (InspViolations) other;
        if (this.getInspViolationUid() != that.getInspViolationUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another InspViolations.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof InspViolations)) return false;
        return this.equalKeys(other) && ((InspViolations)other).equalKeys(this);
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
        i = getInspViolationUid();
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
        StringBuffer sb = new StringBuffer("[InspViolations |");
        sb.append(" inspViolationUid=").append(getInspViolationUid());
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
        ret.put("inspViolationUid", Integer.valueOf(getInspViolationUid()));
        return ret;
    }

}
