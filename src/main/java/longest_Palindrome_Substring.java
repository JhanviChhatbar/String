public class longest_Palindrome_Substring {

    /*
    Given a string s, return the longest
palindromic

substring
 in s.



Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
     */

        public String longestPalindrome(String s) {
            int l = s.length();

            if(l < 2)
                return s;

            int maxLength =1, start =0;
            int low, high;

            for(int i=0; i<l; i++){
                low = i-1;
                high = i+1;

                while(high < l && s.charAt(i) == s.charAt(high))
                    high++;

                while(low >=0 && s.charAt(i) == s.charAt(low))
                    low--;

                while(high < l && low >=0 && s.charAt(low) == s.charAt(high)){
                    low--;
                    high++;
                }

                int length = high -low-1;

                if(maxLength < length){
                    maxLength = length;
                    start = low +1;
                }

            }
            return s.substring(start, start+maxLength);
        }
}
