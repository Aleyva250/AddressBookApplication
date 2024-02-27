package address.data;
import java.util.*;
import java.io.*;
import address.Menu;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

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
    private String file;

    // <lastName, <"first name": firstName>>
    private final LinkedHashMap<String, String> addressEntryList = new LinkedHashMap<>();

    // Creates a Linked HashMap named 'EntryList'
   // HashMap<String, String> EntryList = new LinkedHashMap<>();


    // ToString METHOD: Prints out the User's Data using a for looped HashMap
    public String ToString(){
        // This for loop creates a HashMap to iterate through all the elements of Linked HashMap
        for(Map.Entry<String,String> entry : addressEntryList.entrySet()){
            // Prints in the format KEY: VALUE
            System.out.println(entry.getKey() + ": "+ entry.getValue());
        }
        // Returns a string if there is nothing in the Linked HashMap
        return "Hmm";
    }



    public String toWrite(String fileName){
        try{
            FileWriter myWriter = new FileWriter(fileName,true);
            BufferedWriter newWrite = new BufferedWriter(myWriter);
            for (Map.Entry<String,String> entry:addressEntryList.entrySet()){
                //newWrite.write(entry.getKey() + ": " + entry.getValue() + " ");
                newWrite.write(entry.getKey() + ": "+ entry.getValue() + " ");
            }
            newWrite.close();
            System.out.println("File has been Updated");
        }catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        return "bruh";
    }

    public void toRead(String fileName){
        try{
            File myObj = new File (fileName);
            Scanner myRead = new Scanner (myObj);
            while(myRead.hasNextLine()){
                String data = myRead.nextLine();
                System.out.println(" "+ data + " "+ "\n" );
            }
            myRead.close();
        }catch (FileNotFoundException e){
            System.out.println("An Error has Occureed");
            e.printStackTrace();
        }
    }

    public void toFind(String fileName){

        try{
            Scanner myOb = new Scanner(System.in);
            System.out.println("Enter in all or beginning of last name you wish to find: ");
            String search = myOb.nextLine();
            File myObj = new File (fileName);
            Scanner myFind = new Scanner (myObj);
            System.out.println("The following entries were found in the address book for "
                    + " a last name containing or starting with " + "'" + search + ",:" +"\n");
            while(myFind.hasNextLine()){
                String line = myFind.nextLine();
                if (line.contains("Last Name: " + search)){
                    System.out.println(line);
                }

            }
            myFind.close();
        }catch (FileNotFoundException e ){
            System.out.println("An error has occured");
            e.printStackTrace();
        }


    }
    public void toRemove(String fileName){
        try{
            Scanner myOb = new Scanner(System.in);
            System.out.println("Enter in all or beginning of last name you wish to remove: ");
            String takeOut = myOb.nextLine();
            File myObj = new File (fileName);
            Scanner myFind = new Scanner (myObj);
            System.out.println("The following entries were found in the address book for "
                    + " a last name containing or starting with " + "'" + takeOut + ",:" +"\n");
            while(myFind.hasNextLine()){
                String line = myFind.nextLine();
                if (line.contains("Last Name: " + takeOut)) {
                    System.out.println(line);
                }
            }
            Scanner rem = new Scanner(System.in);
            System.out.println("Type in the First Name of the entry you wish to delete: ");
            String removed = rem.nextLine();
            File obi = new File (fileName);
            Scanner toremove = new Scanner (obi);
            while(toremove.hasNextLine()){
                String line = toremove.nextLine();
                if (line.contains("Last Name: " + takeOut) && line.contains("First Name: "+ removed)){
                    File inputFile = new File(fileName);
                    File tempFile = new File("tempFile.txt");
                    BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                    BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
                    String lineToRemove = line;
                    String currentLine;
                    while ((currentLine = reader.readLine()) != null){
                        String trimmedLine = currentLine.trim();
                        if(trimmedLine.equals(lineToRemove)) continue;
                        writer.write(currentLine + System.getProperty("line.separator"));
                    }
                    writer.close();
                    reader.close();
                    boolean successful = tempFile.renameTo(inputFile);
                }

            }
            myFind.close();
        }catch (FileNotFoundException e ){
            System.out.println("An error has occured");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /** Every methods below this comments are my Setters and Getters where:
     * Setters - takes the new string and sets it and then adds it to the Linked HashMap
     * Getters - returns said String
     */


    // Setter for Strings 'firstName'
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        // Adds string (VALUE: 'firstName') to  Linked HashMap (KEY: "First Name")
        addressEntryList.put("First Name",firstName);


    }

    // Returns String 'firstName'
    public String getFirstName(){
        return firstName;
    }

    // Setter for String 'lastName'
    public void setLastName(String lastName) {
        this.lastName = lastName;
        // Adds string (VALUE: 'lastName') to Linked HashMap (KEY: "Last Name")
        addressEntryList.put("Last Name",lastName);
    }

    // Returns String 'lastName'
    public String getLastName() {
        return lastName;
    }

    // Setter for String 'street'
    public void setStreet(String street) {
        this.street = street;
        // Adds string (VALUE: 'street') to Linked HashMap (KEY: "Street")
        addressEntryList.put("Street",street);
    }

    // Returns String 'street'
    public String getStreet(){
        return street;
    }

    // Setter for String 'city'
    public void setCity(String city) {
        this.city = city;
        // Adds string (VALUE: 'city') to Linked HashMap (KEY: "City")
        addressEntryList.put("City",city);
    }

    // Returns String 'city'
    public String getCity(){
        return city;
    }

    // Setter for String 'State'
    public void setState(String state) {
        this.state = state;
        // Adds string (VALUE: 'state') to linked HashMap (KEY: "State")
        addressEntryList.put("State",state);
    }

    // Returns String 'state')
    public String getState() {
        return state;
    }

    // Setter for String 'zip'
    public void setZip(String zip) {
        this.zip = zip;
        // Adds string (VALUE: 'zip') to linked HashMap (KEY: "Zip")
        addressEntryList.put("Zip",zip);
    }

    // Returns string 'zip'
    public String getZip() {
        return zip;
    }

    // Setter for String 'phone'
    public void setPhone(String phone) {
        this.phone = phone;
        // Adds string (VALUE: 'phone') to linked HashMap (KEY: "Phone")
        addressEntryList.put("Phone",phone);
    }

    // Returns string 'phone'
    public String getPhone(){
        return phone;
    }

    // Setter for String 'Email'
    public void setEmail(String email) {
        this.email = email;
        // Adds string (VALUE: 'email') to linked HashMap (KEY: "Email")
        addressEntryList.put("Email",email);
    }

    // Returns string 'email'
    public String getEmail(){
        return email;
    }


}
