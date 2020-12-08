package ClassDemo.Algorithms.Search;

import java.util.*;

public class TopKfrequent {
    public static int[] topKfrequent(int[] nums, int k){
        PriorityQueue<int[]> minHeap=new PriorityQueue<int[]>(new Comparator<int[]>() {
            @Override
            public int compare(int[] m, int[] n) {
                return m[1] - n[1];
            }
        });
        Map<Integer, Integer> hashmap = new HashMap<>();
        for(int num: nums){
            hashmap.put(num, hashmap.getOrDefault(num, 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: hashmap.entrySet()){
            int[] ocurr = new int[] {entry.getKey(), entry.getValue()};
            if(minHeap.size()<k) {
                minHeap.offer(ocurr);
                continue;
            }
            if(ocurr[1]>minHeap.peek()[1]){
                minHeap.poll();
                minHeap.add(ocurr);
            }
        }
        int[] result = new int[k];
        for(int i = 0; i < k;i++){
            result[i] = minHeap.poll()[0];
        }
        return result;


    }

    public static int finfKthlargest(int[] nums, int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        for(int num:nums){
            if(minHeap.size()<k){
                minHeap.offer(num);
                continue;
            }
            if(num > minHeap.peek()){
                minHeap.poll();
                minHeap.offer(num);
            }

        }
        return minHeap.poll();
    }



    public static void main(String[] args) {
        int[] test = new int[] {3,2,3,1,2,4,5,5,6};
        System.out.println(Arrays.toString(topKfrequent(new int[]{1,1,1,2,2,3},2)));
        System.out.println((finfKthlargest(test,4)));
    }
}
