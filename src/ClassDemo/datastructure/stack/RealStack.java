package ClassDemo.datastructure.stack;

import java.util.ArrayList;
import java.util.List;

public class RealStack<E> {
    private Object[] data = null;
    private int maxSize = 0;
    private int top = -1;

    RealStack(){
        this(10);
    }

    RealStack(int initialSize){
        if(initialSize >=0){
            this.maxSize = initialSize;
            data = new Object[initialSize];
            top = -1;
        }else{
            throw new RuntimeException("The initial size can't be smaller than 0" + initialSize);
        }
    }

    public boolean push(E e){
        if(top == maxSize -1){
            throw new RuntimeException("Stack is full!!!");
        } else{
            data[++top] =e;
            return true;
        }
    }
    public E pop(){
        if(top>=0){
            return (E) data[top--];
        }else{
            throw new RuntimeException("empty stack");
        }
    }

    public E peek(){
        if(top>=0){
            return (E) data[top];
        } else{
            throw new RuntimeException("empty stack!");
        }
    }

    public String toString() {
        return String.valueOf(top);
    }

    public static void main(String[] args) {
        RealStack<String> realstack = new RealStack<>();
        for(int i =0; i < realstack.maxSize; i++ ){
            realstack.push(String.valueOf((char)('A' +i)));
        }
        System.out.println(realstack.peek());
        for(int i=0; i<20; i++){
            System.out.println(realstack.pop());
        }

    }
}
