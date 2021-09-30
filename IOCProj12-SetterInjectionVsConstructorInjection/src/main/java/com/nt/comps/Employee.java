package com.nt.comps;

public class Employee {
	// All are mandatory to participate
	private Integer eid;
	private String ename;
	private Long phoneNum;
	private Double sal;

	public Employee(Integer eid, String ename, Long phoneNum, Double sal) {
		this.eid = eid;
		this.ename = ename;
		this.phoneNum = phoneNum;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", phoneNum=" + phoneNum + ", sal=" + sal + "]";
	}
	

}
