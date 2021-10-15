package com.gokhan.inheritance.example1;

public class Patika {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calisan calisan = new Calisan("gokhan gemici", "5364464564", "info@patika.dev");
		calisan.giris();
		calisan.yemekhane();
		calisan.cikis();
		
		Akademisyen akademisyen = new Akademisyen("gokhan özbay", "644545646", "eray@aydýn.com", "akademisyen", "bilgisayar mühendisliði");
		akademisyen.derseGir();
		akademisyen.yemekhane();
		
		Memur memur = new Memur("selen özbek", "65465654", "selenozbek@gmail.com", "bilgi islem", "09:00 - 18:00");
		memur.calis();
		
		OgretimGorevlisi ogretimGorevlisi = new OgretimGorevlisi("pelin olgun", "4665454", "pelin@hotmail.com", "öðretim görevlisi", "matematik", "111");
		ogretimGorevlisi.derseGir();
		ogretimGorevlisi.senatoToplantisi();
		
		Asistan asistan = new Asistan("burcu biricik", "5645646564", "burcubiricik@gmail.com", "asistan", "fizik bölümü", 14); 
		asistan.quizYap();
		
		LabAsistani labAsistani = new LabAsistani("tamer karadað", "465464654", "tamer@hotmail.com", "lab asistaný", "kimya", 18, "kimya 101");
		System.out.println(labAsistani.getAdSoyad() + " " + labAsistani.getUnvan() + " olarak görev yapar ve girdiði lab dersinin ismi: " +  labAsistani.getLabName() + " dir.");
		labAsistani.derseGir();
		labAsistani.lablaraGir();
		
		BilgiIslem bilgiIslem = new BilgiIslem("nazlý koçak", "45645464", "nazli@gmail.com", "bilgi islem", "09:00 - 17:00", "teknoloji altyapýsýndan sorumlu olma");
		bilgiIslem.networkKurulum();
		
		GuvenlikGorevlisi guvenlikGorevlisi = new GuvenlikGorevlisi("özgür gündüzkanat", "654654564", "özgür@gmail.com", "güvenlik", "08:00 - 17:00", "güvenlik belgesi");
		System.out.println(guvenlikGorevlisi.toString());
		
		
		

	}

}
