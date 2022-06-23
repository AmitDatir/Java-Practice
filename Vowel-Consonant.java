import java.util.Scanner;
public class vowelConsonant {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any character: ");
        String ch = input.next();
        if (ch=="a" || ch=="e" || ch=="i" || ch=="o" || ch=="u"){
            System.out.println(ch + " is vowel.");
        }
        else{
            System.out.println(ch +" is consonant.");
        }
    }
}


//Output:
Enter any character: d
d is consonant.
