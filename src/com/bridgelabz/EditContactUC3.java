/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class EditContactUC3 extends AddressBookMainUC1 {

	public EditContactUC3(String firstName, String lastName, String email, String city, String state, long mobileNo,
			int pincode) {
		// TODO Auto-generated constructor stub
	}

	public static void editDetails() {
       
	{
			Scanner sc = new Scanner(System.in);
			System.out.println(" Enter the first name. ");
			String fName = sc.nextLine();

			for (int index = 0; index < addressBook.size(); index++) {

				if (addressBook.get(index).toString().equals(fName)) {
					addressBook.remove(index);

					AddressBookMainUC1 addressBook = new AddressBookMainUC1();
					AddressBookMainUC1.createContact();

				} else {
					System.out.println(" There is no user in address book.. ");
	}
	
	
	

	
	
	
	
	}

	
}}

	public void add(EditContactUC3 addressBook) {
		// TODO Auto-generated method stub
		
	}} 	