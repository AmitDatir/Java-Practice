//largest number between 3 inputs:
import java.util.Scanner;
public class largestNumber1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number to check: ");
        int number1 = input.nextInt();
        System.out.print("Enter 2nd number to check: ");
        int number2 = input.nextInt();
        System.out.print("Enter 3rd number to check: ");
        int number3 = input.nextInt();
        int largest;
        
        if(number1 >= number2 && number1>=number3){
            largest = number1;
        }else if(number2 >= number1 && number2>=number3){
            largest = number2;
        }else{
            largest = number3;
        }
        System.out.println("Largest number from given input is: " + largest );
}
}



/*
Output:
Enter 1st number to check: 523
Enter 2nd number to check: -45
Enter 3rd number to check: 584521
Largest number from given input is: 584521
*/







import java.util.Scanner;
public class largestNumber2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number to check: ");
        int number1 = input.nextInt();
        System.out.print("Enter 2nd number to check: ");
        int number2 = input.nextInt();
        System.out.print("Enter 3rd number to check: ");
        int number3 = input.nextInt();
        int largest;
        
        if(number1 >= number2){
            if(number1 >= number3){
                largest = number1;
            } else{
                largest = number3;
            }
    } else{
        if(number2 >= number3){
            largest = number2;
        } else{
            largest = number3;
        }
    }
    System.out.println("Largest number from given input is: " + largest );
}
}


/*
Output:
Enter 1st number to check: 2512
Enter 2nd number to check: 20
Enter 3rd number to check: 152
Largest number from given input is: 2512
*/
