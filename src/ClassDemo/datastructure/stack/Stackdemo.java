package ClassDemo.datastructure.stack;

import java.util.Stack;

public class Stackdemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<10; i++){
            stack.push(i);
        }
        System.out.println(stack.pop());
        System.out.println("--------------");
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
