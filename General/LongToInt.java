//using typcasting:
public class LongToInt1 {
    public static void main(String args[]) {
        long a = 123855215L;      // 2147483999L ---> -2147483297  >>> Loss of data as it exceed max limit of int
        long b = 51125122L;
        
        int c = (int)a;
        int d = (int)b;
        System.out.println("Int1 = " + c);
        System.out.println("Int2 = " + d);
    }
}


/*
Output:
Int1 = 123855215
Int2 = 51125122
*/


//using toIntExact():
public class LongToInt2 {
    public static void main(String args[]) {
        long a = 123855215L;      // 32147483648L ---> throws an "java.lang.ArithmeticException: integer overflow" exception as value greater than max value of int
        long b = 51125122L;
        
        int c = Math.toIntExact(a);       
        int d = Math.toIntExact(b);
        System.out.println("Int1 = " + c);
        System.out.println("Int2 = " + d);
    }
}



//convert Long class object to int:
public class LongToInt2 {
    public static void main(String args[]) {
        Long a = 123855215L;    //Long Object
        
        int b = a.intValue();   //Long object to int variable using intValue() method
        System.out.println("Int = " + b);
    }
}


//Output: Int = 123855215
