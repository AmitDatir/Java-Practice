import java.util.Scanner;

public class PalindromicMatrix {
    public static void main(String args[]) {
        System.out.println("Enter length of matrix: ");
        Scanner input = new Scanner(System.in);
        int len = input.nextInt();
        int arr[] = new int[len];
    
        System.out.print("Enter elements inside array: ");
        for(int i=0; i<len; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(isPalindrome(arr));
    }
    
    public static String isPalindrome(int arr[]){
        for(int i=0; i<arr.length; i++){
            int reversed = 0;
            int num = arr[i];
            while (arr[i] != 0){
                int remainder = num % 10;
                reversed = reversed*10 + remainder;
                num/=10;
            }
            if (num != reversed){
                String str1 = "Given array is not Palindromic";
                return str1;
            }
        }
        String str2 = "Given array is Palindromic";
        return str2;
    }
}
