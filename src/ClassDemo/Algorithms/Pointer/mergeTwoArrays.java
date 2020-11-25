package ClassDemo.Algorithms.Pointer;

import java.util.Arrays;

public class mergeTwoArrays {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = m; i<nums1.length;i++){
            nums1[i] = nums2[i-m];
        }
        Arrays.sort(nums1);
    }

    public static void mergeByPointer(int[] nums1, int m, int[] nums2, int n){
        int nums1Pointer = 0;
        int nums2Pointer = 0;
        int[] copyofnums1 = new int[m];  //新创建对象必须把nums1的元素拷贝过去，否则只是nums1的引用
        System.arraycopy(nums1, 0, copyofnums1, 0, m);
        while(nums1Pointer <m && nums2Pointer <n) {
            nums1[nums1Pointer + nums2Pointer] = (copyofnums1[nums1Pointer] <= nums2[nums2Pointer])?
                    copyofnums1[nums1Pointer++]:nums2[nums2Pointer++];
        if(!(nums1Pointer <m)){
            System.arraycopy(nums2, nums2Pointer, nums1, nums1Pointer + nums2Pointer, n-nums2Pointer);
        }
        if(!(nums2Pointer <n)){
            System.arraycopy(copyofnums1, nums1Pointer, nums1, nums1Pointer + nums2Pointer, m-nums1Pointer);
        }
    }
    }

    public static void main(String[] args) {
        merge((new int[] {1,2,3,0,0,0}),3, new int[] {2,5,6}, 3);
        mergeByPointer((new int[] {1,2,3,0,0,0}),3, new int[] {2,5,6}, 3);

    }
}
