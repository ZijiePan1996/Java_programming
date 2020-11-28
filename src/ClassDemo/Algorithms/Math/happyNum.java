package ClassDemo.Algorithms.Math;

import java.util.HashSet;
import java.util.Set;

public class happyNum {
    public static boolean isHappy(int n) {
        Set<Integer> hashset = new HashSet<Integer>();
        boolean happy = false;
        int nextint = n;
        while(happy == false){
            int temp = nextint;
            nextint = 0;
            while(temp/10 != 0){
                nextint += Math.pow(temp%10, 2);
                temp /= 10;
            }
            nextint += Math.pow(temp%10, 2);
            //System.out.println(nextint);
            if(nextint == 1){
                happy = true;
            }
            if(!hashset.contains(nextint)){
                hashset.add(nextint);
            } else return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
