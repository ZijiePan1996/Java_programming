package ClassDemo.Algorithms.Arrays;

import java.util.HashMap;
import java.util.Map;

public class FourSum {
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D){
        int result = 0;
        Map<Integer, Integer> countAB = new HashMap<>();
        for(int i  = 0; i < A.length; i++){
            for(int j = 0; j < B.length; j++){
                countAB.put(A[i]+B[j], countAB.getOrDefault(A[i]+B[j],0) + 1);
            }
        }
        for(int i =0; i < C.length ; i++){
            for(int j =0; j < D.length; j++){
                int k = countAB.getOrDefault(-(C[i]+D[j]),0);
                if(k > 0){
                    result += k;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = new int[] {-1,-1};
        int[] B = new int[] {-1,1};
        int[] C = new int[] {-1,1};
        int[] D = new int[] {1,-1};
        System.out.println(fourSumCount(A,B,C,D));
    }
}
