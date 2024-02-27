package address.Test;
import address.data.AddressEntry;

import java.util.LinkedHashMap;

public class addressEntryTest {
    //creating instance of 'AddressEntry'
    //TEST FILE: testing.txt
    AddressEntry ae = new AddressEntry();


    // initialized a linked hashmap called 'TestEntryList'
    private final LinkedHashMap<String, String> TestEntryList = new LinkedHashMap<>();

    //IMPORTANT: Calling these methods require a string argument to be added

    //Testing to see if values are added to Linked HashMap
    public void setFirstNameTest(String firstName) {
        TestEntryList.put("First Name",firstName);
        System.out.println(firstName);
    }
    public void setLastNameTest(String lastName) {
        TestEntryList.put("Last Name", lastName);
        System.out.println(lastName);
    }
    public void setCityTest(String city) {
        TestEntryList.put("City",city);
        System.out.println(city);
    }

    public void setStateTest(String state) {
        TestEntryList.put("State",state);
        System.out.println(state);
    }

    public void setZipTest(String zip) {
        TestEntryList.put("Zip",zip);
        System.out.println(zip);
    }

    public void setPhoneTest(String phone) {
        TestEntryList.put("Phone",phone);
        System.out.println(phone);
    }

    public void setEmailTest(String email) {
        TestEntryList.put("Email",email);
        System.out.println(email);
    }


    //Seeing if my text file will be written
    public void writeTest(){
        ae.toWrite("testing.txt");

    }
    //Testing 'toRead' to see if file can be displayed
    public void readTest(){
        ae.toRead("testing.txt");
    }

    //Testing 'toFind' to see if enteries can be found via lastName
    public void findTest(){
        ae.toFind("testing.txt");
    }
}
