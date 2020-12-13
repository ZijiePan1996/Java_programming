package ClassDemo.Algorithms.Math;

import java.util.ArrayList;
import java.util.List;

public class y杨辉三角 {
    public List<List<Integer>> generate(int numRows) {
        if(numRows == 0) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i< numRows; i++){
            List<Integer> newadd = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i) newadd.add(1);
                else {
                    newadd.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            result.add(newadd);
        }
        return result;
    }
}
