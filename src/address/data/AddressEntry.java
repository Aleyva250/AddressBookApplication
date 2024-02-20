package address.data;
import java.util.*;

/** This class does a few things:
 * Initializes several strings (firstName,lastName,street,city,state,zip,phone,email)
 * Creates a Linked HashMap
 * Displays the Linked HashMap
 * Has Getters and Setters to change the Strings in the Linked HashMap
 */
public class AddressEntry {
    // Initializes Strings
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;

    // Creates a Linked HashMap named 'EntryList'
    HashMap<String, String> EntryList = new LinkedHashMap<>();


    // ToString METHOD: Prints out the User's Data using a for looped HashMap
    public String ToString(){
        // This for loop creates a HashMap to iterate through all the elements of Linked HashMap
        for(Map.Entry<String,String> entry : EntryList.entrySet()){
            // Prints in the format KEY: VALUE
            System.out.println(entry.getKey() + ": "+ entry.getValue());
        }
        // Returns a string if there is nothing in the Linked HashMap
        return "Hmm";
    }

    /** Every methods below this comments are my Setters and Getters where:
     * Setters - takes the new string and sets it and then adds it to the Linked HashMap
     * Getters - returns said String
     */

    // Setter for Strings 'firstName'
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        // Adds string (VALUE: 'firstName') to  Linked HashMap (KEY: "First Name")
        EntryList.put("First Name",firstName);
    }

    // Returns String 'firstName'
    public String getFirstName(){
        return firstName;
    }

    // Setter for String 'lastName'
    public void setLastName(String lastName) {
        this.lastName = lastName;
        // Adds string (VALUE: 'lastName') to Linked HashMap (KEY: "Last Name")
        EntryList.put("Last Name",lastName);
    }

    // Returns String 'lastName'
    public String getLastName() {
        return lastName;
    }

    // Setter for String 'street'
    public void setStreet(String street) {
        this.street = street;
        // Adds string (VALUE: 'street') to Linked HashMap (KEY: "Street")
        EntryList.put("Street",street);
    }

    // Returns String 'street'
    public String getStreet(){
        return street;
    }

    // Setter for String 'city'
    public void setCity(String city) {
        this.city = city;
        // Adds string (VALUE: 'city') to Linked HashMap (KEY: "City")
        EntryList.put("City",city);
    }

    // Returns String 'city'
    public String getCity(){
        return city;
    }

    // Setter for String 'State'
    public void setState(String state) {
        this.state = state;
        // Adds string (VALUE: 'state') to linked HashMap (KEY: "State")
        EntryList.put("State",state);
    }

    // Returns String 'state')
    public String getState() {
        return state;
    }

    // Setter for String 'zip'
    public void setZip(String zip) {
        this.zip = zip;
        // Adds string (VALUE: 'zip') to linked HashMap (KEY: "Zip")
        EntryList.put("Zip",zip);
    }

    // Returns string 'zip'
    public String getZip() {
        return zip;
    }

    // Setter for String 'phone'
    public void setPhone(String phone) {
        this.phone = phone;
        // Adds string (VALUE: 'phone') to linked HashMap (KEY: "Phone")
        EntryList.put("Phone",phone);
    }

    // Returns string 'phone'
    public String getPhone(){
        return phone;
    }

    // Setter for String 'Email'
    public void setEmail(String email) {
        this.email = email;
        // Adds string (VALUE: 'email') to linked HashMap (KEY: "Email")
        EntryList.put("Email",email);
    }

    // Returns string 'email'
    public String getEmail(){
        return email;
    }

}
