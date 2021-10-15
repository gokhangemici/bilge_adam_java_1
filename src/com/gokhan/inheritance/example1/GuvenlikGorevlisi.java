package com.gokhan.inheritance.example1;

public class GuvenlikGorevlisi extends Memur{
	
	private String belge;
	
	public GuvenlikGorevlisi(String adSoyad, String telefon, String eposta, String departman, String mesai, String belge) {
		
		super(adSoyad, telefon, eposta, departman, mesai);
		this.belge = belge;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GuvenlikGorevlisi [belge=" + belge + ", getDepartman()=" + getDepartman() + ", getMesai()=" + getMesai()
				+ ", getAdSoyad()=" + getAdSoyad() + ", getTelefon()=" + getTelefon() + ", getEposta()=" + getEposta()
				+ "]";
	}
	public void nobet()
	{
		System.out.println(this.getAdSoyad() + "bir " + this.getDepartman() +  " dir ve þu an nöbet tutmaktadýr");
	}

	/**
	 * @return the belge
	 */
	public String getBelge() {
		return belge;
	}

	/**
	 * @param belge the belge to set
	 */
	public void setBelge(String belge) {
		this.belge = belge;
	}
	
	
	
	
	
	

}
