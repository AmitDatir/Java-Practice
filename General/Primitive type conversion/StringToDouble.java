//using parseDouble():
public class StringToDouble1 {
    public static void main(String args[]) {
        String str1 = "6251";       // str="Java"  ---> Throws an error: java.lang.NumberFormatException 
        String str2 = "51.152";
        
        double d1 = Double.parseDouble(str1);
        double d2 = Double.parseDouble(str2);
        
        System.out.println("Double1: " + d1);
        System.out.println("Double2: " + d2);
    }
}



/*
Output:
Double1: 6251.0
Double2: 51.152
*/


//using valueOf():
public class StringToDouble2 {
    public static void main(String args[]) {
        String str1 = "6251";       // str="Java"  ---> Throws an error: java.lang.NumberFormatException 
        String str2 = "51.152";
        
        double d1 = Double.valueOf(str1);
        double d2 = Double.valueOf(str2);
        
        System.out.println("Double1: " + d1);
        System.out.println("Double2: " + d2);
    }
}



//string containing ,:
public class StringToDouble3 {
    public static void main(String args[]) {
        String str1 = "62,51";   
        
        str1 = str1.replace("," , ".");
        double d1 = Double.parseDouble(str1);
        
        System.out.println("Double1: " + d1);
    }
}


//Output:   Double1: 62.51
