/*
387. First Unique Character in a String : https://leetcode.com/problems/first-unique-character-in-a-string/
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
*/


//frequency array:
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




//hashmap:
class Solution {
    public int firstUniqChar(String s) {
        // Step 1: count how many times each character appears
       Map<Character,Integer> map=new HashMap<>();
       for(char ch : s.toCharArray()){
             map.put(ch,map.getOrDefault(ch,0)+1);
           }
           // Step 2: scan in order, return index of first char with count == 1
           for(int i=0;i<s.length();i++){
             if(map.get(s.charAt(i))==1){   // appears exactly once -> first unique
                   return i;
                 }
           }
       return -1;   // no unique character found
    }
}
