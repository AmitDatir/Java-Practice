//HashSet class:
import java.util.Set;
import java.util.HashSet;

public class SubSet1 {
    public static void main(String args[]) {
        Set<String> set1 = new HashSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("1");
        set1.add("2");
        set1.add("3");
        System.out.println("Set-1: " + set1);
        
        Set<String> set2 = new HashSet<>();
        set2.add("1");
        //set2.add("4");
        //set2.add("10");
        set2.add("b");
        System.out.println("Set-2: " + set2);
        
        boolean result = set1.containsAll(set2);
        System.out.println("Is Set-2 subset of Set-1?: " + result);
    }
}


/*
Output:
Set-1: [a, 1, b, 2, c, 3]
Set-2: [1, b]
Is Set-2 subset of Set-1?: true
*/



//TreeSet Class:
import java.util.Set;
import java.util.TreeSet;

public class SubSet1 {
    public static void main(String args[]) {
        Set<String> set1 = new TreeSet<>();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("1");
        set1.add("2");
        set1.add("3");
        System.out.println("Set-1: " + set1);
        
        Set<String> set2 = new TreeSet<>();
        set2.add("1");
        //set2.add("4");
        //set2.add("10");
        set2.add("b");
        System.out.println("Set-2: " + set2);
        
        boolean result = set1.containsAll(set2);
        System.out.println("Is Set-2 subset of Set-1?: " + result);
    }
}
