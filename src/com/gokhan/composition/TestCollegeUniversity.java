package com.gokhan.composition;

import java.util.ArrayList;
import java.util.List;

public class TestCollegeUniversity {

	public static void main(String[] args) {
		

		College c1 = new College("Abes engineering college", "ghazibad");
		College c2 = new College("AKG Engineering College", "Ghaziabad");
		College c3 = new College("ACN College of Engineering & Management Studies", "Aligarh");
		
		College c4 = new College();
		c4.setName("robert college");
		c4.setAddress("istanbul");
		List<College> college = new ArrayList<College>();
		college.add(c1);
		college.add(c2);
		college.add(c3);
		college.add(c4);
		University university = new University(college);
		
		List<College> colleges = university.getColleges();
		for (College cg : colleges) {
			
			System.out.println(cg.toString());
			
		}
		
		
	}
}
