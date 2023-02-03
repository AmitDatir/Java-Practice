//ArrayList to String:
import java.util.ArrayList;

public class ArrayListToString1 {
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
        System.out.println("List-1: " + list1);
        
        String str = list1.toString();
        System.out.println("String: " + str);
    }
}


/*
Output:
List-1: [C, C++, C#, Java, Python, PHP, Ruby, Perl]
String: [C, C++, C#, Java, Python, PHP, Ruby, Perl]
*/


//ArrayList to String using join():
import java.util.ArrayList;

public class ArrayListToString2 {
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
        System.out.println("List-1: " + list1);
        
        String str = String.join(", " , list1);
        System.out.println("String: " + str);
    }
}


/*
Output:
List-1: [C, C++, C#, Java, Python, PHP, Ruby, Perl]
String: C, C++, C#, Java, Python, PHP, Ruby, Perl
*/



//String to ArrayList:
import java.util.ArrayList;
import java.util.Arrays;

public class StringToArrayList {
    public static void main(String args[]) {
        String str = "C, C++, C#, Java, Python, PHP, Ruby, Perl";
        System.out.println("String: " + str);
        
        String arr[] = str.split(", ");           //convert string to array
        
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println("List: " + list1);
    }
}


/*
Output:
String: C, C++, C#, Java, Python, PHP, Ruby, Perl
List: [C, C++, C#, Java, Python, PHP, Ruby, Perl]
*/
