//using typecasting:
public class IntToLong1 {
    public static void main(String args[]) {
        int a = 623612331;
        int b = 8123326;
        
        long c = a;        // widening
        long d = b;
        System.out.println("Long1: " + c);
        System.out.println("Long2: " + d);
    }
}


/*
Output:
Long1: 623612331
Long2: 8123326
*/




//int to object of Long using valueOf():
public class IntToLong2 {
    public static void main(String args[]) {
        int a = 623612331;
        
        Long b = Long.valueOf(a);        // Long object b stores value of int a
        System.out.println("Long: " + b);
    }
}


//Output:  Long: 623612331
