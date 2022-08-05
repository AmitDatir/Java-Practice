//Positive number:
import java.util.Scanner;

public class PositiveFactors {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find factors: ");
        int num = input.nextInt();
        
        System.out.print("Factors of given number are: ");
        for (int i=1; i<=num; i++){
            if (num % i == 0){
                System.out.print( i + " ");
            }
        }
    }
}


/*
Output:
Enter a number to find factors: 60
Factors of given number are: 1 2 3 4 5 6 10 12 15 20 30 60 
*/




//Negative number:
import java.util.Scanner;

public class Negative_Factors {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to find factors: ");
        int num = input.nextInt();
        
        System.out.print("Factors of given number are: ");
        for (int i=num; i<=Math.abs(num); i++){
            if ( i == 0){
                continue;
            } else {
                if (num % i == 0){
                System.out.print( i + " ");
                }
              }
        }
    }
}


/*
output:
Enter a number to find factors: -60
Factors of given number are: -60 -30 -20 -15 -12 -10 -6 -5 -4 -3 -2 -1 1 2 3 4 5 6 10 20 30 12 15 60 
*/
