//Using arraycopyt:
import java.util.Arrays;

public class Concatenate1 {
    public static void main(String args[]) {
        int[] arr1 = {11, 22, 33};
        int arr2[] = {44, 55, 66};
        
        int length1 = arr1.length;
        int length2 = arr2.length;
        int copy[] = new int[length1+length2];
        
        System.arraycopy(arr1, 0, copy, 0, length1);
        System.arraycopy(arr2, 0, copy, length1, length2);
        
        System.out.println(Arrays.toString(copy));
    }
}



/*
Output:
[11, 22, 33, 44, 55, 66]
*/



//Without using arraycopyt:
import java.util.Arrays;
public class Concatenate2 {
    public static void main(String args[]) {
        int[] arr1 = {11, 22, 33};
        int arr2[] = {44, 55, 66};
        
        int length1 = arr1.length;
        int length2 = arr2.length;
        int result[] = new int[length1+length2];
        
        int i=0;
        for(int x : arr1){
            result[i] = x;
            i++;
        }
        
        for(int x : arr2){
            result[i] = x;
            i++;
        }
        
        System.out.println(Arrays.toString(result));
    }
}


/*
Output:
[11, 22, 33, 44, 55, 66]
*/
