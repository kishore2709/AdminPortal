// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="user_security")
public class UserSecurity implements Serializable {

    /** Primary key. */
    protected static final String PK = "UserSecurityPrimary";

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

    @Column(name="User_Security_UID", nullable=false, precision=10)
    private int userSecurityUid;
    @Column(name="Question_Answer", nullable=false, length=64)
    private String questionAnswer;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Security_Question_UID", nullable=false)
    private SecurityQuestion securityQuestion;
    @ManyToOne(optional=false)
    @JoinColumn(name="Users_UID", nullable=false)
    private Users users;

    /** Default constructor. */
    public UserSecurity() {
        super();
    }

    /**
     * Access method for userSecurityUid.
     *
     * @return the current value of userSecurityUid
     */
    public int getUserSecurityUid() {
        return userSecurityUid;
    }

    /**
     * Setter method for userSecurityUid.
     *
     * @param aUserSecurityUid the new value for userSecurityUid
     */
    public void setUserSecurityUid(int aUserSecurityUid) {
        userSecurityUid = aUserSecurityUid;
    }

    /**
     * Access method for questionAnswer.
     *
     * @return the current value of questionAnswer
     */
    public String getQuestionAnswer() {
        return questionAnswer;
    }

    /**
     * Setter method for questionAnswer.
     *
     * @param aQuestionAnswer the new value for questionAnswer
     */
    public void setQuestionAnswer(String aQuestionAnswer) {
        questionAnswer = aQuestionAnswer;
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
     * Access method for securityQuestion.
     *
     * @return the current value of securityQuestion
     */
    public SecurityQuestion getSecurityQuestion() {
        return securityQuestion;
    }

    /**
     * Setter method for securityQuestion.
     *
     * @param aSecurityQuestion the new value for securityQuestion
     */
    public void setSecurityQuestion(SecurityQuestion aSecurityQuestion) {
        securityQuestion = aSecurityQuestion;
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

    /** Temporary value holder for group key fragment securityQuestionSecurityQuestionUid */
    private transient int tempSecurityQuestionSecurityQuestionUid;

    /**
     * Gets the key fragment securityQuestionUid for member securityQuestion.
     * If this.securityQuestion is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setSecurityQuestionSecurityQuestionUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see SecurityQuestion
     */
    public int getSecurityQuestionSecurityQuestionUid() {
        return (getSecurityQuestion() == null ? tempSecurityQuestionSecurityQuestionUid : getSecurityQuestion().getSecurityQuestionUid());
    }

    /**
     * Sets the key fragment securityQuestionUid from member securityQuestion.
     * If this.securityQuestion is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getSecurityQuestionSecurityQuestionUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aSecurityQuestionUid New value for the key fragment
     * @see SecurityQuestion
     */
    public void setSecurityQuestionSecurityQuestionUid(int aSecurityQuestionUid) {
        if (getSecurityQuestion() == null) {
            tempSecurityQuestionSecurityQuestionUid = aSecurityQuestionUid;
        } else {
            getSecurityQuestion().setSecurityQuestionUid(aSecurityQuestionUid);
        }
    }

    /** Temporary value holder for group key fragment usersUsersUid */
    private transient int tempUsersUsersUid;

    /**
     * Gets the key fragment usersUid for member users.
     * If this.users is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setUsersUsersUid.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Users
     */
    public int getUsersUsersUid() {
        return (getUsers() == null ? tempUsersUsersUid : getUsers().getUsersUid());
    }

    /**
     * Sets the key fragment usersUid from member users.
     * If this.users is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getUsersUsersUid.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aUsersUid New value for the key fragment
     * @see Users
     */
    public void setUsersUsersUid(int aUsersUid) {
        if (getUsers() == null) {
            tempUsersUsersUid = aUsersUid;
        } else {
            getUsers().setUsersUid(aUsersUid);
        }
    }

    /**
     * Compares the key for this instance with another UserSecurity.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class UserSecurity and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof UserSecurity)) {
            return false;
        }
        UserSecurity that = (UserSecurity) other;
        if (this.getUserSecurityUid() != that.getUserSecurityUid()) {
            return false;
        }
        if (this.getSecurityQuestionSecurityQuestionUid() != that.getSecurityQuestionSecurityQuestionUid()) {
            return false;
        }
        if (this.getUsersUsersUid() != that.getUsersUsersUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another UserSecurity.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof UserSecurity)) return false;
        return this.equalKeys(other) && ((UserSecurity)other).equalKeys(this);
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
        i = getUserSecurityUid();
        result = 37*result + i;
        i = getSecurityQuestionSecurityQuestionUid();
        result = 37*result + i;
        i = getUsersUsersUid();
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
        StringBuffer sb = new StringBuffer("[UserSecurity |");
        sb.append(" userSecurityUid=").append(getUserSecurityUid());
        sb.append(" securityQuestionSecurityQuestionUid=").append(getSecurityQuestionSecurityQuestionUid());
        sb.append(" usersUsersUid=").append(getUsersUsersUid());
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
        ret.put("userSecurityUid", Integer.valueOf(getUserSecurityUid()));
        ret.put("securityQuestionSecurityQuestionUid", Integer.valueOf(getSecurityQuestionSecurityQuestionUid()));
        ret.put("usersUsersUid", Integer.valueOf(getUsersUsersUid()));
        return ret;
    }

}
