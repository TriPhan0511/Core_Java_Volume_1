/**
 * 
 */
package com.triphan.dateclasssamples;

import java.util.Date;

/**
 * This sample demnonstrates the Date class.
 * 2021-10-13
 * @author Tri Phan
 *
 */
public class DateSample 
{
	/*
	 * The standard Java library contains a Date class.
	 * Its objects describe points in time, such as December 31, 1999, 23:59:59 GMT.
	 * */
	
	/*
	 * Constructors always have the same name as the class name. Thus, the constructor for the Date class
	 * is called Date. To construct a Date object, combine the constructor with the new operator, as follows:
	 *
	 * 		new Date()
	 * 
	 * This expression constructs a new object. The object is initialized to the the current date and time.
	 * 
	 *  If you like, you can pass the object to a method:
	 *  
	 *  	System.out.println(new Date()); // -> Thus Oct 14 07:49:44 ICT 2021
	 *  
	 *  Alternatively, you can apply a method to the object that you just constructed.
	 *  
	 *  One of the methods of the Date class is the toString method. That method yields a string representation
	 *  of the date:
	 *  
	 *  	String str =  new Date().toString();
	 *		System.out.println(str); // -> Thus Oct 14 07:49:44 ICT 2021
	 *  
	 *  In these two examples, the constructed object is used only once. Usually, you will want to hang on to
	 *  the objects that you construct so that you can keep using them. Simply store the object in a variable:
	 *  
	 *  	Date birthDay = new Date();
	 * 
	 * */
	
	/*
	 * There is an important difference between object and object variables. For example, the statement:
	 * 
	 * 		Date deadline; // deadline doesn't refer to any object.
	 * 
	 * defines an object variable, deadline, that can refer to objects of type Date. It is important to
	 * realize that the variable deadline is not an object, and, in fact, does not even refer to an object yet.
	 * You can not use any Date methods on this variable at this time. The statement:
	 * 
	 * 		String s = deadline.toString(); // not yet.
	 * 
	 * would cause a compile-time error.
	 * 
	 * You must first initialize the deadline vatiable. You have two choices. Of course, you can initialize the
	 * variable so that it refers to a newly constructed object:
	 * 
	 * 		deadline = new Date();
	 * 
	 * Or you can set the variable refer to an existing object:
	 * 
	 * 		deadline = birthDay;
	 * 
	 * Now both variables refer the same object.
	 * 
	 * It is important to realize that an object variable doesn't actually contain an object. It only refers to an object.
	 * 
	 * In Java, the value of any object variable is a reference to an object that is stored elsewhere. The return value of
	 * the new operator is also a reference. A statement such as:
	 * 
	 * 		Date deadline = new Date();
	 * 
	 * has two parts. The expression new Date() makes an object of type Date, and its value is a reference to that newly
	 * created object. That reference is then stored in the dealine variable.
	 * 
	 * You can explicitly set an object variable to null to indicate that it currently refers to no object.
	 * 
	 * 		if (deadline != null) 
	 *		{
	 *			System.out.println(deadline.toString());
	 *		}
	 * 
	 * 
	 * */
	
	public static void main(String[] args) 
	{
//		System.out.println(new Date());
////		-> Thus Oct 14 07:49:44 ICT 2021
		
//		String str =  new Date().toString();
//		System.out.println(str);
////		-> Thus Oct 14 07:49:44 ICT 2021
		
//		-----------------------------------------------------------------------
		
//		Date birthDay = new Date();
//		System.out.println(birthDay);
//
//		Date deadline; // deadline doesn't refer to any object.
//		
////		String s = deadline.toString(); // error
//		
////		Choice 1:
//		deadline = new Date();
//		String str = deadline.toString();
//		System.out.println(str); // -> Thu Oct 14 08:13:20 ICT 2021
//		
////		Choice 2:
//		deadline = birthDay;
//		System.out.println(deadline);
		
//		---------------------------------------------------------------------------
		
//		Date d1 = new Date(1984, 10, 5);
//		Date d2 = d1;
//		
////		System.out.println(d2.toString());
//////		-> Wed Nov 05 00:00:00 ICT 3884
////		System.out.println(d1.toString());
//////		-> Wed Nov 05 00:00:00 ICT 3884
//		
//		System.out.printf("d1: %s\nd2: %s", d1.toString(), d2.toString());
//		
////		Change the value of d1
//		d1 = new Date(2021, 9, 14);
//		
//		System.out.printf("\nAfter changing\nd1: %s\nd2: %s", d1.toString(), d2.toString());
		
//		---------------------------------------------------------------------------
		
		var deadline = new Date();
		System.out.println(deadline.toString());
		
		deadline = null;
		if (deadline != null) 
		{
			System.out.println(deadline.toString());
		} 
		
	}
	
	
}





































