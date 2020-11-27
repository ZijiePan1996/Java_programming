package ClassDemo.Algorithms.Arrays;

import java.util.Deque;
import java.util.LinkedList;

public class mergeTwosorted {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        while(p1 >= 0 && p2 >= 0){
            if(nums1[p1] >= nums2[p2]) {
                nums1[p1+p2+1] = nums1[p1];
                p1--;
            } else{
                nums1[p1 + p2+1] = nums2[p2];
                p2--;
            }
        }
        if(p2>=0){
            System.arraycopy(nums2, 0, nums1, 0, p2+1);
        }
    }

    public static boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        char[] input = s.toCharArray();
        if( input.length == 0) return true;
        if( input.length % 2 != 0) return false;
        for(char c: input){
            if(c == '(' || c == '[' || c == '{'){
                stack.offerLast(c);
            }if(c== ')'){
                if(!stack.isEmpty() && stack.peekLast() == '(') stack.pollLast();
            }if(c== ']'){
                if(stack.peekLast() == '[') stack.pollLast();
            }if(c== '}'){
                if(stack.peekLast() == '{') stack.pollLast();
            }
        }
        if(stack.size() != 0) return false;
        return true;
    }

    public static void main(String[] args) {

        merge((new int[]{1,2,3,0,0,0}),3,(new int[] {4,5,6}),3);
        System.out.println(isValid("{[()]}"));
    }
}
