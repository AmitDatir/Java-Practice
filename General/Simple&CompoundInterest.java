import java.util.Scanner;

public class SimpleInterest {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter time in years: ");
        double time = input.nextDouble();
        System.out.print("Enter rate of simple interest: ");
        double simpRate = input.nextDouble();
        System.out.print("Enter rate of compound interest: ");
        double compRate = input.nextDouble();
        System.out.print("Enter number of times interest is compounded: ");
        int number = input.nextInt();
        
        double simpInterest = (principal* time *simpRate) / 100;
        double compInterest = principal * (Math.pow((1+compRate/100) , (time * number))) - principal;
        System.out.println("Simple Interest = " + simpInterest);
        System.out.println("Compound Interest = " + compInterest);
    }
}


/*
Output:
Enter principal: 1000
Enter time in years: 3
Enter rate of simple interest: 8
Enter rate of compound interest: 10
Enter number of times interest is compounded: 2
Simple Interest = 240.0
Compound Interest = 771.5610000000008
*/
