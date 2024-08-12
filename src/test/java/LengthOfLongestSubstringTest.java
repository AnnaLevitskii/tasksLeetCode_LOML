import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tasks.LengthOfLongestSubstring;

class LengthOfLongestSubstringTest {

    @Test
    void lengthOfLongestSubstring_positiveTest() {
        Assertions.assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("namea"), 4);
        Assertions.assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("na"), 2);
        Assertions.assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"), 3);
        Assertions.assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("bbbbb"), 1);
        Assertions.assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew"), 3);
        Assertions.assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("PpwwPkew"), 4);
        Assertions.assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("Ppww ke w"), 4);
        Assertions.assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("Pwpw=kw"), 4);
        Assertions.assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring("dvdf"), 3);
    }
    @Test
    void lengthOfLongestSubstring_negativeTest() {
        Assertions.assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring(""), 0);
        Assertions.assertEquals(LengthOfLongestSubstring.lengthOfLongestSubstring(" "), 1);

    }
}