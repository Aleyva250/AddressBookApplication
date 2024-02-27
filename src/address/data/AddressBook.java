package address.data;
import address.Menu;

public class AddressBook {
    // Creates a new instance 'AddressEntryList' from AddressEntry class;
   AddressEntry EntryList = new AddressEntry();


    // Prints out user's info
    public void list(){
        EntryList.ToString();

    }


    public void listing(){
        EntryList.toRead(Menu.prompt_File());
    }

    // Hardcoded info that is added to our Linked HashMap (created in the AddressEntry Class)
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

        EntryList.toWrite(Menu.prompt_File());

        }

    public void remove(){
        EntryList.toRemove(Menu.prompt_File());
    }
    public void find(){
        EntryList.toFind(Menu.prompt_File());

    }

    public void quit(){
        System.out.println("Quitting");

    }




}




