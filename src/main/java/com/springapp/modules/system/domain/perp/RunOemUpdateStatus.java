// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Version;

@Entity(name="run_oem_update_status")
public class RunOemUpdateStatus implements Serializable {

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

    @Column(name="run_oem_update_status_flag", length=1)
    private String runOemUpdateStatusFlag;

    /** Default constructor. */
    public RunOemUpdateStatus() {
        super();
    }

    /**
     * Access method for runOemUpdateStatusFlag.
     *
     * @return the current value of runOemUpdateStatusFlag
     */
    public String getRunOemUpdateStatusFlag() {
        return runOemUpdateStatusFlag;
    }

    /**
     * Setter method for runOemUpdateStatusFlag.
     *
     * @param aRunOemUpdateStatusFlag the new value for runOemUpdateStatusFlag
     */
    public void setRunOemUpdateStatusFlag(String aRunOemUpdateStatusFlag) {
        runOemUpdateStatusFlag = aRunOemUpdateStatusFlag;
    }

}
