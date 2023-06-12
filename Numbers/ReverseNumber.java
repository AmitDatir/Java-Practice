//Using while loop:
import java.util.Scanner;

public class Count1 {
    public static void main(String args[]) {
        int number, reversed=0, digit;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the original number: ");
        number = input.nextInt();
        
        while(number!=0){
            digit = number % 10;
            reversed = reversed * 10 + digit;
            
            number/=10;
        }
        
        System.out.println("Reversed number is: " + reversed);
    }
}


/*
Output:
Enter the original number: 654321
Reversed number is: 123456
*/


//Using for loop:
import java.util.Scanner;
public class Count1 {
    public static void main(String args[]) {
        int number, reversed=0, digit;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the original number: ");
        number = input.nextInt();
        
        for(; number!=0; number/=10){
            digit = number % 10;
            reversed = reversed * 10 + digit;
        }
        
        System.out.println("Reversed number is: " + reversed);
    }
}


/*
Output:
Enter the original number: 456123
Reversed number is: 321654
*/
