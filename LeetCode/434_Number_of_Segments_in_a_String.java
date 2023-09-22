/*
434. Number of Segments in a String : https://leetcode.com/problems/number-of-segments-in-a-string/description/
Given a string s, return the number of segments in the string.

A segment is defined to be a contiguous sequence of non-space characters.
*/



class Solution {
    public int countSegments(String s) {
        int res=0;
        for(int i=0; i<s.length(); i++)
            if(s.charAt(i)!=' ' && (i==0 || s.charAt(i-1)==' '))
                res++;        
        return res;
    }
}
