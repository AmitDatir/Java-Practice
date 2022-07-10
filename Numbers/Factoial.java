//Using for loop & small numbers:
import java.util.Scanner;
public class Factorial {

    public static void main(String args[]) {
        int number;
        long factorial = 1;
        System.out.print("Enter a number to find factorial: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        
        for (int i = 1; i<=number; i++){
            factorial *=i;
        }
        System.out.printf("Factorial of number %d is: %d" , number, factorial);
        input.close();
    }
}


/*
Output:
Enter a number to find factorial: 10
Factorial of number 10 is: 3628800
*/



//Using Big-Integer:
