package com.gokhan.inheritance.example1;

public class LabAsistani extends Asistan{
	private String labName;
	public LabAsistani(String adSoyad, String telefon, String eposta, String unvan, String bolum, int ofisSaati, String labName) {
		
		super(adSoyad, telefon, eposta, unvan, bolum, ofisSaati);
		this.labName = labName;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LabAsistani [getOfisSaati()=" + getOfisSaati() + ", getUnvan()=" + getUnvan() + ", getBolum()="
				+ getBolum() + ", getAdSoyad()=" + getAdSoyad() + ", getTelefon()=" + getTelefon() + ", getEposta()="
				+ getEposta() + "]";
	}

	/**
	 * @return the labName
	 */
	public String getLabName() {
		return labName;
	}
	/**
	 * @param labName the labName to set
	 */
	public void setLabName(String labName) {
		this.labName = labName;
	}
	public void lablaraGir()
	{
		System.out.println(this.getUnvan() + " " +  this.getAdSoyad() +  " lablara tam olarak " + this.getOfisSaati() + ":00 de girmektedir!");
		
	}
	public void derseGir()
	{
		System.out.println(this.getAdSoyad() + " lab asistaný olarak derslere girmektedir!");
		
	}



}
