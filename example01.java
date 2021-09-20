package com.bilgeadam.main;

import java.util.Scanner;

public class example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner inp = new Scanner(System.in);
		int x1, x2, x3, x4, x5, sum = 0, avg = 0;
		System.out.println("Birinci sayi: ");
		x1 = inp.nextInt();
		System.out.println("Ýkinci sayi: ");
		x2 = inp.nextInt();
		System.out.println("Ucuncu sayi: ");
		x3 = inp.nextInt();
		System.out.println("Dorduncu sayi: ");
		x4 = inp.nextInt();
		System.out.println("Besinci sayi: ");
		x5 = inp.nextInt();
		
		sum = x1 + x2 + x3 + x4 + x5;
		avg = sum / 5;
		System.out.println("Beþ sayýnýn ortalamasý: " + avg);
		inp.close();
		
		
		
	

	}

}
