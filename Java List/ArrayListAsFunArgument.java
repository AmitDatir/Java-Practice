//pass ArrayList as function parameter:
import java.util.ArrayList;

public class ParameterList {
    public static void output(ArrayList<String> list){
        System.out.print("Elements from the list: ");
        for(String lang : list){
            System.out.print(lang + ", ");
        }
    }
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
        output(list1);
    }
}


/*
Output:
Elements from the list: C, C++, C#, Java, Python, PHP, Ruby, Perl,
*/



//pass ArrayList as function parameter by converting list to array:
import java.util.ArrayList;

public class ParameterList2 {
    public static void output(String[] arr){
        System.out.print("Elements from the list: ");
        for(String lang : arr){
            System.out.print(lang + ", ");
        }
    }
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
        output(list1.toArray(new String[list1.size()]));
    }
}
