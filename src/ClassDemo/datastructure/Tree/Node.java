package ClassDemo.datastructure.Tree;

public class Node {
    private int value;
    private Node left;
    private Node right;

    public Node(){}
    public Node(Node left, Node right, int value){
        this.left = left;
        this.right = right;
        this.value = value;
    }
    public Node(int value){
        this(null, null, value);
        this.value = value;
    }
    public Node getLeft(){
        return this.left;
    }

    public Node getRight(){
        return this.right;
    }
    public void setRight(Node right){
        this.right = right;
    }
    public void setLeft(Node left){
        this.left = left;
    }
    public int getValue(){
        return this.value;
    }
    public void setValue(int calue){
        this.value = value;
    }
    @Override
    public String toString(){
//        return "TreeNode [leftTreeNode=" + this.left +
//                ", rightTreeNode=" + this.right +
//                ", value" +value + "]";
        return String.valueOf(value);
    }

    }




