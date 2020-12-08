package ClassDemo.Algorithms.Arrays;

import java.util.Arrays;

//Leetcode 334 Medium 递增的三元子序列
//用了和最长上升子序列相同的算法进行实现
public class IncreasingTriplet {
    public static boolean increasingTriplet(int[] nums){
        if(nums.length<3) return false;
        int maximumSub = 0;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for(int i = 1; i < nums.length; i++){
            for(int j = 0; j <i; j++){
                //最长上升情况
                if(nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp[j]+1);
            }
            maximumSub = Math.max(dp[i], maximumSub);
            if(maximumSub>=3) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{1,2,3,1,2,1}));
    }
}
