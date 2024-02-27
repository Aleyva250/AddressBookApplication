package address.data;
import address.Menu;

/** 'AddressBook' class purpose: to call functions from other classes and use them for our
 * 'menuSelection' method in 'Menu' class. Also sends out user inputted data to create our linked HashMap
 *
 */
public class AddressBook {
    // Creates a new instance 'EntryList' from AddressEntry class;
   AddressEntry EntryList = new AddressEntry();

   // calls 'toRead' method from 'AddressEntry' which prints out data from file
    public void listing(){
        // @param Menu.prompt_File; String of Text File name
        EntryList.toRead(Menu.prompt_File());
    }

    //User inputted Linked HashMap (created in the 'AddressEntry' Class)
    public void add(){
        // All the strings here are added to the Linked HashMap
        // Adds the user's FirstName
        EntryList.setFirstName(Menu.prompt_FirstName());
        // Adds user's LastName
        EntryList.setLastName(Menu.prompt_LastName());
        // Adds user's Street
        EntryList.setStreet(Menu.prompt_Street());
        // Adds user's City
        EntryList.setCity(Menu.prompt_City());
        // Adds user's State
        EntryList.setState(Menu.prompt_State());
        // Adds user's Zip
        EntryList.setZip(Menu.prompt_Zip());
        // Adds user's Phone number
        EntryList.setPhone(Menu.prompt_Phone());
        // Adds user's Email
        EntryList.setEmail(Menu.prompt_Email());
        // Writes user inputs to text file
        EntryList.toWrite(Menu.prompt_File());
        }

    // calls 'toRemove' method from 'AddressEntry' class to remove entries specified by user
    public void remove(){
        // @param Menu.prompt_File; String of Text File name
        EntryList.toRemove(Menu.prompt_File());
    }

    // calls 'toFind' method from 'AddressEntry' class to find entries specified by user
    public void find(){
        // @param Menu.prompt_File; String of Text File name
        EntryList.toFind(Menu.prompt_File());

    }

    // prints out statement
    public void quit(){
        System.out.println("Quitting");

    }




}




