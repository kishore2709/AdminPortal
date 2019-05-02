// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Date;
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

@Entity(name="perp_documents")
public class PerpDocuments implements Serializable {

    /** Primary key. */
    protected static final String PK = "perpDocUid";

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
    @Column(name="PerpDoc_UID", unique=true, nullable=false, precision=10)
    private int perpDocUid;
    @Column(name="Name", length=128)
    private String name;
    @Column(name="Doc_Header", length=512)
    private String docHeader;
    @Column(name="Doc_Body_Text1")
    private String docBodyText1;
    @Column(name="Doc_Body_Text2")
    private String docBodyText2;
    @Column(name="Doc_Body_Text3")
    private String docBodyText3;
    @Column(name="Doc_Body_Text4")
    private String docBodyText4;
    @Column(name="Doc_Body_Text5")
    private String docBodyText5;
    @Column(name="Doc_Footer_Text", length=255)
    private String docFooterText;
    @Column(name="Document_Obj")
    private byte[] documentObj;
    @Column(name="Original_File_Name", length=255)
    private String originalFileName;
    @Column(name="Original_Source")
    private byte[] originalSource;
    @Column(name="Table_Insert_Flag", nullable=false, length=1)
    private String tableInsertFlag;
    @Column(name="Sent_Date")
    private Timestamp sentDate;
    @Column(name="Active_Flag", nullable=false, length=1)
    private String activeFlag;
    @Column(name="Create_Modified_By", nullable=false, length=45)
    private String createModifiedBy;
    @Column(name="Create_Modified_Date", nullable=false)
    private Timestamp createModifiedDate;
    @Column(name="Invoice_Num", length=45)
    private String invoiceNum;
    @Column(name="Renewal_Invoice_Date")
    private Date renewalInvoiceDate;
    @ManyToOne
    @JoinColumn(name="AppTrans_UID")
    private AppTransactions appTransactions;
    @ManyToOne
    @JoinColumn(name="Company_UID")
    private Company company;
    @ManyToOne
    @JoinColumn(name="Inspection_UID")
    private Inspections inspections;
    @OneToMany(mappedBy="perpDocuments")
    private Set<PerpdocumentItems> perpdocumentItems;
    @OneToMany(mappedBy="perpDocuments")
    private Set<PerpdocumentActions> perpdocumentActions;
    @ManyToOne(optional=false)
    @JoinColumn(name="DocumentType_UID", nullable=false)
    private PerpDocumentTypes perpDocumentTypes;
    @ManyToOne
    @JoinColumn(name="ARBContact_UID")
    private Users users;

    /** Default constructor. */
    public PerpDocuments() {
        super();
    }

    /**
     * Access method for perpDocUid.
     *
     * @return the current value of perpDocUid
     */
    public int getPerpDocUid() {
        return perpDocUid;
    }

    /**
     * Setter method for perpDocUid.
     *
     * @param aPerpDocUid the new value for perpDocUid
     */
    public void setPerpDocUid(int aPerpDocUid) {
        perpDocUid = aPerpDocUid;
    }

    /**
     * Access method for name.
     *
     * @return the current value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for name.
     *
     * @param aName the new value for name
     */
    public void setName(String aName) {
        name = aName;
    }

    /**
     * Access method for docHeader.
     *
     * @return the current value of docHeader
     */
    public String getDocHeader() {
        return docHeader;
    }

    /**
     * Setter method for docHeader.
     *
     * @param aDocHeader the new value for docHeader
     */
    public void setDocHeader(String aDocHeader) {
        docHeader = aDocHeader;
    }

    /**
     * Access method for docBodyText1.
     *
     * @return the current value of docBodyText1
     */
    public String getDocBodyText1() {
        return docBodyText1;
    }

    /**
     * Setter method for docBodyText1.
     *
     * @param aDocBodyText1 the new value for docBodyText1
     */
    public void setDocBodyText1(String aDocBodyText1) {
        docBodyText1 = aDocBodyText1;
    }

    /**
     * Access method for docBodyText2.
     *
     * @return the current value of docBodyText2
     */
    public String getDocBodyText2() {
        return docBodyText2;
    }

    /**
     * Setter method for docBodyText2.
     *
     * @param aDocBodyText2 the new value for docBodyText2
     */
    public void setDocBodyText2(String aDocBodyText2) {
        docBodyText2 = aDocBodyText2;
    }

    /**
     * Access method for docBodyText3.
     *
     * @return the current value of docBodyText3
     */
    public String getDocBodyText3() {
        return docBodyText3;
    }

    /**
     * Setter method for docBodyText3.
     *
     * @param aDocBodyText3 the new value for docBodyText3
     */
    public void setDocBodyText3(String aDocBodyText3) {
        docBodyText3 = aDocBodyText3;
    }

    /**
     * Access method for docBodyText4.
     *
     * @return the current value of docBodyText4
     */
    public String getDocBodyText4() {
        return docBodyText4;
    }

    /**
     * Setter method for docBodyText4.
     *
     * @param aDocBodyText4 the new value for docBodyText4
     */
    public void setDocBodyText4(String aDocBodyText4) {
        docBodyText4 = aDocBodyText4;
    }

    /**
     * Access method for docBodyText5.
     *
     * @return the current value of docBodyText5
     */
    public String getDocBodyText5() {
        return docBodyText5;
    }

    /**
     * Setter method for docBodyText5.
     *
     * @param aDocBodyText5 the new value for docBodyText5
     */
    public void setDocBodyText5(String aDocBodyText5) {
        docBodyText5 = aDocBodyText5;
    }

    /**
     * Access method for docFooterText.
     *
     * @return the current value of docFooterText
     */
    public String getDocFooterText() {
        return docFooterText;
    }

