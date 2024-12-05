// import all class from Java utility package
import java.util.*;

public class ImportPackage {

    public static void main(String[] args) {

        // initializing Scanner class from java.util package to take in input from user
        Scanner input = new Scanner(System.in);
        String name = "";
        String confirm = "no";

        // prompt user for their name
        System.out.println("1. Please enter your name: ");

        // use nextLine() method from Scanner calss to read line of text from input
        name = input.nextLine();

        // if the user declines their name
        while(true){

            // console out user's name
            System.out.println("Confirm: " + name + "... 'yes' or 'no'?");

            // assign user input to variable confirm
            // aside: String .trim() method to remove any excess whitespaces * .toLowerCase() method to account for any capitalization (reduce errors)
            confirm = input.nextLine().trim().toLowerCase();
            
            // if user input "yes"
            if(confirm.equals("yes")){
                // print out message to console
                System.out.println("'" + name + "' sent to database");
                // break out of whole loop --- halt loop
                break;
            }
            // if user input "no"
            else if(confirm.equals("no")){
                // prompt user to enter another name
                System.out.println("2. Please enter your name: ");
                // assign user input from next line to variable "name" ...
                name = input.nextLine();
                // and continue loop
            }
            // otw if user input is neither "yes" nor "no" ...
            else{
                // remind them of the options
                System.out.println("Please select either 'yes' or 'no' to proceed");
            }
        }

        /* closing the Scanner would get rid of the pesky "Resource leaked" warning above but no Scanner class input would not work ... for JDK 7 & onwards seems like try-catch is a workaround */
        // https://stackoverflow.com/questions/12519335/resource-leak-in-is-never-closed
        input.close();
        
    }
}