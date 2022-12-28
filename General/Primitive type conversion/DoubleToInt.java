//using typecasting:
public class DoubleToInt1 {
    public static void main(String args[]) {
        double a = 45.4D;               
        double b = 95.622D;
        
        int c = (int)a;             //narrowing
        int d = (int)b;             //loss of data after max value of int i.e. 2147483647
        
        System.out.println("Int1: " + c);
        System.out.println("Int2: " + d);
    }
}




/*
output:
Int1: 45
Int2: 95
*/




//using intValue():
public class DoubleToInt2 {
    public static void main(String args[]) {
        Double a = 45.4;               
        Double b = 95.622;
        
        int c = a.intValue();             
        int d = b.intValue();
        
        System.out.println("Int1: " + c);
        System.out.println("Int2: " + d);
    }
}





//using Math.round():
public class DoubleToInt3 {
    public static void main(String args[]) {
        double a = 45.4D;               
        double b = 95.622D;
        
        int c = (int)Math.round(a);             //a is converted to closest value of long then long converted into int
        int d = (int)Math.round(b);
        
        System.out.println("Int1: " + c);
        System.out.println("Int2: " + d);
    }
}



/*
output:
Int1: 45
Int2: 96
*/
