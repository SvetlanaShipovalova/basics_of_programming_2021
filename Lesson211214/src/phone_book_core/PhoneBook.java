package phone_book_core;

public class PhoneBook {
    private int contactsCount;
    private PhoneBook() {
        contactsCount = 0;
    }


    public void addContact(String name, String phone) {
        if(name == null)
            throw new IllegalArgumentException("Name can not be null");
        contactsCount++;
    }

    public int getContactsCount() {
        return contactsCount;
    }

    public static PhoneBook create() {
        return new PhoneBook();
    }
}
