package ClassDemo.Algorithms.DP;

import java.util.Deque;
import java.util.LinkedList;

public class 接雨水 {
    public static int trapbyDP(int[] height){
        if(height == null || height.length <= 2) return 0;
        int ans = 0;
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];
        leftmax[0] = height[0];
        rightmax[height.length-1] = height[height.length-1];
        for(int i = 1; i< height.length; i++){
            leftmax[i] = Math.max(leftmax[i-1], height[i]);
        }
        for(int i = height.length-2; i>=0; i--){
            rightmax[i] = Math.max(rightmax[i+1], height[i]);
        }
        for(int i=0; i< height.length; i++){
            ans += Math.min(leftmax[i], rightmax[i]) -height[i];
        }
        return ans;
    }
    public int trapbyStack(int[] height) {
        int ans = 0, current = 0;
        Deque<Integer> stack = new LinkedList<Integer>();
        while (current < height.length) {
            while (!stack.isEmpty() && height[current] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty())
                    break;
                int distance = current - stack.peek() - 1;
                int bounded_height = Math.min(height[current], height[stack.peek()]) - height[top];
                ans += distance * bounded_height;
            }
            stack.push(current++);
        }
        return ans;
    }
}
