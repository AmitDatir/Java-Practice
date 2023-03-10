//Using add():
import java.util.LinkedList;

public class Add1 {
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
    }
}

//Output: LinkedList-1: [C, C++, C#, Java, Python, PHP, Ruby, Perl]


//Using add() with specified position:
import java.util.LinkedList;

public class Add2 {
    public static void main(String args[]) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add(0, "C");
        list1.add(1, "C++");
        //list1.add(5, "C#");
        list1.add(2, "Java");
        list1.add(3, "Python");
        //list1.add(6, "PHP");
        list1.add(4, "Ruby");
        //list1.add(7, "Perl");
        System.out.println("LinkedList-1: " + list1);
    }
}

//Output:LinkedList-1: [C, C++, Java, Python, Ruby]


//add another collection:
import java.util.LinkedList;

public class Add3 {
    public static void main(String args[]) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("C");
        list1.add("C++");
        list1.add("C#");
        System.out.println("LinkedList-1: " + list1);
        
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Java");
        list2.add("Python");
        list2.add("PHP");
        list2.add("Ruby");
        System.out.println("LinkedList-2: " + list2);
        
        list1.addAll(list2);
        System.out.println("Updated list-1:" + list1);
    }
}

/*
Output:
LinkedList-1: [C, C++, C#]
LinkedList-2: [Java, Python, PHP, Ruby]
Updated list-1:[C, C++, C#, Java, Python, PHP, Ruby]
*/


//using listIterator:
import java.util.LinkedList;
import java.util.ListIterator;

public class Add4 {
    public static void main(String args[]) {
        LinkedList<String> list1 = new LinkedList<>();
        ListIterator<String> listIterate = list1.listIterator();
        listIterate.add("C");
        listIterate.add("C++");
        listIterate.add("C#");
        listIterate.add("Java");
        listIterate.add("Python");
        listIterate.add("PHP");
        listIterate.add("Ruby");
        listIterate.add("Perl");
        
        System.out.println("LinkedList-1: " + list1);
    }
}

//Output: LinkedList-1: [C, C++, C#, Java, Python, PHP, Ruby, Perl]
