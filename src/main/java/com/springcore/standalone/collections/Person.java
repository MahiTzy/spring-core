package com.springcore.standalone.collections;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("#{temp}")
	private List<String> friends;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + "]";
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(List<String> friends) {
		super();
		this.friends = friends;
	}
}
