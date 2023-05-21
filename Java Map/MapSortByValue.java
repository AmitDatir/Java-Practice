import java.util.*;
import java.util.Map.Entry;

public class MapSort {
    public static void main(String args[]) {
        LinkedHashMap<String, String> capitals = new LinkedHashMap();
        capitals.put("India", "New Delhi");
        capitals.put("United States", "Washington");
        capitals.put("England", "London");
        capitals.put("Nepal", "Kathmandu");
        capitals.put("Japan", "Tokyo");
        capitals.put("Shri-Lanka", "Colombo");
        
        Map<String, String> result = sortMap(capitals);
        for(Map.Entry entry : result.entrySet()){
            System.out.print("Key: " + entry.getKey() + " | ");
            System.out.println("Value: " + entry.getValue());
        }
    }
    
    public static LinkedHashMap sortMap(LinkedHashMap map){
        List <Entry<String, String>> capitalList = new LinkedList<>(map.entrySet());
        
        Collections.sort(capitalList, (l1, l2) -> l1.getValue().compareTo(l2.getValue()));  //sort method of collections
        
        LinkedHashMap<String, String> result = new LinkedHashMap();
        
        for(Map.Entry<String, String> entry : capitalList){
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}




/*
Output:
Key: Shri-Lanka | Value: Colombo
Key: Nepal | Value: Kathmandu
Key: England | Value: London
Key: India | Value: New Delhi
Key: Japan | Value: Tokyo
Key: United States | Value: Washington
*/
