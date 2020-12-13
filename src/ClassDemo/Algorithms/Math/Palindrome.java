package ClassDemo.Algorithms.Math;

import java.util.Arrays;

public class Palindrome {
    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        if(x < 10) return true;
        int shadow = 0;
        int original = x;
        while( x /10 != 0){
            shadow = shadow*10+ x%10;
            x /= 10;
        }
        shadow = shadow*10+ x%10;
        return shadow == original;
    }


    public static void merge(int[] A, int m, int[] B, int n) {
        int pointerA = m-1;
        int pointerB = n-1;
        int lastpointer = m+n-1;
        while(pointerA>=0 && pointerB >=0){
            if(A[pointerA] > B[pointerB]){
                A[lastpointer] = A[pointerA];
                pointerA--;
            } else {
                A[lastpointer] = B[pointerB];
                pointerB--;
            }
            lastpointer--;
        }
        if(pointerB>=0) System.arraycopy(B, 0, A, 0, pointerB+1);
        //System.out.println(Arrays.toString(A));
    }

    public static int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        while(l!=r){
            int mid = (l+r)/2;
            if(target < nums[mid]){
                r = mid;
            } else if (target >nums[mid]) l = mid + 1;
            else return nums[mid];
        }
        if(nums[l] == target) return l;
        if(target < nums[l]) return l;
        else return l+1;
    }

    public static void main(String[] args) {
        //merge(new int[] {1,2,3,0,0,0},3,new int[] {0,5,6},3);
        searchInsert(new int[] {1,2,3,4,5,6}, 7);
    }
}
