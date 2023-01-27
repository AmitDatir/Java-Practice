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
