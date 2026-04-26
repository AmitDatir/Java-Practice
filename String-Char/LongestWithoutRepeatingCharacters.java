//solution1:
import java.util.HashSet;
public class Main {
public static void main(String[] args) {
String s1 = "abcabcbb"; // Expected: "abc", length 3
String s2 = "bbbbb"; // Expected: "b", length 1
String s3 = "pwwkew"; // Expected: "wke", length 3
String s4 = ""; // Expected: "", length 0
System.out.println("Longest substring without repeating
characters in s1: " + lengthOfLongestSubstring(s1)); // Output: 3
System.out.println("Longest substring without repeating
characters in s2: " + lengthOfLongestSubstring(s2)); // Output: 1
System.out.println("Longest substring without repeating
characters in s3: " + lengthOfLongestSubstring(s3)); // Output: 3
System.out.println("Longest substring without repeating
characters in s4: " + lengthOfLongestSubstring(s4)); // Output: 0
}
public static int lengthOfLongestSubstring(String s) {
HashSet<Character> set = new HashSet<>();
int maxLength = 0;
int start = 0;
int end = 0;
while (end < s.length()) {
char currentChar = s.charAt(end);
if (!set.contains(currentChar)) {
set.add(currentChar);
maxLength = Math.max(maxLength, end - start + 1);
end++;
} else {
set.remove(s.charAt(start));
start++;
}
}
return maxLength;
}
}



//solution2:
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String s1 = "abcabcbb"; 
        String s2 = "bbbbb"; 
        String s3 = "pwwkew"; 
        System.out.println(lengthOfLongestSubstring(s1)); // 3
        System.out.println(lengthOfLongestSubstring(s2)); // 1
        System.out.println(lengthOfLongestSubstring(s3)); // 3
    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), maxLength = 0;
        // Map to store the last seen index of a character
        HashMap<Character, Integer> map = new HashMap<>(); 

        for (int end = 0, start = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            if (map.containsKey(currentChar)) {
                // Move start to the right of the previous occurrence
                start = Math.max(map.get(currentChar) + 1, start);
            }
            maxLength = Math.max(maxLength, end - start + 1);
            map.put(currentChar, end);
        }
        return maxLength;
    }
}
