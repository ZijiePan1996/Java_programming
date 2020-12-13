package ClassDemo.Algorithms.Search;

import java.util.Arrays;

public class FindMissingPositive {
    public static int firstMissingPositive(int[] nums) {
       int[] shadow = new int[nums.length+1];
       for(int i = 0; i< nums.length; i++){
           if(nums[i] >0 && nums[i]<=nums.length && nums[i] <= nums.length ){
               shadow[nums[i]]++;
           }
       }
       for(int i =1; i<= nums.length; i++){
           if(shadow[i]== 0 ) return i;
       }
       return nums.length+1;
    }
    public static String reverseLeftWords(String s, int n) {
        return s.substring(n%s.length(), s.length())+s.substring(0, n%s.length());
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{-1, 2, 3, 4, 5}));
        System.out.println(reverseLeftWords("abcdefg",2));
    }
}
