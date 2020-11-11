package ClassDemo.Algorithms.DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoutetoFreedom {
    public static int findRotateSteps(String ring, String key){
        int n = ring.length(), m = key.length();
        //这里
        List<Integer>[] pos = new List[26];
        for(int i =0; i<26; ++i){
            //创建了26个数组，也即是每个字母创建一个数组
            pos[i] = new ArrayList<Integer>();
        }
        for(int i =0; i < n; ++i){
            //例如第一次循环时，第一个字符是g，因此将pos【6】添加0
            //第二次，将pos【14】添加1
            //第三次，pos【3】添加2
            //最后，pos 3，6，8， 13， 14有元素
            pos[ring.charAt(i) - 'a'].add(i);
        }
        int[][] dp = new int[m][n];
        //两行7列
        for(int i =0; i<m; ++i){
            Arrays.fill(dp[i], 0x3f3f3f); //这步没有懂，就是个极大数？
        }
        for (int i : pos[key.charAt(0) - 'a']) {
            dp[0][i] = Math.min(i, n - i) + 1;
        }
        for(int i = 1; i<m; ++i){
            for (int j : pos[key.charAt(i) - 'a']) {
                for (int k : pos[key.charAt(i - 1) - 'a']) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + Math.min(Math.abs(j - k), n - Math.abs(j - k)) + 1);
                }
            }

        }
        return Arrays.stream(dp[m - 1]).min().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(findRotateSteps("godding","gd"));
    }
}
