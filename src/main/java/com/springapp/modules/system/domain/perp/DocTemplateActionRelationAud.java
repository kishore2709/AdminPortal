// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Date;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="doc_template_action_relation_aud")
public class DocTemplateActionRelationAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "dtarAudUid";

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
    @Column(name="DTARAud_UID", unique=true, nullable=false, precision=10)
    private int dtarAudUid;
    @Column(name="DecisionAction_UID", nullable=false, precision=10)
    private int decisionActionUid;
    @Column(name="DocTemplate_UID", nullable=false, precision=10)
    private int docTemplateUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Date createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public DocTemplateActionRelationAud() {
        super();
    }

    /**
     * Access method for dtarAudUid.
     *
     * @return the current value of dtarAudUid
     */
    public int getDtarAudUid() {
        return dtarAudUid;
    }

    /**
     * Setter method for dtarAudUid.
     *
     * @param aDtarAudUid the new value for dtarAudUid
     */
    public void setDtarAudUid(int aDtarAudUid) {
        dtarAudUid = aDtarAudUid;
    }

    /**
     * Access method for decisionActionUid.
     *
     * @return the current value of decisionActionUid
     */
    public int getDecisionActionUid() {
        return decisionActionUid;
    }

    /**
     * Setter method for decisionActionUid.
     *
     * @param aDecisionActionUid the new value for decisionActionUid
     */
    public void setDecisionActionUid(int aDecisionActionUid) {
        decisionActionUid = aDecisionActionUid;
    }

    /**
     * Access method for docTemplateUid.
     *
     * @return the current value of docTemplateUid
     */
    public int getDocTemplateUid() {
        return docTemplateUid;
    }

    /**
     * Setter method for docTemplateUid.
     *
     * @param aDocTemplateUid the new value for docTemplateUid
     */
    public void setDocTemplateUid(int aDocTemplateUid) {
        docTemplateUid = aDocTemplateUid;
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
     * Compares the key for this instance with another DocTemplateActionRelationAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class DocTemplateActionRelationAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof DocTemplateActionRelationAud)) {
            return false;
        }
        DocTemplateActionRelationAud that = (DocTemplateActionRelationAud) other;
        if (this.getDtarAudUid() != that.getDtarAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another DocTemplateActionRelationAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof DocTemplateActionRelationAud)) return false;
        return this.equalKeys(other) && ((DocTemplateActionRelationAud)other).equalKeys(this);
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
        i = getDtarAudUid();
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
        StringBuffer sb = new StringBuffer("[DocTemplateActionRelationAud |");
        sb.append(" dtarAudUid=").append(getDtarAudUid());
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
        ret.put("dtarAudUid", Integer.valueOf(getDtarAudUid()));
        return ret;
    }

}
