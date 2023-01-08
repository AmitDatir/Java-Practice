//using valueof():
public class DoubleToString1 {
    public static void main(String args[]) {
        double d1 = 23.45;
        double d2 = 98.76;
        
        String s1 = String.valueOf(d1);
        String s2 = String.valueOf(d2);
        System.out.println("String1: " + s1);
        System.out.println("String2: " + s2);
    }
}


/*
Output:
String1: 23.45
String2: 98.76
*/


//using toString():
public class DoubleToString2 {
    public static void main(String args[]) {
        double d1 = 23.45;
        double d2 = 98.76;
        
        String s1 = Double.toString(d1);
        String s2 = Double.toString(d2);
        System.out.println("String1: " + s1);
        System.out.println("String2: " + s2);
    }
}


//using + operator:
public class DoubleToString3 {
    public static void main(String args[]) {
        double d1 = 23.45;
        double d2 = 98.76;
        
        String s1 = "" + d1;
        String s2 = "" + d2;
        System.out.println("String1: " + s1);
        System.out.println("String2: " + s2);
    }
}



//using format():
public class DoubleToString4 {
    public static void main(String args[]) {
        double d1 = 23.45;
        double d2 = 98.76;
        
        String s1 = String.format("%f", d1);
        String s2 = String.format("%f", d2);
        System.out.println("String1: " + s1);
        System.out.println("String2: " + s2);
    }
}


/*
Output:
String1: 23.450000
String2: 98.760000
*/
