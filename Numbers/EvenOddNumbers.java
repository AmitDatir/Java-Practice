import java.util.Scanner;

public class EvenOdd1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to check: ");
        int number = input.nextInt();
        if(number%2 == 0){
            System.out.println("Number " + number + " is even.");
        }
        else{
            System.out.println("Number " + number + " is odd.");
        }
    }
}


/*
Output:
Enter any number to check: 561
Number 561 is odd.
*/





import java.util.Scanner;

public class EvenOdd2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any number to check: ");
        int number = input.nextInt();
        String result = (number % 2 == 0)? " even" : " odd";
        System.out.println("Number " + number + " is" + result);
    }
}


/*Output:
Enter any number to check: 523
Number 523 is odd
*/




//Using Bitwise operator:
import java.util.Scanner;

public class EvenOdd3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to check: ");
        int num = input.nextInt();
        System.out.println(result(num));
    }

    public static String result(int num){
        num = num & 1;
        if(num == 1){
            return "Given number is odd.";
        }else{
            return "Given number is even.";
        }
    }
}
