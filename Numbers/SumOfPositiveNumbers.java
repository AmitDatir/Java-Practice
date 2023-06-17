//using while loop:
import java.util.Scanner;

public class SumPositive {

    public static void main(String args[]) {
        int sum = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to add:");
        int number = input.nextInt();
        
        while(number >= 0){
            sum+=number;
            System.out.print("Enter a number to add:");
            number = input.nextInt();
        }
        
        if(number<0){
            System.out.println("You entered a negative number, so exiting the program.");
        }
            
        System.out.println("Sum of all positive numbers entered is = " + sum);
    }
}


/*
Output:
Enter a number to add:1
Enter a number to add:2
Enter a number to add:3
Enter a number to add:4
Enter a number to add:5
Enter a number to add:6
Enter a number to add:7
Enter a number to add:8
Enter a number to add:9
Enter a number to add:10
Enter a number to add:-11
You entered a negative number, so exiting the program.
Sum of all positive numbers entered is = 55
*/



//using do-while loop:
import java.util.Scanner;
public class SumPositive {

    public static void main(String args[]) {
        int number = 0, sum = 0;
        Scanner input = new Scanner(System.in);
        
        do{
            sum+=number;
            System.out.print("Enter a number to add:");
            number = input.nextInt();
        } while(number>=0);
        
        if(number<0){
            System.out.println("You entered a negative number, so exiting the program.");
        }
            
        System.out.println("Sum of all positive numbers entered is = " + sum);
        input.close();
    }
}


/*
Output:
Enter a number to add:10
Enter a number to add:9
Enter a number to add:8
Enter a number to add:7
Enter a number to add:6
Enter a number to add:5
Enter a number to add:4
Enter a number to add:3
Enter a number to add:2
Enter a number to add:1
Enter a number to add:0
Enter a number to add:-1
You entered a negative number, so exiting the program.
Sum of all positive numbers entered is = 55
*/
