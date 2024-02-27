package address;
import address.data.AddressBook;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.util.*;
import java.io.IOException;
/** Class Menu: class made up of static methods that prompts user to enter detials to fill out AddressBook
 **/
public class Menu {
    AddressBook ab = new AddressBook();
    public void menuSelection(){
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
        Scanner options = new Scanner(System.in);
        String selection = options.nextLine();
        System.out.println("You Selected: " + selection);
            switch (selection){
                case "a":
                    prompt_File();
                    break;
                case "b":
                    ab.add();
                    break;
                case "c":
                    ab.remove();
                    break;
                case "d":
                    ab.find();
                    break;
                case "e":
                    ab.listing();
                    break;
                case "f":
                    ab.quit();
                    break;
                default:
                    System.out.println("Invalid selection made!");
                    menuSelection();



        }



    }


    public static String prompt_FirstName(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("First Name: ");
        String firstName = myObj.nextLine();
        return firstName;
    }
    public static String prompt_LastName(){
        Scanner myObj =  new Scanner(System.in);
        System.out.println("Last Name: ");
        String lastName = myObj.nextLine();
        return lastName;
    }

    public static String prompt_Street(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Street: ");
        String street = myObj.nextLine();
        return street;
    }

    public static String prompt_City(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("City: ");
        String city = myObj.nextLine();
        return city;
    }
    public static String prompt_State(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("State: ");
        String state = myObj.nextLine();
        return state;
    }
    public static String prompt_Zip(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Zip: ");
        String zip = myObj.nextLine();
        return zip;
    }
    public static String prompt_Phone(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Phone: ");
        String phone = myObj.nextLine();
        return phone;
    }

    public static String prompt_Email(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Email: ");
        String email = myObj.nextLine();
        return email;
    }


    public static String prompt_File(){
        try{
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter File Name to edit: ");
            String newFile = myObj.nextLine();
            File currFile = new File(newFile);
            if (currFile.createNewFile()){
                System.out.println("File created: " + currFile.getName());
            }
            else{
                System.out.println("File Found: ");
            }
            return currFile.toString();
        }
        catch(IOException e ) {
            System.out.println("An error occured: ");
            e.printStackTrace();
        }
        return "meh";
    }







}
