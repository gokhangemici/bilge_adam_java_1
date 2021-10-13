package com.gokhan.composition.avm;

public class Store extends CommonProperties{
	
	private String storeName;
	private String storeMaterialName;
	private double price;
	
	
	public Store() {
		// TODO Auto-generated constructor stub
		storeName = "no value added";
		storeMaterialName = "no value added";
		price = 0.0d;
		
	}
	public Store(int id, String storeName, String storeMaterialName, double price) {
		
		super(id);
		this.storeName = storeName;
		this.storeMaterialName = storeMaterialName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Store [storeName=" + storeName + ", storeMaterialName=" + storeMaterialName + ", price=" + price
				+ ", getId()=" + getId() + ", getLogsDate()=" + getLogsDate() + "]";
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreMaterialName() {
		return storeMaterialName;
	}

	public void setStoreMaterialName(String storeMaterialName) {
		this.storeMaterialName = storeMaterialName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	
	
	
	

}
