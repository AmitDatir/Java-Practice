//Int array:
public class Arr1 {
    public static void main(String args[]) {
        int arr1[] = {5, 9, 0, 2, 6, 7};
        int num = 1;
        boolean result = false;
        
        for(int x : arr1){
            if(x==num){
                result = true;
            }
        }
        
        if(result){
            System.out.println(num + " is present in the array.");
        } else {
            System.out.println(num + " is not present in the array.");
        }
    }
}


//Output: 1 is not present in the array.



//Using Stream:
import java.util.stream.IntStream;

public class Arr2 {
    public static void main(String args[]) {
        int arr1[] = {5, 9, 0, 2, 6, 7};
        int num = 5;
        
        boolean result = IntStream.of(arr1).anyMatch(n -> n == num);
        
        if(result){
            System.out.println(num + " is present in the array.");
        } else {
            System.out.println(num + " is not present in the array.");
        }
    }
}


//Output:5 is present in the array.



//For non-primitive data types:
import java.util.Arrays;

public class Arr3 {
    public static void main(String args[]) {
        String arr1[] = {"Mon", "Tues", "Wed", "Thur", "Fri", "Sat"};
        String str = "tues";
        
        boolean result = Arrays.stream(arr1).anyMatch(n -> n.equals(str));
        
        if(result){
            System.out.println(str + " is present in the array.");
        } else {
            System.out.println(str + " is not present in the array.");
        }
    }
}


//Output: tues is not present in the array.

