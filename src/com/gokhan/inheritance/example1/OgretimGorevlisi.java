package com.gokhan.inheritance.example1;

public class OgretimGorevlisi extends Akademisyen{
	
	private String kapiNo;
	
	public OgretimGorevlisi(String adSoyad, String telefon, String eposta, String unvan, String bolum, String kapiNo) {
		super(adSoyad, telefon, eposta, unvan, bolum);
		this.kapiNo = kapiNo;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "OgretimGorevlisi [kapiNo=" + kapiNo + ", getUnvan()=" + getUnvan() + ", getBolum()=" + getBolum()
				+ ", getAdSoyad()=" + getAdSoyad() + ", getTelefon()=" + getTelefon() + ", getEposta()=" + getEposta()
				+ "]";
	}
	
	public void sinavYap()
	{
		System.out.println(this.getAdSoyad() + " adl� �gretim gorevlisi s�nav yap�yor!");
	}
	public void senatoToplantisi()
	{
		System.out.println(this.getAdSoyad() + " adl� ��retim g�revlisi senato toplant�s�na girdi!");
		
	}
	public String getKapiNo()
	{
		return kapiNo;
	}
	public void setKapiNo(String kapiNo)
	{
		this.kapiNo = kapiNo;
	}

	
	
	

	
}
