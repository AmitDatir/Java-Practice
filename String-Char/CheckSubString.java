//Check if a string contains a substring using contains():
import java.util.Scanner;

public class CheckSubString1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Main String: ");
        String str1 = input.nextLine();
        
        System.out.println("Enter 2 sub strings to check: ");
        String str2 = input.next();
        String str3 = input.next();
        
        boolean result1 = str1.contains(str2);
        if(result1){
            System.out.println(str2 + " is present in the main string.");
        } else{
            System.out.println(str2 + " is not present in the main string.");
        }
        
        boolean result2 = str1.contains(str3);
        if(result2){
            System.out.println(str3 + " is present in the main string.");
        } else{
            System.out.println(str3 + " is not present in the main string.");
        }
    }
}




/*
Output:
Enter Main String: 
Java is an awesome language.
Enter 2 sub strings to check: 
java
awesome
java is not present in the main string.
awesome is present in the main string.
*/




//Check if a string contains a substring using indexOf():
import java.util.Scanner;

public class CheckSubString2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Main String: ");
        String str1 = input.nextLine();
        
        System.out.println("Enter 2 sub strings to check: ");
        String str2 = input.next();
        String str3 = input.next();
        
        int result1 = str1.indexOf(str2);
        if(result1 == -1){
            System.out.println(str2 + " is not present in the main string.");
        } else{
            System.out.println(str2 + " is present in the main string.");
        }
        
        int result2 = str1.indexOf(str3);
        if(result2 == -1){
            System.out.println(str3 + " is not present in the main string.");
        } else{
            System.out.println(str3 + " is present in the main string.");
        }
    }
}
