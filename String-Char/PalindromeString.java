import java.util.Scanner;

public class PalindromeString1 {
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



import java.util.Scanner;

public class PalindromeString2 {
    public static void main(String args[]) {
        String str, reverseStr = "";
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        str = input.next();
        int len = str.length();
        int i, begin, end, middle;
        begin = 0;
        end = len - 1;
        middle = (begin + end) / 2;
        
        for(i=begin; i<=middle; i++){
            if(str.charAt(begin) == str.charAt(end)){
                begin++;
                end--;
            } else{
                break;
            }
        }
        
        if(i==middle+1){
            System.out.println(str + " is a palindrome.");
        } else{
            System.out.println(str + " is not a palindrome.");
        }
    }
}
