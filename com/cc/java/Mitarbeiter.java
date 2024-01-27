package com.cc.java;

public class Mitarbeiter {
	
	private String familyName ;
	private String firstName;
	private String role ;
	private int yearOfEntry ;
	
	public Mitarbeiter(String familyName, String firstName, String role, int yearOfEntry) {
		this.familyName = familyName;
		this.firstName = firstName;
		this.role = role;
		this.yearOfEntry = yearOfEntry;
	}


	public String getInfo(String flag) {
		// switch ..
		switch (flag) {
			case "#familyName":
				return familyName;
			case "#firstName":
				return firstName;
			case "#role":
				return role;						
			default:
				return "ERROR!";
		}

	}

	public String getYaerOfEntry(){
		return String.valueOf(yearOfEntry);
	}

	// public int setYearofEntry(){
	// 	return yearOfEntry;
	// }

}
