//Using for-each loop:
import java.util.HashMap;
import java.util.Map.Entry;

public class IterateHashMap1 {
    public static void main(String args[]) {
        HashMap<String,String> map1 = new HashMap<>();
        map1.put("C", "1");
        map1.put("C++", "2");
        map1.put("C#", "3");
        map1.put("Java", "4");
        map1.put("Python", "5");
        map1.put("PHP", "6");
        map1.put("Ruby", "7");
        map1.put("Perl", "8");
        
        System.out.println("HashMap Entries: ");                  //iterating through key+value mapping
        for (Entry<String, String> entry : map1.entrySet()){
            System.out.print(entry + ", ");
        }
        
        System.out.println("\nKeys: ");                  //iterating through key mapping
        for (String key : map1.keySet()){
            System.out.print(key + ", ");
        }
        
        System.out.println("\nValues: ");                  //iterating through value mapping
        for (String value : map1.values()){
            System.out.print(value + ", ");
        }
    }
}


/*
Output:
HashMap Entries: 
C#=3, Java=4, C++=2, C=1, PHP=6, Perl=8, Ruby=7, Python=5, 
Keys: 
C#, Java, C++, C, PHP, Perl, Ruby, Python, 
Values: 
3, 4, 2, 1, 6, 8, 7, 5, 
*/



//Using Iterator:
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Iterator;

public class IterateHashMap2 {
    public static void main(String args[]) {
        HashMap<String,String> map1 = new HashMap<>();
        map1.put("C", "1");
        map1.put("C++", "2");
        map1.put("C#", "3");
        map1.put("Java", "4");
        map1.put("Python", "5");
        map1.put("PHP", "6");
        map1.put("Ruby", "7");
        map1.put("Perl", "8");
        
        Iterator<Entry<String, String>> iterate1 = map1.entrySet().iterator();          //iterating through key+value mapping
        System.out.println("HashMap Entries: ");                  
        while(iterate1.hasNext()){
            System.out.print(iterate1.next() + ", ");
        }
        
        Iterator<String> iterate2 = map1.keySet().iterator();                //iterating through key mapping
        System.out.println("\nKeys: ");                  
        while(iterate2.hasNext()){
            System.out.print(iterate2.next() + ", ");
        }
        
        Iterator<String> iterate3 = map1.values().iterator();               //iterating through value mapping
        System.out.println("\nValues: ");                  
        while(iterate3.hasNext()){
            System.out.print(iterate3.next() + ", ");
        }
    }
}
