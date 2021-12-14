package phone_book_tests;

import org.junit.*;
import phone_book_core.*;

public class PhoneBookTests extends Assert {
    @Test
    public void create_CreateEmptyPhoneBook_ContactsCountEqualsZero() {
        PhoneBook phoneBook = PhoneBook.create();
        assertEquals(0, phoneBook.getContactsCount());
    }
}
