//using typecasting:
public class IntToChar1 {
    public static void main(String args[]) {
        int a = 80;
        int b = 90;
        
        char c = (char)a;          // int value treated as ASCII value
        char d = (char)b;
        System.out.println("Char1 = " + c);
        System.out.println("Char2 = " + d);
    }
}



/*
Output:
Char1 = P
Char2 = Z
*/



//using forDigit() method:
public class IntToChar2 {
    public static void main(String args[]) {
        int a = 8;
        int b = 14;
        
        char c = Character.forDigit(a,10);          // 10 is treated as radix value of decimal number
        char d = Character.forDigit(b,16);           // 16 is treated as radix value of hexadecimal number
        System.out.println("Char1 = " + c);
        System.out.println("Char2 = " + d);
    }
}


/*
Output:
Char1 = 8
Char2 = e
*/



//by adding 0:
public class IntToChar3 {
    public static void main(String args[]) {
        int a = 8;
        int b = 21;
        
        char c = (char)(a + '0');             // '0' is treated as ASCII value i.e. 48
        char d = (char)(b + '0');
        System.out.println("Char1 = " + c);
        System.out.println("Char2 = " + d);
    }
}



/*
Output:
Char1 = 8
Char2 = E
*/
