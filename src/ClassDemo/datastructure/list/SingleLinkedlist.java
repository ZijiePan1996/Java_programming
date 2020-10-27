package ClassDemo.datastructure.list;

/**
 * Created by Pan on 27/10/20.
 */
public class SingleLinkedlist {
    private int length;
    private Node head;
    SingleLinkedlist(){
        length=0;
        head =null;
    }

    private class Node{
        private Object data;
        private Node next;
        Node(Object data){
            this.data = data;
        }
    }

    public Object addHead(Object obj){
        Node newHead = new Node(obj); //definition of the new node
        if(length ==0){
            head = newHead;   //set the node as head node if the linkedlist is empty
        }else{
            newHead.next = head; //assign next node as the original head
            head = newHead; //assign the new head
        }
        length ++;
        return obj;
    }

    public boolean delete(Object value){
        if(length ==0){
            return false;       //链表长度为0，说明链表为空
        }

        Node current = head;
        Node previous = head;

        while(current.data != value){
            if(current.next == null){
                return false;
            }else{
                previous = current;
                current = current.next;
            }
        }

        if(current == head){
            head = current.next;  //如果要删除的是头节点，则需要把要删除的节点的下一个节点指定为头节点
            length--;
        }else{
            previous.next = current.next;
            length--;
        }
        return true;
    }

    public int getLength(){
        return length;
    }

    public String find(Object obj){
        Node current = head;
        int tempSize = length;
        while(tempSize >0){
            if(obj.equals(current.data)){
                return String.valueOf(current.data );             //如果当前数据和要查找的相同，则返回该数据
            }else{
                current = current.next;     //如果不同则继续向后查找
            }
            tempSize--;
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        if (head != null) {
            Node curr = head;
            while (curr != null) {
                sb.append(String.valueOf(curr.data));
                if (curr.next != null) {
                    sb.append(" ->").append(" ");
                }
                curr = curr.next;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Node reverseList(){
        Node prev = null;
        Node curr = head;
        while(curr != null) {
            Node temp = curr.next;
            System.out.println(curr.data);
            curr.next = prev;       //此时将指针指向上一个节点
            prev = curr;            //将现在的node赋给prev
            curr = temp;            //将原本的下一个元素作为新的curr

        }
        head = prev;
        return head;
    }






    public static void main(String[] args) {
        SingleLinkedlist linkedlist = new SingleLinkedlist();
        for(int i = 0; i<10; i++){
            linkedlist.addHead(i);
        }
        System.out.println(linkedlist);
        linkedlist.reverseList();
        System.out.println();
    }
}
