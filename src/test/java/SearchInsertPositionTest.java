import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tasks.SearchInsertPosition;

class SearchInsertPositionTest {
    int[] nums = new int[4];
    @BeforeEach
    void be(){
        nums[0]=1;
        nums[1]=3;
        nums[2]=5;
        nums[3]=6;
    }

    @Test
    void searchInsert_5() {
        Assertions.assertEquals(SearchInsertPosition.searchInsert(nums, 5), 2);
    }
    @Test
    void searchInsert_2() {
        Assertions.assertEquals(SearchInsertPosition.searchInsert(nums, 2), 1);
    }
    @Test
    void searchInsert_7() {
        Assertions.assertEquals(SearchInsertPosition.searchInsert(nums, 7), 4);
    }
    @Test
    void searchInsert_0() {
        Assertions.assertEquals(SearchInsertPosition.searchInsert(nums, 0), 0);
    }
}
