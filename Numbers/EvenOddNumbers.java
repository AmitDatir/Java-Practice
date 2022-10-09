import java.util.Scanner;
public class evenOdd1 {
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
public class evenOdd2 {
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
