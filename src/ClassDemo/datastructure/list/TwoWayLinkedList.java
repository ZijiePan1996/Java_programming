package ClassDemo.datastructure.list;

public class TwoWayLinkedList {
     private Node head; //链表头
     private Node tail; //链表尾
     private int length; //链表的长度

     private class Node{
         private Object data;
         private  Node next;
         private Node prev;
         public Node(Object data){
             this.data = data;
         }
     }

     public TwoWayLinkedList(){
         length =0;
         head = null;
         tail = null;
     }
     public void addTail(Object value){
         Node newNode = new Node(value); //一个新的node,其储存值为value，调用的是Node的构造方法
         if(length ==0){
             head = newNode;
             tail = newNode;
             length++;
         }else{
             newNode.prev = tail;
             tail.next = newNode;
             tail = newNode;
             length++;
             //当前节点的上一个节点设置为尾部节点，
             // 同时原来尾部节点的下一个节点设置为当前节点
             //然后将新的设置为尾部节点（完成插入）
             //不能忘记加一操作
         }
     }
     public void addHead(Object value){
         Node newNode = new Node(value);
         if(length ==0){
             head = newNode;
             tail = newNode;
             length++;
         }else{
             newNode.next = head;
             head.prev = newNode;
             head = newNode;
             length ++;
         }
     }

     public Node deleteHead(){
         Node temp = head;
         if(length !=0){
             head = head.next;
             head.prev = null;
             length--;
             return temp;
         }else{return null;}
     }

     public Node deleteTail(){
         Node temp = tail;
         if(length !=0){
             tail = tail.prev;
             tail.next = null;
             length --;
             return  temp;
         }else{return null;
         }
     }


}
