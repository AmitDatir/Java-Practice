//using exception handling:
import java.util.Scanner;

public class Numeric {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String str = input.next();
        
        boolean numeric = true;
        try{
            Double num = Double.parseDouble(str);
        } catch( NumberFormatException e){
            numeric = false;
        }
        if(numeric){
            System.out.println("Given string '" + str + "' is a number.");
        } else{
            System.out.println("Given string '" + str + "' is not a number.");
        }
    }
}


/* 
Output:
1.
Enter a string to check: 25156.6523
Given string '25156.6523' is a number.
2.
Enter a string to check: Amit
Given string 'Amit' is not a number.
3.
Enter a string to check: 523scs
Given string '523scs' is not a number.
*/




//Using regular expression(regex):
import java.util.Scanner;
public class Numeric {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string to check: ");
        String str = input.next();
        
        boolean numeric = true;
        numeric = str.matches("-?\\d+(\\.\\d+)?");
        
        if(numeric){
            System.out.println("Given string '" + str + "' is a number.");
        } else{
            System.out.println("Given string '" + str + "' is not a number.");
        }
    }
}
