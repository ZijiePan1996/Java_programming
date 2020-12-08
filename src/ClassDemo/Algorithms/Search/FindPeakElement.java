package ClassDemo.Algorithms.Search;

public class FindPeakElement {
    public int findPeakElement(int[] nums){
    return 0;
    }

    public static int findFirst(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;
        int ans = nums.length;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]>=target){
                r = mid-1;
                ans = mid;
            } else l = mid+1;
        }
        if(ans<nums.length) return ans;
        else return -1;
    }

    public static void main(String[] args) {
        System.out.println(findFirst(new int[] {1,2,3,4,4,4,4,4,5}, 5));
    }

}
