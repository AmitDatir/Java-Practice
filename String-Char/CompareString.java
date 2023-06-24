public class CompareString1 {
    public static void main(String args[]) {
        String str1 = "Amit";
        String str2 = "Amt";
        
        if(str1 == str2){                                 //compares the object, not the value
            System.out.println("Equal Strings");
        } else{
            System.out.println("Not Equal Strings");
        }
    }
}


//Output: Not Equal Strings


//using equals():
public class CompareString2 {
    public static void main(String args[]) {
        String str1 = new String("Amit");        //as we are using string constructor, we need to use equals method to compare strings
        String str2 = new String("Amit");
        
        if(str1.equals(str2)){                        //compares the value
            System.out.println("Equal Strings");
        } else{
            System.out.println("Not Equal Strings");
        }
    }
}


//Output:  Equal Strings
