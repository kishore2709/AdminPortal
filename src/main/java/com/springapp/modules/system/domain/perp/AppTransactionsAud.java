// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity(name="app_transactions_aud")
public class AppTransactionsAud implements Serializable {

    /** Primary key. */
    protected static final String PK = "atAudUid";

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
    @Column(name="ATAud_UID", unique=true, nullable=false, precision=10)
    private int atAudUid;
    @Column(name="AppTrans_UID", nullable=false, precision=10)
    private int appTransUid;
    @Column(name="AppTransStatus_UID", nullable=false, precision=10)
    private int appTransStatusUid;
    @Column(name="AppTransType_UID", nullable=false, precision=10)
    private int appTransTypeUid;
    @Column(name="Consultant_Contact_UID", precision=10)
    private int consultantContactUid;
    @Column(name="Company_UID", precision=10)
    private int companyUid;
    @Column(name="App_Box_Number", precision=5)
    private short appBoxNumber;
    @Column(name="Clock_Starts_Date")
    private Timestamp clockStartsDate;
    @Column(name="External_Flag", nullable=false, length=1)
    private String externalFlag;
    @Column(name="OnBatch_Flag", nullable=false, length=1)
    private String onBatchFlag;
    @Column(name="PrelimReviewed_Flag", nullable=false, length=1)
    private String prelimReviewedFlag;
    @Column(name="Transaction_Amount", precision=10, scale=2)
    private BigDecimal transactionAmount;
    @Column(name="Close_Out_Date")
    private Timestamp closeOutDate;
    @Column(name="Request_Date")
    private Timestamp requestDate;
    @Column(name="Post_Mark_Date")
    private Timestamp postMarkDate;
    @Column(name="Transaction_Issuance_Date")
    private Date transactionIssuanceDate;
    @Column(name="Auto_Generate_Docs_Flag", nullable=false, length=1)
    private String autoGenerateDocsFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Operation", nullable=false, length=10)
    private String operation;

    /** Default constructor. */
    public AppTransactionsAud() {
        super();
    }

    /**
     * Access method for atAudUid.
     *
     * @return the current value of atAudUid
     */
    public int getAtAudUid() {
        return atAudUid;
    }

    /**
     * Setter method for atAudUid.
     *
     * @param aAtAudUid the new value for atAudUid
     */
    public void setAtAudUid(int aAtAudUid) {
        atAudUid = aAtAudUid;
    }

    /**
     * Access method for appTransUid.
     *
     * @return the current value of appTransUid
     */
    public int getAppTransUid() {
        return appTransUid;
    }

    /**
     * Setter method for appTransUid.
     *
     * @param aAppTransUid the new value for appTransUid
     */
    public void setAppTransUid(int aAppTransUid) {
        appTransUid = aAppTransUid;
    }

    /**
     * Access method for appTransStatusUid.
     *
     * @return the current value of appTransStatusUid
     */
    public int getAppTransStatusUid() {
        return appTransStatusUid;
    }

    /**
     * Setter method for appTransStatusUid.
     *
     * @param aAppTransStatusUid the new value for appTransStatusUid
     */
    public void setAppTransStatusUid(int aAppTransStatusUid) {
        appTransStatusUid = aAppTransStatusUid;
    }

    /**
     * Access method for appTransTypeUid.
     *
     * @return the current value of appTransTypeUid
     */
    public int getAppTransTypeUid() {
        return appTransTypeUid;
    }

    /**
     * Setter method for appTransTypeUid.
     *
     * @param aAppTransTypeUid the new value for appTransTypeUid
     */
    public void setAppTransTypeUid(int aAppTransTypeUid) {
        appTransTypeUid = aAppTransTypeUid;
    }

    /**
     * Access method for consultantContactUid.
     *
     * @return the current value of consultantContactUid
     */
    public int getConsultantContactUid() {
        return consultantContactUid;
    }

    /**
     * Setter method for consultantContactUid.
     *
     * @param aConsultantContactUid the new value for consultantContactUid
     */
    public void setConsultantContactUid(int aConsultantContactUid) {
        consultantContactUid = aConsultantContactUid;
    }

    /**
     * Access method for companyUid.
     *
     * @return the current value of companyUid
     */
    public int getCompanyUid() {
        return companyUid;
    }

    /**
     * Setter method for companyUid.
     *
     * @param aCompanyUid the new value for companyUid
     */
    public void setCompanyUid(int aCompanyUid) {
        companyUid = aCompanyUid;
    }

    /**
     * Access method for appBoxNumber.
     *
     * @return the current value of appBoxNumber
     */
    public short getAppBoxNumber() {
        return appBoxNumber;
    }

    /**
     * Setter method for appBoxNumber.
     *
     * @param aAppBoxNumber the new value for appBoxNumber
     */
    public void setAppBoxNumber(short aAppBoxNumber) {
        appBoxNumber = aAppBoxNumber;
    }

