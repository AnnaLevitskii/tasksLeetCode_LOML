import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    @Test
    void isValid() {
        Assertions.assertTrue(ValidParentheses.isValid("( )[ ]{ }"));
        Assertions.assertTrue(ValidParentheses.isValid("( )[ ]{ }{ }"));
        Assertions.assertTrue(ValidParentheses.isValid("[ ( ]{ })"));
        Assertions.assertFalse(ValidParentheses.isValid("( [ ]{ ( }"));
        Assertions.assertFalse(ValidParentheses.isValid("( gdfgfgd ( "));
        Assertions.assertTrue(ValidParentheses.isValid("( gdfgfgd ) "));
        Assertions.assertTrue(ValidParentheses.isValid("gdfgfgd{(gdfgfgd)gdfgfgd}gdfgfgd"));
        Assertions.assertTrue(ValidParentheses.isValid("{(gdfgfgd)gdfgfgd}"));

    }
}