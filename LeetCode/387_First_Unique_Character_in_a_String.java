/*
387. First Unique Character in a String : https://leetcode.com/problems/first-unique-character-in-a-string/
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
*/



public class Solution {
    public int firstUniqChar(String s) {
        int freq [] = new int[26];
        for(int i = 0; i < s.length(); i ++)
            freq [s.charAt(i) - 'a'] ++;
        for(int i = 0; i < s.length(); i ++)
            if(freq [s.charAt(i) - 'a'] == 1)
                return i;
        return -1;
    }
}
