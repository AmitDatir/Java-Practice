/*
271: Encode and Decode Strings : https://leetcode.com/problems/encode-and-decode-strings/description/ || https://neetcode.io/problems/string-encode-and-decode/question
Design an algorithm to encode a list of strings to a string. The encoded string is then sent over the network and is decoded back to the original list of strings.
*/



import java.util.ArrayList;
import java.util.List;

public class Codec {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            // Append length, the delimiter, and the actual string
            sb.append(str.length()).append("#").append(str);
        }
        return sb.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.isEmpty()) {
            return result;
        }
        
        int i = 0;
        while (i < s.length()) {
            // Find where the delimiter '#' is located
            int delimiterIndex = s.indexOf('#', i);
            
            // Extract the length of the upcoming string
            int length = Integer.parseInt(s.substring(i, delimiterIndex));
            
            // Move index past the delimiter
            i = delimiterIndex + 1;
            
            // Extract the substring using the parsed length
            String str = s.substring(i, i + length);
            result.add(str);
            
            // Move index past the extracted string
            i += length;
        }
        return result;
    }
}
