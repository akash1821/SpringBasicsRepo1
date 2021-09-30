package com.nt.comps;

public class Student {
	// assume all are optional to provide
	private Integer stdId;
	private String stdName;
	private String stdClgName;
	private Double stdFee;

	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public void setStdClgName(String stdClgName) {
		this.stdClgName = stdClgName;
	}

	public void setStdFee(Double stdFee) {
		this.stdFee = stdFee;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdClgName=" + stdClgName + ", stdFee=" + stdFee
				+ "]";
	}
	
	

}
