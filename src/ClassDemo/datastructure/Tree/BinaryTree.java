package ClassDemo.datastructure.Tree;

public class BinaryTree {
    private Node root;

    public Node getRoot(){
        return root;
    }

    public void insertBST(int key){
        Node p = root;
        Node prev = null;
        while(p != null){
            prev = p;
            if(key <p.getValue()){
                p = p.getLeft();
            }else if(key > p.getValue()){
                p = p.getRight();
            }else{
                return;
            }
        }

        if(root ==null){
            root = new Node(key);
        }else if(key < prev.getValue()){
            prev.setLeft(new Node(key));
        }else prev.setRight(new Node(key));
    }

    public void inOrderTraverse(Node node){
        if (node !=null){
            inOrderTraverse(node.getLeft());
            System.out.print(" " + node.getValue() + " ");
            inOrderTraverse(node.getRight());
        }
    }

    public void beforeOrderTraverse(Node node){
        if (node !=null){
            System.out.print(" " + node.getValue() + " ");
            beforeOrderTraverse(node.getLeft());
            beforeOrderTraverse(node.getRight());
        }
    }

    public void afterOrderTraverse(Node node){
        if (node !=null){
            afterOrderTraverse(node.getLeft());
            afterOrderTraverse(node.getRight());
            System.out.print(" " + node.getValue() + " ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insertBST(10);
        tree.insertBST(4);
        tree.insertBST(12);
        tree.insertBST(2);
        tree.insertBST(5);
        tree.insertBST(14);
        tree.insertBST(11);

        System.out.println(tree.getRoot());
        tree.inOrderTraverse(tree.getRoot());
        System.out.println();
        tree.beforeOrderTraverse(tree.getRoot());
        System.out.println();
        tree.afterOrderTraverse(tree.getRoot());
    }
}
