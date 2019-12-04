package com.san.springdemo.mvc;

import java.util.LinkedHashMap;

import org.springframework.stereotype.Controller;

@Controller
public class Student {

	private String firstName;
	private String lastName;
	private String country;
	// using radio button from class
	  private LinkedHashMap<String, String> favoriteLanguageOptions;
	  
	//using property file for country
		//private LinkedHashMap<String, String> countryOptions;
	private String favoriteLanguage;
	
	private String[] operatingSystems;
	
	public Student() {
		// populate country options: used ISO country code
		//using property file for country
		/*
		 * countryOptions = new LinkedHashMap<>(); countryOptions.put("BR", "Brazil");
		 * countryOptions.put("FR", "France"); countryOptions.put("DE", "Germany");
		 * countryOptions.put("IN", "India"); countryOptions.put("US",
		 * "United States Of America");
		 */
		
		//using radio button from the class
			// populate favorite language options
	        favoriteLanguageOptions = new LinkedHashMap<>();
	
	        // parameter order: value, display label
	        //
	        favoriteLanguageOptions.put("Java", "Java");
	        favoriteLanguageOptions.put("C#", "C#");
	        favoriteLanguageOptions.put("PHP", "PHP");
	        favoriteLanguageOptions.put("Ruby", "Ruby");   
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	//using property file for country			
		//	public LinkedHashMap<String, String> getCountryOptions() {
		//		return countryOptions;
		//	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
   public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }

	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
   
}
