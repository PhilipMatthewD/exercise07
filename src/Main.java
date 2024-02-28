
import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("What is the first contact name?");
        String userInputName = input.nextLine();
        System.out.println("What is the first contact's email address?");
        String userInputEmail = input.nextLine();
        System.out.println("Is this contact business related?");
        String userInput = input.nextLine();
        if (userInput.equals("yes")){
            System.out.println("What is their #?");
            int userInputPhone = parseInt(input.nextLine());
            BusinessContact person1 = new BusinessContact(userInputName, userInputEmail, userInputPhone);
            person1.display();
        }else{
            ContactInfo person1 = new ContactInfo(userInputName, userInputEmail);
            person1.display();
        }


    }
}