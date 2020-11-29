package ClassDemo.Algorithms.Backtrack;


import java.util.*;

/* Leetcode46 全排列，并不是很简单，采用递归回溯的方法，比较经典

 */
public class Permutation{
    public static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        HashSet<List<Integer>> hashset  = new HashSet<List<Integer>>();
        List<List<Integer>> finalset  = new ArrayList<List<Integer>>();
        List<Integer> output = new ArrayList<Integer>();
        for(int num: nums){
            output.add(num);  //这里把nums里面的值加进output里，准备开始遍历
        }
        int n = nums.length;
        backtrack(n, output, res, 0);
        for(int i =0; i<res.size(); i++){
            if(!hashset.contains(res.get(i))){
                hashset.add(res.get(i));
                finalset.add(res.get(i));
            }
        }
        return finalset;
    }
    /*
    如果 \textit{first}==nfirst==n，说明我们已经填完了 nn 个位置（注意下标从 00 开始），找到了一个可行的解，我们将 \textit{output}output 放入答案数组中，递归结束。
如果 \textit{first}<nfirst<n，我们要考虑这第 \textit{first}first 个位置我们要填哪个数。根据题目要求我们肯定不能填已经填过的数，因此很容易想到的一个处理手段是我们定义一个标记数组 \textit{vis}[]vis[] 来标记已经填过的数，那么在填第 \textit{first}first 个数的时候我们遍历题目给定的 nn 个数，如果这个数没有被标记过，我们就尝试填入，并将其标记，继续尝试填下一个位置，即调用函数 backtrack(first + 1, output)。搜索回溯的时候要撤销这一个位置填的数以及标记，并继续尝试其他没被标记过的数。

     */

    public static void backtrack(int n, List<Integer> output, List<List<Integer>> res, int first){
        if(first == n){

            res.add(new ArrayList<Integer>(output));
        }
        //这里的first是指向下递归的第一个元素
        else {
            for (int i = first; i < n; i++) {
                Collections.swap(output, first, i);
                backtrack(n, output, res, first + 1);
                Collections.swap(output, first, i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(permute(new int[] {1,2,1}));
    }
}