    /**
     * Setter method for docFooterText.
     *
     * @param aDocFooterText the new value for docFooterText
     */
    public void setDocFooterText(String aDocFooterText) {
        docFooterText = aDocFooterText;
    }

    /**
     * Access method for documentObj.
     *
     * @return the current value of documentObj
     */
    public byte[] getDocumentObj() {
        return documentObj;
    }

    /**
     * Setter method for documentObj.
     *
     * @param aDocumentObj the new value for documentObj
     */
    public void setDocumentObj(byte[] aDocumentObj) {
        documentObj = aDocumentObj;
    }

    /**
     * Access method for originalFileName.
     *
     * @return the current value of originalFileName
     */
    public String getOriginalFileName() {
        return originalFileName;
    }

    /**
     * Setter method for originalFileName.
     *
     * @param aOriginalFileName the new value for originalFileName
     */
    public void setOriginalFileName(String aOriginalFileName) {
        originalFileName = aOriginalFileName;
    }

    /**
     * Access method for originalSource.
     *
     * @return the current value of originalSource
     */
    public byte[] getOriginalSource() {
        return originalSource;
    }

    /**
     * Setter method for originalSource.
     *
     * @param aOriginalSource the new value for originalSource
     */
    public void setOriginalSource(byte[] aOriginalSource) {
        originalSource = aOriginalSource;
    }

    /**
     * Access method for tableInsertFlag.
     *
     * @return the current value of tableInsertFlag
     */
    public String getTableInsertFlag() {
        return tableInsertFlag;
    }

    /**
     * Setter method for tableInsertFlag.
     *
     * @param aTableInsertFlag the new value for tableInsertFlag
     */
    public void setTableInsertFlag(String aTableInsertFlag) {
        tableInsertFlag = aTableInsertFlag;
    }

    /**
     * Access method for sentDate.
     *
     * @return the current value of sentDate
     */
    public Timestamp getSentDate() {
        return sentDate;
    }

    /**
     * Setter method for sentDate.
     *
     * @param aSentDate the new value for sentDate
     */
    public void setSentDate(Timestamp aSentDate) {
        sentDate = aSentDate;
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
     * Access method for invoiceNum.
     *
     * @return the current value of invoiceNum
     */
    public String getInvoiceNum() {
        return invoiceNum;
    }

    /**
     * Setter method for invoiceNum.
     *
     * @param aInvoiceNum the new value for invoiceNum
     */
    public void setInvoiceNum(String aInvoiceNum) {
        invoiceNum = aInvoiceNum;
    }

    /**
     * Access method for renewalInvoiceDate.
     *
     * @return the current value of renewalInvoiceDate
     */
    public Date getRenewalInvoiceDate() {
        return renewalInvoiceDate;
    }

    /**
     * Setter method for renewalInvoiceDate.
     *
     * @param aRenewalInvoiceDate the new value for renewalInvoiceDate
     */
    public void setRenewalInvoiceDate(Date aRenewalInvoiceDate) {
        renewalInvoiceDate = aRenewalInvoiceDate;
    }

    /**
     * Access method for appTransactions.
     *
     * @return the current value of appTransactions
     */
    public AppTransactions getAppTransactions() {
        return appTransactions;
    }

    /**
     * Setter method for appTransactions.
     *
     * @param aAppTransactions the new value for appTransactions
     */
    public void setAppTransactions(AppTransactions aAppTransactions) {
        appTransactions = aAppTransactions;
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
     * Access method for perpdocumentItems.
     *
     * @return the current value of perpdocumentItems
     */
    public Set<PerpdocumentItems> getPerpdocumentItems() {
        return perpdocumentItems;
    }

    /**
     * Setter method for perpdocumentItems.
     *
     * @param aPerpdocumentItems the new value for perpdocumentItems
     */
    public void setPerpdocumentItems(Set<PerpdocumentItems> aPerpdocumentItems) {
        perpdocumentItems = aPerpdocumentItems;
    }

    /**
     * Access method for perpdocumentActions.
     *
     * @return the current value of perpdocumentActions
     */
    public Set<PerpdocumentActions> getPerpdocumentActions() {
        return perpdocumentActions;
    }

    /**
     * Setter method for perpdocumentActions.
     *
     * @param aPerpdocumentActions the new value for perpdocumentActions
     */
    public void setPerpdocumentActions(Set<PerpdocumentActions> aPerpdocumentActions) {
        perpdocumentActions = aPerpdocumentActions;
    }

    /**
     * Access method for perpDocumentTypes.
     *
     * @return the current value of perpDocumentTypes
     */
    public PerpDocumentTypes getPerpDocumentTypes() {
        return perpDocumentTypes;
    }

    /**
     * Setter method for perpDocumentTypes.
     *
     * @param aPerpDocumentTypes the new value for perpDocumentTypes
     */
    public void setPerpDocumentTypes(PerpDocumentTypes aPerpDocumentTypes) {
        perpDocumentTypes = aPerpDocumentTypes;
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

    /**
     * Compares the key for this instance with another PerpDocuments.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class PerpDocuments and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof PerpDocuments)) {
            return false;
        }
        PerpDocuments that = (PerpDocuments) other;
        if (this.getPerpDocUid() != that.getPerpDocUid()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another PerpDocuments.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof PerpDocuments)) return false;
        return this.equalKeys(other) && ((PerpDocuments)other).equalKeys(this);
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
        i = getPerpDocUid();
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
        StringBuffer sb = new StringBuffer("[PerpDocuments |");
        sb.append(" perpDocUid=").append(getPerpDocUid());
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
        ret.put("perpDocUid", Integer.valueOf(getPerpDocUid()));
        return ret;
    }

}
