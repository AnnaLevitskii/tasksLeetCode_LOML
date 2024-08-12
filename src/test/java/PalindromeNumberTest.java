import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tasks.PalindromeNumber;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    void isPalindrome_positiveTest() {
        Assertions.assertTrue(PalindromeNumber.isPalindrome(12321));
        Assertions.assertFalse(PalindromeNumber.isPalindrome(-12321));
        Assertions.assertTrue(PalindromeNumber.isPalindrome(0));


    }
    @Test
    void isPalindrome_negativeTest() {
        Assertions.assertTrue(PalindromeNumber.isPalindrome(000)); // 0
        Assertions.assertTrue(PalindromeNumber.isPalindrome(-0));  // 0
        //Assertions.assertFalse(PalindromeNumber.isPalindrome(+12321)); //? 12321
        //Assertions.assertTrue(PalindromeNumber.isPalindrome(-12321-), true);
    }
}