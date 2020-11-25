package ClassDemo.Algorithms.nums;

import java.util.Arrays;

public class rotateNums {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        for(int i = 0;i <k; i++){
            int temp = nums[n-1];
            //这里用j--，j--，使得数据不会覆盖
            for(int j = 1; j<n; j++){
                int previous = nums[j];
                nums[j] = temp;
                temp = previous;

            }
            nums[0] = temp;
        }
    }

    public static void rotateByreverse(int[] nums, int k){
        k %= nums.length;
        reverseArray(nums, 0, nums.length-1);
        reverseArray(nums, 0, k-1);
        reverseArray(nums, k, nums.length-1);

    }

    public static void reverseArray(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start ++;
            end --;
        }
    }

    public static void main(String[] args) {
        int[] reversetest = new int[] {1,2,3,4,5,6,7};
        rotateByreverse(reversetest, 3);
        System.out.println(Arrays.toString(reversetest));
    }
}

