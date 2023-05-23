//Array to Set:
import java.util.*;

public class ArraySet1 {
    public static void main(String args[]) {
        String arr[] = {"a", "b", "c", "1", "2", "3"};
        Set<String> set = new HashSet<>(Arrays.asList(arr));
        System.out.println("Set: " + set);
    }
}



//Output: Set: [a, 1, b, 2, c, 3]




//Using stream:
import java.util.*;
public class ArraySet2 {
    public static void main(String args[]) {
        String arr[] = {"a", "b", "c", "1", "2", "3"};
        Set<String> set = new HashSet<>(Arrays.stream(arr).collect(Collectors.toSet()));
        System.out.println("Set: " + set);
    }
}
//error????
