/**
 * 
 */
package com.triphan.exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This sample demonstrate the Scanner class.
 * 2021-10-15
 * @author Tri Phan
 *
 */

/*
 * Bài 1.1:
 * Thực hành các thao tác nhập / xuất:
 * 		_ Viết chương trình nhập vào họ và tên, giới tính, số điện thoại, địa chỉ, điểm.
 * 		_ Sau đó in các thông tin vừa nhập ra màn hình.
 * 		_Chú ý:
 * 			* Sử dụng lớp Scanner và các phương thưc nhập kiểu dữ liệu tương ứng.
 * 			* Sử dụng các phương thức (print, println...) của System.out để xuất dữ liệu. 
 * 
 * */

public class Exercise01Simple 
{
	public static void main(String[] args) 
	{
//		Calls the getAndDisplayInfo to get and display information of a student
		System.out.println(getAndDisplayInfo());
	}
	
//	-------------------------------- End of main method --------------------------------
	
	/* 
	 * Method getAndDisplayInfo: 
	 * 		Get information from user's input and display it to the console. 
	 * 
	 * */
	public static String getAndDisplayInfo()
	{
//		Declares some variables
		String fullName;
		String gender;
		String phoneNumber;
		String address;
		float mark;
		
//		Get information
//		The following try is a so-called "try block with resources". It automatically
//		closes the resource when the try block exixts.
		try (Scanner in = new Scanner(System.in))
		{
			System.out.print("Your fullname ? ");
			fullName = in.nextLine();
			System.out.print("Your gender ? ");
			gender = in.nextLine();
			System.out.print("Your phone number ? ");
			phoneNumber = in.nextLine();
			System.out.print("Your address ? ");
			address = in.nextLine();
			System.out.print("Your mark ? ");
			mark = in.nextFloat();
		}
		
////		Dummy data
//		fullName = "Alex Ferguson";
//		gender = "Male";
//		phoneNumber = "0905 123 456";
//		address = " 123 ABC";
//		mark = 7.55f;
		
//		Return the information 
		StringBuilder builder = new StringBuilder();
		builder.append("-------- Information --------\n");
		builder.append("Full Name: ");
		builder.append(fullName);
		builder.append("\nGender: ");
		builder.append(gender);
		builder.append("\nPhone Number: ");
		builder.append(phoneNumber);
		builder.append("\nAddress: ");
		builder.append(address);
		builder.append("\nMark: ");
		
//		Format the mark: The floating point number up to 1 decimal places.
		DecimalFormat df = new DecimalFormat("#.#"); 
		builder.append(df.format(mark));
		
		return builder.toString();
	}
	
//	-------------------------------- End of getAndDisplayInfo method --------------------------------
	
	
}




































