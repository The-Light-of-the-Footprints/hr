package com.hr.entity;

public class HumanFileWithBLOBs extends HumanFile {
    private String remark;

    private String humanHistroyRecords;

    private String humanFamilyMembership;
    
    private ConfigFileFirstKind firstKind;
    
    private ConfigFileSecondKind secondKind;
    
    private ConfigFileThirdKind thirdKind;
    
    private ConfigMajor major;
    
    private ConfigMajorKind majorKind;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getHumanHistroyRecords() {
        return humanHistroyRecords;
    }

    public void setHumanHistroyRecords(String humanHistroyRecords) {
        this.humanHistroyRecords = humanHistroyRecords == null ? null : humanHistroyRecords.trim();
    }

    public String getHumanFamilyMembership() {
        return humanFamilyMembership;
    }

    public void setHumanFamilyMembership(String humanFamilyMembership) {
        this.humanFamilyMembership = humanFamilyMembership == null ? null : humanFamilyMembership.trim();
    }

	public ConfigFileFirstKind getFirstKind() {
		return firstKind;
	}

	public void setFirstKind(ConfigFileFirstKind firstKind) {
		this.firstKind = firstKind;
	}

	public ConfigFileSecondKind getSecondKind() {
		return secondKind;
	}

	public void setSecondKind(ConfigFileSecondKind secondKind) {
		this.secondKind = secondKind;
	}

	public ConfigFileThirdKind getThirdKind() {
		return thirdKind;
	}

	public void setThirdKind(ConfigFileThirdKind thirdKind) {
		this.thirdKind = thirdKind;
	}

	public ConfigMajor getMajor() {
		return major;
	}

	public void setMajor(ConfigMajor major) {
		this.major = major;
	}

	public ConfigMajorKind getMajorKind() {
		return majorKind;
	}

	public void setMajorKind(ConfigMajorKind majorKind) {
		this.majorKind = majorKind;
	}
    
    
}