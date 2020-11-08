package ClassDemo.Algorithms.Pointer;

public class Containter_more {
    public static int maxArea(int[] height){
        int i =0; int j = height.length-1;
        int maxarea = 0;
        while(i<j){
            maxarea = Math.max(maxarea, Math.min(height[i], height[j]) * (j-i));
            if(height[i] <=height[j]){
                i++;
            }else j--; }

        return maxarea;
    }

    public static void main(String[] args) {
        int[] newheight = new int[] {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(newheight));
    }
}
