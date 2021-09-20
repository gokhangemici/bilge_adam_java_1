package com.bilgeadam.main;

import java.util.Scanner;

public class example04 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sayi;
		boolean isEven = false;
		Scanner inp = new Scanner(System.in);
		System.out.println("Sayi giriniz: ");
		sayi = inp.nextInt();
		if(sayi % 2 == 0)
		{
			isEven = true;
			System.out.println("Sayý çifttir: ");
		}
		else
		{
			isEven = false;
			System.out.println("Sayi tektir: ");
		}
				
		
	}
	
}
