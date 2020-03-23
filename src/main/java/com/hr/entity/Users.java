package com.hr.entity;

public class Users {
    private Integer uId;

    private String uName;

    private String uTrueName;

    private String uPassword;

    private Integer uRoleid;
    
    private SysRole role;

    public SysRole getRole() {
		return role;
	}

	public void setRole(SysRole role) {
		this.role = role;
	}

	public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuTrueName() {
        return uTrueName;
    }

    public void setuTrueName(String uTrueName) {
        this.uTrueName = uTrueName == null ? null : uTrueName.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public Integer getuRoleid() {
        return uRoleid;
    }

    public void setuRoleid(Integer uRoleid) {
        this.uRoleid = uRoleid;
    }

	@Override
	public String toString() {
		return "Users [uId=" + uId + ", uName=" + uName + ", uTrueName=" + uTrueName + ", uPassword=" + uPassword
				+ ", uRoleid=" + uRoleid + ", role=" + role + "]";
	}
    
}