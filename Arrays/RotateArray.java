/*
Problem: Rotate an array of n elements to the right by k steps. For example, with n
= 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]. How many different
ways do you know to solve this problem?
*/


//Solution 1 - Intermediate Array:
import java.util.Scanner;

public class Rotate1 {
    public static void main(String args[]) {
        System.out.println("Enter number of elements inside array: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] num = new int[n];
        
        System.out.println("Enter elements of array: ");
        for (int i=0; i<n; i++){
            num[i] = input.nextInt();
        }
        
        System.out.println("Enter steps to rotate: ");
        int k = input.nextInt();
        
        num = rotate(num, k);
        System.out.println("Rotated array: ");
        for(int num1: num){
            System.out.print(num1 + ", ");
        }
    }
    
    public static int[] rotate(int[] num, int k){
        if(k>num.length){
            k = k%num.length;
        }
        int[] result = new int[num.length];
        for(int i=0; i<k; i++){
            result[i] = num[num.length-k+i];
        }
        int j=0;
        for(int i=k; i<num.length; i++){
            result[i] = num[j];
            j++;
        }
        return result;
    }
}


/*
Output:
Enter number of elements inside array: 
7
Enter elements of array: 
1
2
3
4
5
6
7
Enter steps to rotate: 
3
Rotated array: 
5, 6, 7, 1, 2, 3, 4, 
*/



//Solution 2 - Bubble Rotate:
import java.util.Scanner;

public class Rotate2 {
    public static void main(String args[]) {
        System.out.println("Enter number of elements inside array: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] num = new int[n];
        
        System.out.println("Enter elements of array: ");
        for (int i=0; i<n; i++){
            num[i] = input.nextInt();
        }
        
        System.out.println("Enter steps to rotate: ");
        int k = input.nextInt();
        
        num = rotate(num, k);
        System.out.println("Rotated array: ");
        for(int num1: num){
            System.out.print(num1 + ", ");
        }
    }
    
    public static int[] rotate(int[] num, int k){
        if (num == null || num.length==0 || k < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        for(int i=0; i<k; i++){
            for(int j=num.length-1; j>0; j--){
                int temp = num[j];
                num[j] = num[j-1];
                num[j-1] = temp;
            }
        }
        return num;
    }
}
