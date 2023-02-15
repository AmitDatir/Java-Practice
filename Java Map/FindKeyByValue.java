import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class FindKey {
    public static void main(String args[]) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("India", "New Delhi");
        capitals.put("United States", "Washington");
        capitals.put("England", "London");
        capitals.put("Nepal", "Kathmandu");
        capitals.put("Japan", "Tokyo");
        capitals.put("Shri-Lanka", "Colombo");
        System.out.println("Initial Hashmap: " + capitals);
        
        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter the string value to find key: ");
        // String value = new String();
        // value = input.nextLine();
        String value = "Washington";
        System.out.println("Given value is: " + value);
        
        for(Entry<String, String> entry : capitals.entrySet()){
            if(entry.getValue() == value){
                System.out.println("Key for the given value: " + entry.getKey());
                break;
            }
            // else {
            //     System.out.println("Please enter correct string.");
            // }
        }
    }
}


/*
Output:
Initial Hashmap: {United States=Washington, Japan=Tokyo, England=London, Shri-Lanka=Colombo, Nepal=Kathmandu, India=New Delhi}
Given value is: Washington
Key for the given value: United States
*/
