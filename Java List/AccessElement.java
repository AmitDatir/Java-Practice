//using get():
import java.util.LinkedList;

public class Access1 {
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
        System.out.println("List: " + list1);
        
        String str = list1.get(4);
        System.out.println("String at index 4: " + str);
    }
}

/*
Output:
List: [C, C++, C#, Java, Python, PHP, Ruby, Perl]
String at index 4: Python
*/


//using iterator():
import java.util.LinkedList;
import java.util.Iterator;

public class Access2 {
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
        System.out.println("List: ");
        
        Iterator<String> iterate = list1.iterator();
        while(iterate.hasNext()){
            System.out.print(iterate.next() + ", ");
        }
    }
}



/*
Output:
List: 
C, C++, C#, Java, Python, PHP, Ruby, Perl, 
*/


//using listIterator():
import java.util.LinkedList;
import java.util.ListIterator;

public class Access3 {
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
        System.out.println("List: ");
        
        ListIterator<String> listIterate = list1.listIterator();;
        while(listIterate.hasNext()){                                   //Forward access
            System.out.print(listIterate.next() + ", ");
        }
        
        System.out.print("\nReverse LinkedList: \n");
         while(listIterate.hasPrevious()){                                   //Forward access
            System.out.print(listIterate.previous() + ", ");
        }
    }
}


/*
Output:
List: 
C, C++, C#, Java, Python, PHP, Ruby, Perl, 
Reverse LinkedList: 
Perl, Ruby, PHP, Python, Java, C#, C++, C,
*/
