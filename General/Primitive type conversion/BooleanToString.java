//using valueof():
public class BooleanToString1 {
    public static void main(String args[]) {
        boolean b1 = true;
        boolean b2 = false;
        
        String S1 = String.valueOf(b1);
        String S2 = String.valueOf(b2);
        System.out.println("String1: " + S1);
        System.out.println("String2: " + S2);
    }
}



/*
Output:
String1: true
String2: false
*/



//using toString():
public class BooleanToString2 {
    public static void main(String args[]) {
        boolean b1 = true;
        boolean b2 = false;
        
        String S1 = Boolean.toString(b1);
        String S2 = Boolean.toString(b2);
        System.out.println("String1: " + S1);
        System.out.println("String2: " + S2);
    }
}
