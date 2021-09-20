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
			System.out.print("Alaný hesaplanacak olan çokgenin kenar sayýsýný giriniz: ");
			n = inp.nextInt();
			System.out.print("Alaný hesaplanacak olan çokgenin kenar uzunluðunu giriniz: ");
			s = inp.nextInt();
		
			
		
			if(n >= 3)
			{
				alan = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));
				
				switch(n)
				{
					case 3:
						System.out.println("Bu bir üçgendir ve üçgenin alaný: " + alan);
						break;
					case 4:
						System.out.println("Bu bir dörtgendir ve dörtgenin alaný: " + alan);
						break;
					case 5:
						System.out.println("Bu bir beþgendir ve beþgenin alaný: " + alan);
						break;
					case 6:
						System.out.println("Bu bir altýgendir ve altýgenin alaný: " + alan);
						break;
					case 7:
						System.out.println("Bu bir yedigendir ve yedigenin alaný: " + alan);
						break;
					case 8:
						System.out.println("Bu bir sekizgendir ve sekizgenin alaný: " + alan);
						break;
					case 9:
						System.out.println("Bu bir dokuzgendir ve dokuzgenin alaný: " + alan);
						break;
					case 10:
						System.out.println("Bu bir ongendir ve ongenin alaný: " + alan);
						break;
				}
			}
			else
			{
				System.out.println("Hatalý giriþ yaptýnýz! Girdiðiniz kenar sayýsý bir çokgen oluþturmamaktadýr.");
			}
			System.out.println("Tekrar iþlem yapmak istiyor musunuz? (E, e): ");
			yesOrNo = inp.next();
			if(!yesOrNo.equalsIgnoreCase("e"))
			{
				System.out.println("Programdan çýktýnýz!");
				break;
			}
		}while(true);
		
		
		inp.close();
		
	}
	
}
