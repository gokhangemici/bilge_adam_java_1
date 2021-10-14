package com.gokhan.composition;

public class Student {
	
	String firstName;
	String lastName;
	Address address;
	Phone cellPhone;
	
	public Student(String firstName, String lastName, Address address, Phone cellPhone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.cellPhone = cellPhone;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", cellPhone="
				+ cellPhone + "]";
	}
	
	
	

}
