package ClassDemo.datastructure.queue;

import java.util.Deque;
import java.util.LinkedList;

//移掉k位数字使得string的值最小
public class DequeLeetcode422 {
    public static String removeKdigits(String num, int k){
        Deque<Character> stack = new LinkedList<>();
        int length = num.length();
        for(int i = 0; i <length; i++){
            char digit = num.charAt(i);
            while(!stack.isEmpty() && k >0 && stack.peekLast() >digit){
                stack.pollLast();
                k--;
            }
            stack.offerLast(digit);
        }

        for(int i =0; i<k; i++) stack.pollLast();

        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true;

        while(!stack.isEmpty()){
            char digit = stack.pollFirst();
            if(leadingZero && digit == '0') continue;
            leadingZero = false;
            sb.append(digit);
        }

        return sb.length() ==0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeKdigits("10", 2));
    }
}
