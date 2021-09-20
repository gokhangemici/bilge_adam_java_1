package com.bilgeadam.main;

import java.util.Scanner;

public class example06 {
	
	public static void main(String args[])
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Lütfen hizi giriniz: ");
		int hiz = inp.nextInt();
		double para = 0;
		double erkenIndirim = 0.15;
		
		if(hiz >= 80 && hiz <= 85)
		{
			para = 200;
			para = para - (para * erkenIndirim);
			System.out.println("Ödenecek ceza miktari: " + para);	
		}
		else if(hiz > 85 && hiz <= 100)
		{
			para = 300;
			para = para - (para * erkenIndirim);
			System.out.println("Ödenecek ceza miktari: " + para);
		}
		else if(hiz > 100)
		{
			para = 1000;
			System.out.println("Çok hýzlý gidiyorsunuz! Ehliyetinize el konuldu...");
			System.out.println("Ödenecek ceza miktari: " + para);
		}
		else
		{
			System.out.println("Herþey normal");
		}
	}
}
