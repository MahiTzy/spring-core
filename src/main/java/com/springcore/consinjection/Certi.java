package com.springcore.consinjection;

public class Certi {
	private String name;

	@Override
	public String toString() {
		return "Certi [name=" + name + "]";
	}

	public Certi(String name) {
		super();
		this.name = name;
	}
}