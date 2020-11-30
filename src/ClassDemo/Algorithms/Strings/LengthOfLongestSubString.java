package ClassDemo.Algorithms.Strings;

import java.util.HashSet;

public class LengthOfLongestSubString {
    public static int lengthOfLongestSubstring(String s) {
        char[] input = s.toCharArray();
        HashSet<Character> hashset = new HashSet<>();
        int leftpointer = 0;
        int maximumSize = 0;
        int currsize = 0;
        int rightpointer = 0;

        while(leftpointer < input.length ){
            while(rightpointer < input.length && !hashset.contains(input[rightpointer])){
                hashset.add(input[rightpointer]);
                currsize += 1;
                maximumSize = Math.max(currsize, maximumSize);
                rightpointer ++;
            }
            if(rightpointer == input.length){
                return maximumSize;
            }
            hashset.remove(input[leftpointer++]);
            currsize--;
        }

        return maximumSize;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
}
