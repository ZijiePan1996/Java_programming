package ClassDemo.Algorithms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Pan on 10/11/20.
 */
//重新push
public class nextPermutation {
    public static void nextPermutation(int[] nums){
        if(nums.length >=2){
            int leftnumber = 0;
            int rightnumber =0;
            //首先左移指针，找到左边数
            for(int i=nums.length-2; i>0;i--){
                if(nums[i]>=nums[i+1]){
                    continue;
                } else{
                    leftnumber = i;
                    break;
                }
            }
            //然后基于左边指针找到右边数
            for(int i=nums.length-1; i>0;i--){
                if(nums[i]>nums[leftnumber]){
                    rightnumber = i;
                    int temp = nums[rightnumber];
                    nums[rightnumber] = nums[leftnumber];
                    nums[leftnumber] = temp;
                    break;
                }
            }
            //对于左指针右方数字进行升序操作
            if(rightnumber!=0){reverse(nums, leftnumber+1, nums.length-1);}
            else{reverse(nums, 0, nums.length-1);}

        }

    }
    public static void reverse(int[] arr, int from, int to){
        while(from < to){
            int tmp = arr[from];
            arr[from++] = arr[to];
            arr[to--] = tmp;
        }
    }



    public static void main(String[] args) {
        int[] testnums = new int[] {1,2};
        nextPermutation(testnums);
        System.out.println(Arrays.toString(testnums));

    }
}
