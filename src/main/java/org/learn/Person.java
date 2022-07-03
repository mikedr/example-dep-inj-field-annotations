package org.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myPerson")
public class Person {

	@Autowired
	Sportist mySport;

	public Person() {
	}
	
	public String doSport() {
		return mySport.playSport();
	}
}

