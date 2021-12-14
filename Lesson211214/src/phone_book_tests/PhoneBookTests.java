package phone_book_tests;

import org.junit.*;
import phone_book_core.*;

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
}
