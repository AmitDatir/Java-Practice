//using typecasting:
public class IntToDouble1 {
    public static void main(String args[]) {
        int a = 456;               
        int b = 9562261;
        
        double c = a;     //widening
        double d = b;
        
        System.out.println("Double1: " + c);
        System.out.println("Double2: " + d);
    }
}



/*
Output:
Double1: 456.0
Double2: 9562261.0
*/



//using valueOf():
public class IntToDouble2 {
    public static void main(String args[]) {
        int a = 456;               
        int b = 9562261;
        
        Double c = Double.valueOf(a);       //c & d are objects of Double wrapper class
        Double d = Double.valueOf(b);
        
        System.out.println("Double1: " + c);
        System.out.println("Double2: " + d);
    }
}
