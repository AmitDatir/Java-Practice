import java.util.Scanner;

public class EvenOddArraySort {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int len = input.nextInt();
        int arr[] = new int[len];
        System.out.println("Enter elements inside array: ");
        for(int i=0; i<len; i++){
            arr[i] = input.nextInt();
        }
        
        int newArr[] = new int[arr.length];
        int j = 0;
        int k = arr.length - 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2 == 0){
                newArr[j] = arr[i];
                j++;
            }else{
                newArr[k] = arr[i];
                k--;
            }
        }
        
        System.out.print("Old Array = ");
        for(int temp1 : arr){
            System.out.print(temp1 + " ");   
        }
        System.out.print("\nNew Even-Odd sorted Array = ");
        for(int temp2 : newArr){
            System.out.print(temp2 + " ");   
        }
    }
}


/*
Output:
Enter length of array: 6
Enter elements inside array: 
1
4
9
8
6
2
Old Array = 1 4 9 8 6 2 
New Even-Odd sorted Array = 4 8 6 2 9 1
*/
