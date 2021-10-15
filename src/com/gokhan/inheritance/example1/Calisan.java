package com.gokhan.inheritance.example1;




public class Calisan {
	
	private String adSoyad;
	private String telefon;
	private String eposta;
	
	public Calisan() {
		// TODO Auto-generated constructor stub
	}
	public Calisan(String adSoyad, String telefon, String eposta) {
		
		this.adSoyad = adSoyad;
		this.telefon = telefon;
		this.eposta = eposta;
	}
	
	@Override
	public String toString() {
		return "Calisan [getAdSoyad()=" + getAdSoyad() + ", getTelefon()=" + getTelefon() + ", getEposta()="
				+ getEposta() + "]";
	}
	public void giris()
	{
		System.out.println(adSoyad + " üniversiteye giriþ yaptý! ");
	}
	public void cikis()
	{
		System.out.println(adSoyad +  " üniversiteden çýkýþ yaptý");
	}
	public void yemekhane()
	{
		System.out.println(adSoyad + " yemekhaneye giriþ yaptý! ");
		
	}

	public String getAdSoyad() {
		return adSoyad;
	}

	public void setAdSoyad(String adSoyad) {
		this.adSoyad = adSoyad;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getEposta() {
		return eposta;
	}

	public void setEposta(String eposta) {
		this.eposta = eposta;
	}
	
	
	
	

	
	
}
