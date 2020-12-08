package ClassDemo.Algorithms.Search;

public class SearchMatrix {
    public static boolean searchMatrixForce(int[][] matrix, int target){
        //暴力算法复杂度自然是O（mn），空间复杂度O（1）
        for(int i =0; i< matrix.length;i++){
            for(int j =0; j<matrix[i].length; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }



    public static boolean searchMatrixPointer(int[][] matrix, int target){
        int i = matrix.length-1;
        int j = 0;
        if(matrix == null) return false;
        while(j<matrix[0].length && i>0){
            if(matrix[i][j] > target)  i--;
            else if(matrix[i][j] < target)  j++;
            else return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int[][] newmatrix = new int[][]{
                {1,   4,  7, 11, 15},
            {2,   5,  8, 12, 19},
            {3,   6,  9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        System.out.println(searchMatrixForce(newmatrix, 20));
        System.out.println(searchMatrixPointer(newmatrix, 20));
    }
}
