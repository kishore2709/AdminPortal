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
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="security_question")
public class SecurityQuestion implements Serializable {

    /** Primary key. */
    protected static final String PK = "securityQuestionUid";

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
    @Column(name="Security_Question_UID", unique=true, nullable=false, precision=10)
    private int securityQuestionUid;
    @Column(name="Question", nullable=false, length=128)
    private String question;
    @Column(name="Group", nullable=false, precision=10)
    private int group;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="securityQuestion")
    private Set<UserSecurity> userSecurity;

    /** Default constructor. */
    public SecurityQuestion() {
        super();
    }

    /**
     * Access method for securityQuestionUid.
     *
     * @return the current value of securityQuestionUid
     */
    public int getSecurityQuestionUid() {
        return securityQuestionUid;
    }

    /**
     * Setter method for securityQuestionUid.
     *
     * @param aSecurityQuestionUid the new value for securityQuestionUid
     */
    public void setSecurityQuestionUid(int aSecurityQuestionUid) {
        securityQuestionUid = aSecurityQuestionUid;
    }

    /**
     * Access method for question.
     *
     * @return the current value of question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Setter method for question.
     *
     * @param aQuestion the new value for question
     */
    public void setQuestion(String aQuestion) {
        question = aQuestion;
    }

    /**
     * Access method for group.
     *
     * @return the current value of group
     */
    public int getGroup() {
        return group;
    }

    /**
     * Setter method for group.
     *
     * @param aGroup the new value for group
     */
    public void setGroup(int aGroup) {
        group = aGroup;
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
     * Compares the key for this instance with another SecurityQuestion.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class SecurityQuestion and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof SecurityQuestion)) {
            return false;
        }
        SecurityQuestion that = (SecurityQuestion) other;
        if (this.getSecurityQuestionUid() != that.getSecurityQuestionUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another SecurityQuestion.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof SecurityQuestion)) return false;
        return this.equalKeys(other) && ((SecurityQuestion)other).equalKeys(this);
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
        i = getSecurityQuestionUid();
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
        StringBuffer sb = new StringBuffer("[SecurityQuestion |");
        sb.append(" securityQuestionUid=").append(getSecurityQuestionUid());
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
        ret.put("securityQuestionUid", Integer.valueOf(getSecurityQuestionUid()));
        return ret;
    }

}
