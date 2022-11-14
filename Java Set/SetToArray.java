//Set to Array:
import java.util.*;
public class SetArray {
    public static void main(String args[]) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("1");
        set.add("2");
        set.add("3");
        
        String arr[] = new String[set.size()];
        set.toArray(arr);
        System.out.println("Array: " + Arrays.toString(arr));
    }
}



//Output: Array: [a, 1, b, 2, c, 3]
