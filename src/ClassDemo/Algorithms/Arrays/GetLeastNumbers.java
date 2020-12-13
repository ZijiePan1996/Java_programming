package ClassDemo.Algorithms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GetLeastNumbers {
    public static int[] getleastNumbers(int[] arr, int k){
        if(k<1) return new int[]{};
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i = 0; i< arr.length; i++){
            if(pq.size()<k){
                pq.offer(arr[i]);
                continue;
            }
            if(arr[i] < pq.peek()){
                pq.poll();
                pq.offer(arr[i]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!pq.isEmpty()){
            list.add(pq.poll());
        }
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getleastNumbers(new int[] {0,0,0,2,0,5}, 0)));
    }
}
