//using valueof():
public class BooleanToString1 {
    public static void main(String args[]) {
        boolean b1 = true;
        boolean b2 = false;
        
        String s1 = String.valueOf(b1);
        String s2 = String.valueOf(b2);
        System.out.println("String1: " + s1);
        System.out.println("String2: " + s2);
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
        
        String s1 = Boolean.toString(b1);
        String s2 = Boolean.toString(b2);
        System.out.println("String1: " + s1);
        System.out.println("String2: " + s2);
    }
}
