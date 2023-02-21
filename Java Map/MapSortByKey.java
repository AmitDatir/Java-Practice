import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapSortbyKey {
    public static void main(String args[]) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("India", "New Delhi");
        capitals.put("United States", "Washington");
        capitals.put("England", "London");
        capitals.put("Nepal", "Kathmandu");
        capitals.put("Japan", "Tokyo");
        capitals.put("Shri-Lanka", "Colombo");
        System.out.println("Pre-Sort Map: " + capitals);
        
        TreeMap<String, String> sorted = new TreeMap<>(capitals);
        System.out.println("Sorted Map by key: " + sorted);
    }
}


/*
Output:
Pre-Sort Map: {United States=Washington, Japan=Tokyo, England=London, Shri-Lanka=Colombo, Nepal=Kathmandu, India=New Delhi}
Sorted Map by key: {England=London, India=New Delhi, Japan=Tokyo, Nepal=Kathmandu, Shri-Lanka=Colombo, United States=Washington}
*/
