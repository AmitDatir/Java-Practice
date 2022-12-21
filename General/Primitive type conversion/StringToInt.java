//using parseInt():
public class StringToInt1 {
    public static void main(String args[]) {
        String str1 = "456";                    //str1 = "Java"  --> Throws error: java.lang.NumberFormatException
        String str2 = "9562261";
        
        int i1 = Integer.parseInt(str1);
        int i2 = Integer.parseInt(str2);
        System.out.println("Int1: " + i1);
        System.out.println("Int2: " + i2);
    }
}


/*
Output:
Int1: 456
Int2: 9562261
*/




//using valueOf():
public class StringToInt2 {
    public static void main(String args[]) {
        String str1 = "456";               //str1 = "Java"  --> Throws error: java.lang.NumberFormatException
        String str2 = "9562261";
        
        int i1 = Integer.valueOf(str1);
        int i2 = Integer.valueOf(str2);
        System.out.println("Int1: " + i1);
        System.out.println("Int2: " + i2);
    }
}
