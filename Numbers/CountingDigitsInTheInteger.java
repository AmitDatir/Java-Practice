//using while loop:
import java.util.Scanner;

public class Count1 {
    public static void main(String args[]) {
        int number,count=0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to check: ");
        number = input.nextInt();
        
        while(number != 0){
            number /= 10;
            count++;
        }
        
        System.out.println("Count of digits in given integer is: " + count);
    }
}



/*
Output:
Enter an integer to check: 12345678
Count of digits in given integer is: 8
*/



//using for loop:
import java.util.Scanner;

public class Count1 {
    public static void main(String args[]) {
        int number,count=0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer to check: ");
        number = input.nextInt();
        
        for(; number!=0; number/=10, ++count);
        
        System.out.println("Count of digits in given integer is: " + count);
    }
}



/*
Output:
Enter an integer to check: 000234561
Count of digits in given integer is: 6
*/
