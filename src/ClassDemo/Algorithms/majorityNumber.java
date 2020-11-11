package ClassDemo.Algorithms;

/**
 * Created by Pan on 11/11/20.
 */
public class majorityNumber {
    public static int majorityElement(int[] nums){
        int count = 1;
        int result = nums[0];

        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        for(int i = 1; i<nums.length;i++){
            count +=(nums[i]==result)?1:-1;
            if(count ==0) result = nums[i+1];
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[] {8,8,7,7,7}));
    }
}
