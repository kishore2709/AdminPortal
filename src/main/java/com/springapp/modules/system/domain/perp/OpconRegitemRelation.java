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

@Entity(name="opcon_regitem_relation")
public class OpconRegitemRelation implements Serializable {

    /** Primary key. */
    protected static final String PK = "ocriRelationUid";

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
    @Column(name="OCRIRelation_UID", unique=true, nullable=false, precision=10)
    private int ocriRelationUid;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @OneToMany(mappedBy="opconRegitemRelation")
    private Set<OcrirInputValues> ocrirInputValues;
    @ManyToOne(optional=false)
    @JoinColumn(name="OpCon_UID", nullable=false)
    private OperatingConditions operatingConditions;
    @ManyToOne(optional=false)
    @JoinColumn(name="RegItem_UID", nullable=false)
    private RegistrationItems registrationItems;

    /** Default constructor. */
    public OpconRegitemRelation() {
        super();
    }

    /**
     * Access method for ocriRelationUid.
     *
     * @return the current value of ocriRelationUid
     */
    public int getOcriRelationUid() {
        return ocriRelationUid;
    }

    /**
     * Setter method for ocriRelationUid.
     *
     * @param aOcriRelationUid the new value for ocriRelationUid
     */
    public void setOcriRelationUid(int aOcriRelationUid) {
        ocriRelationUid = aOcriRelationUid;
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
     * Access method for ocrirInputValues.
     *
     * @return the current value of ocrirInputValues
     */
    public Set<OcrirInputValues> getOcrirInputValues() {
        return ocrirInputValues;
    }

    /**
     * Setter method for ocrirInputValues.
     *
     * @param aOcrirInputValues the new value for ocrirInputValues
     */
    public void setOcrirInputValues(Set<OcrirInputValues> aOcrirInputValues) {
        ocrirInputValues = aOcrirInputValues;
    }

    /**
     * Access method for operatingConditions.
     *
     * @return the current value of operatingConditions
     */
    public OperatingConditions getOperatingConditions() {
        return operatingConditions;
    }

    /**
     * Setter method for operatingConditions.
     *
     * @param aOperatingConditions the new value for operatingConditions
     */
    public void setOperatingConditions(OperatingConditions aOperatingConditions) {
        operatingConditions = aOperatingConditions;
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
     * Compares the key for this instance with another OpconRegitemRelation.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class OpconRegitemRelation and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof OpconRegitemRelation)) {
            return false;
        }
        OpconRegitemRelation that = (OpconRegitemRelation) other;
        if (this.getOcriRelationUid() != that.getOcriRelationUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another OpconRegitemRelation.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof OpconRegitemRelation)) return false;
        return this.equalKeys(other) && ((OpconRegitemRelation)other).equalKeys(this);
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
        i = getOcriRelationUid();
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
        StringBuffer sb = new StringBuffer("[OpconRegitemRelation |");
        sb.append(" ocriRelationUid=").append(getOcriRelationUid());
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
        ret.put("ocriRelationUid", Integer.valueOf(getOcriRelationUid()));
        return ret;
    }

}
