/*
424. Longest Repeating Character Replacement: https://leetcode.com/problems/longest-repeating-character-replacement
You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

Return the length of the longest substring containing the same letter you can get after performing the above operations.
*/




class Solution {
    public int characterReplacement(String s, int k) {
        // Array to store the frequency of uppercase English letters
        int[] counts = new int[26];
        
        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;
        
        // Expand the window using the right pointer
        for (int right = 0; right < s.length(); right++) {
            // Update the frequency of the incoming character
            int currentClassIndex = s.charAt(right) - 'A';
            counts[currentClassIndex]++;
            
            // Track the maximum frequency seen in the current window
            maxFrequency = Math.max(maxFrequency, counts[currentClassIndex]);
            
            // Current window size is (right - left + 1)
            // If remaining characters to replace exceed k, shrink window from left
            if ((right - left + 1) - maxFrequency > k) {
                counts[s.charAt(left) - 'A']--;
                left++; // Move left pointer forward
            }
            
            // Track the maximum valid window size found
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}



/*
####Rule of thumb:
✅ Need to know whether an element exists? → HashSet
✅ Need to know how many times an element appears? → HashMap or a frequency array
✅ Fixed, small character set (like A–Z or a–z)? → Frequency array (int[]) is usually the fastest choice.
*/
