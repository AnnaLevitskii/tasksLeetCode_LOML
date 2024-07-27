import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    void romanToInt_posetiveTest() {
        Assertions.assertEquals(RomanToInteger.romanToInt("III"), 3);
        Assertions.assertEquals(RomanToInteger.romanToInt("LVIII"), 58);
        Assertions.assertEquals(RomanToInteger.romanToInt("MCMXCIV"), 1994);
    }
    @Test
    void romanToInt_negativeTest() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{RomanToInteger.romanToInt("I II");});
        Assertions.assertThrows(IllegalArgumentException.class, ()->{RomanToInteger.romanToInt("I_II");});

    }
}