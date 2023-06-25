//1st letter capital:
import java.util.Scanner;

public class Caps1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.next();
        
        String first = str.substring(0,1);
        String remain = str.substring(1,str.length());
        
        first = first.toUpperCase();
        str = first + remain;
        System.out.println("Updated string: " + str);
    }
}


/*
Output:
1. Enter a string: cdocmAaCcs
Updated string: CdocmAaCcs
2. Enter a string: AMIT
Updated string: AMIT
3. Enter a string: oMKAR
Updated string: OMKAR
*/


//every word start letter capital:
import java.util.Scanner;
public class Caps2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        char[] ch = str.toCharArray();
        boolean space = true;
        
        for (int i = 0; i < ch.length; i++){
            if(Character.isLetter(ch[i])){
                if(space){
                    ch[i] = Character.toUpperCase(ch[i]);
                    space = false;
                }
            } else{
                space = true;
            }
        }
        str = String.valueOf(ch);
        System.out.println("Updated string: " + str);
    }
}


/*
Output:
Enter a string: aMIT is awesome!!!!
Updated string: AMIT Is Awesome!!!!
*/
