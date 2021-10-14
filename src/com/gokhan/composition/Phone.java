package com.gokhan.composition;

public class Phone {

	int areaCode;
	int number;
	public Phone(int areaCode, int number) {
	
		this.areaCode = areaCode;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Phone [areaCode=" + areaCode + ", number=" + number + "]";
	}
	
	
	
}
