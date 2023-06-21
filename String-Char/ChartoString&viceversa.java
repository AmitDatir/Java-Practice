//Char to String:
public class CS1 {
    public static void main(String args[]) {
        char ch = 'x';
        String str = Character.toString(ch);   // OR String str = String.valueOf(ch);
        System.out.println("Value of String: " + str);
    }
}

//Output: Value of String: x



//Char array to String:
public class CS2 {
    public static void main(String args[]) {
        char[] ch = {'a', 'b', 'c', 'd', 'e'};
        String str1 = String.valueOf(ch);
        String str2 = new String(ch);
        System.out.println("Value of String1: " + str1);
        System.out.println("Value of String2: " + str2);
    }
}


/*
Output:
Value of String1: abcde
Value of String2: abcde
*/


//String to Char array:
import java.util.Arrays;

public class CS3 {
    public static void main(String args[]) {
        String str = "Java is awesome!";
        char[] ch = str.toCharArray();
        System.out.println("Character array: "+ Arrays.toString(ch));
    }
}


//Output: Character array: [J, a, v, a,  , i, s,  , a, w, e, s, o, m, e, !]