    /**
     * Access method for clockStartsDate.
     *
     * @return the current value of clockStartsDate
     */
    public Timestamp getClockStartsDate() {
        return clockStartsDate;
    }

    /**
     * Setter method for clockStartsDate.
     *
     * @param aClockStartsDate the new value for clockStartsDate
     */
    public void setClockStartsDate(Timestamp aClockStartsDate) {
        clockStartsDate = aClockStartsDate;
    }

    /**
     * Access method for externalFlag.
     *
     * @return the current value of externalFlag
     */
    public String getExternalFlag() {
        return externalFlag;
    }

    /**
     * Setter method for externalFlag.
     *
     * @param aExternalFlag the new value for externalFlag
     */
    public void setExternalFlag(String aExternalFlag) {
        externalFlag = aExternalFlag;
    }

    /**
     * Access method for onBatchFlag.
     *
     * @return the current value of onBatchFlag
     */
    public String getOnBatchFlag() {
        return onBatchFlag;
    }

    /**
     * Setter method for onBatchFlag.
     *
     * @param aOnBatchFlag the new value for onBatchFlag
     */
    public void setOnBatchFlag(String aOnBatchFlag) {
        onBatchFlag = aOnBatchFlag;
    }

    /**
     * Access method for prelimReviewedFlag.
     *
     * @return the current value of prelimReviewedFlag
     */
    public String getPrelimReviewedFlag() {
        return prelimReviewedFlag;
    }

    /**
     * Setter method for prelimReviewedFlag.
     *
     * @param aPrelimReviewedFlag the new value for prelimReviewedFlag
     */
    public void setPrelimReviewedFlag(String aPrelimReviewedFlag) {
        prelimReviewedFlag = aPrelimReviewedFlag;
    }

    /**
     * Access method for transactionAmount.
     *
     * @return the current value of transactionAmount
     */
    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Setter method for transactionAmount.
     *
     * @param aTransactionAmount the new value for transactionAmount
     */
    public void setTransactionAmount(BigDecimal aTransactionAmount) {
        transactionAmount = aTransactionAmount;
    }

    /**
     * Access method for closeOutDate.
     *
     * @return the current value of closeOutDate
     */
    public Timestamp getCloseOutDate() {
        return closeOutDate;
    }

    /**
     * Setter method for closeOutDate.
     *
     * @param aCloseOutDate the new value for closeOutDate
     */
    public void setCloseOutDate(Timestamp aCloseOutDate) {
        closeOutDate = aCloseOutDate;
    }

    /**
     * Access method for requestDate.
     *
     * @return the current value of requestDate
     */
    public Timestamp getRequestDate() {
        return requestDate;
    }

    /**
     * Setter method for requestDate.
     *
     * @param aRequestDate the new value for requestDate
     */
    public void setRequestDate(Timestamp aRequestDate) {
        requestDate = aRequestDate;
    }

    /**
     * Access method for postMarkDate.
     *
     * @return the current value of postMarkDate
     */
    public Timestamp getPostMarkDate() {
        return postMarkDate;
    }

    /**
     * Setter method for postMarkDate.
     *
     * @param aPostMarkDate the new value for postMarkDate
     */
    public void setPostMarkDate(Timestamp aPostMarkDate) {
        postMarkDate = aPostMarkDate;
    }

    /**
     * Access method for transactionIssuanceDate.
     *
     * @return the current value of transactionIssuanceDate
     */
    public Date getTransactionIssuanceDate() {
        return transactionIssuanceDate;
    }

    /**
     * Setter method for transactionIssuanceDate.
     *
     * @param aTransactionIssuanceDate the new value for transactionIssuanceDate
     */
    public void setTransactionIssuanceDate(Date aTransactionIssuanceDate) {
        transactionIssuanceDate = aTransactionIssuanceDate;
    }

    /**
     * Access method for autoGenerateDocsFlag.
     *
     * @return the current value of autoGenerateDocsFlag
     */
    public String getAutoGenerateDocsFlag() {
        return autoGenerateDocsFlag;
    }

    /**
     * Setter method for autoGenerateDocsFlag.
     *
     * @param aAutoGenerateDocsFlag the new value for autoGenerateDocsFlag
     */
    public void setAutoGenerateDocsFlag(String aAutoGenerateDocsFlag) {
        autoGenerateDocsFlag = aAutoGenerateDocsFlag;
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
     * Compares the key for this instance with another AppTransactionsAud.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class AppTransactionsAud and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof AppTransactionsAud)) {
            return false;
        }
        AppTransactionsAud that = (AppTransactionsAud) other;
        if (this.getAtAudUid() != that.getAtAudUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another AppTransactionsAud.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof AppTransactionsAud)) return false;
        return this.equalKeys(other) && ((AppTransactionsAud)other).equalKeys(this);
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
        i = getAtAudUid();
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
        StringBuffer sb = new StringBuffer("[AppTransactionsAud |");
        sb.append(" atAudUid=").append(getAtAudUid());
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
        ret.put("atAudUid", Integer.valueOf(getAtAudUid()));
        return ret;
    }

}
