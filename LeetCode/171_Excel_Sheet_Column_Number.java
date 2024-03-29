/*
171. Excel Sheet Column Number : https://leetcode.com/problems/excel-sheet-column-number/description/
Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
*/



public class Solution {
    public int titleToNumber(String s) {
        if (s == null){
            return -1;
        }
        int sum = 0;
        for (char c : s.toUpperCase().toCharArray()) {
            sum *= 26;
            sum += c - 'A' + 1;
        }
        return sum;
    }
}
