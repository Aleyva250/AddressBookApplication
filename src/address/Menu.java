package address;

/** Class Menu: class made up of static methods that prompts user to enter detials to fill out AddressBook
 **/
public class Menu {
    /** prompts user for first name;
     */
    public static String prompt_FirstName(){
        System.out.println("First Name: ");
        // return 'Jane' as default
        return "Jane";
    }

    // prompts user for Last Name
    public static String prompt_LastName(){
       System.out.println("Last Name: ");
       // return 'Smith' as default
       return "Smith";
    }

    // prompts user for Street address
    public static String prompt_Street(){
        System.out.println("Street: ");
        // return '101 Willow Dr' as default
        return "101 Willow Dr";
    }

    // prompt user for City address
    public static String prompt_City(){
        System.out.println("City: ");
        // return 'Whiterun' as default
        return "Whiterun";
    }

    // prompt user for State address
    public static String prompt_State(){
        System.out.println("State: ");
        // return 'CA' as default
        return "CA";
    }

    // prompt user for Zip address
    public static String prompt_Zip(){
        System.out.println("Zip: ");
        // return '12345' as default
        return "12345";
    }

    // prompt user for Telephone number
    public static String prompt_Telephone(){
        System.out.println("Telephone: ");
        // return '015-882-3005' as default
        return "015-882-3005";
    }

    // prompt user for Email address
    public static String prompt_Email(){
        System.out.println("Email: ");
        // return 'student@horizon.csueastbay.edu' as default
        return "student@horizon.csueastbay.edu";
    }

}
