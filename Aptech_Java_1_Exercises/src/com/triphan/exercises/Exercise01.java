/**
 * 
 */
package com.triphan.exercises;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * This sample demonstrate the Scanner, DecimalFormat classes.
 * 2021-10-15
 * 
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

public class Exercise01 
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
		Scanner in = new Scanner(System.in);
		
//		Validate fullname: 
		while (true) {
			System.out.print("Your fullname ? ");
			fullName = in.nextLine();
		
//			Check whether input is an empty string or not
			if (fullName.equals("")) 
			{
				System.out.println("*** Warning: Your name should not be empty. Try again !");
				continue;
			}
			break;
		}
		
//		Validate gender:
//		Input is only "m" or "f"
		while (true) 
		{
			System.out.print("Your gender (m or f) ? ");
			gender = in.nextLine();
			if (!gender.equalsIgnoreCase("m") && !gender.equalsIgnoreCase("f")) {
				System.out.println("*** Warning: Your gender should be \"m\" or \"f\". Try again !");
				continue;
			}
			break;
		}
		
//		Validate phone number: 
//		Check whether input is an empty string or not
		while (true) {
			System.out.print("Your phone number ? ");
			phoneNumber = in.nextLine();
			
			if (phoneNumber.equals("")) 
			{
				System.out.println("*** Warning: Your phone number should not be empty. Try again !");
				continue;
			}
			break;
		}
		
//		Validate address: 
//		Check whether input is an empty string or not
		while (true) {
			System.out.print("Your address ? ");
			address = in.nextLine();
			if (address.equals("")) 
			{
				System.out.println("*** Warning: Your address should not be empty. Try again !");
				continue;
			}
			break;
		}
		
//		Validate mark:
		while (true) 
		{
			in = new Scanner(System.in);
			System.out.print("Your mark ? (between 0 and 10) ");
			
//			Check whether the input is a float or not 
			if (!in.hasNextFloat()) 
			{
				System.out.println("*** Warning: Invalid mark. Try again !");
				continue;
			}
			
			mark = in.nextFloat();
//			Check whether the mark is between 0 and 10 or not
			if (mark < 0 || mark > 10)  
			{
				System.out.println("Invalid mark. Try again !");
				continue;
			}
			break;
		}
		
//		Close the scanner
		in.close();
		
//		Return the information 
		StringBuilder builder = new StringBuilder();
		builder.append("\n-------- Information --------\n");
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




































