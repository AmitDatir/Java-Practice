/*
3. Longest Substring Without Repeating Characters : https://leetcode.com/problems/longest-substring-without-repeating-characters
Given a string s, find the length of the longest substring without duplicate characters.
*/



//using array:
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Array to store the last seen index of each ASCII character
        int[] lastSeen = new int[128];
        
        // Initialize all indices to -1 (indicating the character hasn't been seen yet)
        for (int i = 0; i < 128; i++) {
            lastSeen[i] = -1;
        }
        
        int maxLength = 0;
        int left = 0; // Left boundary of the sliding window
        
        // Move the right boundary of the window
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If the character was seen inside the current window, move 'left' past its previous position
            if (lastSeen[currentChar] >= left) {
                left = lastSeen[currentChar] + 1;
            }
            
            // Update the last seen index of the current character
            lastSeen[currentChar] = right;
            
            // Calculate and update the maximum length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}




//Java HashSet Solution:
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        
        // Expand the right boundary of the window
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            
            // Shrink the window from the left until the duplicate character is removed
            while (seen.contains(rightChar)) {
                seen.remove(s.charAt(left));
                left++;
            }
            
            // Add the current character and update max length
            seen.add(rightChar);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
