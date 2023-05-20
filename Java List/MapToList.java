//map to list:
import java.util.*;

public class MapList {
    public static void main(String args[]) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Amit");
        map.put(2, "Revan");
        map.put(3, "Sourav");
        map.put(4, "Abhishek");
        map.put(5, "Akshay");
        System.out.println("Hashmap: " + map);
   
        List<Integer> keyList = new ArrayList<>(map.keySet());
        List<String> valueList = new ArrayList<>(map.values());
        
        System.out.println("Key List: " + keyList);
        System.out.println("Value List: " + valueList);
    }
}



/*
Output:
Hashmap: {1=Amit, 2=Revan, 3=Sourav, 4=Abhishek, 5=Akshay}
Key List: [1, 2, 3, 4, 5]
Value List: [Amit, Revan, Sourav, Abhishek, Akshay]
*/




//using stream:
import java.util.*;
import java.util.stream.Collectors;

public class MapList {
    public static void main(String args[]) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Amit");
        map.put(2, "Revan");
        map.put(3, "Sourav");
        map.put(4, "Abhishek");
        map.put(5, "Akshay");
        System.out.println("Hashmap: " + map);
        
        List<Integer> keyList = map.keySet().stream().collect(Collectors.toList());
        List<String> valueList = map.values().stream().collect(Collectors.toList());
        
        System.out.println("Key List: " + keyList);
        System.out.println("Value List: " + valueList);
    }
}
