import java.util.HashSet;
import java.util.Set;

/*
Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

 */

public class Longest_Nonrepeating_Substring {
        public int lengthOfLongestSubstring(String s) {
            if(s.length() <= 0){
                return 0;
            }
            if(s.length() == 1){
                return 1;
            }
            Set<Character> charSet = new HashSet<>();

            int l = 0;
            int r = 1;
            int maxLength =0;

            charSet.add(s.charAt(l));
            while(r < s.length()){
                if(charSet.contains(s.charAt(r))){
                    while(charSet.contains(s.charAt(r))){
                        charSet.remove(s.charAt(l));
                        l++;
                    }
                    charSet.add(s.charAt(r));
                    r++;
                    if(r-l > maxLength){
                        maxLength = r-l;
                    }
                }else{
                    charSet.add(s.charAt(r));
                    r++;
                    if(r-l > maxLength){
                        maxLength = r-l;
                    }

                }
            }

            return maxLength;
        }
}
