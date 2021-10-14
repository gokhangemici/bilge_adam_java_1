package com.gokhan.composition;

public class Address {

	int number;
	String street;
	String city;
	String province;
	Phone homePhone;
	
	public Address(int number, String street, String city, String province, Phone homePhone) {
		super();
		this.number = number;
		this.street = street;
		this.city = city;
		this.province = province;
		this.homePhone = homePhone;
	}

	@Override
	public String toString() {
		return "Address [number=" + number + ", street=" + street + ", city=" + city + ", province=" + province
				+ ", homePhone=" + homePhone + "]";
	}
	
	
	
	
}
