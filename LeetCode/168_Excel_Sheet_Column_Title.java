/*
168. Excel Sheet Column Title : https://leetcode.com/problems/excel-sheet-column-title/description/
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

*/


class Solution {
    public String convertToTitle(int columnNumber) {
        String res = "";
        while(columnNumber != 0) {
            res = (char)('A' + (columnNumber - 1) % 26) + res;
            columnNumber = (columnNumber - 1) / 26;
        }
        return res;
    }
}
