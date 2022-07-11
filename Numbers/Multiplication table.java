//Using while loop:
import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String args[]) {
        int number;
        System.out.print("Enter a number to find multiplication table: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        
        int i=1;
        while (i<=10){
            System.out.printf("%d * %d = %d \n" , number, i, number*i);
            i++;
        }
    }
}


/*
Output:
Enter a number to find multiplication table: 17
17 * 1 = 17 
17 * 2 = 34 
17 * 3 = 51 
17 * 4 = 68 
17 * 5 = 85 
17 * 6 = 102 
17 * 7 = 119 
17 * 8 = 136 
17 * 9 = 153 
17 * 10 = 170
*/


//Using for loop:
import java.util.Scanner;
public class MultiplicationTable {

    public static void main(String args[]) {
        int number;
        System.out.print("Enter a number to find multiplication table: ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        
        for (int i = 1; i<=10 ; i++){
            System.out.printf("%d * %d = %d \n" , number, i, number*i);
        }
    }
}
