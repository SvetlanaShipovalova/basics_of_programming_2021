package phone_book_core;

public class PhoneBook {
    private int contactsCount;
    private PhoneBook() {
        contactsCount = 0;
    }


    public void addContact(String name, String phone) {
        StringBuilder error = new StringBuilder();
        if(name == null)
            error.append("Name can not be null\n");
        if(phone == null)
            error.append("Phone can not be null\n");
        if(!error.isEmpty())
            throw new IllegalArgumentException(error.toString());

        contactsCount++;
    }

    public int getContactsCount() {
        return contactsCount;
    }

    public static PhoneBook create() {
        return new PhoneBook();
    }
}
