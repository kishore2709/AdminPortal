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

@Entity(name="terminal_tru_relation")
public class TerminalTruRelation implements Serializable {

    /** Primary key. */
    protected static final String PK = "terminalTruRelationUid";

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
    @Column(name="Terminal_TRU_Relation_UID", unique=true, nullable=false, precision=10)
    private int terminalTruRelationUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @ManyToOne(optional=false)
    @JoinColumn(name="Terminal_UID", nullable=false)
    private Terminal terminal;

    /** Default constructor. */
    public TerminalTruRelation() {
        super();
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
     * Compares the key for this instance with another TerminalTruRelation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TerminalTruRelation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TerminalTruRelation)) {
            return false;
        }
        TerminalTruRelation that = (TerminalTruRelation) other;
        if (this.getTerminalTruRelationUid() != that.getTerminalTruRelationUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TerminalTruRelation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TerminalTruRelation)) return false;
        return this.equalKeys(other) && ((TerminalTruRelation)other).equalKeys(this);
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
        i = getTerminalTruRelationUid();
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
        StringBuffer sb = new StringBuffer("[TerminalTruRelation |");
        sb.append(" terminalTruRelationUid=").append(getTerminalTruRelationUid());
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
        ret.put("terminalTruRelationUid", Integer.valueOf(getTerminalTruRelationUid()));
        return ret;
    }

}
