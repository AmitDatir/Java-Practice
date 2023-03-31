import java.util.Scanner;

public class PalindromicMatrix {
    public static void main(String args[]) {
        System.out.println("Enter length of matrix: ");
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int arr[] = new int[len];
    
        System.out.println("Enter elements inside array: ");
        for(int i=0; i<len; i++){
            arr[i] = input.nextInt();
        }
        String str = isPalindrome(arr);
        System.out.println(str);
    }
    
    public static String isPalindrome(int arr[]){
        for(int i=0; i<arr.length; i++){
            int reversed = 0;
            int remainder = 0;
            int num = arr[i];
            while (num != 0){
                remainder = num % 10;
                reversed = reversed * 10 + remainder;
                num /= 10;
            }
            if (arr[i] != reversed){
                String str1 = "Given array is not Palindromic.";
                return str1;
            }
        }
        String str2 = "Given array is Palindromic.";
        return str2;
    }
}


/*
Output:
1.
Enter length of matrix: 
4
Enter elements inside array: 
151
959
789
363
Given array is not Palindromic.

2.
Enter length of matrix: 
6
Enter elements inside array: 
999
787
494
111
323
686
Given array is Palindromic.
*/
