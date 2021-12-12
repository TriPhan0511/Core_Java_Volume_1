package com.triphan.myownclasses;

import java.time.LocalDate;
import java.util.Objects;

/**
 * This program tests the Employee class.
 * @version 1.00 2021-10-16
 * @author Tri Phan 
 */
public class EmployeeTest 
{
	public static void main(String[] args) 
	{
//		Create an Employee array and fill it with three Employee objects.
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Jack Developer", 10000, 2020, 10, 5);
		staff[1] = new Employee("Mary Tester", 15000, 2019, 11, 24);
		staff[2] = new Employee("David Boss", 35000, 2000, 2, 15);
		
//		Display information about all Employees
		for (Employee e : staff) 
		{
			System.out.printf("Name= %s, salary= %,.2f, hire date= %s\n",
					e.getName(), e.getSalary(), e.getHireDay());
		}
		
//		Raise averyone's salary by 5%
		for (Employee e : staff) 
		{
			e.raiseSalary(5);
		}
		
//		Display the salary of all employees
		System.out.println("After increasing:");
		for (Employee e : staff) 
		{
			System.out.printf("Name= %s, salary= %,.2f, hire date= %s\n",
					e.getName(), e.getSalary(), e.getHireDay());
		}
		
		
	}
}

class Employee
{
//	Instance fields
	private String name;
	private double salary;
	private LocalDate hireDay;
	
//	Constructor
	public Employee(String n, double s, int year, int month, int day)
	{
		/* Solutions to handle the NullPointerExeption */
		
		/* Solution 1 */
//		if (n == null) 
//		{
//			name = "unknown";
//		}
//		else
//		{
//			name = n;
//		}
		
		/* Solution 2 */
//		name = Objects.requireNonNullElse(n, "unknown");
		
		/* Solution 3 */
		Objects.requireNonNull(n, "The name cannot be null.");
		name = n;
		
		salary = s;
		hireDay = LocalDate.of(year, month, day);
	}
	
//	Getters
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public LocalDate getHireDay()
	{
		return hireDay;
	}
	
//	Increase salary
	public void raiseSalary(double byPercent)
	{
		this.salary += salary * byPercent / 100;
	}
}



























