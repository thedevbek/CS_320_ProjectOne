package com.jetbrains.bek;

import java.util.ArrayList;


public class ContactService {
    private final ArrayList<Contact> contacts;

    public ContactService()
    {

        contacts = new ArrayList<>();
    }
    public boolean addContact(Contact contact)
    {
        boolean contactAlready = false;
        for (Contact contactList:contacts)
        {
            if (contactList.equals(contact)) {
                contactAlready = true;
                break;
            }
        }
        if (!contactAlready)
        {
            contacts.add(contact);
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean deleteContact(String contactID)
    {
        for (Contact contactList:contacts)
        {
            if (contactList.getContactID().equals(contactID))
            {
                contacts.remove(contactList);
                return true;
            }
        }
        return false;
    }
    public boolean updateContact(String contactID)
    {
        for (Contact contactList:contacts)
        {
            if (contactList.getContactID().equals(contactID))
            {
                String firstName = null;
                if(firstName != null && !(firstName.length()>10))
                {
                    contactList.setFirstName(firstName);
                }
                String lastName = null;
                if(lastName != null && !(lastName.length()>10))
                {
                    contactList.setFirstName(lastName);
                }
                String phoneNumber = null;
                if(phoneNumber != null && (phoneNumber.length()==10))
                {
                    contactList.setFirstName(phoneNumber);
                }
                String address = null;
                if(address != null && !(address.length()>30))
                {
                    contactList.setFirstName(address);
                }
                return true;
            }
        }
        return false;
    }
}