package phone_book_core;

public class PhoneBook {
    private int contactsCount;
    private PhoneBook() {
        contactsCount = 0;
    }


    public void addContact(String name, String phone) {
        if(phone == null && name == null)
            throw new IllegalArgumentException("Phone can not be null, name can not be null");
        if(name == null)
            throw new IllegalArgumentException("Name can not be null");
        if(phone == null)
            throw new IllegalArgumentException("Phone can not be null");
        contactsCount++;
    }

    public int getContactsCount() {
        return contactsCount;
    }

    public static PhoneBook create() {
        return new PhoneBook();
    }
}
