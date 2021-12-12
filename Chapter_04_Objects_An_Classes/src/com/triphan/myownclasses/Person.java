package com.triphan.myownclasses;

import java.time.LocalDate;

class Person 
{
//	Instance fields
	private String name;
	private String nationality;
	private LocalDate birthDay;
	
//	Constructor
	public Person(String name, String nationality, int year, int month, int day)
	{
		this.name = name;
		this.nationality = nationality;
		this.birthDay = LocalDate.of(year, month, day);
	}
	
//	Getters
	public String getName()
	{
		return name;
	}
	
	public String getNationality()
	{
		return nationality;
	}
	
	public LocalDate getBirthDay()
	{
		return birthDay;
	}
	
//	Override the toString method
	@Override
	public String toString() {
		return "Person [name=" + name + ", nationality=" + nationality + ", birthDay=" + birthDay + "]";
	}
}






















