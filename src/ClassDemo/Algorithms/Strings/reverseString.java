package ClassDemo.Algorithms.Strings;

import java.util.Arrays;

public class reverseString {
    public static char[] reverseString(char[] s){
        int start = 0;
        int end = s.length-1;
        while(start < end){
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start ++;
            end --;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseString(new char[] {'h','e','l','l','o'})));
        String s = "123345";
        char[] news = s.toCharArray();
        for(char i:news){
            System.out.println(i);
        }
    }
}
