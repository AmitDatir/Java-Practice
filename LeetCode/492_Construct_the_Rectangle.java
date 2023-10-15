/*
492. Construct the Rectangle : https://leetcode.com/problems/construct-the-rectangle/description/
A web developer needs to know how to design a web page's size. So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:

    1. The area of the rectangular web page you designed must equal to the given target area.
    2. The width W should not be larger than the length L, which means L >= W.
    3. The difference between length L and width W should be as small as possible.

Return an array [L, W] where L and W are the length and width of the web page you designed in sequence.
*/




class Solution {
    public int[] constructRectangle(int area) {
        int[] result = new int[2];
        if(area == 0){
            return result;
        }
        int a = (int)Math.sqrt(area);
        while(area%a != 0){
            a--;
        }
        int b = area/a;
        result[0] = b;
        result[1] = a;
        return result;
    }
}
