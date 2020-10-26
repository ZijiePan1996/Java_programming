package ClassDemo.datastructure.queue;

public class RealQueue {
    public class Queue<E>{
        private Object[] data = null;
        private int maxSize;
        private int front; // start of the queue
        private int rear;  // end of the queue

        public Queue(){
            this(10);
        }
        public Queue(int initialSize){
            if(initialSize >= 0){
                this.maxSize = initialSize;
                data = new Object[initialSize];
                front = rear =0;
            } else{
                throw new RuntimeException("Initial size must be greater than 0");
            }
        }
    }
}
