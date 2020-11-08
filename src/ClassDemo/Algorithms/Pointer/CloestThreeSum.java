package ClassDemo.Algorithms.Pointer;

import java.util.Arrays;

public class CloestThreeSum {
    public static int threeSumtarget(int[] nums, int target){
        if( nums.length < 3) return  0;
        Arrays.sort(nums);
        int maxcombo = Integer.MAX_VALUE;
        int closestSum = 0;
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = nums.length-1;
            while(j < k){
                int currsum = nums[i] + nums[j] + nums[k];
                if( currsum > target) {
                    if(Math.abs(currsum-target) < maxcombo) {
                        closestSum = currsum;
                        maxcombo = Math.abs(currsum-target);
                    }
                    k--;
                    if(j < k && nums[k] == nums[k+1]) k--;
                }
                if( currsum <= target){
                    if(Math.abs(currsum-target) < maxcombo) {
                        closestSum = currsum;
                        maxcombo = Math.abs(currsum-target);
                    }
                    j++;
                    if(j < nums.length && nums[j] == nums[j-1]) j++;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        System.out.println(threeSumtarget(new int[] {-1,2,1,-4}, 1));
    }
}
