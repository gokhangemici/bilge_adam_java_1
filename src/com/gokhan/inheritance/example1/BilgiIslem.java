package com.gokhan.inheritance.example1;

public class BilgiIslem extends Memur {

	private String gorev;

	public BilgiIslem(String adSoyad, String telefon, String eposta, String departman, String mesai, String gorev) {
		super(adSoyad, telefon, eposta, departman, mesai);
		this.gorev = gorev;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BilgiIslem [gorev=" + gorev + ", getDepartman()=" + getDepartman() + ", getMesai()=" + getMesai()
				+ ", getAdSoyad()=" + getAdSoyad() + ", getTelefon()=" + getTelefon() + ", getEposta()=" + getEposta()
				+ "]";
	}

	public void networkKurulum() {
		System.out.println(this.getDepartman() + " görevlisi " + getAdSoyad() + " network kurulumundan sorumludur! ");

	}

	/**
	 * @return the gorev
	 */
	public String getGorev() {
		return gorev;
	}

	/**
	 * @param gorev the gorev to set
	 */
	public void setGorev(String gorev) {
		this.gorev = gorev;
	}

}
