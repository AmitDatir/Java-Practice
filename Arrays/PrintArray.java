//Using for-each loop:
public class PrintArray1 {
    public static void main(String args[]) {
        int arr[] = {11,22,33,44,55};
        
        System.out.print("Elements in array: ");
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}


/*
Output:
Elements in array: 11 22 33 44 55 
*/




//Using standard library functions:
import java.util.Arrays;

public class PrintArray2 {
    public static void main(String args[]) {
        int arr[] = {11,22,33,44,55};
        
        System.out.print("Elements in array: "+ Arrays.toString(arr));
    }
}


/*
Output:
Elements in array: [11, 22, 33, 44, 55]
*/



//Using standard library function for multi-dimensional array:
import java.util.Arrays;

public class PrintArray3 {
    public static void main(String args[]) {
        int arr[][] = {{1, 2}, {4, 5}, {7, 8}};       //works for 3-D array as well
        
        System.out.print("Elements in array: "+ Arrays.deepToString(arr));
    }
}



/*
Output:
Elements in array: [[1, 2], [4, 5], [7, 8]]
*/
