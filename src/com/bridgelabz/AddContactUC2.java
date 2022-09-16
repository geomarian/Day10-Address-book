/**
 * 
 */
package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class AddContactUC2 extends AddressBookMainUC1 {
	
	static ArrayList<AddContactUC2> addressBook = new ArrayList<AddContactUC2>();

     static String FirstName;
     String LastName;
     String Address;
     String State;
     String City;
     long Pincode;
     long MobileNo;
     String Email;

     Scanner input = new Scanner(System.in);
     
     public void contactDisplay() {
         System.out.println("Enter a First name: ");
         String FirstName = input.next();

         System.out.println("Enter a Last name: ");
         String LastName = input.next();

         System.out.println("Enter a Address: ");
         String Address = input.next();

         System.out.println("Enter a State: ");
         String State = input.next();

         System.out.println("Enter a City: ");
         String City = input.next();

         System.out.println("Enter a Zipcode: ");
         String Pincode = input.next();

         System.out.println("Enter a Phone NUmber: ");
         String MobileNo = input.next();

         System.out.println("Enter a Email: ");
         String Email = input.next();
         
         
         System.out.println("First Name:\t" + FirstName);
         System.out.println("Last name:\t" + LastName);
         System.out.println("Address:\t" + Address);
         System.out.println("State:\t" + State);
         System.out.println("Pincode:\t" + City);
         System.out.println("City:\t" + Pincode);
         System.out.println("Mobile No:\t" + MobileNo);
         System.out.println("Email:\t" + Email);
}
     
}

