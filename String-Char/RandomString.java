//Generate random String:
import java.util.Random;

public class RandomString {
    public static void main(String args[]) {
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder sb = new StringBuilder();          //random string builder
        Random random = new Random();                    //object of Random class
        int length = 7;                                  //to generate random string of 7 char
        
        for(int i = 0; i < length; i++){
            int index = random.nextInt(alphabets.length());        //generating random index from String alphabets
            char randomChar = alphabets.charAt(index);
            sb.append(randomChar);
        }
        
        String randomString = sb.toString();
        System.out.println("Random string generated: " + randomString);
    }
}


/*
Output:
1. Random string generated: EIPSVNP
2. Random string generated: QLSHZDN
3. Random string generated: GQOKLEP
*/



//Generate random AlphaNumeric String:
import java.util.Random;

public class RandomAlphaNum {
    public static void main(String args[]) {
        String uAlphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lAlphabets = "abcdefghijklmnopqrstuvwxyz";
        String num = "0123456789";
        String alphaNumeric = uAlphabets + lAlphabets + num;
        
        StringBuilder sb = new StringBuilder();          //random string builder
        Random random = new Random();                    //object of Random class
        int length = 11;                                  //to generate random string of 7 char
        
        for(int i = 0; i < length; i++){
            int index = random.nextInt(alphaNumeric.length());        //generating random index from String alphabets
            char randomChar = alphaNumeric.charAt(index);
            sb.append(randomChar);
        }
        
        String randomAlphaNumeric = sb.toString();
        System.out.println("Random string generated: " + randomAlphaNumeric);
    }
}


/*
Output:
1. Random string generated: WRsH5CxDNf6
2. Random string generated: 5emSop8ReBG
3. Random string generated: JLmdrbGvFct
*/
