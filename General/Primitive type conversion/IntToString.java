//using valueOf():                     //most prefered way
public class IntToString1 {
    public static void main(String args[]) {
        int a = 456;               
        int b = 9562261;
        
        String str1 = String.valueOf(a);         
        String str2 = String.valueOf(b);
        System.out.println("Str1: " + str1);
        System.out.println("Str2: " + str2);
    }
}



/*
Output:
Str1: 456
Str2: 9562261
*/


//using toString():
public class IntToString2 {
    public static void main(String args[]) {
        int a = 456;               
        int b = 9562261;
        
        String str1 = Integer.toString(a);         
        String str2 = Integer.toString(b);
        System.out.println("Str1: " + str1);
        System.out.println("Str2: " + str2);
    }
}



//using + operator:
public class IntToString3 {
    public static void main(String args[]) {
        int a = 456;               
        int b = 9562261;
        
        String str1 = "" + a;
        String str2 = "" + b;
        System.out.println("Str1: " + str1);
        System.out.println("Str2: " + str2);
    }
}




//using  format():
public class IntToString4 {
    public static void main(String args[]) {
        int a = 456;               
        int b = 9562261;
        
        String str1 = String.format("%d", a);
        String str2 = String.format("%d", b);
        System.out.println("Str1: " + str1);
        System.out.println("Str2: " + str2);
    }
}
