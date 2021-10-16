package com.triphan.myownclasses;

import java.time.LocalDate;

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
					e.getName(), e.getSalary(), e.getHireDate());
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
					e.getName(), e.getSalary(), e.getHireDate());
		}
		
	}
}

class Employee
{
//	Instance fields
	private String name;
	private double salary;
	private LocalDate hireDate;
	
//	Constructor
	public Employee(String name, double salary, int year, int month, int day)
	{
		this.name = name;
		this.salary = salary;
		this.hireDate = LocalDate.of(year, month, day);
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
	
	public LocalDate getHireDate()
	{
		return hireDate;
	}
	
//	Increase salary
	public void raiseSalary(double byPercent)
	{
		salary += salary * byPercent / 100;
	}
}



























