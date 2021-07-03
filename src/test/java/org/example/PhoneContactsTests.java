package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PhoneContactsTests {
    PhoneContacts testPhoneContacts = new PhoneContacts();

    @Test
    public void testAddGroup_success() {
        final String group = "Test";
        Assertions.assertTrue(testPhoneContacts.addGroup(group));
    }

    @Test
    public void testAddContact_success() {
        Contact testContact = new Contact("TestName", "TestSurName", "000");
        String[] testGroups = {"Test1"};
        testPhoneContacts.addGroup("Test1");
        Assertions.assertTrue(testPhoneContacts.addContact(testContact, testGroups));
    }

    @Test
    public void testIsSameGroup_success() {
        String group = "Test";
        testPhoneContacts.addGroup(group);
        Assertions.assertFalse(testPhoneContacts.isSameGroup(group));
    }
}
