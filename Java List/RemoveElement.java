//Using remove():
import java.util.LinkedList;

public class Remove1 {
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
        
        String str = list1.remove(0);
        System.out.println("Removed Element: " + str);
        System.out.println("Updated list: " + list1);
    }
}


/*
Output:
LinkedList-1: [C, C++, C#, Java, Python, PHP, Ruby, Perl]
Removed Element: C
Updated list: [C++, C#, Java, Python, PHP, Ruby, Perl]
*/


//Using listIterator():
import java.util.LinkedList;
import java.util.ListIterator;

public class Remove2 {
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
        
        ListIterator<String> listIterate = list1.listIterator();
        listIterate.next();
        listIterate.remove();
        System.out.println("Updated list: " + list1);
    }
}


/*
Output:
LinkedList-1: [C, C++, C#, Java, Python, PHP, Ruby, Perl]
Updated list: [C++, C#, Java, Python, PHP, Ruby, Perl]
*/



//Remove all elements using clear():
import java.util.LinkedList;
import java.util.ListIterator;

public class Remove3 {
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
        
        list1.clear();                                  //Can also use removeAll() method, but clear() method is more efficient
        System.out.println("Updated list: " + list1);
    }
}


/*
Output:
LinkedList-1: [C, C++, C#, Java, Python, PHP, Ruby, Perl]
Updated list: []
*/



//Using removeIf():
import java.util.LinkedList;

public class Remove4 {
    public static void main(String args[]) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(5);
        list1.add(6);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(8);
        list1.add(0);
        System.out.println("LinkedList-1: " + list1);
        
        list1.removeIf((Integer i) -> i < 4);
        System.out.println("Updated list: " + list1);
    }
}


/*
Output:
LinkedList-1: [1, 5, 6, 3, 2, 4, 8, 0]
Updated list: [5, 6, 4, 8]
*/
