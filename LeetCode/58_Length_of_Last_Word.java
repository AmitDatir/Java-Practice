/*
58. Length of Last Word : https://leetcode.com/problems/length-of-last-word/description/
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
consisting of non-space characters only.
*/



//1:
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] arr =  s.split("\\s+");
        
        return arr[arr.length-1].length();
    }
}



//2:
class Solution {
    public int lengthOfLastWord(String s) {
        int lenthOfLastWord = 0;
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i)!=' ') {
                lenthOfLastWord++;
            }else{
                if(lenthOfLastWord>0){
                    return lenthOfLastWord;
                }
            }
        }
        return lenthOfLastWord;
    }
}
