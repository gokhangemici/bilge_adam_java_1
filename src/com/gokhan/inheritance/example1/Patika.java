package com.gokhan.inheritance.example1;

public class Patika {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calisan calisan = new Calisan("gokhan gemici", "5364464564", "info@patika.dev");
		calisan.giris();
		calisan.yemekhane();
		calisan.cikis();
		
		Akademisyen akademisyen = new Akademisyen("gokhan �zbay", "644545646", "eray@ayd�n.com", "akademisyen", "bilgisayar m�hendisli�i");
		akademisyen.derseGir();
		akademisyen.yemekhane();
		
		Memur memur = new Memur("selen �zbek", "65465654", "selenozbek@gmail.com", "bilgi islem", "09:00 - 18:00");
		memur.calis();
		
		OgretimGorevlisi ogretimGorevlisi = new OgretimGorevlisi("pelin olgun", "4665454", "pelin@hotmail.com", "��retim g�revlisi", "matematik", "111");
		ogretimGorevlisi.derseGir();
		ogretimGorevlisi.senatoToplantisi();
		
		Asistan asistan = new Asistan("burcu biricik", "5645646564", "burcubiricik@gmail.com", "asistan", "fizik b�l�m�", 14); 
		asistan.quizYap();
		
		LabAsistani labAsistani = new LabAsistani("tamer karada�", "465464654", "tamer@hotmail.com", "lab asistan�", "kimya", 18, "kimya 101");
		System.out.println(labAsistani.getAdSoyad() + " " + labAsistani.getUnvan() + " olarak g�rev yapar ve girdi�i lab dersinin ismi: " +  labAsistani.getLabName() + " dir.");
		labAsistani.derseGir();
		labAsistani.lablaraGir();
		
		BilgiIslem bilgiIslem = new BilgiIslem("nazl� ko�ak", "45645464", "nazli@gmail.com", "bilgi islem", "09:00 - 17:00", "teknoloji altyap�s�ndan sorumlu olma");
		bilgiIslem.networkKurulum();
		
		GuvenlikGorevlisi guvenlikGorevlisi = new GuvenlikGorevlisi("�zg�r g�nd�zkanat", "654654564", "�zg�r@gmail.com", "g�venlik", "08:00 - 17:00", "g�venlik belgesi");
		System.out.println(guvenlikGorevlisi.toString());
		
		
		

	}

}
