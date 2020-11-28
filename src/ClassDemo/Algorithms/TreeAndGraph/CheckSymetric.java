package ClassDemo.Algorithms.TreeAndGraph;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class CheckSymetric {
    @Deprecated
    public static boolean isSymmetric(TreeNode root) {
        List<List<Integer>> symmetric = levelOrder(root);
        for(List<Integer> i : symmetric){
            if(localsymmetric(i) == true) continue;
            else return false;
        }
        return true;
    }
    @Deprecated
    public static boolean localsymmetric(List<Integer> list){
        int start = 0;
        int end = list.size()-1;
        while(start < end){
            if(list.get(start) == list.get(end)){
                start++;
                end--;
            } else return false;
        }
        return true;
    }

    public static boolean isSymmetricbyRecur(TreeNode root){
        return check(root, root);
    }
    public static boolean check(TreeNode p, TreeNode q){
        if(p==null && q == null){
            return true;
        }
        if(p == null || q ==null){
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }

    //或者可以用迭代

    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }
        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int currentlevelsize = queue.size();
            for (int i = 0; i < currentlevelsize; i++) {
                //先取出了queue里的node元素
                TreeNode node = queue.poll();
                //这时候已经将node里的元素放了进去
                level.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right!= null) queue.offer(node.right);

            }
            ret.add(level);
        }
        return ret;
    }

    public static void main(String[] args) {
        TreeNode node0 = new TreeNode(1);
        TreeNode node1 = new TreeNode(2);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(3);
        node0.left = node1;
        node0.right = node2;
        node1.right = node3;
        node2.left = node4;
        System.out.println(levelOrder(node0));
        System.out.println(isSymmetric(node0));
    }
}
