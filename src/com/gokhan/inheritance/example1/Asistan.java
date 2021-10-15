package com.gokhan.inheritance.example1;

public class Asistan extends Akademisyen{
	
	private int ofisSaati;
	public Asistan(String adSoyad, String telefon, String eposta, String unvan, String bolum, int ofisSaati) {
		super(adSoyad, telefon, eposta, unvan, bolum);
		this.ofisSaati = ofisSaati;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Asistan [getOfisSaati()=" + getOfisSaati() + ", getUnvan()=" + getUnvan() + ", getBolum()=" + getBolum()
				+ ", getAdSoyad()=" + getAdSoyad() + ", getTelefon()=" + getTelefon() + ", getEposta()=" + getEposta()
				+ "]";
	}
	
	/**
	 * @return the ofisSaati
	 */
	public int getOfisSaati() {
		return ofisSaati;
	}
	/**
	 * @param ofisSaati the ofisSaati to set
	 */
	public void setOfisSaati(int ofisSaati) {
		this.ofisSaati = ofisSaati;
	}
	
	public void quizYap()
	{
		System.out.println(this.getUnvan() + " " + this.getAdSoyad() +  " þu anda quiz yapýyor!");
		
	}


	
	
	

}
