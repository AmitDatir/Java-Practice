//LinkedList to Array:
import java.util.LinkedList;

public class LinkedListToArray {
    public static void main(String args[]) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("C");
        list1.add("C++");
        list1.add("C#");
        list1.add("Java");
        list1.add("Python");
        list1.add("PHP");
        list1.add("Ruby");
        list1.add("Perl");
        System.out.println("LinkedList-1: " + list1);
        
        String arr[] = new String[list1.size()];
        list1.toArray(arr);
        
        System.out.print("Array: ");
        for (String item : arr){
            System.out.print(item + ", ");
        }
    }
}


/*
Output:
LinkedList-1: [C, C++, C#, Java, Python, PHP, Ruby, Perl]
Array: C, C++, C#, Java, Python, PHP, Ruby, Perl,
*/



//Array to LinkedList:
import java.util.LinkedList;
import java.util.Arrays;

public class ArrayToLinkedList {
    public static void main(String args[]) {
        String arr[] = {"C", "C++", "C#", "Java", "Python", "PHP", "Ruby", "Perl"};
        System.out.println("Arrays: " + Arrays.toString(arr));
        
        LinkedList<String> list1 = new LinkedList<>(Arrays.asList(arr));
        System.out.println("List: " + list1);
    }
}


/*
Output;
Arrays: [C, C++, C#, Java, Python, PHP, Ruby, Perl]
List: [C, C++, C#, Java, Python, PHP, Ruby, Perl]
*/
