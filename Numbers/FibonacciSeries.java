//Using for loop:
import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String args[]) {
        int number,firstNum = 0,secondNum = 1,nextNum;
        System.out.print("Enter a number of times till we need to find fibonnaci series: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        System.out.print("Fibonnaci series till " + number + " terms is: ");
        for (int i = 1; i<=number ; i++){
            System.out.print(firstNum + ", ");
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
}


/*
Output:
Enter a number of times till we need to find fibonnaci series: 15
Fibonnaci series till 15 terms is: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 
*/


//Using While loop:
import java.util.Scanner;
public class FibonacciSeries {

    public static void main(String args[]) {
        int number,firstNum = 0,secondNum = 1,nextNum;
        System.out.print("Enter a number of times till we need to find fibonnaci series: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        System.out.print("Fibonnaci series till " + number + " terms is: ");
        int i =1;
        while(i <= number){
            System.out.print(firstNum + ", ");
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
            i++;
        }
    }
}




//fibonacci series upto given number:
import java.util.Scanner;
public class FibonacciSeries {

    public static void main(String args[]) {
        int number,firstNum = 0,secondNum = 1,nextNum;
        System.out.print("Enter an approximate last number of the series: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        System.out.print("Fibonnaci series upto " + number + " is: ");
        int i =1;
        while(firstNum <= number){
            System.out.print(firstNum + ", ");
            nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
            i++;
        }
    }
}


/*
Output:
Enter an approximate last number of the series: 100
Fibonnaci series upto 100 is: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
*/
