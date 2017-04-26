package longest_palindromic_substring;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.Test;

/**
 * Created by twlcbo on 2017/4/25.
 * Given a string s, find the longest palindromic substring in s. You may assume that the
 * maximum length of s is 1000.
 * Palindromic string: a string reads the same from left and right hand side.
 * 0
 * Input : "a"
 * Output : "a"
 *
 * Example1:
 * Input: "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example2:
 * Input: "cbbd"
 * Output: "bb"
 *
 * method signature:
 *     public String longestPalindrome(String s) {}
 */
public class LongestPalindromicSubstringTest {
  @Test
  public void two_consecutive_char_is_longest() throws Exception {
    //Arrange
    String input = "aa";
    String expected = "aa";

    //Act
    String result = new LongestPalindromicSubstring().longestPalindromicSubstring(input);

    //Assert
    assertThat(expected, is(equalTo(result)));
  }

  @Test
  public void one_char_is_longest() throws Exception {
    //Arrange
    String input = "a";
    String expected = "a";

    //Act
    String result = new LongestPalindromicSubstring().longestPalindromicSubstring(input);

    //Assert
    assertThat(expected, is(equalTo(result)));
  }

  private class LongestPalindromicSubstring {
    public String longestPalindromicSubstring(String input) {
      return "a";
    }
  }
}
