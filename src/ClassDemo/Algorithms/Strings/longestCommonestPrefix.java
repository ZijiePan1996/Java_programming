package ClassDemo.Algorithms.Strings;

import java.util.Arrays;

public class longestCommonestPrefix {
    public static String longestcommonPrefix(String[] strs) {
        String string1 = strs[0];
        char[] head = string1.toCharArray();
        //StringBuffer sb = new StringBuffer();
        for(String string: strs){
            for(int i =0; i<head.length; i++){
                if(i < string.length() && head[i] == string.charAt(i)){
                    continue;
                }
                head = Arrays.copyOfRange(head,0,i);
            }

        }
        return Arrays.toString(head);
    }

    public static void main(String[] args) {
        String[] a = new String[] {"floor", "float", "floank"};
        System.out.println(longestcommonPrefix(a));
    }
}
