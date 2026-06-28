/*
647. Palindromic Substrings: https://leetcode.com/problems/palindromic-substrings/
Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.
*/


class Solution {
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        
        int totalCount = 0;
        
        for (int i = 0; i < s.length(); i++) {
            // Case 1: Odd-length palindromes (centered at index i)
            totalCount += expandFromCenter(s, i, i);
            
            // Case 2: Even-length palindromes (centered between index i and i+1)
            totalCount += expandFromCenter(s, i, i + 1);
        }
        
        return totalCount;
    }
    
    private int expandFromCenter(String s, int left, int right) {
        int count = 0;
        
        // Expand outwards as long as characters match and indices are valid
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;  // Move left pointer outwards
            right++; // Move right pointer outwards
        }
        
        return count;
    }
}
