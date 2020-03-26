package com.hr.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;


public class EngageMajorRelease {
    private Short mreId;

    private Short thirdKindId;

    private Short majorId;

    private Short humanAmount;

    private String engageType;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date deadline;

    private String register;
    
    private String changer;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date registTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date changeTime;

    public Short getMreId() {
        return mreId;
    }

    public void setMreId(Short mreId) {
        this.mreId = mreId;
    }

    public Short getThirdKindId() {
        return thirdKindId;
    }

    public void setThirdKindId(Short thirdKindId) {
        this.thirdKindId = thirdKindId;
    }

    public Short getMajorId() {
        return majorId;
    }

    public void setMajorId(Short majorId) {
        this.majorId = majorId;
    }

    public Short getHumanAmount() {
        return humanAmount;
    }

    public void setHumanAmount(Short humanAmount) {
        this.humanAmount = humanAmount;
    }

    public String getEngageType() {
        return engageType;
    }

    public void setEngageType(String engageType) {
        this.engageType = engageType == null ? null : engageType.trim();
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register == null ? null : register.trim();
    }

    public String getChanger() {
        return changer;
    }

    public void setChanger(String changer) {
        this.changer = changer == null ? null : changer.trim();
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

	@Override
	public String toString() {
		return "EngageMajorRelease [mreId=" + mreId + ", thirdKindId=" + thirdKindId + ", majorId=" + majorId
				+ ", humanAmount=" + humanAmount + ", engageType=" + engageType + ", deadline=" + deadline
				+ ", register=" + register + ", changer=" + changer + ", registTime=" + registTime + ", changeTime="
				+ changeTime + "]";
	}
    
    
}