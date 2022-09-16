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

	static ArrayList<AddressBookMainUC1> addressBook = new ArrayList<AddressBookMainUC1>();

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
		System.out.println("Phone No : " + mobileNo);
		System.out.println("Email : " + email);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Address Book Application...");
		createContact();


		System.out.println("-----------------------");
		CreateContactUC1 createcontact = new CreateContactUC1();
		createcontact.contactDisplay();

		System.out.println("-----------------------");
		AddContactUC2 addcontact = new AddContactUC2();
		addcontact.contactDisplay();

		DeleteContactUC4 delete = new DeleteContactUC4();
		delete.deleteContact();
	}


}
