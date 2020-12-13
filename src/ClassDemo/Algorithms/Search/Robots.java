package ClassDemo.Algorithms.Search;

import java.util.Deque;
import java.util.LinkedList;

public class Robots {
    /*剑指offer13，机器人的运动范围
       地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，
       它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。
       例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，
       因为3+5+3+8=19。请问该机器人能够到达多少个格子？
     */
    public static int movingCount(int m, int n, int k) {
        Deque<int[]> queue = new LinkedList<>();
        queue.offerLast(new int[]{0, 0});
        int result = 0;
        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                result++;
                int[] curr = queue.pollFirst();
                if (curr[0] + 1 < m && countSum(curr[0] + 1) + countSum(curr[1]) <= k) {
                    queue.offerLast(new int[]{curr[0] + 1, curr[1]});
                }
                if (curr[1] + 1 < n && countSum(curr[0] ) + countSum(curr[1] + 1) <= k) {
                    queue.offerLast(new int[]{curr[0] , curr[1] + 1});
                }
            }
        }
        return result;

    }

    public static int countSum(int m){
        int result = 0;
        while(m/10 != 0){
                result += m%10;
                m/=10;
        }
        result+=m;
        return result;
    }

    public static void main(String[] args) {
        movingCount(2, 3, 1);
    }
}
