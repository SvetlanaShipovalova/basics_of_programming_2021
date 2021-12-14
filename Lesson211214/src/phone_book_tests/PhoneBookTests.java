package phone_book_tests;

import org.junit.*;
import phone_book_core.*;

import java.util.List;

public class PhoneBookTests extends Assert {
    @Test
    public void create_CreateEmptyPhoneBook_ContactsCountEqualsZero() {
        PhoneBook phoneBook = PhoneBook.create();
        assertEquals(0, phoneBook.getContactsCount());
    }

    @Test
    public void addContact_AddContactWithNameAndPhone_ContactsCountEqualsOne() {
        PhoneBook phoneBook = PhoneBook.create();
        phoneBook.addContact("name", "phone");
        assertEquals(1, phoneBook.getContactsCount());
    }
    @Test
    public void addContact_AddContactWithNullName_ThrowsException() {
        PhoneBook phoneBook = PhoneBook.create();
        var exc = assertThrows(IllegalArgumentException.class, () -> phoneBook.addContact(null, "phone"));
        assertTrue(exc.getMessage().toLowerCase().contains("name can not be null"));
    }
    @Test
    public void addContact_AddContactWithNullPhone_ThrowsException() {
        PhoneBook phoneBook = PhoneBook.create();
        var exc = assertThrows(IllegalArgumentException.class, () -> phoneBook.addContact("name", null));
        assertTrue(exc.getMessage().toLowerCase().contains("phone can not be null"));
    }
    @Test
    public void addContact_AddContactWithNullNameAndNullPhone_ThrowsException() {
        PhoneBook phoneBook = PhoneBook.create();
        var exc = assertThrows(IllegalArgumentException.class, () -> phoneBook.addContact(null, null));
        assertTrue(exc.getMessage().toLowerCase().contains("phone can not be null") &&
                   exc.getMessage().toLowerCase().contains("name can not be null"));
    }

    @Test
    public void getContact_getContactByName_returnListOfPhones() {
        PhoneBook phoneBook = PhoneBook.create();
        phoneBook.addContact("name1", "phone1");
        phoneBook.addContact("name2", "phone2");
        phoneBook.addContact("name3", "phone3");
        List<String> phones = phoneBook.getPhonesForName("name1");
        assertTrue(phones.contains("phone1"));
        assertEquals(1, phones.size());
    }
}
