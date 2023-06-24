package Assignment1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MoveZeroes {

    public static int[] moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }

        int cur = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                int temp = nums[cur];
                nums[cur++] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }
}
