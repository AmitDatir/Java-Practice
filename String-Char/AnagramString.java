import java.util.Scanner;
import java.util.Arrays;
public class AnagramString {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st string to check: ");
        String str1 = input.next();
        System.out.print("Enter 2nd string to check: ");
        String str2 = input.next();
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        if(str1.length() == str2.length()){
            char[] charArr1 = str1.toCharArray();
            char[] charArr2 = str2.toCharArray();
            Arrays.sort(charArr1);
            Arrays.sort(charArr2);
            
            boolean result = Arrays.equals(charArr1, charArr2);
            
            if(result){
                System.out.println("String1: " + str1 + " & String2: " + str2 + " are anagram.");
            } else{
                System.out.println("String1: " + str1 + " & String2: " + str2 + " are not anagram.");
            }
        } else{
            System.out.println("String1: " + str1 + " & String2: " + str2 + " are not anagram.");
        }
    }
}


/*
Output:
1.
Enter 1st string to check: Race
Enter 2nd string to check: CARE
String1: race & String2: care are anagram.
2.
Enter 1st string to check: AMIT
Enter 2nd string to check: OMkaR
String1: amit & String2: omkar are not anagram.
*/
