/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class CreateContactUC1 extends AddressBookMainUC1 {

     String FirstName;
     String LastName;
     String Address;
     String State;
     String City;
     long Pincode;
     long MobileNo;
     String Email;

     Scanner input = new Scanner(System.in);
     
     public void contactDisplay() {
         System.out.println("Enter First name: ");
         String FirstName = input.next();

         System.out.println("Enter Last name: ");
         String LastName = input.next();

         System.out.println("Enter Address: ");
         String Address = input.next();

         System.out.println("Enter State: ");
         String State = input.next();

         System.out.println("Enter City: ");
         String City = input.next();

         System.out.println("Enter Pincode: ");
         String Pincode = input.next();

         System.out.println("Enter MobileNo: ");
         String MobileNo = input.next();

         System.out.println("Enter Email: ");
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

