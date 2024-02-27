package address.data;
import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

/** This class does a few things:
 * Initializes several strings (firstName,lastName,street,city,state,zip,phone,email)
 * Creates a Linked HashMap
 * Displays the Linked HashMap
 * Writes, Find, List, Remove, Reads entries to text file that is given/created by user
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

    // initialized a linked hashmap called 'addressEntryList'
    private final LinkedHashMap<String, String> addressEntryList = new LinkedHashMap<>();

    // opens file and writes info for our entries given to us by User
    // @param String fileName
    public String toWrite(String fileName){
        //try method
        try{
            // opens and writes text file given to us as a argument
            FileWriter myWriter = new FileWriter(fileName,true);
            BufferedWriter newWrite = new BufferedWriter(myWriter);
            // iterates through linked hashmap and writes it in text file
            for (Map.Entry<String,String> entry:addressEntryList.entrySet()){
                newWrite.write(entry.getKey() + ": "+ entry.getValue() + " ");
            }
            newWrite.newLine();
            // closes text file
            newWrite.close();
            // prints message letting user know that file has been updated
            System.out.println("File has been Updated");
        }//catch method
        catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        //random return statement since this method is a static that demands a return statement
        return "bruh";
    }

    // 'toRead' method which iterates through a given file name and prints out the entries
    // @param String fileName
    public void toRead(String fileName){
        //try method
        try{
            // creates a new object file and reads through said fileName given to us as an argument
            File myObj = new File (fileName);
            Scanner myRead = new Scanner (myObj);
            // while file has a next line, it will display contents of file
            while(myRead.hasNextLine()){
                String data = myRead.nextLine();
                // prints out data in a specified format
                System.out.println(" "+ data + " "+ "\n" );
            }
            // closes file after method is done executing
            myRead.close();
        }//catch method
        catch (FileNotFoundException e){
            System.out.println("An Error has Occureed");
            e.printStackTrace();
        }
    }

    // 'toFind' method which searches given text file and searches entries based on last name
    // or beginning part of last name (ex: last name: Smith can we found if user searched "S")
    // it then prints said specified last names
    //@param String fileName
    public void toFind(String fileName){
        //try method
        try{
            // takes user input and assigns it to 'search'
            Scanner myOb = new Scanner(System.in);
            System.out.println("Enter in all or beginning of last name you wish to find: ");
            String search = myOb.nextLine();
            // opens file
            File myObj = new File (fileName);
            Scanner myFind = new Scanner (myObj);
            // displays a message
            System.out.println("The following entries were found in the address book for "
                    + " a last name containing or starting with " + "'" + search + ",:" +"\n");
            // while there is another line in the text file
            while(myFind.hasNextLine()){
                String line = myFind.nextLine();
                // displays entries if it is the same or similar to the user input
                if (line.contains("Last Name: " + search)){
                    System.out.println(line);
                }
            }
            // close file
            myFind.close();
        }//catch method
        catch (FileNotFoundException e ){
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }

    // 'toRemove' method looks up entries based on last name
    // then deletes based on first name by creating a temp file to rewrite the file without the entry
    // the user wants removed
    //@param String fileName
    public void toRemove(String fileName){
        //try method
        try{
            //takes user input
            Scanner myOb = new Scanner(System.in);
            System.out.println("Enter in all or beginning of last name you wish to remove: ");
            String takeOut = myOb.nextLine();
            File myObj = new File (fileName);
            Scanner myFind = new Scanner (myObj);
            System.out.println("The following entries were found in the address book for "
                    + " a last name containing or starting with " + "'" + takeOut + ",:" +"\n");
            //shows user entries with the same last name to see which one they wish to remove
            while(myFind.hasNextLine()){
                String line = myFind.nextLine();
                if (line.contains("Last Name: " + takeOut)) {
                    System.out.println(line);
                }
            }
            //takes user input for firstName
            Scanner rem = new Scanner(System.in);
            System.out.println("Type in the First Name of the entry you wish to delete: ");
            String removed = rem.nextLine();
            File obi = new File (fileName);
            Scanner toremove = new Scanner (obi);
            // creates a temp file to rewrite entries without the entry the user wants removed
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
                        //skips the entry the user wants removed
                        if(trimmedLine.equals(lineToRemove)) continue;
                        writer.write(currentLine + System.getProperty("line.separator"));
                    }
                    // temp files
                    writer.close();
                    reader.close();
                    //renames temp file with current text file's name
                    boolean successful = tempFile.renameTo(inputFile);
                }
            }
            //closes main file
            myFind.close();
        }//catch methods
        catch (FileNotFoundException e ){
            System.out.println("An error has occured");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /** Every methods below this comment are Setters and Getters where:
     * Setters - takes the new string and sets it and then adds it to the Linked HashMap
     * Getters - returns said String
     */


    // Setter for Strings 'firstName'
    //@param String firstName
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        // Adds string (VALUE: 'firstName') to  Linked HashMap (KEY: "First Name")
        addressEntryList.put("First Name",firstName);


    }

    // Returns String 'firstName'
    //@return firstName
    public String getFirstName(){
        return firstName;
    }

    // Setter for String 'lastName'
    //@param String lastName
    public void setLastName(String lastName) {
        this.lastName = lastName;
        // Adds string (VALUE: 'lastName') to Linked HashMap (KEY: "Last Name")
        addressEntryList.put("Last Name",lastName);
    }

    // Returns String 'lastName'
    //@return lastName
    public String getLastName() {
        return lastName;
    }

    // Setter for String 'street'
    //@param String street
    public void setStreet(String street) {
        this.street = street;
        // Adds string (VALUE: 'street') to Linked HashMap (KEY: "Street")
        addressEntryList.put("Street",street);
    }

    // Returns String 'street'
    //@return street
    public String getStreet(){
        return street;
    }

    // Setter for String 'city'
    //@param String city
    public void setCity(String city) {
        this.city = city;
        // Adds string (VALUE: 'city') to Linked HashMap (KEY: "City")
        addressEntryList.put("City",city);
    }

    // Returns String 'city'
    //@return city
    public String getCity(){
        return city;
    }

    // Setter for String 'State'
    //@param String state
    public void setState(String state) {
        this.state = state;
        // Adds string (VALUE: 'state') to linked HashMap (KEY: "State")
        addressEntryList.put("State",state);
    }

    // Returns String 'state')
    //@return state
    public String getState() {
        return state;
    }

    // Setter for String 'zip'
    //@param String zip
    public void setZip(String zip) {
        this.zip = zip;
        // Adds string (VALUE: 'zip') to linked HashMap (KEY: "Zip")
        addressEntryList.put("Zip",zip);
    }

    // Returns string 'zip'
    //@return zip
    public String getZip() {
        return zip;
    }

    // Setter for String 'phone'
    //@param String phone
    public void setPhone(String phone) {
        this.phone = phone;
        // Adds string (VALUE: 'phone') to linked HashMap (KEY: "Phone")
        addressEntryList.put("Phone",phone);
    }

    // Returns string 'phone'
    //@return phone
    public String getPhone(){
        return phone;
    }

    // Setter for String 'Email'
    //@param String email
    public void setEmail(String email) {
        this.email = email;
        // Adds string (VALUE: 'email') to linked HashMap (KEY: "Email")
        addressEntryList.put("Email",email);
    }

    // Returns string 'email'
    //@return email
    public String getEmail(){
        return email;
    }


}
