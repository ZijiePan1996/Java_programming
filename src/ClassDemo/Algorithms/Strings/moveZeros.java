package ClassDemo.Algorithms.Strings;

import java.util.Arrays;

public class moveZeros {
    public static int[] moveZerosByForce(int[] nums){
        int p1= 0;
        int p2 = 0;
        while(p2<nums.length){
            if(nums[p2]!=0){
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p1++;
            }
            p2++;
        }

        return nums;
    }


    public static void main(String[] args) {
        int[] testnums = new int[] {0,0,1};
        System.out.println(Arrays.toString(moveZerosByForce(testnums)));
    }
}

