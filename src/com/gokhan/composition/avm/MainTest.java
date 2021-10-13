package com.gokhan.composition.avm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainTest {

	/*
	 * 4 tane ma�aza nesnesi olu�turdum ve 1 tane avm nesnesi olu�turarak o avm ye
	 * bu ma�azalar� ekledim Foreach ile ma�aza bilgilerini g�sterdim. Composition
	 * yap�s� kullanm�� oldum Bir avm de birden fazla ma�aza bulunabilir veya sadece
	 * bir tane de olabilir Burada avm s�n�f� ile store s�n�f� aras�nda 1 N ili�kisi
	 * bulunmakta
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store1 = new Store(1, "D&R", "Kitap ma�azas�", 15000);
		Store store2 = new Store(2, "Media market", "Elektronik ma�azas�", 20000);
		Store store3 = new Store(3, "Koton", "Giyim ma�azas�", 15000);
		Store store4 = new Store();
		store4.setId(4);
		store4.setStoreName("Perfume point");
		store4.setStoreMaterialName("Parf�m ma�azas�");
		store4.setPrice(300000);

		List<Store> storeCevahir = new ArrayList<Store>();
		storeCevahir.add(store1);
		storeCevahir.add(store2);
		storeCevahir.add(store3);
		storeCevahir.add(store4);

		ShoppingMall cevahir = new ShoppingMall(1, "Cevahir", "1993", "�stanbul", storeCevahir);

		List<Store> allStoresCevahir = cevahir.getStores(); // avm nin i�indeki ma�azalar� al�p bir listeye at�yorum.
		System.out.println("Cevahir avm i�inde bulunan ma�azalar");
		for (Store st : allStoresCevahir) {

			System.out.println(st);
		}
		System.out.println();
		List<Store> storeForum = new ArrayList<Store>();
		Store store5 = new Store(5, "Boyner", "Giyim ma�azas�", 156444);
		store5.setLogsDate(new Date(122, 5, 18)); 
		
		storeForum.add(store5);

		ShoppingMall forumIstanbul = new ShoppingMall(2, "Forum istanbul", "1985", "�stanbul", storeForum);
		List<Store> allStoresForum = forumIstanbul.getStores();
		System.out.println("Forum istanbul avm i�inde bulunan ma�azalar...");
		for (Store st : allStoresForum) {

			System.out.println(st);
		}

	}

}
