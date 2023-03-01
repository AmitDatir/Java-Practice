import java.util.ArrayList;

public class IterateList {
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
        System.out.print("LinkedList-1: ");
        
        list1.forEach((e) -> {
            System.out.print(e + ", ");
        });
    }
}


/*
Output:
LinkedList-1: C, C++, C#, Java, Python, PHP, Ruby, Perl,
*/
