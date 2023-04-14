package com.jetbrains.bek;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ContactTest {

    @Test
    @DisplayName("The contact object shall have a required unique contact ID string that cannot be longer than 10 characters.")
    void TestGetContactID() {
        Contact contact = new Contact("12345", "Bek", "Johansson", "8322886911", "995 Media Luna");
        assertEquals(contact.getContactID(),"12345");
    }
    @Test
    @DisplayName("The first name object shall have a required first name string that cannot be longer than 10 characters.")
    void TestGetFirstName() {
        Contact contact = new Contact("12345", "Rebekah", "Johan", "8322886911", "995 Media Luna");
        contact.setFirstName("Rebekah");
        assertEquals(contact.getFirstName(),"Rebekah");
    }
    @Test
    @DisplayName("The last name object shall have a required last name string that cannot be longer than 10 characters.")
    void getLastName() {
        Contact contact = new Contact("12345", "Rebekah", "Johansson", "8322886911", "995 Media Luna");
        contact.setLastName("Johansson");
        assertEquals(contact.getLastName(),"Johansson");
    }

    @Test
    @DisplayName("The phone number object shall have a required phone number string that cannot be longer than 10 characters.")
    void getPhoneNumber() {
        Contact contact = new Contact("12345", "Rebekah", "Johansson", "8322886911", "995 Media Luna");
        contact.setPhoneNumber("8322886911");
        assertEquals(contact.getPhoneNumber(),"8322886911");
    }
    @Test
    @DisplayName("The address object shall have a required address string that cannot be longer than 30 characters.")
    void getAddress() {
        Contact contact = new Contact("12345", "Rebekah", "Johansson", "8322886911", "995 Media Luna");
        contact.setAddress("995 Media Luna");
        assertEquals(contact.getAddress(),"995 Media Luna");
    }
}