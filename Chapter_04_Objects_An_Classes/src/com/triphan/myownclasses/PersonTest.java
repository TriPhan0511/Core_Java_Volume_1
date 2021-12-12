/**
 * 
 */
package com.triphan.myownclasses;

/**
 * This program tests the Person class.
 * @version 1.00 2021-10-16
 * @author Tri Phan
 *
 */
public class PersonTest 
{
	public static void main(String[] args) 
	{
//		Create a Person array named students and fill it with three Person objects
		Person[] students = new Person[] 
		{
			new Person("Alex Ferguson", "Scotish", 1958, 6, 5),
			new Person("Harry Kewell", "Aussie", 1970, 12, 24),
			new Person("David Cooperfield", "American", 1965, 11, 5),
		};
		
//		Display information about all of students		
		for (Person s : students) {
			System.out.printf("Name: %s - Nationality: %s - Birthday: %s\n",
					s.getName(), s.getNationality(), s.getBirthDay());
		}
		
	}

}


























