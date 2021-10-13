package com.gokhan.composition.avm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainTest {

	/*
	 * 4 tane maðaza nesnesi oluþturdum ve 1 tane avm nesnesi oluþturarak o avm ye
	 * bu maðazalarý ekledim Foreach ile maðaza bilgilerini gösterdim. Composition
	 * yapýsý kullanmýþ oldum Bir avm de birden fazla maðaza bulunabilir veya sadece
	 * bir tane de olabilir Burada avm sýnýfý ile store sýnýfý arasýnda 1 N iliþkisi
	 * bulunmakta
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store store1 = new Store(1, "D&R", "Kitap maðazasý", 15000);
		Store store2 = new Store(2, "Media market", "Elektronik maðazasý", 20000);
		Store store3 = new Store(3, "Koton", "Giyim maðazasý", 15000);
		Store store4 = new Store();
		store4.setId(4);
		store4.setStoreName("Perfume point");
		store4.setStoreMaterialName("Parfüm maðazasý");
		store4.setPrice(300000);

		List<Store> storeCevahir = new ArrayList<Store>();
		storeCevahir.add(store1);
		storeCevahir.add(store2);
		storeCevahir.add(store3);
		storeCevahir.add(store4);

		ShoppingMall cevahir = new ShoppingMall(1, "Cevahir", "1993", "Ýstanbul", storeCevahir);

		List<Store> allStoresCevahir = cevahir.getStores(); // avm nin içindeki maðazalarý alýp bir listeye atýyorum.
		System.out.println("Cevahir avm içinde bulunan maðazalar");
		for (Store st : allStoresCevahir) {

			System.out.println(st);
		}
		System.out.println();
		List<Store> storeForum = new ArrayList<Store>();
		Store store5 = new Store(5, "Boyner", "Giyim maðazasý", 156444);
		store5.setLogsDate(new Date(122, 5, 18)); 
		
		storeForum.add(store5);

		ShoppingMall forumIstanbul = new ShoppingMall(2, "Forum istanbul", "1985", "Ýstanbul", storeForum);
		List<Store> allStoresForum = forumIstanbul.getStores();
		System.out.println("Forum istanbul avm içinde bulunan maðazalar...");
		for (Store st : allStoresForum) {

			System.out.println(st);
		}

	}

}
