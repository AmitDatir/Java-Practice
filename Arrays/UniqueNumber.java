import java.util.ArrayList;
import java.util.Scanner;

public class collectiondemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of elements inside an array: ");
        int len = input.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter elements inside an array: ");
        for(int i=0; i<len; i++){
            arr[i] = input.nextInt();
        }

        ArrayList<Integer> arrList = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            int k = 0;
            if(!arrList.contains(arr[i])) {
                arrList.add(arr[i]);
                k++;
                for(int j=i+1; j<arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        k++;
                    }
                }
                if (k == 1){
                    System.out.println(arr[i] + " is unique number inside given array.");
                } 
            }
        }
    }
}



/*
Output:
Enter number of elements inside an array: 
10
Enter elements inside an array: 
4
5
5
5
4
6
6
9
4
6
9 is unique number inside given array.
*/



//Optimized code:
import java.util.*;

public class CollectionDemo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of elements in the array: ");
        int len = input.nextInt();
        
        int[] arr = new int[len];
        System.out.println("Enter elements in the array:");
        for(int i = 0; i < len; i++) {
            arr[i] = input.nextInt();
        }

        // Count frequency of each number
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print unique numbers
        System.out.print("Unique numbers in the array: ");
        for (int num : freqMap.keySet()) {
            if (freqMap.get(num) == 1) {
                System.out.println(num + " is a unique number.");
            }
        }
    }
}
