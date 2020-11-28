package ClassDemo.Algorithms.Arrays;

import java.util.Arrays;

public class SortColors {
    public static int[] sortColors(int[] nums) {
        int p0 = 0;
        int p00 = 0;
        while (p00 < nums.length) {
            if (nums[p00] == 0) {
                int temp = nums[p0];
                nums[p0] = nums[p00];
                nums[p00] = temp;
                p0++;
            }
            p00++;
        }

        int p2 = nums.length - 1;
        int p22 = nums.length - 1;
        while (p22 >= 0) {
            if (nums[p22] == 2) {
                int temp = nums[p2];
                nums[p2] = nums[p22];
                nums[p22] = temp;
                p2--;
            }
            p22--;
        }


        return nums;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortColors(new int[]{1, 2, 1, 0, 1, 2, 0, 1, 1, 1})));
    }
}
