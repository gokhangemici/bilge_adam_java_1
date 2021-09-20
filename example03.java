package com.bilgeadam.main;

import java.util.Scanner;

public class example03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		double velocity, temperatureKelvin, temperatureCelcius, temperatureFahrenheit,  wct;
		System.out.println("Lütfen hýz deðerini giriniz: ");
		velocity = scanner.nextDouble();
		System.out.println("Lütfen sýcaklýk deðerini celcius cinsinden giriniz: ");
		temperatureCelcius = scanner.nextDouble() - 273.15;
		
		temperatureFahrenheit = (temperatureCelcius * 180 + 32);
		
		wct = 33 + (0.478 + 0.237 * Math.sqrt(velocity) - (0.0124 * velocity)) * 
				(temperatureFahrenheit - 33);
		
		temperatureCelcius = (temperatureFahrenheit - 32) / 180;
		System.out.println("Hýz deðeri: " + velocity);
		System.out.println("Celcius cinsinden sýcaklýk deðeri: " + temperatureCelcius);
		
		
		
		
		
		
		
	}
	
}
