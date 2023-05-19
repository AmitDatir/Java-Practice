import java.util.Scanner;

public class Boolean1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 1st boolean: ");
        boolean first = input.nextBoolean();
        System.out.print("Enter 2nd boolean: ");
        boolean second = input.nextBoolean();
        System.out.print("Enter 3rd boolean: ");
        boolean third = input.nextBoolean();
        boolean result;
        
        if(first){
            result = second || third;
        } else {
            result = second && third;
        }
        if(result){
            System.out.println("Two of the 3 boolean values are true.");
        } else{
            System.out.println("Two of the 3 boolean values are not true.");
        }
    }
}


/*
Output:
1.
Enter 1st boolean: false
Enter 2nd boolean: false
Enter 3rd boolean: false
Two of the 3 boolean values are not true.
2.
Enter 1st boolean: true
Enter 2nd boolean: true
Enter 3rd boolean: true
Two of the 3 boolean values are true.
3.
Enter 1st boolean: false
Enter 2nd boolean: true
Enter 3rd boolean: true
Two of the 3 boolean values are true.
4.
Enter 1st boolean: true
Enter 2nd boolean: false
Enter 3rd boolean: false
Two of the 3 boolean values are not true.
*/


//ternary operator:
import java.util.Scanner;
public class Boolean2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 1st boolean: ");
        boolean first = input.nextBoolean();
        System.out.print("Enter 2nd boolean: ");
        boolean second = input.nextBoolean();
        System.out.print("Enter 3rd boolean: ");
        boolean third = input.nextBoolean();
        boolean result;
        
        result = first ? second || third : second && third;
        
        if(result){
            System.out.println("Two of the 3 boolean values are true.");
        } else{
            System.out.println("Two of the 3 boolean values are not true.");
        }
    }
}
