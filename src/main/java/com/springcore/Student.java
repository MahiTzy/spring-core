package com.springcore;

public class Student {
	private int stdId;
	private String stdName;
	private String stdAAdr;

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdAAdr() {
		return stdAAdr;
	}

	public void setStdAAdr(String stdAAdr) {
		this.stdAAdr = stdAAdr;
	}

	public Student(int stdId, String stdName, String stdAAdr) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdAAdr = stdAAdr;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdAAdr=" + stdAAdr + "]";
	}
}
