package com.bilgeadam.main;

import java.util.Scanner;

public class example02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner inp = new Scanner(System.in);
		int n, s;
		double alan;
		String yesOrNo; 
		do {
			System.out.print("Alan� hesaplanacak olan �okgenin kenar say�s�n� giriniz: ");
			n = inp.nextInt();
			System.out.print("Alan� hesaplanacak olan �okgenin kenar uzunlu�unu giriniz: ");
			s = inp.nextInt();
		
			
		
			if(n >= 3)
			{
				alan = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
				
				switch(n)
				{
					case 3:
						System.out.println("Bu bir ��gendir ve ��genin alan�: " + alan);
						break;
					case 4:
						System.out.println("Bu bir d�rtgendir ve d�rtgenin alan�: " + alan);
						break;
					case 5:
						System.out.println("Bu bir be�gendir ve be�genin alan�: " + alan);
						break;
					case 6:
						System.out.println("Bu bir alt�gendir ve alt�genin alan�: " + alan);
						break;
					case 7:
						System.out.println("Bu bir yedigendir ve yedigenin alan�: " + alan);
						break;
					case 8:
						System.out.println("Bu bir sekizgendir ve sekizgenin alan�: " + alan);
						break;
					case 9:
						System.out.println("Bu bir dokuzgendir ve dokuzgenin alan�: " + alan);
						break;
					case 10:
						System.out.println("Bu bir ongendir ve ongenin alan�: " + alan);
						break;
				}
			}
			else
			{
				System.out.println("Hatal� giri� yapt�n�z! Girdi�iniz kenar say�s� bir �okgen olu�turmamaktad�r.");
			}
			System.out.println("Tekrar i�lem yapmak istiyor musunuz? (E, e): ");
			yesOrNo = inp.next();
			if(!yesOrNo.equalsIgnoreCase("e"))
			{
				System.out.println("Programdan ��kt�n�z!");
				break;
			}
		}while(true);
		
		
		inp.close();
		
	}
	
}
