package ClassDemo.Algorithms.Search;

public class SearchRotateArray {
    public int search(int[] nums, int target){
        int n = nums.length;
        if(n==0){
            return -1;
        }
        if(n == 1){
            return nums[0] == target ? 0 : -1;
        }
        int l = 0, r = n-1;
        while(l <= r){
            int mid = (l+r) /2;
            if(nums[mid] == target){
                return mid;
            }
            //如果左侧是升序，正常排列
            if(nums[0] <= nums[mid]){
                //如果target位于左侧
                if(nums[0] <= target && target < nums[mid]){
                    r = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }
            //如果右侧是升序，正常排列
            else{
                //如果target位于右侧
                if(nums[mid] < target && target <= nums[n-1]){
                    l = mid+1;
                } else{
                    r = mid-1;
                }
            }
        }
        return -1;
    }
}
