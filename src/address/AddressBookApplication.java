package address;
//imports only for testing purposes
import address.Test.AddressBookTest;
import address.Test.menuTesting;
import address.Test.addressEntryTest;
/////////////////////////////////

/** main AddressBookApplication Class: purpose is call on 'Menu' Classs
 **/
class AddressBookApplication {
    // This method creates a new instance of 'Menu' class
    public static void main(String[] args) {
        // new instance of 'Menu' class called 'menus'
        Menu menus = new Menu();
        // calls 'menuSelection' method which brings up a menu for user to choose from
        menus.menuSelection();





    }


}