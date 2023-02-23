package com.pavan.All_apps;

import java.util.Date;


import com.pavan.All.entity.Aadhar;
import com.pavan.All.entity.Person;
import com.pavan.All.repository.AssocationReposirory;

public class PersonApp {
	public static void main(String[] args) {	
		Person person = new Person();
		person.setName("Akshara");
    	person.setGender("female");
    	person.setAge(3L);
    	person.setContactNumber("1122334455");
    	person.setDateOfBirth(new Date(0));
    	person.setEmail("akshara@user.in");
		
		Aadhar aadhar = new Aadhar();
		aadhar.setAdharNumber("111122223333");
		aadhar.setCity("kurnool");
		aadhar.setCountry("india");
		aadhar.setState("ap");
		person.setAdharDetails(aadhar);
		
		AssocationReposirory assocationReposirory = new AssocationReposirory();
		assocationReposirory.savePersonDetailes(person);
		
	}

}
