import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class TwoSumTest {

    @Test
    void twoSum_posetiveTest() {
        Assertions.assertArrayEquals(TwoSum.twoSum(new int[]{2,7,11,15}, 9), new int[]{0,1} );
        Assertions.assertArrayEquals(TwoSum.twoSum(new int[]{3,2,4}, 6), new int[]{1,2} );
        Assertions.assertArrayEquals(TwoSum.twoSum(new int[]{3,3}, 6), new int[]{0,1} );
        Assertions.assertArrayEquals(TwoSum.twoSum(new int[]{2,1,7,8,9,11,15}, 10), new int[]{0,3} );
        Assertions.assertArrayEquals(TwoSum.twoSum(new int[]{3,7,3,2,4}, 6), new int[]{0,2} );
        Assertions.assertArrayEquals(TwoSum.twoSum(new int[]{3,3, 0, 13, 4}, 6), new int[]{0,1} );
        Assertions.assertArrayEquals(TwoSum.twoSum(new int[]{2,3, 1, 13, 0}, 1), new int[]{2,4} );
        Assertions.assertArrayEquals(TwoSum.twoSum(new int[]{0,3, 8, 13, 0}, 0), new int[]{0,4} );
    }
    @Test
    void twoSum_negativeTest() {
        Assertions.assertThrows(IllegalArgumentException.class,()->{ TwoSum.twoSum(new int[]{}, 6);},
                "Illegal nums values");
        Assertions.assertThrows(IllegalArgumentException.class,()->{ TwoSum.twoSum(new int[]{2,3,5,7,8}, 6);},
                "Illegal nums values");
    }
}