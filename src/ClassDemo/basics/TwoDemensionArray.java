package ClassDemo.basics;

/**
 * Created by Pan on 10/11/20.
 */
public class TwoDemensionArray {
    public static void printArray(int[][] matrix){
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int sumColumnArray(int[][] matrix){
        int max =0;
        int tempMax = 0;
        for(int i =0; i<matrix.length;i++){
             for(int j=0; j<matrix[i].length;j++){
                 tempMax += matrix[i][j];
             }
            max = Math.max(tempMax, max);
            tempMax = 0;
        }
        return max;
    }




    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {1,2,3,4},
                {2,1,0,3},
                {5,2,0,0}
        };
        printArray(matrix);
        System.out.println(sumColumnArray(matrix));

        for(int column =0; column <matrix[0].length;column++){
            int total =0;
            for(int row =0; row < matrix.length;row++){
                total += matrix[row][column];
            }
            System.out.println("Sum for column " +column +"is "+ total);

        }
    }
}
