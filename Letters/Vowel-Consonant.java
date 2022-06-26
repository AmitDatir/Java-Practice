import java.util.Scanner;
public class vowelConsonant1 {
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


/*
Output:
Enter any character: d
d is consonant.
*/
    
    

    
    
import java.util.Scanner;
public class vowelConsonant2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any character: ");
        String ch = input.next();
        switch(ch){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(ch + " is vowel.");
                break;
            default:
                System.out.println(ch +" is consonant.");
        }
    }
}



/*
Output:
Enter any character: i
i is vowel.
*/
