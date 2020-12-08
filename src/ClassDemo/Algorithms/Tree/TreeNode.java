package ClassDemo.Algorithms.Tree;

import apple.laf.JRSUIUtils;

import java.util.*;

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

    //中序遍历的两种方式
    public List<Integer> inorderTraversalByrecursive(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }

    public List<Integer> inorderTraversalBystack(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        Deque<TreeNode> stk = new LinkedList<TreeNode>();
        while(root != null || !stk.isEmpty()){
            while(root != null){
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
    public static int kthSmallest(TreeNode root, int k){
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();

        while(true){
            while (root != null){
                stack.add(root);
                root = root.left;
            }
            root  = stack.removeLast();
            if(--k == 0) return root.val;
            root = root.right;
        }
    }


    public static List<List<Integer>> zigzaglevelOrder(TreeNode root){
        Deque<TreeNode> stackodd = new LinkedList<>();
        Deque<TreeNode> stackeven = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        int levelNumber = 1;
        stackodd.push(root);
        while(!stackodd.isEmpty() || !stackeven.isEmpty()){
            if(levelNumber%2 != 0 ){
                List<Integer> currresult = new ArrayList<>();
                while(!stackodd.isEmpty()){
                    TreeNode currNode = stackodd.pop();
                    currresult.add(currNode.val);
                    if (currNode.left != null) stackeven.push(currNode.left);
                    if (currNode.right != null) stackeven.push(currNode.right);
                }
                levelNumber ++;
                result.add(currresult);
            }
            else{
                List<Integer> currresult = new ArrayList<>();
                while(!stackeven.isEmpty()){
                    TreeNode currNode = stackeven.pop();
                    currresult.add(currNode.val);
                    if(currNode.right != null) stackodd.push(currNode.right);
                    if(currNode.left != null)stackodd.push(currNode.left);
                }
                levelNumber ++;
                result.add(currresult);
            }
        }

        return result;
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
        //System.out.println(isValidBSTbystack(node0));
        System.out.println(zigzaglevelOrder(node0));

    }

}
