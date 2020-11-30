package ClassDemo.Algorithms.Tree;

import apple.laf.JRSUIUtils;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    private int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {this.val = val;}

    public boolean isValidBST(TreeNode root){
        return helper(root, null, null);
    }

    public boolean helper(TreeNode node, Integer lower, Integer upper){
        if(node == null){
            return true;
        }
        int val = node.val;
        if(lower != null && val <= lower){
            return false;
        }
        if(upper != null && val >= upper){
            return false;
        }
        if(!helper(node.right,val,upper)){
            return false;
        }
        if (!helper(node.left, lower, val)) {
            return false;
        }
        return true;
    }

    public static boolean isValidBSTbystack(TreeNode root){
        Deque<TreeNode> stack = new LinkedList<>();
        double inorder = -Double.MAX_VALUE;

        while(!stack.isEmpty() || root != null){
            while(root!= null) {
                stack.offerLast(root);
                root = root.left;
            }
            root = stack.pollLast();
            if(root.val <=inorder) {
                return false;
            }
            inorder = root.val;
            root = root.right;
        }
        return true;
    }


    public static void main(String[] args) {
        TreeNode node0 = new TreeNode(5);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(6);
        node0.left = node1;
        node0.right = node2;
        node2.left = node3;
        node2.right = node4;
        System.out.println(isValidBSTbystack(node0));
    }

}
