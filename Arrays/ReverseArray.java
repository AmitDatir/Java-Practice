import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int x = input.nextInt();
        int[] arr = new int[x];
        System.out.println("Enter elements inside the array: ");
        for(int i=0; i<x; i++){
            arr[i] = input.nextInt();
        }
        reverse(arr);
        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}



/*
Output:
1.
Enter length of array: 5
Enter elements inside the array: 
65 15 2 48 45
Reversed Array: [45, 48, 2, 15, 65]
2.
Enter length of array: 8
Enter elements inside the array: 
11 22 33 44 55 66 77 88
Reversed Array: [88, 77, 66, 55, 44, 33, 22, 11]
*/
