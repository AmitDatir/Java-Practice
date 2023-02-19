//Using removeAll():
import java.util.Set;
import java.util.HashSet;

public class DifferenceSet1 {
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
        set2.add("4");
        set2.add("10");
        set2.add("b");
        System.out.println("Set-2: " + set2);
        
        set1.removeAll(set2);
        System.out.println("Difference set: " + set1);
    }
}


/*
Output:
Set-1: [a, 1, b, 2, c, 3]
Set-2: [1, b, 4, 10]
Difference set: [a, 2, c, 3]
*/



//Using Guava library:           //need to implement Guava library by adding it in dependency
import java.util.Set;
import java.util.HashSet;
import com.google.common.collect.Sets;

public class DifferenceSet2 {
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
        set2.add("4");
        set2.add("10");
        set2.add("b");
        System.out.println("Set-2: " + set2);
        
        Set<String> diffSet = Sets.difference(set1, set2);
        System.out.println("Difference set: " + diffSet);
    }
}
