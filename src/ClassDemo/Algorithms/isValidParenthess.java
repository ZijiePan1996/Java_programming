package ClassDemo.Algorithms;

import java.util.Stack;

/**
 * Created by Pan on 9/11/20.
 */
public class isValidParenthess {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        if(s.length()%2 ==0){


            for(int i=0;i<s.length();i++){
                char c = s.charAt(i);
                if(c == '{' || c == '[' || c == '(') stack.push(c);
                else if(c=='}' && stack.size()>0 && stack.peek() == '{') stack.pop();
                else if(c==')' && stack.size()>0 && stack.peek() == '(') stack.pop();
                else if(c==']' && stack.size()>0 && stack.peek() == '[') stack.pop();
                else return false;

            }

        }
        else return false;

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(isValid("}("));
    }
}
