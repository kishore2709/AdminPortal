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

@Entity(name="terminal_tru_relation_aud")
public class TerminalTruRelationAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "terminalTruRelAudUid";

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
    @Column(name="Terminal_TRU_Rel_Aud_UID", unique=true, nullable=false, precision=10)
    private int terminalTruRelAudUid;
    @Column(name="Terminal_TRU_Relation_UID", nullable=false, precision=10)
    private int terminalTruRelationUid;
    @Column(name="TRU_UID", nullable=false, precision=10)
    private int truUid;
    @Column(name="Terminal_UID", nullable=false, precision=10)
    private int terminalUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public TerminalTruRelationAud() {
        super();
    }

    /**
     * Access method for terminalTruRelAudUid.
     *
     * @return the current value of terminalTruRelAudUid
     */
    public int getTerminalTruRelAudUid() {
        return terminalTruRelAudUid;
    }

    /**
     * Setter method for terminalTruRelAudUid.
     *
     * @param aTerminalTruRelAudUid the new value for terminalTruRelAudUid
     */
    public void setTerminalTruRelAudUid(int aTerminalTruRelAudUid) {
        terminalTruRelAudUid = aTerminalTruRelAudUid;
    }

    /**
     * Access method for terminalTruRelationUid.
     *
     * @return the current value of terminalTruRelationUid
     */
    public int getTerminalTruRelationUid() {
        return terminalTruRelationUid;
    }

    /**
     * Setter method for terminalTruRelationUid.
     *
     * @param aTerminalTruRelationUid the new value for terminalTruRelationUid
     */
    public void setTerminalTruRelationUid(int aTerminalTruRelationUid) {
        terminalTruRelationUid = aTerminalTruRelationUid;
    }

    /**
     * Access method for truUid.
     *
     * @return the current value of truUid
     */
    public int getTruUid() {
        return truUid;
    }

    /**
     * Setter method for truUid.
     *
     * @param aTruUid the new value for truUid
     */
    public void setTruUid(int aTruUid) {
        truUid = aTruUid;
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
     * Compares the key for this instance with another TerminalTruRelationAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TerminalTruRelationAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TerminalTruRelationAud)) {
            return false;
        }
        TerminalTruRelationAud that = (TerminalTruRelationAud) other;
        if (this.getTerminalTruRelAudUid() != that.getTerminalTruRelAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TerminalTruRelationAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TerminalTruRelationAud)) return false;
        return this.equalKeys(other) && ((TerminalTruRelationAud)other).equalKeys(this);
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
        i = getTerminalTruRelAudUid();
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
        StringBuffer sb = new StringBuffer("[TerminalTruRelationAud |");
        sb.append(" terminalTruRelAudUid=").append(getTerminalTruRelAudUid());
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
        ret.put("terminalTruRelAudUid", Integer.valueOf(getTerminalTruRelAudUid()));
        return ret;
    }

}
