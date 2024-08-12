package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
//        ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(nums)
//                .boxed()
//                .collect(Collectors.toList());

        if(nums.length<2) throw new IllegalArgumentException("Illegal nums values");
        int indexMax = ((nums.length*(nums.length-1))/2);

        for(int i = 0, j=0, k=1; i<indexMax; i++, k++ ) {
            if (k > nums.length - 1) {
                j++;
                k = j + 1;
            }
            int fn = nums[j];
            int sn = nums[k];
            if (fn + sn == target) {
                return new int[]{j, k};
            }
        }
        throw new IllegalArgumentException("Illegal nums values");
    }
}
