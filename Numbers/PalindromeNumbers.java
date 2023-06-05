import java.util.Scanner;

public class PalindromeNumbers {
    public static void main(String args[]) {
        int num,original,reversed = 0,remainder;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check for palindrome: ");
        num = input.nextInt();
        original = num;
        
        while (num!=0){
            remainder =num % 10;
            reversed = reversed*10 + remainder;
            num/=10;
        }
        
        if (original == reversed){
            System.out.printf("Entered number %d is a Palindrome.", original);
        } else{
            System.out.printf("Entered number %d is not a Palindrom.", original);
        }
    }
}



/*
Output:
1.
Enter a number to check for palindrome: 123321
Entered number 123321 is a Palindrome.
2.
Enter a number to check for palindrome: 45678
Entered number 45678 is not a Palindrom.
*/
