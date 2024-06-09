package com.springcore.consinjection;

public class Person {
	private String name;
	private int pId;
	private Certi certi;
	public Person(String name, int pId, Certi certi) {
		super();
		this.name = name;
		this.pId = pId;
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", pId=" + pId + ", certi=" + certi + "]";
	}
	
	
	
	
}
