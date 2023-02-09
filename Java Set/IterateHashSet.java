//Using For-each loop:
import java.util.HashSet;
import java.util.Set;

public class IterateHashSet1 {
    public static void main(String args[]) {
        Set<String> set1 = new HashSet<>();
        set1.add("C");
        set1.add("C++");
        set1.add("C#");
        set1.add("Java");
        set1.add("Python");
        set1.add("PHP");
        set1.add("Ruby");
        set1.add("Perl");
        System.out.println("Set: " + set1);
        
        System.out.println("Iterating over HashSet using for-each loop: ");
        for(String iterate : set1){
            System.out.print(iterate + ", ");
        }
    }
}


/*
Output:
Set: [C#, Java, C++, C, PHP, Perl, Ruby, Python]
Iterating over HashSet using for-each loop: 
C#, Java, C++, C, PHP, Perl, Ruby, Python,
*/


//Using iterator():
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class IterateHashSet2 {
    public static void main(String args[]) {
        Set<String> set1 = new HashSet<>();
        set1.add("C");
        set1.add("C++");
        set1.add("C#");
        set1.add("Java");
        set1.add("Python");
        set1.add("PHP");
        set1.add("Ruby");
        set1.add("Perl");
        System.out.println("Set: " + set1);
        
        System.out.println("Iterating over HashSet using for-each loop: ");
        Iterator<String> iterate = set1.iterator();
        while(iterate.hasNext()){
            System.out.print(iterate.next() + ", ");
        }
    }
}



//Using forEach() method:
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class IterateHashSet3 {
    public static void main(String args[]) {
        Set<String> set1 = new HashSet<>();
        set1.add("C");
        set1.add("C++");
        set1.add("C#");
        set1.add("Java");
        set1.add("Python");
        set1.add("PHP");
        set1.add("Ruby");
        set1.add("Perl");
        System.out.println("Set: " + set1);
        
        System.out.println("Iterating over HashSet using for-each loop: "); 
        set1.forEach((e) -> {                    // pass lambda expression to forEach()
            System.out.print(e + ", ");
        });                                      //******
    }
}
