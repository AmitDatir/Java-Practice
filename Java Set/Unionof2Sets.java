//Using addAll():
import java.util.Set;
import java.util.HashSet;

public class UnionSet1 {
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
        System.out.println("Set-2: " + set2);
        
        set2.addAll(set1);
        System.out.println("Union set: " + set2);
    }
}

/*
Output:
Set-1: [a, 1, b, 2, c, 3]
Set-2: [1, 4, 10]
Union set: [1, a, b, 2, c, 3, 4, 10]
*/


//Using Guava library:           //need to implement Guava library by adding it in dependency
import java.util.Set;
import java.util.HashSet;
import com.google.common.collect.Sets;

public class UnionSet2 {
    public static void main(String args[]) {
        Set<String> set1 = new HashSet<>();
        set1.add("C");
        set1.add("C++");
        set1.add("C#");
        set1.add("Java");
        System.out.println("Set-1: " + set1);
        
        Set<String> set2 = new HashSet<>();
        set2.add("Java");
        set2.add("Python");
        set2.add("PHP");
        set2.add("Ruby");
        set2.add("Perl");
        System.out.println("Set-2: " + set2);
        
        Set<String> unionSet = Sets.union(set1, set2);
        System.out.println("Union set: " + unionSet);
    }
}
