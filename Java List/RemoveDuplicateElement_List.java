//Using Set:
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicate1 {
    public static void main(String args[]) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("C");
        list1.add("C++");
        list1.add("C#");
        list1.add("Java");
        list1.add("C");
        list1.add("Python");
        list1.add("Python");
        list1.add("PHP");
        list1.add("Ruby");
        list1.add("Perl");
        list1.add("C");
        System.out.println("Old List: " + list1);
        
        Set<String> set1 = new LinkedHashSet<>();       //used LinkedHashSet to maintain insertion order
        set1.addAll(list1);
        
        list1.clear();
        list1.addAll(set1);
        System.out.println("Updated List: " + list1);
    }
}


/*
Output:
Old List: [Java, C, C++, C#, Java, C, Python, Python, PHP, Ruby, Perl, C]
Updated List: [Java, C, C++, C#, Python, PHP, Ruby, Perl]
*/


//Using Stream:
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class RemoveDuplicate2 {
    public static void main(String args[]) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("C");
        list1.add("C++");
        list1.add("C#");
        list1.add("Java");
        list1.add("C");
        list1.add("Python");
        list1.add("Python");
        list1.add("PHP");
        list1.add("Ruby");
        list1.add("Perl");
        list1.add("C");
        System.out.println("Old List: " + list1);
        
        Stream<String> stream = list1.stream();
        stream = stream.distinct();
        
        list1 = (ArrayList<String>)stream.collect(Collectors.toList());
        System.out.println("Updated List: " + list1);
    }
}
