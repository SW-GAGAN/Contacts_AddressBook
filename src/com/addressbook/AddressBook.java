package com.addressbook;

/*
@Description - To create a contacts in address book with first name, last name, address, city, state,
* zip,mobile number.
 */
public class AddressBook {
    public static void main(String[] args) {
        Contacts contact = new Contacts("Gagan", "Reddy", " madivala",
                "Benglore", "Karnataka", 560099,
                91805666658L, "gaga@gmail.com");
        System.out.println(contact.toString());
    }

}

