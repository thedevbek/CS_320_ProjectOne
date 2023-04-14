package com.jetbrains.bek;
import java.lang.String;

public  class Contact extends ContactService {

    private  String contactID;
    private  String firstName;
    private  String lastName;
    private  String phoneNumber;
    private  String address;

    Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {
        setContactID(contactID);
        setFirstName(firstName);
        setLastName(lastName);
        setPhoneNumber(phoneNumber);
        setAddress(address);
    }

    public String getContactID() {
        return contactID;
    }
    private void setContactID(String contactID) {
        validateContactID(contactID);
        this.contactID = contactID;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        validateFirstName(firstName);
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        validateLastName(lastName);
        this.lastName = lastName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        validatePhoneNumber(phoneNumber);
        this.phoneNumber = phoneNumber;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        validateAddress(address);
        this.address = address;
    }

    private void validateContactID(String contactID) {
        if (contactID == null) {
            throw new RuntimeException("Contact ID cannot be null or empty!");
        }
        if (contactID.length() > 10)
            throw new RuntimeException("Contact ID must have no more than 10 characters!");
    }

    private void validateFirstName(String firstName) {
        if (firstName == null) {
            throw new RuntimeException("First Name Cannot be null or empty");
        }
        if (firstName.length() > 10) {
            throw new RuntimeException("First Name must have no more than 10 characters!");
        }
    }

    private void validateLastName(String lastName) {
        if (lastName == null) {
            throw new RuntimeException("Last Name Cannot be null or empty");
        }
        if (lastName.length() > 10) {
            throw new RuntimeException("Last Name must have no more than 10 characters!");
        }
    }

    private void validatePhoneNumber(String phoneNumber) {
        if (phoneNumber == null) {
            throw new RuntimeException("Phone number Cannot be null or empty");
        }
        if (phoneNumber.length() != 10) {
            throw new RuntimeException("Phone number should be 10 digits!");
        }
        for (int i = 0; i < phoneNumber.length(); i++) {
            if (!Character.isDigit(phoneNumber.charAt(i))) {
                throw new RuntimeException("The phone number should be digits only!");
            }
        }
    }

    private void validateAddress(String address) {
        if (address == null) {
            throw new RuntimeException("Address Cannot be null or empty");
        }
        if (address.length() > 30) {
            throw new RuntimeException("Address Name must have no more than 30 characters!");
        }
    }
}

