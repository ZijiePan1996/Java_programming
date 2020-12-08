package ClassDemo.Algorithms.Search;

import java.util.Arrays;

public class SearchRange {
    public static int searchSingle(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start != end){
            if(nums[(start+end)/2]<target){
                start = (start+end)/2 +1;
            } else if (nums[(start+end)/2]>target){
                end = (start+end)/2;
            } else return (start+end)/2;
        }
        if(nums[start] == target){
            return start;
        }
        return -1;

    }
    public static int[] searchRange(int[] nums, int target){
        boolean isStart = false;
        boolean isFinish = false;
        int start = 0;
        int end = nums.length;
        while(!isStart && !isFinish){
            int tempIndex = searchSingle(Arrays.copyOfRange(nums, start, end), target);
            if(tempIndex == -1) return new int[] {-1,-1};
            if(nums[tempIndex+1]==target){

            }
        }
        return null;
    }

    public static int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] test = new int[] {5,6,7,8,8,8,8,8,9};
        System.out.println(binarySearch(test, 8, false));
    }
}
