//using parseBoolean():
public class StringToBoolean1 {
    public static void main(String args[]) {
        String str1 = "true";
        String str2 = "false";
        
        boolean b1 = Boolean.parseBoolean(str1);
        boolean b2 = Boolean.parseBoolean(str2);
        System.out.println("Boolean1: " + b1);
        System.out.println("Boolean2: " + b2);
    }
}



/*
Output:
Boolean1: true
Boolean2: false
*/



//using valueOf():
public class StringToBoolean1 {
    public static void main(String args[]) {
        String str1 = "true";
        String str2 = "false";
        
        boolean b1 = Boolean.valueOf(str1);
        boolean b2 = Boolean.valueOf(str2);
        System.out.println("Boolean1: " + b1);
        System.out.println("Boolean2: " + b2);
    }
}
