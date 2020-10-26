package ClassDemo.datastructure;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap(new descendingSorter());
        treeMap.put(40000, "小张");
        treeMap.put(30000, "小李");
        treeMap.put(50000, "小赵");

        treeMap.forEach((k, v)->{
            System.out.println(k + ":" +v);
        });

    }
}

class descendingSorter implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }

}