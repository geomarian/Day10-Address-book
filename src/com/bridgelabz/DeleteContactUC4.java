/**
 * 
 */
package com.bridgelabz;

/**
 * @author ASUS
 *
 */
public class DeleteContactUC4 extends AddressBookMainUC1 {
	
	public void deleteContact() {
        System.out.println("confirm the name to delete contact");
        String confirmName = input.next();
        
        for (int i = 0; i < addressBook.size(); i++) {
            System.out.println(addressBook.get(i));
            
			if (AddressBookMainUC1.addressBook.equals(confirmName)) ;
            AddressBookMainUC1 person = (AddressBookMainUC1) addressBook.get(i);
            addressBook.remove(person);
        }
        System.out.println("User deleted successfully");
    }

}
