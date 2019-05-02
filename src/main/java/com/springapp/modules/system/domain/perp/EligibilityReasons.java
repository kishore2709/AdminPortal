// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="eligibility_reasons")
public class EligibilityReasons implements Serializable {

    /** Primary key. */
    protected static final String PK = "eligiblityReasonUid";

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
    @Column(name="EligiblityReason_UID", unique=true, nullable=false, precision=10)
    private int eligiblityReasonUid;
    @Column(name="Completed_Flag", length=1)
    private String completedFlag;
    @Column(name="Needs_Review_Flag", length=1)
    private String needsReviewFlag;
    @Column(name="Eligibility_Indicator", length=1)
    private String eligibilityIndicator;
    @Column(name="Comment", length=128)
    private String comment;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Date createModifiedDate;
    @ManyToOne
    @JoinColumn(name="AppTransRegRel_UID")
    private ApptransRegRel apptransRegRel;
    @ManyToOne(optional=false)
    @JoinColumn(name="ReasonCodes_UID", nullable=false)
    private ReasonCodes reasonCodes;
    @ManyToOne
    @JoinColumn(name="RegItem_UID")
    private RegistrationItems registrationItems;

    /** Default constructor. */
    public EligibilityReasons() {
        super();
    }

    /**
     * Access method for eligiblityReasonUid.
     *
     * @return the current value of eligiblityReasonUid
     */
    public int getEligiblityReasonUid() {
        return eligiblityReasonUid;
    }

    /**
     * Setter method for eligiblityReasonUid.
     *
     * @param aEligiblityReasonUid the new value for eligiblityReasonUid
     */
    public void setEligiblityReasonUid(int aEligiblityReasonUid) {
        eligiblityReasonUid = aEligiblityReasonUid;
    }

    /**
     * Access method for completedFlag.
     *
     * @return the current value of completedFlag
     */
    public String getCompletedFlag() {
        return completedFlag;
    }

    /**
     * Setter method for completedFlag.
     *
     * @param aCompletedFlag the new value for completedFlag
     */
    public void setCompletedFlag(String aCompletedFlag) {
        completedFlag = aCompletedFlag;
    }

    /**
     * Access method for needsReviewFlag.
     *
     * @return the current value of needsReviewFlag
     */
    public String getNeedsReviewFlag() {
        return needsReviewFlag;
    }

    /**
     * Setter method for needsReviewFlag.
     *
     * @param aNeedsReviewFlag the new value for needsReviewFlag
     */
    public void setNeedsReviewFlag(String aNeedsReviewFlag) {
        needsReviewFlag = aNeedsReviewFlag;
    }

    /**
     * Access method for eligibilityIndicator.
     *
     * @return the current value of eligibilityIndicator
     */
    public String getEligibilityIndicator() {
        return eligibilityIndicator;
    }

    /**
     * Setter method for eligibilityIndicator.
     *
     * @param aEligibilityIndicator the new value for eligibilityIndicator
     */
    public void setEligibilityIndicator(String aEligibilityIndicator) {
        eligibilityIndicator = aEligibilityIndicator;
    }

    /**
     * Access method for comment.
     *
     * @return the current value of comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * Setter method for comment.
     *
     * @param aComment the new value for comment
     */
    public void setComment(String aComment) {
        comment = aComment;
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
    public Date getCreateModifiedDate() {
        return createModifiedDate;
    }

    /**
     * Setter method for createModifiedDate.
     *
     * @param aCreateModifiedDate the new value for createModifiedDate
     */
    public void setCreateModifiedDate(Date aCreateModifiedDate) {
        createModifiedDate = aCreateModifiedDate;
    }

    /**
     * Access method for apptransRegRel.
     *
     * @return the current value of apptransRegRel
     */
    public ApptransRegRel getApptransRegRel() {
        return apptransRegRel;
    }

    /**
     * Setter method for apptransRegRel.
     *
     * @param aApptransRegRel the new value for apptransRegRel
     */
    public void setApptransRegRel(ApptransRegRel aApptransRegRel) {
        apptransRegRel = aApptransRegRel;
    }

    /**
     * Access method for reasonCodes.
     *
     * @return the current value of reasonCodes
     */
    public ReasonCodes getReasonCodes() {
        return reasonCodes;
    }

    /**
     * Setter method for reasonCodes.
     *
     * @param aReasonCodes the new value for reasonCodes
     */
    public void setReasonCodes(ReasonCodes aReasonCodes) {
        reasonCodes = aReasonCodes;
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
     * Compares the key for this instance with another EligibilityReasons.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class EligibilityReasons and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof EligibilityReasons)) {
            return false;
        }
        EligibilityReasons that = (EligibilityReasons) other;
        if (this.getEligiblityReasonUid() != that.getEligiblityReasonUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another EligibilityReasons.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof EligibilityReasons)) return false;
        return this.equalKeys(other) && ((EligibilityReasons)other).equalKeys(this);
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
        i = getEligiblityReasonUid();
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
        StringBuffer sb = new StringBuffer("[EligibilityReasons |");
        sb.append(" eligiblityReasonUid=").append(getEligiblityReasonUid());
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
        ret.put("eligiblityReasonUid", Integer.valueOf(getEligiblityReasonUid()));
        return ret;
    }

}
