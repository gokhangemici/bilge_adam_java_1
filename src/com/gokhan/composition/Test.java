package com.gokhan.composition;

public class Test {
	
	public static void main(String[] args) {
		
		Phone homePhone = new Phone(555, 123456);
		
		Address address = new Address(1, "baðdat caddesi", "istanbul", "sancaktepe", homePhone);
		
		Phone cellPhone = new Phone(216, 536464467);
		Student student = new Student("gokhan", "gemici", address, cellPhone);
		System.out.println(student.address.street + " " + student.address.province + " " + student.address.city);
		System.out.println(student.cellPhone.number);
		
	}

}
