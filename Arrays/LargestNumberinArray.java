import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter elements inside an array:");
        int x = input.nextInt();
        double arr[] = new double[x];
        for(int i=0; i<x; i++){
            arr[i] = input.nextDouble();
        }
        
        double largest = arr[0];
        for (double num : arr){
            if (largest < num){
                largest = num;
            }
        }
        System.out.println("Largest element in array is: " + largest );
    }
}


/*
Output:
Enter number of elements inside an array:4
Enter elements inside an array: 62
62.3
62.33
62.333
Largest element in array is: 62.333
*/
