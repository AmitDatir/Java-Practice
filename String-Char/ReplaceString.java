import java.util.Scanner;

public class ReplaceAll {
    public static void main(String args[]) {
        System.out.print("Enter the string to modify: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        
        String strNew = str.replaceAll("is" , "was");
        System.out.println("Updated String: " + strNew);
    }
}


/*
Output:
Enter the string to modify: Java is awesome, so is Amit!!!!
Updated String: Java was awesome, so was Amit!!!!
*/
