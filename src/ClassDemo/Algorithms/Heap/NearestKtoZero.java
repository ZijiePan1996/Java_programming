package ClassDemo.Algorithms.Heap;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.PriorityQueue;

public class NearestKtoZero {
    public static int[][] kClosest(int[][] points, int k){
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[0]-o1[0];
            }
        });
        //大根堆的第一个元素是23
        for(int i =0; i<k; ++i){
            pq.offer(new int[]{points[i][0] * points[i][0] + points[i][1] * points[i][1], i});
        }
        int n = points.length;
        for(int i = k; i<n; i++){
            int dist = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            //这里维护的是一个大根堆，它有k个元素, 其中每个元素第一个元素是值，第二个元素是它的初始index
            if(dist < pq.peek()[0]){
                pq.poll();
                pq.offer(new int[]{dist, i});
            }
        }
        int[][] ans = new int[k][2];
        for(int i = 0; i<k; i++){
            //输出值对应到初始的index
            ans[i] = points[Objects.requireNonNull(pq.poll())[1]];
        }
        return ans;

    }

    public static void main(String[] args) {
        int[][] result = kClosest(new int[][]{{0,1},{2,2},{3,1},{1,2}}, 2);
        for(int i=0; i< result.length; i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
