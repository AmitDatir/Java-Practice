//Using for loop:
import java.util.ArrayList;
public class IterateArrayList1 {
    public static void main(String args[]) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("C");
        list1.add("C++");
        list1.add("C#");
        list1.add("Java");
        list1.add("Python");
        list1.add("PHP");
        list1.add("Ruby");
        list1.add("Perl");
        System.out.println("LinkedList-1: " + list1);
        
        System.out.println("Iterating over ArrayList using for loop: ");
        for(int i=0; i<list1.size(); i++){
            System.out.print(list1.get(i) + ", ");
        }
    }
}


/*
Output:
LinkedList-1: [C, C++, C#, Java, Python, PHP, Ruby, Perl]
Iterating over ArrayList using for loop: 
C, C++, C#, Java, Python, PHP, Ruby, Perl,
*/


//using for-each loop:
import java.util.ArrayList;
public class IterateArrayList1 {
    public static void main(String args[]) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("C");
        list1.add("C++");
        list1.add("C#");
        list1.add("Java");
        list1.add("Python");
        list1.add("PHP");
        list1.add("Ruby");
        list1.add("Perl");
        System.out.println("LinkedList-1: " + list1);
        
        System.out.println("Iterating over ArrayList using for-each loop: ");
        for(String element : list1){
            System.out.print(element + ", ");
        }
    }
}


//Using ListItertor:
import java.util.ArrayList;
import java.util.ListIterator;
public class IterateArrayList1 {
    public static void main(String args[]) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("C");
        list1.add("C++");
        list1.add("C#");
        list1.add("Java");
        list1.add("Python");
        list1.add("PHP");
        list1.add("Ruby");
        list1.add("Perl");
        System.out.println("LinkedList-1: " + list1);
        
        System.out.println("Iterating over ArrayList using ListIterator: ");
        ListIterator<String> iterator = list1.listIterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
        }
    }
}
