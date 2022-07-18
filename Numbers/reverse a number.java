//Using while loop:
import java.util.Scanner;
public class Count1 {
    public static void main(String args[]) {
        int number, reveresed=0, digit;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the original number: ");
        number = input.nextInt();
        
        while(number!=0){
            digit = number % 10;
            reveresed = reveresed * 10 + digit;
            
            number/=10;
        }
        
        System.out.println("Reveresed number is: " + reveresed);
    }
}


/*
Output:
Enter the original number: 654321
Reveresed number is: 123456
*/
