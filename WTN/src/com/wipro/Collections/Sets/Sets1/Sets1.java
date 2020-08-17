package com.wipro.Collections.Sets.Sets1;

public class Sets1 {

	public static void main(String[] args) {
		Country countries = new Country();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("UK");
		countries.saveCountryNames("Bangladesh");
		countries.saveCountryNames("China");

		System.out.println("China: " + countries.getCountry("China"));
		System.out.println("Japan: " + countries.getCountry("Japan"));		
	}

}