/*
409. Longest Palindrome : https://leetcode.com/problems/longest-palindrome/
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
*/



//1:
class Solution {
    public int longestPalindrome(String s) {
        int length = 0;
        // Create a HashSet...
        HashSet<Character> hset = new HashSet<Character>();
        // Traverse every element through the loop...
        for (int idx = 0; idx < s.length(); idx++) {
            // Convert string to character array...
            char character = s.charAt(idx);
            // If hset contains character already, emove that character & adding 2 to length...
            // It means we get pair of character which is used in palindrome...
            if (hset.contains(character)) {
                length += 2;
                hset.remove(character);
            }
            // Otherwise, add the character to the hashset...
            else {
                hset.add(character);
            }
        }
        // If the size of the set is greater than zero, move length forward...
        if (hset.size() > 0) {
            length ++;
        }
        return length;      // Return the length of the longest palindrome...
    }
}




//2:
class Solution {
    public int longestPalindrome(String s) {
            if(s==null || s.length()==0) return 0;
            HashSet<Character> hs = new HashSet<Character>();
            int count = 0;
            for(int i=0; i<s.length(); i++){
                if(hs.contains(s.charAt(i))){
                    hs.remove(s.charAt(i));
                    count++;
                }else{
                    hs.add(s.charAt(i));
                }
            }
            if(!hs.isEmpty()) return count*2+1;
            return count*2;
    }
}
