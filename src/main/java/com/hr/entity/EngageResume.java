package com.hr.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EngageResume {
    private Short resId;

    private String humanName;

    private String engageType;

    private String humanAddress;

    private String humanPostcode;

    private Short humanMajorId;

    private String humanTelephone;

    private String humanHomephone;

    private String humanMobilephone;

    private String humanEmail;

    private String humanHobby;

    private String humanSpecility;

    private String humanSex;

    private String humanReligion;

    private String humanParty;

    private String humanNationality;

    private String humanRace;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date humanBirthday;

    private Short humanAge;

    private String humanEducatedDegree;

    private Short humanEducatedYears;

    private String humanEducatedMajor;

    private String humanCollege;

    private String humanIdcard;

    private String humanBirthplace;

    private BigDecimal demandSalaryStandard;

    private String humanPicture;

    private String attachmentName;

    private Short checkStatus;

    private String register;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date registTime;

    private String checker;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date checkTime;

    private Short interviewStatus;

    private Short interviewAmount;

    private Double totalPoints;

    private Short testAmount;

    private String testChecker;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date testCheckTime;

    private String passRegister;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date passRegistTime;

    private String passChecker;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date passCheckTime;

    private Short passCheckStatus;

    private String passCheckcomment;

    private String passPasscomment;

    public Short getResId() {
        return resId;
    }

    public void setResId(Short resId) {
        this.resId = resId;
    }

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName == null ? null : humanName.trim();
    }

    public String getEngageType() {
        return engageType;
    }

    public void setEngageType(String engageType) {
        this.engageType = engageType == null ? null : engageType.trim();
    }

    public String getHumanAddress() {
        return humanAddress;
    }

    public void setHumanAddress(String humanAddress) {
        this.humanAddress = humanAddress == null ? null : humanAddress.trim();
    }

    public String getHumanPostcode() {
        return humanPostcode;
    }

    public void setHumanPostcode(String humanPostcode) {
        this.humanPostcode = humanPostcode == null ? null : humanPostcode.trim();
    }

    public Short getHumanMajorId() {
        return humanMajorId;
    }

    public void setHumanMajorId(Short humanMajorId) {
        this.humanMajorId = humanMajorId;
    }

    public String getHumanTelephone() {
        return humanTelephone;
    }

    public void setHumanTelephone(String humanTelephone) {
        this.humanTelephone = humanTelephone == null ? null : humanTelephone.trim();
    }

    public String getHumanHomephone() {
        return humanHomephone;
    }

    public void setHumanHomephone(String humanHomephone) {
        this.humanHomephone = humanHomephone == null ? null : humanHomephone.trim();
    }

    public String getHumanMobilephone() {
        return humanMobilephone;
    }

    public void setHumanMobilephone(String humanMobilephone) {
        this.humanMobilephone = humanMobilephone == null ? null : humanMobilephone.trim();
    }

    public String getHumanEmail() {
        return humanEmail;
    }

    public void setHumanEmail(String humanEmail) {
        this.humanEmail = humanEmail == null ? null : humanEmail.trim();
    }

    public String getHumanHobby() {
        return humanHobby;
    }

    public void setHumanHobby(String humanHobby) {
        this.humanHobby = humanHobby == null ? null : humanHobby.trim();
    }

    public String getHumanSpecility() {
        return humanSpecility;
    }

    public void setHumanSpecility(String humanSpecility) {
        this.humanSpecility = humanSpecility == null ? null : humanSpecility.trim();
    }

    public String getHumanSex() {
        return humanSex;
    }

    public void setHumanSex(String humanSex) {
        this.humanSex = humanSex == null ? null : humanSex.trim();
    }

    public String getHumanReligion() {
        return humanReligion;
    }

    public void setHumanReligion(String humanReligion) {
        this.humanReligion = humanReligion == null ? null : humanReligion.trim();
    }

    public String getHumanParty() {
        return humanParty;
    }

    public void setHumanParty(String humanParty) {
        this.humanParty = humanParty == null ? null : humanParty.trim();
    }

    public String getHumanNationality() {
        return humanNationality;
    }

    public void setHumanNationality(String humanNationality) {
        this.humanNationality = humanNationality == null ? null : humanNationality.trim();
    }

    public String getHumanRace() {
        return humanRace;
    }

    public void setHumanRace(String humanRace) {
        this.humanRace = humanRace == null ? null : humanRace.trim();
    }

    public Date getHumanBirthday() {
        return humanBirthday;
    }

    public void setHumanBirthday(Date humanBirthday) {
        this.humanBirthday = humanBirthday;
    }

    public Short getHumanAge() {
        return humanAge;
    }

    public void setHumanAge(Short humanAge) {
        this.humanAge = humanAge;
    }

    public String getHumanEducatedDegree() {
        return humanEducatedDegree;
    }

    public void setHumanEducatedDegree(String humanEducatedDegree) {
        this.humanEducatedDegree = humanEducatedDegree == null ? null : humanEducatedDegree.trim();
    }

    public Short getHumanEducatedYears() {
        return humanEducatedYears;
    }

    public void setHumanEducatedYears(Short humanEducatedYears) {
        this.humanEducatedYears = humanEducatedYears;
    }

    public String getHumanEducatedMajor() {
        return humanEducatedMajor;
    }

    public void setHumanEducatedMajor(String humanEducatedMajor) {
        this.humanEducatedMajor = humanEducatedMajor == null ? null : humanEducatedMajor.trim();
    }

    public String getHumanCollege() {
        return humanCollege;
    }

    public void setHumanCollege(String humanCollege) {
        this.humanCollege = humanCollege == null ? null : humanCollege.trim();
    }

    public String getHumanIdcard() {
        return humanIdcard;
    }

    public void setHumanIdcard(String humanIdcard) {
        this.humanIdcard = humanIdcard == null ? null : humanIdcard.trim();
    }

    public String getHumanBirthplace() {
        return humanBirthplace;
    }

    public void setHumanBirthplace(String humanBirthplace) {
        this.humanBirthplace = humanBirthplace == null ? null : humanBirthplace.trim();
    }

    public BigDecimal getDemandSalaryStandard() {
        return demandSalaryStandard;
    }

    public void setDemandSalaryStandard(BigDecimal demandSalaryStandard) {
        this.demandSalaryStandard = demandSalaryStandard;
    }

    public String getHumanPicture() {
        return humanPicture;
    }

    public void setHumanPicture(String humanPicture) {
        this.humanPicture = humanPicture == null ? null : humanPicture.trim();
    }

    public String getAttachmentName() {
        return attachmentName;
    }

    public void setAttachmentName(String attachmentName) {
        this.attachmentName = attachmentName == null ? null : attachmentName.trim();
    }

    public Short getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(Short checkStatus) {
        this.checkStatus = checkStatus;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register == null ? null : register.trim();
    }

    public Date getRegistTime() {
        return registTime;
    }

    public void setRegistTime(Date registTime) {
        this.registTime = registTime;
    }

    public String getChecker() {
        return checker;
    }

    public void setChecker(String checker) {
        this.checker = checker == null ? null : checker.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public Short getInterviewStatus() {
        return interviewStatus;
    }

    public void setInterviewStatus(Short interviewStatus) {
        this.interviewStatus = interviewStatus;
    }

    public Short getInterviewAmount() {
        return interviewAmount;
    }

    public void setInterviewAmount(Short interviewAmount) {
        this.interviewAmount = interviewAmount;
    }

    public Double getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(Double totalPoints) {
        this.totalPoints = totalPoints;
    }

    public Short getTestAmount() {
        return testAmount;
    }

    public void setTestAmount(Short testAmount) {
        this.testAmount = testAmount;
    }

    public String getTestChecker() {
        return testChecker;
    }

    public void setTestChecker(String testChecker) {
        this.testChecker = testChecker == null ? null : testChecker.trim();
    }

    public Date getTestCheckTime() {
        return testCheckTime;
    }

    public void setTestCheckTime(Date testCheckTime) {
        this.testCheckTime = testCheckTime;
    }

    public String getPassRegister() {
        return passRegister;
    }

    public void setPassRegister(String passRegister) {
        this.passRegister = passRegister == null ? null : passRegister.trim();
    }

    public Date getPassRegistTime() {
        return passRegistTime;
    }

    public void setPassRegistTime(Date passRegistTime) {
        this.passRegistTime = passRegistTime;
    }

    public String getPassChecker() {
        return passChecker;
    }

    public void setPassChecker(String passChecker) {
        this.passChecker = passChecker == null ? null : passChecker.trim();
    }

    public Date getPassCheckTime() {
        return passCheckTime;
    }

    public void setPassCheckTime(Date passCheckTime) {
        this.passCheckTime = passCheckTime;
    }

    public Short getPassCheckStatus() {
        return passCheckStatus;
    }

    public void setPassCheckStatus(Short passCheckStatus) {
        this.passCheckStatus = passCheckStatus;
    }

    public String getPassCheckcomment() {
        return passCheckcomment;
    }

    public void setPassCheckcomment(String passCheckcomment) {
        this.passCheckcomment = passCheckcomment == null ? null : passCheckcomment.trim();
    }

    public String getPassPasscomment() {
        return passPasscomment;
    }

    public void setPassPasscomment(String passPasscomment) {
        this.passPasscomment = passPasscomment == null ? null : passPasscomment.trim();
    }

	@Override
	public String toString() {
		return "EngageResume [resId=" + resId + ", humanName=" + humanName + ", engageType=" + engageType
				+ ", humanAddress=" + humanAddress + ", humanPostcode=" + humanPostcode + ", humanMajorId="
				+ humanMajorId + ", humanTelephone=" + humanTelephone + ", humanHomephone=" + humanHomephone
				+ ", humanMobilephone=" + humanMobilephone + ", humanEmail=" + humanEmail + ", humanHobby=" + humanHobby
				+ ", humanSpecility=" + humanSpecility + ", humanSex=" + humanSex + ", humanReligion=" + humanReligion
				+ ", humanParty=" + humanParty + ", humanNationality=" + humanNationality + ", humanRace=" + humanRace
				+ ", humanBirthday=" + humanBirthday + ", humanAge=" + humanAge + ", humanEducatedDegree="
				+ humanEducatedDegree + ", humanEducatedYears=" + humanEducatedYears + ", humanEducatedMajor="
				+ humanEducatedMajor + ", humanCollege=" + humanCollege + ", humanIdcard=" + humanIdcard
				+ ", humanBirthplace=" + humanBirthplace + ", demandSalaryStandard=" + demandSalaryStandard
				+ ", humanPicture=" + humanPicture + ", attachmentName=" + attachmentName + ", checkStatus="
				+ checkStatus + ", register=" + register + ", registTime=" + registTime + ", checker=" + checker
				+ ", checkTime=" + checkTime + ", interviewStatus=" + interviewStatus + ", interviewAmount="
				+ interviewAmount + ", totalPoints=" + totalPoints + ", testAmount=" + testAmount + ", testChecker="
				+ testChecker + ", testCheckTime=" + testCheckTime + ", passRegister=" + passRegister
				+ ", passRegistTime=" + passRegistTime + ", passChecker=" + passChecker + ", passCheckTime="
				+ passCheckTime + ", passCheckStatus=" + passCheckStatus + ", passCheckcomment=" + passCheckcomment
				+ ", passPasscomment=" + passPasscomment + "]";
	}
    
    
}