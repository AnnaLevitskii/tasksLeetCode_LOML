import core.providers.JaCoCoProvider;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tasks.AnagramChecker;

class AnagramCheckerTest {

    @Test
    void areAnagrams() {
        Assertions.assertTrue(AnagramChecker.areAnagrams("listen", "silent"));
        Assertions.assertTrue(AnagramChecker.areAnagrams("listeN", "Silent"));
        Assertions.assertFalse(AnagramChecker.areAnagrams("listen", "silen"));
        Assertions.assertFalse(AnagramChecker.areAnagrams("listmn", "silent"));
        Assertions.assertFalse(AnagramChecker.areAnagrams("li stmn", "silent "));
        Assertions.assertTrue(AnagramChecker.areAnagrams("li", "il"));
        Assertions.assertTrue(AnagramChecker.areAnagrams("i", "i"));
        Assertions.assertTrue(AnagramChecker.areAnagrams("I", "i"));
        Assertions.assertTrue(AnagramChecker.areAnagrams("", ""));
        Assertions.assertTrue(AnagramChecker.areAnagrams("", " "));
        Assertions.assertFalse(AnagramChecker.areAnagrams("1243", "6554"));
    }
}