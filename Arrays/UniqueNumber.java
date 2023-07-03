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
