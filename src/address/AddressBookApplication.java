package address;
import address.data.AddressBook;

/** main AddressBookApplication Class: purpose is to call a few methods from the AddressBook Class
 **/
class AddressBookApplication {
    // This method calls on methods from the AddressBook class
    public static void main(String[] args) {
        // Creates an instance of AddressBook called addressbook
        AddressBook addressbook = new AddressBook();
        // Calls initAddressBookExercise function
        initAddressBookExercise();


        /** Exercise 1 code for Menu (wont be used for exercise 2)
        Menu.prompt_FirstName();
        Menu.prompt_LastName();
        Menu.prompt_Street();
        Menu.prompt_City();
        Menu.prompt_State();
        Menu.prompt_Zip();
        Menu.prompt_Telephone();
        Menu.prompt_Email();
        */
    }

    // initAddressBookExercise METHOD: Creates an instance of AddressBook (called ab)
    public static void initAddressBookExercise(){
        // Creates an instance of AddressBook called ab
        AddressBook ab =  new AddressBook();
        // Adds entries that has been hard coded in AddressBook that is linked to an instance of AddresssEntry
        ab.add("Jerry","John","103 Chad Ave", "Hayward", "California",
                "12345", "123-456-7890", "VeryRealEmail@gmail.com");
        // Prints out the user's info
        ab.list();

        System.out.println("");

        AddressBook ab2 = new AddressBook();
        ab2.add("Rich", "Richard","456 Rich Way", "Richmond","California",
                "54321", "098-765-4321","SuperRealEmail@gmail.com");
        ab2.list();

    }

    }
