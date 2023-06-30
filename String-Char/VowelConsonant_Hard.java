import java.util.Scanner;

public class vowelConsonant {
    private char ch;
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any character: ");
        String s1 = input.next();
        vowelConsonant v1 = new vowelConsonant();
        v1.setCharacter(s1);
        v1.isVowel(v1.getCharacter());
    }

    public void setCharacter(String s) {
        if (s.length() == 1) {
            ch = s.charAt(0);
        } else {
            System.out.println("Enter a valid character");
        }
    }

    public char getCharacter() {
        return ch;
    }


    public void isVowel(char ch) {
        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is vowel.");
                break;
            default:
                System.out.println(ch + " is consonant.");
        }
    }
}


/* Output:
1.
Enter any character: abhi
Enter a valid character

2.
Enter any character: o
o is vowel.
*/
