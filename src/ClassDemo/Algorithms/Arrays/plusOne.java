package ClassDemo.Algorithms.Arrays;

import java.util.*;

public class plusOne {
    public static int[] plusOne(int[] digits) {
        List<Integer> digitlist = new ArrayList<>();
        int carry = 1;
        for (int i = digits.length-1; i>-1; --i){
            if(digits[i]+carry == 10){
                digitlist.add(0);
                carry = 1;
            } else {
                digitlist.add(digits[i]+carry);
                carry = 0;
            }
        }
        if(carry == 1) digitlist.add(1);
        Collections.reverse(digitlist);
        Integer[] newresult = digitlist.toArray(new Integer[digitlist.size()]);
        int[] result = Arrays.stream(newresult).mapToInt(Integer::valueOf).toArray();
        return result;
    }

    public static int[] realplusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{ 9, 9, 9})));
        System.out.println(Arrays.toString(realplusOne(new int[]{ 5, 9, 9, 9})));
    }
}
