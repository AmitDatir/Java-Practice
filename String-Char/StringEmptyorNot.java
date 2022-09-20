//String empty or not:
public class NullEmpty1 {
    public static void main(String args[]) {
        String str1 = null;
        String str2 = "";
        String str3 = "  ";
        
        System.out.println("str1 is " + isNullEmpty(str1));
        System.out.println("str2 is " + isNullEmpty(str2));
        System.out.println("str3 is " + isNullEmpty(str3));
    }
    
    public static String isNullEmpty(String str){
        if(str == null){
            return "Null.";
        } else if(str.isEmpty()){
            return "empty.";
        } else{
            return "neither null nor empty.";
        }
    }
}


/*
Output:
str1 is Null.
str2 is empty.
str3 is neither null nor empty.
*/


//String with white spaces empty or not:
public class NullEmpty2 {
    public static void main(String args[]) {
        String str1 = null;
        String str2 = "";
        String str3 = "  ";
        
        System.out.println("str1 is " + isNullEmpty(str1));
        System.out.println("str2 is " + isNullEmpty(str2));
        System.out.println("str3 is " + isNullEmpty(str3));
    }
    
    public static String isNullEmpty(String str){
        if(str == null){
            return "Null.";
        } else if(str.trim().isEmpty()){
            return "empty.";
        } else{
            return "neither null nor empty.";
        }
    }
}


/*
Output:
str1 is Null.
str2 is empty.
str3 is empty.
*/
