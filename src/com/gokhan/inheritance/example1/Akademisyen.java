package com.gokhan.inheritance.example1;

public class Akademisyen extends Calisan {

	private String unvan;
	private String bolum;

	public Akademisyen(String adSoyad, String telefon, String eposta, String unvan, String bolum) {
		super(adSoyad, telefon, eposta);
		this.bolum = bolum;
		this.unvan = unvan;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Akademisyen [unvan=" + unvan + ", bolum=" + bolum + ", getAdSoyad()=" + getAdSoyad() + ", getTelefon()="
				+ getTelefon() + ", getEposta()=" + getEposta() + "]";
	}

	public String getUnvan() {
		return unvan;
	}

	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public void derseGir() {
		System.out.println(this.getAdSoyad() + " derse girdi.");
	}

}
