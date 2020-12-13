package ClassDemo.Algorithms.DP;

public class wiggleMaxLength {
    public static int wiggleMaxLength(int[] nums) {
        int length = nums.length;
        if(length<=1) return 0;
        int[] dp = new int[length];
        //用gt来表示上一个值是上升还是下降，0表示上一个值等同
        int gt = 0;
        dp[0] = 0;
        for(int i =1; i < length; i++){
            if(nums[i]> nums[i-1]){dp[i] = 1;}
            else if(nums[i]< nums[i-1]){dp[i] = -1;}
            else dp[i] = dp[i-1];
        }
        int result = 0;
        for(int i = 1; i<dp.length; i++){
            if(dp[i]!=dp[i-1]){
                result ++;
            }
        }
        return result==0 ? 0:++result;
    }

    public static void main(String[] args) {
        System.out.println(wiggleMaxLength(new int[]{1, 7, 4, 9, 2, 5}));
    }
}
