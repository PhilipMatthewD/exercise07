import java.util.*;

public class PhoneBook {
    Map<String,String> people = new HashMap<>();
    public void addContact(ContactInfo a){
        people.put(a.getName(),a.getEmail());
    }
    public void findEmail(String a){
        if(people.containsKey(a)){
            System.out.println(a + "s email is " + people.get(a));
        } else {
            System.out.println("That name isn't available");
        }
    }
}