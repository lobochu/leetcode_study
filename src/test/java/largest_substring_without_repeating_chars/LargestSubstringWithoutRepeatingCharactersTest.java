package largest_substring_without_repeating_chars;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Lobo on 2016/05/26 16:32.
 * Given a string, find the length of the longest substring without repeating characters.
 * <p/>
 * Examples:
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * Given "bbbbb", the answer is "b", with the length of 1.
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LargestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void given_empty_should_return_0_as_longest_char_which_length_is_0() {
        //Arrange
        LongestSubstringWithoutRepeatingChar longestSubstringWithoutRepeatingChar = new LongestSubstringWithoutRepeatingChar();

        //Act
        int longestRepeatingLength = longestSubstringWithoutRepeatingChar.lengthOfLongestSubstring("");

        //Assert
        assertEquals(0, longestRepeatingLength);
    }

    @Test
    public void given_bbb_should_return_b_as_longest_char_which_length_is_1() {
        //Arrange
        LongestSubstringWithoutRepeatingChar longestSubstringWithoutRepeatingChar = new LongestSubstringWithoutRepeatingChar();

        //Act
        int longestRepeatingLength = longestSubstringWithoutRepeatingChar.lengthOfLongestSubstring("bbb");

        //Assert
        assertEquals(1, longestRepeatingLength);
    }

    @Test
    public void given_abcabcbb_should_return_abc_as_longest_char_which_length_is_3() {
        //Arrange
        LongestSubstringWithoutRepeatingChar longestSubstringWithoutRepeatingChar = new LongestSubstringWithoutRepeatingChar();

        //Act
        int longestRepeatingLength = longestSubstringWithoutRepeatingChar.lengthOfLongestSubstring("abcabcbb");

        //Assert
        assertEquals(3, longestRepeatingLength);
    }

    @Test
    public void given_pwwkew_should_return_wke_as_longest_char_which_length_is_3() {
        //Arrange
        LongestSubstringWithoutRepeatingChar longestSubstringWithoutRepeatingChar = new LongestSubstringWithoutRepeatingChar();

        //Act
        int longestRepeatingLength = longestSubstringWithoutRepeatingChar.lengthOfLongestSubstring("pwwkew");

        //Assert
        assertEquals(3, longestRepeatingLength);
    }

    @Test
    public void given_aab_should_return_ab_as_longest_char_which_length_is_2() {
        //Arrange
        LongestSubstringWithoutRepeatingChar longestSubstringWithoutRepeatingChar = new LongestSubstringWithoutRepeatingChar();

        //Act
        int longestRepeatingLength = longestSubstringWithoutRepeatingChar.lengthOfLongestSubstring("aab");

        //Assert
        assertEquals(2, longestRepeatingLength);
    }

    @Test
    public void given_dvdf_should_return_vdf_as_longest_char_which_length_is_3() {
        //Arrange
        LongestSubstringWithoutRepeatingChar longestSubstringWithoutRepeatingChar = new LongestSubstringWithoutRepeatingChar();

        //Act
        int longestRepeatingLength = longestSubstringWithoutRepeatingChar.lengthOfLongestSubstring("dvdf");

        //Assert
        assertEquals(3, longestRepeatingLength);
    }

    @Test
    public void given_tmmuzxt_should_return_muzxt_as_longest_char_which_length_is_5() {
        //Arrange
        LongestSubstringWithoutRepeatingChar longestSubstringWithoutRepeatingChar = new LongestSubstringWithoutRepeatingChar();

        //Act
        int longestRepeatingLength = longestSubstringWithoutRepeatingChar.lengthOfLongestSubstring("tmmuzxt");

        //Assert
        assertEquals(5, longestRepeatingLength);
    }
    @Test
    public void given_tmmuzxtmmu_should_return_muzxt_as_longest_char_which_length_is_5() {
        //Arrange
        LongestSubstringWithoutRepeatingChar longestSubstringWithoutRepeatingChar = new LongestSubstringWithoutRepeatingChar();

        //Act
        int longestRepeatingLength = longestSubstringWithoutRepeatingChar.lengthOfLongestSubstring("tmmuzxtmmu");

        //Assert
        assertEquals(5, longestRepeatingLength);
    }
    @Test
    public void given_ohvhjdml_should_return_vhjdml_as_longest_char_which_length_is_6() {
        //Arrange
        LongestSubstringWithoutRepeatingChar longestSubstringWithoutRepeatingChar = new LongestSubstringWithoutRepeatingChar();

        //Act
        int longestRepeatingLength = longestSubstringWithoutRepeatingChar.lengthOfLongestSubstring("ohvhjdml");

        //Assert
        assertEquals(6, longestRepeatingLength);
    }
}
