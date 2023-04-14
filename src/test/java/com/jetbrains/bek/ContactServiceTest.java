package com.jetbrains.bek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {

    @Test
    public void testAdd() {
        ContactService cs = new ContactService();
        Contact contact = new Contact("12345", "Bek", "Johansson", "8322886911", "995 Media Luna");
        assertTrue(cs.addContact(contact));

        contact = new Contact("12345", "Bek", "Johansson", "8322886911", "995 Media Luna");
        assertTrue(cs.addContact(contact));

        assertFalse(cs.addContact(contact));
    }

    @Test
    public void testRemove() {
        ContactService cs = new ContactService();
        Contact contact = new Contact("12345", "Bek", "Johansson", "8322886911", "995 Media Luna");
        cs.addContact(contact);

        assertTrue(cs.deleteContact("12345"));
        assertTrue(cs.addContact(contact));
    }

    @Test
    public void testUpdate() {
        ContactService cs = new ContactService();
        Contact contact = new Contact("12345", "Bek", "Johansson", "8322886911", "995 Media Luna");
        cs.addContact(contact);

        assertTrue(cs.updateContact("12345"));
        assertFalse(cs.updateContact(String.valueOf(contact)));
    }

}