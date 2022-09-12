//using replaceAll method:
import java.util.Scanner;
public class WhiteSpace {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any string value: ");
        String str = input.nextLine();
        
        str = str.replaceAll("\\s", "");
        System.out.print("String after replacement: " + str);
    }
}


/*
Output:
Enter any string value: j a v a i s a w e s o m e
String after replacement: javaisawesome
*/
