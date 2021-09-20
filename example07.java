package com.bilgeadam.main;

import java.util.Scanner;

public class example07 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vize, fin;
		double ortalama = 0;
		String harfNotu = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Vize notunu giriniz: ");
		vize = scanner.nextInt();
		
		System.out.println("Final notunu giriniz: ");
		fin = scanner.nextInt();
		
		ortalama = (vize * 0.4) + (fin * 0.6);
		
		if(fin >= 50)
		{
			if (ortalama >= 80 && ortalama <= 100) {
				harfNotu = "AA";
				System.out.println("Ders notu: " + harfNotu);
			} else if (ortalama >= 70 && ortalama < 80) {
				harfNotu = "BA";
				System.out.println("Ders notu: " + harfNotu);
			} else if (ortalama >= 60 && ortalama < 70) {
				harfNotu = "CC";
				System.out.println("Ders notu: " + harfNotu);
			} else if (ortalama >= 50 && ortalama < 60) {
				harfNotu = "DC";
				System.out.println("Ders notu: " + harfNotu);
			} else {
				harfNotu = "FF";
				System.out.println("Ders notu: " + harfNotu);
			}
		}
		else
		{
			System.out.println("Kaldýnýz");
		}
		

	}
	
}
