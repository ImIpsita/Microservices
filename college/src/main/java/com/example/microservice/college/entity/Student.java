package com.example.microservice.college.entity;

public class Student {
	
	private Long sId;
	private String sname;
	private String sAddress;
	private String sRollNo;
	public Long getsId() {
		return sId;
	}
	public void setsId(Long sId) {
		this.sId = sId;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public String getsRollNo() {
		return sRollNo;
	}
	public void setsRollNo(String sRollNo) {
		this.sRollNo = sRollNo;
	}
	public Student(Long sId, String sname, String sAddress, String sRollNo) {
		super();
		this.sId = sId;
		this.sname = sname;
		this.sAddress = sAddress;
		this.sRollNo = sRollNo;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
