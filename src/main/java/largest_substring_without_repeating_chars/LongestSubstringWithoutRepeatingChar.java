package largest_substring_without_repeating_chars;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lobo on 2016/05/26 16:39.
 * Given a string, find the length of the longest substring without repeating characters.
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingChar {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Map<String, Integer> uniqueCharMap = new HashMap<String, Integer>();
        int startIndex = 0;
        String startStr = "";

        if (s.length() > 0)
            startStr = String.valueOf(s.charAt(0));

        for (int endIndex = 0; endIndex < s.length(); endIndex++) {
            String currentChar = String.valueOf(s.charAt(endIndex));
            if (uniqueCharMap.containsKey(currentChar)) {
                int repeatingCharIndex = uniqueCharMap.get(currentChar);
                if (repeatingCharIndex < startIndex) {
                    uniqueCharMap.put(currentChar, endIndex);
                    maxLength = Math.max(maxLength, endIndex - startIndex + 1);
                    continue;
                }
                startIndex = repeatingCharIndex + 1;
                uniqueCharMap.remove(currentChar);
                startStr = currentChar;

            }
            uniqueCharMap.put(currentChar, endIndex);
            maxLength = Math.max(maxLength, endIndex - startIndex + 1);
        }
        return maxLength;
    }
}
