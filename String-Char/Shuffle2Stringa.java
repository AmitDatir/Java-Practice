import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ShuffleString {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 Strings to check: ");
        String str1 = input.next();
        String str2 = input.next();
        System.out.println("Enter 3 result options to check: ");
        String results[] = new String[3];
        for(int i=0; i<3; i++){
            results[i] = input.next();
        }
        for(String result : results){
            if(checkLength(str1, str2, result) && shuffleCheck(str1, str2, result)){
                System.out.println(result + " is a valid shuffle of " + str1 + " & " + str2);
            } else{
                System.out.println(result + " is not a valid shuffle of " + str1 + " & " + str2);
            }
        }
    }
    
    static boolean checkLength(String str1, String str2, String result){
        if(str1.length() + str2.length() != result.length()){
            return false;
        } else{
            return true;
        }
    }
    
    static String stringSort(String str){
        char charArr[] = str.toCharArray();
        Arrays.sort(charArr);
        str = String.valueOf(charArr);
        return str;
    }
    
    static boolean shuffleCheck(String str1, String str2, String result){
        str1 = stringSort(str1);
        str2 = stringSort(str2);
        result = stringSort(result);
        
        int i=0, j=0, k=0;
        while(k != result.length()){
            if(i<str1.length() && str1.charAt(i) == result.charAt(k)){
                i++;
            } else if(j<str2.length() && str2.charAt(j) == result.charAt(k)){
                j++;
            } else{
                return false;
            }
            k++;
        }
        
        if(i<str1.length() || j<str2.length()){
            return false;
        }
        
        return true;
    }
}


/*
Output:
1.
Enter 2 Strings to check: 
ma
ti
Enter 3 result options to check: 
amit
tima
mita
amit is a valid shuffle of ma & ti
tima is a valid shuffle of ma & ti
mita is a valid shuffle of ma & ti

2.
Enter 2 Strings to check: 
1x
2y
Enter 3 result options to check: 
1y2x
2x1y
1xx2y
1y2x is a valid shuffle of 1x & 2y
2x1y is a valid shuffle of 1x & 2y
1xx2y is not a valid shuffle of 1x & 2y
*/
