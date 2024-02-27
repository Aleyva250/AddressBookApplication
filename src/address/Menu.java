package address;
import address.data.AddressBook;
import java.io.File;
import java.util.*;
import java.io.IOException;
/** Class Menu: class made up of static methods that prompts user to enter detials to fill out AddressBook
 **/
public class Menu {
    // creates a new instance of 'AddressBook' class called 'ab'
    AddressBook ab = new AddressBook();

    // 'menuSelection' method displays a menu that takes user inputs
    // The inputs will then call on different methods depending on the selection made
    public void menuSelection(){

        // prints Menu options
        System.out.println("*********************");
        System.out.println("Please enter your menu selection");
        System.out.println("a) Loading from File");
        System.out.println("b) Addition");
        System.out.println("c) Removal");
        System.out.println("d) Find");
        System.out.println("e) Listing");
        System.out.println("f) Quit");
        System.out.println("************************");
        System.out.println("Please make a selection: ");

        // takes in user input
        Scanner options = new Scanner(System.in);
        String selection = options.nextLine();
        // prints the option the user selected
        System.out.println("You Selected: " + selection);
        // switch statement to navigate to the method called
            switch (selection){
                // Loading From File option -> takes user to 'prompt_file' method
                // it then returns back to this ('MenuSelection') method
                case "a":
                    prompt_File();
                    menuSelection();
                    break;
                // Addition option -> takes user to 'add' method in 'AddressBook' class
                // it then returns back to this ('MenuSelection') method
                case "b":
                    ab.add();
                    menuSelection();
                    break;
                // Removal option -> takes user to 'remove' method in 'AddressBook' class
                // it then returns back to this ('MenuSelection') method
                case "c":
                    ab.remove();
                    menuSelection();
                    break;
                // Find option -> takes user to 'find' method in 'AddressBook' class
                // it then returns back to this ('MenuSelection') method
                case "d":
                    ab.find();
                    menuSelection();
                    break;
                // Listing option -> takes user to 'listing' method in 'AddressBook' class
                // it then returns back to this ('MenuSelection') method
                case "e":
                    ab.listing();
                    menuSelection();
                    break;
                // Quit option -> takes user to 'quit' method in 'AddressBook' class
                // DOES NOT return after method is called so loop can end
                case "f":
                    ab.quit();
                    break;
                // Default -> prints error messages then recalls 'menuSelection' method so user can
                // input correct option
                default:
                    System.out.println("Invalid selection made!");
                    menuSelection();



        }

    }

    // 'prompt_FirstName' method which takes user input and assigns it to 'firstName' variable
    // @return firstName
    public static String prompt_FirstName(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("First Name: ");
        String firstName = myObj.nextLine();
        return firstName;
    }

    // 'prompt_LastName' method which takes user input and assigns it to 'LastName' variable
    // @return LastName
    public static String prompt_LastName(){
        Scanner myObj =  new Scanner(System.in);
        System.out.println("Last Name: ");
        String lastName = myObj.nextLine();
        return lastName;
    }

    // 'prompt_Street' method which takes user input and assigns it to 'street' variable
    // @return street
    public static String prompt_Street(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Street: ");
        String street = myObj.nextLine();
        return street;
    }

    // 'prompt_City' method which takes user input and assigns it to 'city' variable
    // @return city
    public static String prompt_City(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("City: ");
        String city = myObj.nextLine();
        return city;
    }

    // 'prompt_State' method which takes user input and assigns it to 'state' variable
    // @return state
    public static String prompt_State(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("State: ");
        String state = myObj.nextLine();
        return state;
    }

    // 'prompt_Zip' method which takes user input and assigns it to 'zip' variable
    // @return zip
    public static String prompt_Zip(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Zip: ");
        String zip = myObj.nextLine();
        return zip;
    }

    // 'prompt_Phone' method which takes user input and assigns it to 'phone' variable
    // @return phone
    public static String prompt_Phone(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Phone: ");
        String phone = myObj.nextLine();
        return phone;
    }

    // 'prompt_Email' method which takes user input and assigns it to 'email' variable
    // @return email
    public static String prompt_Email(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Email: ");
        String email = myObj.nextLine();
        return email;
    }

    // 'prompt_File' method which takes user input and assigns it as a text file
    // This method also: creates file if it does not exist
    // @return currFile.toString (which is the text File name that has turned into a string)
    public static String prompt_File(){
        //try method
        try{
            //takes user input to create a new file
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter File Name to edit (be sure to add '.txt' to the end of file): ");
            String newFile = myObj.nextLine();
            File currFile = new File(newFile);
            // if file does not exist, a message is displayed saying it has been created
            if (currFile.createNewFile()){
                System.out.println("File created: " + currFile.getName());
            }
            // if file already exist, a message is displayed saying that it already exist
            else{
                System.out.println("File Found: ");
            }
            // returns the String version of the file name
            return currFile.toString();
        }
        //catch method
        catch(IOException e ) {
            System.out.println("An error occured: ");
            e.printStackTrace();
        }
        //random return statement since this method is a static that demands a return statement
        return "meh";
    }







}
