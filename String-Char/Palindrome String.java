import java.util.Scanner;
public class PalindromeString {
    public static void main(String args[]) {
        String str, reverseStr = "";
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        str = input.next();
        
        for (int i = (str.length()-1); i>=0; i-- ){
            reverseStr  = reverseStr + str.charAt(i);
        }
        
        if(str.toLowerCase().equals(reverseStr.toLowerCase())){
            System.out.println(str + " is a palindrome.");
        } else{
            System.out.println(str + " is not a palindrome.");
        }
    }
}


/*
Output:
1.
Enter a string to check for palindrome: radar
radar is a palindrome.
2.
Enter a string to check for palindrome: noice
noice is not a palindrome.
*/
