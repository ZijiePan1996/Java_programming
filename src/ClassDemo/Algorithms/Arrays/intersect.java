package ClassDemo.Algorithms.Arrays;

import java.util.*;

public class intersect {
    public static int[] intersectByHashSet(int[] nums1, int[] nums2){
        List<Integer> list = new ArrayList<>();
        Set<Integer> hashset1 = new HashSet<>();
        Set<Integer> hashset2 = new HashSet<>();
        for(int num: nums1){hashset1.add(num);}
        for(int num: nums2){hashset2.add(num);}
        if(nums1.length < nums2.length){
            for(int num: nums1){
                if(hashset2.contains(num)) list.add(num);
            }
        }else{
            for(int num:nums2){
                if(hashset1.contains(num)) list.add(num);
            }
        }
        Integer[] result = list.toArray(new Integer[list.size()]);
        int[] x = Arrays.stream(result).mapToInt(Integer::valueOf).toArray();
        return x;

    }

    public static int[] intersect(int[] nums1, int[] nums2){
        if(nums1.length > nums2.length) return intersect(nums2, nums1);
        Map<Integer, Integer> hashmap1 = new HashMap<>();
        for(int num: nums1){
            int occur = hashmap1.getOrDefault(num, 0) +1;
            hashmap1.put(num, occur);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for(int num: nums2){
            int count= hashmap1.getOrDefault(num, 0);
            if(count > 0){
                hashmap1.put(num, --count);
                intersection[index] = num;
                index += 1;
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }



    public static void main(String[] args) {
        int[] nums1 = new int[] {4,9,5};
        int[] nums2 = new int[] {9,4,9,8,4};
        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }


}
