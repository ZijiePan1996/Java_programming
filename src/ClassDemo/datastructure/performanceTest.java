package ClassDemo.datastructure;

import ClassDemo.datastructure.list.Arraylist;

import java.util.*;

public class performanceTest {
    static final int N=50000;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<N; i++){
            list.add(i);
        }
        Collections.shuffle(list);

        Collection<Integer> set1 = new HashSet<>(list);
        System.out.println("Member test time for hashset is " + getTestTime(set1) + " milliseconds");
        Collection<Integer> linkedHashSet = new LinkedHashSet<>(list);
        System.out.println("Member test time for linkedHashset is " + getTestTime(linkedHashSet) + " milliseconds");
        Collection<Integer> treeSet = new TreeSet<>(list);
        System.out.println("Member test time for Treeset is " + getTestTime(treeSet) + " milliseconds");
        System.out.println("Remove test time for Treeset is " + getRemoveTime(treeSet) + " milliseconds");
        Collection<Integer> arrayList = new ArrayList<>(list);
        System.out.println("Member test time for arraylist is " + getTestTime(arrayList) + " milliseconds");
        System.out.println("Member test time for arraylist is " + getRemoveTime(arrayList) + " milliseconds");

    }
    public static long getTestTime(Collection<Integer> c){
        long startTime = System.currentTimeMillis();
        //for(int i=0; i<N; i++) c.contains((int) (Math.random()*2*N));
        for(int i=0; i<N; i++){
            if(c.contains((int) (Math.random()*2*N))){
                continue;
            }
        }
        return System.currentTimeMillis()-startTime;
    }

    public static long getRemoveTime(Collection<Integer> c){
        long startTime = System.currentTimeMillis();
        for(int i=0; i<N; i++) c.remove(i);
        return System.currentTimeMillis()- startTime;
    }
}
