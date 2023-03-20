import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String args[]) {
        System.out.println("Enter 2 strings to check: ");
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        String str2 = input.next();
        
        Boolean result = isIsomorphic(str1, str2);
        System.out.println("Given strings " + str1 + " & " + str2 + " is isomorphic?: " + result);
    }
    
    public static boolean isIsomorphic(String str1, String str2){
        if(str1==null || str2==null){
            return false;
        }
        if(str1.length() != str2.length()){
            return false;
        }
        if(str1.length()==0 || str2.length()==0){
            return true;
        }
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i=0; i<str1.length(); i++){
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);
            
            Character c = getKey(map, c2);
            if(c!=null && c!=c1){
                return false;
            }else if(map.containsKey(c1)){
                if(c2!=map.get(c1)){
                    return false;
                }
            }else{
                map.put(c1,c2);
            }
        }
        return true;
    }
    
    public static Character getKey(HashMap<Character, Character>map, Character target){
        for(Map.Entry<Character, Character> entry : map.entrySet()){
            if(entry.getValue().equals(target)){
                return entry.getKey();
            }
        }
        return null;
    }
}



/*
Output;
1.
Enter 2 strings to check: 
foo
bar
Given strings foo & bar is isomorphic?: false
2.
Enter 2 strings to check: 
egg
add
Given strings egg & add is isomorphic?: true
*/
