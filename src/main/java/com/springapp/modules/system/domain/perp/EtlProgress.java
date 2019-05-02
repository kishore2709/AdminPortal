// Generated with g9.

package com.springapp.modules.system.domain.perp;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Version;

@Entity(name="etl_progress")
public class EtlProgress implements Serializable {

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

    @Column(name="Step", length=100)
    private String step;
    @Column(name="EndTime")
    private Timestamp endTime;
    @Column(name="Duration", precision=10)
    private int duration;

    /** Default constructor. */
    public EtlProgress() {
        super();
    }

    /**
     * Access method for step.
     *
     * @return the current value of step
     */
    public String getStep() {
        return step;
    }

    /**
     * Setter method for step.
     *
     * @param aStep the new value for step
     */
    public void setStep(String aStep) {
        step = aStep;
    }

    /**
     * Access method for endTime.
     *
     * @return the current value of endTime
     */
    public Timestamp getEndTime() {
        return endTime;
    }

    /**
     * Setter method for endTime.
     *
     * @param aEndTime the new value for endTime
     */
    public void setEndTime(Timestamp aEndTime) {
        endTime = aEndTime;
    }

    /**
     * Access method for duration.
     *
     * @return the current value of duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * Setter method for duration.
     *
     * @param aDuration the new value for duration
     */
    public void setDuration(int aDuration) {
        duration = aDuration;
    }

}
