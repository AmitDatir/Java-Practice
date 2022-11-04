//Arraylist to Array:
import java.util.ArrayList;

public class ListToArray {
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
List-1: [C, C++, C#, Java, Python, PHP, Ruby, Perl]
Array: C, C++, C#, Java, Python, PHP, Ruby, Perl, 
*/



//Array to List:
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ArrayToList {
    public static void main(String args[]) {
        String arr[] = {"C", "C++", "C#", "Java", "Python", "PHP", "Ruby", "Perl"};
        System.out.println("Arrays: " + Arrays.toString(arr));
        
        List<String> list1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println("List: " + list1);
    }
}


/*
Output:
Arrays: [C, C++, C#, Java, Python, PHP, Ruby, Perl]
List: [C, C++, C#, Java, Python, PHP, Ruby, Perl]
*/
