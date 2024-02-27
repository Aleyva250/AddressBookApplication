package address.Test;
import address.data.AddressBook;

public class AddressBookTest {
    //
    AddressBook ab = new AddressBook();
    // Most methods in 'AddressBook' calls on another method from different classes

    // Test the 'add' method to make sure entries are added to a text file
    // TEST FILE: testing.txt
    public void addTest(){
        ab.add();
    }
}
