package address.data;


public class AddressBook {
    // Creates a new instance 'AddressEntryList' from AddressEntry class;
   AddressEntry AddressEntryList = new AddressEntry();

    // Prints out user's info
    public void list(){
        AddressEntryList.ToString();
    }

    // Hardcoded info that is added to our Linked HashMap (created in the AddressEntry Class)
    public void add(String firstName, String lastName, String street, String city, String state,
                    String zip, String phone, String email){
        // All the strings here are added to the Linked HashMap
        // Adds the user's FirstName
        AddressEntryList.setFirstName(firstName);
        // Adds user's LastName
        AddressEntryList.setLastName(lastName);
        // Adds user's Street
        AddressEntryList.setStreet(street);
        // Adds user's City
        AddressEntryList.setCity(city);
        // Adds user's State
        AddressEntryList.setState(state);
        // Adds user's Zip
        AddressEntryList.setZip(zip);
        // Adds user's Phone number
        AddressEntryList.setPhone(phone);
        // Adds user's Email
        AddressEntryList.setEmail(email);

        }



    }









