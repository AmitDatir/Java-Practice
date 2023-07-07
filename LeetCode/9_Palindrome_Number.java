/*
9. Palindrome Number : https://leetcode.com/problems/palindrome-number/description/
Given an integer x, return true if x is a
palindrome
, and false otherwise.
*/


class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        long reversed = 0;
        long temp = x;
        while (temp != 0) {
            int digit = (int) (temp % 10);
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return (reversed == x);
    }
}
