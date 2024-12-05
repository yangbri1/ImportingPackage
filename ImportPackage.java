// import all class from Java utility package
import java.util.*;

public class ImportPackage {

    public static void main(String[] args) {

        // initializing Scanner class from java.util package to take in input from user
        Scanner input = new Scanner(System.in);
        String name;
        String confirm;
        
        // prompt user for their name
        System.out.println("Please enter your name: ");

        // use nextLine() method from Scanner calss to read line of text from input
        name = input.nextLine();

        // console out user's name
        System.out.println("Confirm: " + name + "... 'yes' or 'no'?");

        confirm = input.nextLine();

        if(confirm.equals("yes")){
            System.out.println("Sealed");
        }
        else if(confirm.equals("no")){
            System.out.println("Please enter your name: ");
            name = input.nextLine();
        }
    }
}