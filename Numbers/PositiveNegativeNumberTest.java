//positive - negative test on a number
import java.util.Scanner;

public class positiveNegative {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to check: ");
        int number = input.nextInt();
        if(number > 0){
            System.out.println("The Number " + number + " is positive.");
        } else if(number < 0){
            System.out.println("The Number " + number + " is negative.");
        } else{
            System.out.println("The Number is 0.");
        }
    }
}


/*Output:
Enter any number to check: -523
The Number -523 is negative.
*/
