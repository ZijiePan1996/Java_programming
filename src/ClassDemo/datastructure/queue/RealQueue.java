package ClassDemo.datastructure.queue;

public class RealQueue<E> {

        private Object[] data = null;
        private int maxSize;
        private int front; // start of the queue
        private int rear;  // end of the queue

        public RealQueue(){
            this(10);
        }
        public RealQueue(int initialSize){
            if(initialSize >= 0){
                this.maxSize = initialSize;
                data = new Object[initialSize];
                front = rear =0;
            } else{
                throw new RuntimeException("Initial size must be greater than 0");
            }
        }
        public boolean isEmpty(){
            return rear==front?true:false;
        }

        public int getSize(){
            return rear-front;
        }

        public boolean add(E e){
            if(rear==maxSize){
                throw new RuntimeException("The queue is full");
            }else{
                data[rear++] =e;
                return true;
            }
        }
        public E poll(){
            if(isEmpty()){
                throw new RuntimeException("Empty queue");
            } else{
                E value = (E) data[front];
                data[front++] = null;
                return value;
            }
        }

        public E peek(){
            if (isEmpty()){
                throw new RuntimeException("Empty queue");
            } else{
                return (E) data[front];
            }
        }



    public static void main(String[] args) throws InterruptedException {
        RealQueue<String> queue = new RealQueue();
        for(int i = 0; i < 10; i++){
            queue.add(String.valueOf((char)('A'+i)));
            System.out.println(queue.poll());
        }
        System.out.println(queue.poll());
        System.out.println(queue.getSize());

    }
}
