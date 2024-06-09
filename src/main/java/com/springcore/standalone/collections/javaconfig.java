package com.springcore.standalone.collections;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import java.util.Arrays;

@Configuration
@ComponentScan(basePackages = "com.springcore.standalone.collections")
public class javaconfig {
		@Bean("temp")
    	List<String> person1(){
    		List<String> friend = new ArrayList<>();
    		friend.add("Mohit");
    		friend.add("Mohit");
    		friend.add("Mohit");
    		return friend;	
    	}
    }
