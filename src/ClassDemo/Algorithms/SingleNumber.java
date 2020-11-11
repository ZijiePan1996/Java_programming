package ClassDemo.Algorithms;

import java.util.*;

/**
 * Created by Pan on 11/11/20.
 */
public class SingleNumber {
    public static int singleNumber(int[] nums){
        Map<Integer, Integer> hashmap = new HashMap<>();
        for(int i =0; i<nums.length;i++){
            if(!hashmap.containsKey(nums[i])) {
                hashmap.put(nums[i], 1);
            } else hashmap.put(nums[i], 2);
        }
        for(int i = 0; i<nums.length; i++){
            if(hashmap.get(nums[i])==1){
                return nums[i];
            }
        }
        return 0;
    }

    public static int singleNumberBySet(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(!set.contains(num)) set.add(num);
            else set.remove(num);
        }
        List<Integer> list = new ArrayList<>(set);
        return list.get(0);
    }

    public static int singleNumberByXOR(int[] nums){
        int single =0;
        for(int num:nums){
            single ^= num;
        }
        return single;
    }


    public static void main(String[] args) {
        int[] testlist = new int[] {4,1,2,1,2};
        System.out.println(singleNumber(testlist));
        System.out.println(singleNumberBySet(testlist));
        System.out.println(singleNumberByXOR(testlist));
        System.out.println("8ad17b78b0fd9bf18efb1e2c6d25979b4ae8cc43");
    }
}
