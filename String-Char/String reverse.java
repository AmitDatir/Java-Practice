//using recursion:
import java.util.Scanner;

public class Reverse {
    public static void main(String args[]) {
        String sentence, reversed;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sentence/string to reverse: ");
        sentence = input.nextLine();
        
        reversed = reverse(sentence);
        System.out.println("Reveresed sentence is: " + reversed);
    }
    
    public static String reverse(String sentence){
        if (sentence.isEmpty()){
            return sentence;
        } else{
            return reverse(sentence.substring(1)) + sentence.charAt(0);
        }
    }
}




/*
Output:
Enter sentence/string to reverse: Amit is awesome
Reveresed sentence is: emosewa si timA
*/
