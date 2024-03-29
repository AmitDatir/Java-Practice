//Using if - else loop:
import java.util.Scanner;

public class AlphabetNoAlpha1 {
    private char ch;


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any character to check: ");
        String s1 = input.next();
        AlphabetNoAlpha v1 = new AlphabetNoAlpha();
        v1.setCharacter(s1);
        v1.isAlpha(v1.getCharacter());
    }

    public void setCharacter(String s) {
        if (s.length() == 1) {
            ch = s.charAt(0);
        } else {
            System.out.println("Enter only single character.");
        }
    }


    public char getCharacter() {
        return ch;
    }


    public void isAlpha(char ch) {
        if(ch >= 'a' && ch<='z' || ch>='A' && ch<='Z' ){
            System.out.println(ch + " is an Alphabet.");
        } else{
            System.out.println(ch + " is not an Alphabet.");
        }
    }
}


/*
Output:
1.
Enter any character to check: g
g is an Alphabet.
2.
Enter any character to check: A
A is an Alphabet.
3.
Enter any character to check: $
$ is not an Alphabet.
4.
Enter any character to check: 6
6 is not an Alphabet.
5.
Enter any character to check: abc
Enter only single character.
*/



//Using Ternary operator:
import java.util.Scanner;

public class AlphabetNoAlpha {
    private char ch;


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any character to check: ");
        String s1 = input.next();
        AlphabetNoAlpha v1 = new AlphabetNoAlpha();
        v1.setCharacter(s1);
        v1.isAlpha(v1.getCharacter());
    }

    public void setCharacter(String s) {
        if (s.length() == 1) {
            ch = s.charAt(0);
        } else {
            System.out.println("Enter only single character.");
        }
    }


    public char getCharacter() {
        return ch;
    }


    public void isAlpha(char ch) {
        String output = (ch>= 'a' && ch<='z' || ch>='A' && ch<='Z') ? (ch + " is an Alphabet.") : (ch + " is not an Alphabet.");
            System.out.println(output);
    }
}





//Using isAlphabetic() method:
import java.util.Scanner;

public class AlphabetNoAlpha {
    private char ch;


    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any character to check: ");
        String s1 = input.next();
        AlphabetNoAlpha v1 = new AlphabetNoAlpha();
        v1.setCharacter(s1);
        v1.isAlpha(v1.getCharacter());
    }

    public void setCharacter(String s) {
        if (s.length() == 1) {
            ch = s.charAt(0);
        } else {
            System.out.println("Enter only single character.");
        }
    }


    public char getCharacter() {
        return ch;
    }


    public void isAlpha(char ch) {
        if(Character.isAlphabetic(ch) ){
            System.out.println(ch + " is an Alphabet.");
        } else{
            System.out.println(ch + " is not an Alphabet.");
        }
    }
}
