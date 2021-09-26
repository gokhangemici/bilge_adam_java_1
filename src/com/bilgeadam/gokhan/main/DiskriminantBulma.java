package com.bilgeadam.gokhan.main;

import java.util.Scanner;

public class DiskriminantBulma {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.println("(ax²+bx+c) ikinci dereceden bir denklemdir.\\n Denklemdeki sabitleri aþaðýdaki gibi sýrayla girin");
		
		System.out.println("a deðerini giriniz: ");
		int a = inp.nextInt();
		System.out.println("b deðerini giriniz: ");
		int b = inp.nextInt();
		System.out.println("c deðerini giriniz: ");
		int c = inp.nextInt();
		
		//diskriminant
		double delta = Math.pow(b, 2) - (4 * a * c);
		if(delta > 0)
		{
			double x1 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
			double x2 = ((1 * b) - Math.sqrt(delta)) / (2 * a);
			System.out.println("x1= " + x1 + " x2= " + x2);
		}
		else if(delta < 0)
		{
			System.out.println("Denklemin gerçel kökü yoktur.");
		}
		else
		{
			double x = (-1 * b) / (2 * a);
			System.out.println("Çakýþýk kök var x1= x2= " + x);
		}
		
	}
	
}
