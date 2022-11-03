//using addAll():
import java.util.ArrayList;
import java.util.List;

public class JoinLists1 {
    public static void main(String args[]) {
        List<String> list1 = new ArrayList<>();
        list1.add("C");
        list1.add("C++");
        list1.add("C#");
        
        List<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("Python");
        list2.add("PHP");
        list2.add("Ruby");
        
        List<String> joined = new ArrayList<>();
        joined.addAll(list1);
        joined.addAll(list2);
        
        System.out.println("List-1: " + list1);
        System.out.println("List-2: " + list2);
        System.out.println("Joined List: " + joined);
    }
}


/* 
Output:
List-1: [C, C++, C#]
List-2: [Java, Python, PHP, Ruby]
Joined List: [C, C++, C#, Java, Python, PHP, Ruby]
*/



//using union():
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections.ListUtils;

public class JoinLists2 {
    public static void main(String args[]) {
        List<String> list1 = new ArrayList<>();
        list1.add("C");
        list1.add("C++");
        list1.add("C#");
        
        List<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("Python");
        list2.add("PHP");
        list2.add("Ruby");
        
        List<String> joined = ListUtils.union(list1, list2);
        
        System.out.println("List-1: " + list1);
        System.out.println("List-2: " + list2);
        System.out.println("Joined List: " + joined);
    }
}                                                           //Output??????




//using stream:
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoinLists3 {
    public static void main(String args[]) {
        List<String> list1 = new ArrayList<>();
        list1.add("C");
        list1.add("C++");
        list1.add("C#");
        
        List<String> list2 = new ArrayList<>();
        list2.add("Java");
        list2.add("Python");
        list2.add("PHP");
        list2.add("Ruby");
        
        List<String> joined =  Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
        
        System.out.println("List-1: " + list1);
        System.out.println("List-2: " + list2);
        System.out.println("Joined List: " + joined);
    }
}
