package ClassDemo.Algorithms.DP;

public class minimumRoute {
    public static int minPathSum(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for(int i = 1; i < n; i++){
            dp[0][i] = dp[0][i-1] + grid[0][i];
        }
        for(int i = 1; i < m; i++){
            dp[i][0] = dp[i-1][0] + grid[i][0];
        }
        for(int j = 1; j <n; j++){
            for(int k = 1; k <m; k++){
                dp[k][j] = Math.min(dp[k][j-1], dp[k-1][j]) + grid[k][j];
            }
        }

        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int[][] testmatrix = new int[][]{
                {1,2},
                {1,1}
        };
        System.out.println(minPathSum(testmatrix));
    }
}
