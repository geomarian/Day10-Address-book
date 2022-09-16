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
public class AddressBookMainUC1 {

	/**
	 * @param args
	 */

	public static  Scanner input = new Scanner(System.in);

	static ArrayList addressBook = new ArrayList();

	//	Take input from users to create Contact
	public static void createContact() {
		//

		System.out.print("Enter FirstName: ");
		String firstName = input.next();


		System.out.print("Enter LastName: ");
		String lastName = input.next();


		System.out.print("Enter Address: ");
		String address = input.next();


		System.out.print("Enter City: ");
		String city = input.next();


		System.out.print("Enter State: ");
		String state = input.next();


		System.out.print("Enter Pincode: ");
		int pincode = input.nextInt();


		System.out.print("Enter Mobile No: ");
		long mobileNo = input.nextLong();


		System.out.print("Enter Email Id: ");
		String email = input.next();

		System.out.println("------------------------");
		System.out.println("First Name: " + firstName);
		System.out.println("Last Name : " + lastName);
		System.out.println("Last Name : " + address);
		System.out.println("City : " + city);
		System.out.println("State is: " + state);
		System.out.println("Pincode : " + pincode);
		System.out.println("Mobile No : " + mobileNo);
		System.out.println("Email : " + email);

		
		EditContactUC3 addressBook = new EditContactUC3(firstName, lastName, email, city, state, mobileNo, pincode);
		addressBook.add(addressBook);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Address Book Application...");
		createContact();


		System.out.println("-----------------------");
		CreateContactUC1 createContact = new CreateContactUC1();
		createContact.contactDisplay();
		
		System.out.println("-----------------------");
		AddContactUC2 addContact = new AddContactUC2();
		addContact.contactDisplay();

		
		
		DeleteContactUC4 contactDelete = new DeleteContactUC4();
		contactDelete.deleteContact();
	}


}
