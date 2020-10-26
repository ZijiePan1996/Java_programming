package ClassDemo.datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.remove();
        System.out.println(queue);
    }
}
