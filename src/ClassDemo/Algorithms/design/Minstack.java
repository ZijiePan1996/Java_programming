package ClassDemo.Algorithms.design;

import java.util.Deque;
import java.util.LinkedList;

public class Minstack {
    Deque<Integer> xStack;
    Deque<Integer> minStack;

    public Minstack(){
        xStack = new LinkedList<Integer>();
        minStack = new LinkedList<Integer>();
        minStack.push(Integer.MAX_VALUE);
    }
    public void push(int x){
        xStack.push(x);
        minStack.push(Math.min(minStack.peek(),x));
    }
    public void pop(){
        xStack.pop();
        minStack.pop();
    }

    public int top(){
        return xStack.peek();
    }
    public int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args) {
        Minstack minstack = new Minstack();
        minstack.push(-2);
        minstack.push(100);
        minstack.push(50);
        System.out.println(minstack.getMin());
    }
}
