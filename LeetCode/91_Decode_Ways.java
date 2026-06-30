/*
91. Decode Ways: https://leetcode.com/problems/decode-ways/
You have intercepted a secret message encoded as a string of numbers. The message is decoded via the following mapping:

"1" -> 'A'

"2" -> 'B'

...

"25" -> 'Y'

"26" -> 'Z'

However, while decoding the message, you realize that there are many different ways you can decode the message because some codes are contained in other codes ("2" and "5" vs "25").

For example, "11106" can be decoded into:

"AAJF" with the grouping (1, 1, 10, 6)
"KJF" with the grouping (11, 10, 6)
The grouping (1, 11, 06) is invalid because "06" is not a valid code (only "6" is valid).
Note: there may be strings that are impossible to decode.

Given a string s containing only digits, return the number of ways to decode it. If the entire string cannot be decoded in any valid way, return 0.

The test cases are generated so that the answer fits in a 32-bit integer.
*/




class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int n = s.length();
        // represents dp[i-2]
        int twoBack = 1; 
        // represents dp[i-1]
        int oneBack = 1; 

        for (int i = 2; i <= n; i++) {
            int current = 0;
            
            // Check if single digit validation passes (1-9)
            int singleDigit = s.charAt(i - 1) - '0';
            if (singleDigit >= 1 && singleDigit <= 9) {
                current += oneBack;
            }

            // Check if two digit validation passes (10-26)
            int doubleDigit = Integer.parseInt(s.substring(i - 2, i));
            if (doubleDigit >= 10 && doubleDigit <= 26) {
                current += twoBack;
            }

            // Shift states forward
            twoBack = oneBack;
            oneBack = current;
        }

        return oneBack;
    }
}
