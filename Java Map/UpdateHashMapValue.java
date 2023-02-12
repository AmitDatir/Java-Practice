//Using put():-
import java.util.HashMap;

public class UpdateHashMap1 {
    public static void main(String args[]) {
        HashMap<String, String> capitals = new HashMap();
        capitals.put("India", "New Delhi");
        capitals.put("United States", "Washington");
        capitals.put("England", "London");
        capitals.put("Nepal", "Kathmandu");
        capitals.put("Japan", "Tokyo");
        capitals.put("Shri-Lanka", "Colombo");
        System.out.println("Initial Hashmap: " + capitals);
        
        String value = capitals.get("England");
        value = value + "!!!!!!";
        
        capitals.put("England", value);
        System.out.println("Updated Hashmap: " + capitals);
    }
}



/*
Output:
Initial Hashmap: {United States=Washington, Japan=Tokyo, England=London, Shri-Lanka=Colombo, Nepal=Kathmandu, India=New Delhi}
Updated Hashmap: {United States=Washington, Japan=Tokyo, England=London!!!!!!, Shri-Lanka=Colombo, Nepal=Kathmandu, India=New Delhi}
*/




//Using computeIfPresent():-
import java.util.HashMap;

public class UpdateHashMap2 {
    public static void main(String args[]) {
        HashMap<String, String> capitals = new HashMap();
        capitals.put("India", "New Delhi");
        capitals.put("United States", "Washington");
        capitals.put("England", "London");
        capitals.put("Nepal", "Kathmandu");
        capitals.put("Japan", "Tokyo");
        capitals.put("Shri-Lanka", "Colombo");
        System.out.println("Initial Hashmap: " + capitals);
        
        capitals.computeIfPresent("England", (key, oldValue) -> oldValue + "!!!!!!");             //Lambda expression
        System.out.println("Updated Hashmap: " + capitals);
    }
}



//Using merge():-
import java.util.HashMap;

public class UpdateHashMap3 {
    public static void main(String args[]) {
        HashMap<String, String> capitals = new HashMap();
        capitals.put("India", "New Delhi");
        capitals.put("United States", "Washington");
        capitals.put("England", "London");
        capitals.put("Nepal", "Kathmandu");
        capitals.put("Japan", "Tokyo");
        capitals.put("Shri-Lanka", "Colombo");
        System.out.println("Initial Hashmap: " + capitals);
        
        capitals.merge("England", "!!!!!!", (oldValue, newValue) -> oldValue + newValue);      
        System.out.println("Updated Hashmap: " + capitals);
    }
}
