package ClassDemo.Algorithms.design;

import java.util.Deque;
import java.util.LinkedList;

class MyStack {
    Deque<Integer> deque1;
    Deque<Integer> deque2;

    /** Initialize your data structure here. */
    public MyStack() {
        deque1 = new LinkedList<Integer>();
        deque2 = new LinkedList<Integer>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        deque2.offerLast(x);
        while(!deque1.isEmpty()){
            deque2.offerLast(deque1.pollFirst());
        }
        while(!deque2.isEmpty()){
            deque1.offerLast(deque2.pollFirst());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return deque1.pollFirst();
    }

    /** Get the top element. */
    public int top() {
        return deque1.peekFirst();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return deque1.isEmpty() && deque2.isEmpty();
    }

    public static void main(String[] args) {
        MyStack newstack = new MyStack();
        newstack.push(1);
        newstack.push(2);
        System.out.println(newstack.pop());
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */