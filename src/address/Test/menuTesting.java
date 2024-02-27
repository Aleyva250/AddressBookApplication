package address.Test;
import address.Menu;
//

public class menuTesting {
    Menu menu = new Menu();
    // Run menu selection to be sure menu appears and that we are able to navigate the menu
    public void testMenuSelection(){
        menu.menuSelection();
    }

    // Makes sure prompt_firstName runs
    public void firstNameTest(){
        menu.prompt_FirstName();
    }

    // Makes sure prompt_lastName runs
    public void lastNameTest(){
        menu.prompt_LastName();
    }
    // Makes sure prompt_Street runs
    public void streetTest(){
        menu.prompt_Street();
    }

    //Makes sure prompt_City runs
    public void cityTest(){
        menu.prompt_City();
    }

    // Makes sure prompt_State runs
    public void stateTest(){
        menu.prompt_State();
    }

    //Makes sure prompt_Zip runs
    public void zipTest(){
        menu.prompt_Zip();
    }

    //Makes sure prompt_Phone runs
    public void phoneTest(){
        menu.prompt_Phone();
    }

    //Makes sure prompt_Email runs
    public void emailTest(){
        menu.prompt_Email();
    }

    //Makes sure prompt_File is running and that a new file is created
    public void fileTest(){
        menu.prompt_File();
    }

}
