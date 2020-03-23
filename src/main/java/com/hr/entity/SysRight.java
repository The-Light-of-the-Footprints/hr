package com.hr.entity;

public class SysRight {
    private Integer rightCode;

    private Integer rightParentCode;

    private String rightType;

    private String rightText;

    private String rightUrl;

    private String rightTip;

    public Integer getRightCode() {
        return rightCode;
    }

    public void setRightCode(Integer rightCode) {
        this.rightCode = rightCode;
    }

    public Integer getRightParentCode() {
        return rightParentCode;
    }

    public void setRightParentCode(Integer rightParentCode) {
        this.rightParentCode = rightParentCode;
    }

    public String getRightType() {
        return rightType;
    }

    public void setRightType(String rightType) {
        this.rightType = rightType == null ? null : rightType.trim();
    }

    public String getRightText() {
        return rightText;
    }

    public void setRightText(String rightText) {
        this.rightText = rightText == null ? null : rightText.trim();
    }

    public String getRightUrl() {
        return rightUrl;
    }

    public void setRightUrl(String rightUrl) {
        this.rightUrl = rightUrl == null ? null : rightUrl.trim();
    }

    public String getRightTip() {
        return rightTip;
    }

    public void setRightTip(String rightTip) {
        this.rightTip = rightTip == null ? null : rightTip.trim();
    }

	@Override
	public String toString() {
		return "SysRight [rightCode=" + rightCode + ", rightParentCode=" + rightParentCode + ", rightType=" + rightType
				+ ", rightText=" + rightText + ", rightUrl=" + rightUrl + ", rightTip=" + rightTip + "]";
	}
    
    
}