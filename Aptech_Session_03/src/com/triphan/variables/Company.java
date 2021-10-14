package com.triphan.variables;

public class Company 
{
	public void intro(Person person)
	{
		System.out.println(person.getInfo());
	}
	
	public static void main(String[] args) 
	{
		Person john = new Person();
		System.out.println(john.getInfo());
		
		System.out.println(john.getCountry());
	}
}
