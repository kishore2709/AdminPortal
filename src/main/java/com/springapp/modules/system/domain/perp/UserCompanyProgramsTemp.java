// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Version;

@Entity(name="user_company_programs_temp")
public class UserCompanyProgramsTemp implements Serializable {

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

    @Column(name="user_company_programs_UID", nullable=false, precision=10)
    private int userCompanyProgramsUid;

    /** Default constructor. */
    public UserCompanyProgramsTemp() {
        super();
    }

    /**
     * Access method for userCompanyProgramsUid.
     *
     * @return the current value of userCompanyProgramsUid
     */
    public int getUserCompanyProgramsUid() {
        return userCompanyProgramsUid;
    }

    /**
     * Setter method for userCompanyProgramsUid.
     *
     * @param aUserCompanyProgramsUid the new value for userCompanyProgramsUid
     */
    public void setUserCompanyProgramsUid(int aUserCompanyProgramsUid) {
        userCompanyProgramsUid = aUserCompanyProgramsUid;
    }

}
