package com.gokhan.composition;

public class College {

	public String name;
	public String address;

	public College() {
		// TODO Auto-generated constructor stub
	}

	public College(String name, String address) {

		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "College [name=" + name + ", address=" + address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
