package com.gokhan.composition.avm;


import java.util.ArrayList;

import java.util.List;

public class ShoppingMall extends CommonProperties{
	
	private String name;
	private String establishmentYear;
	private String city;
	private List<Store> stores;

	public ShoppingMall() {
		// TODO Auto-generated constructor stub
		
		stores = new ArrayList<Store>();
	}
	
	public ShoppingMall(int id, String name, String establishmentYear, String city, List<Store> stores) {
		
		super(id);
		this.name = name;
		this.establishmentYear = establishmentYear;
		this.city = city;
		this.stores = stores;
	}


	@Override
	public String toString() {
		return "ShoppingMall [name=" + name + ", establishmentYear=" + establishmentYear + ", city=" + city
				+ ", stores=" + stores + ", getId()=" + getId() + ", getLogsDate()=" + getLogsDate() + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEstablishmentYear() {
		return establishmentYear;
	}
	public void setEstablishmentYear(String establishmentYear) {
		this.establishmentYear = establishmentYear;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Store> getStores() {
		return stores;
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	

}
