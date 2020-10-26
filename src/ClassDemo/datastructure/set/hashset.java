package ClassDemo.datastructure.set;

import java.util.*;

//set里的值不能够重复
public class hashset {
    public static void main(String[] args) {
        Set<String> hashset = new HashSet<>();
        //使用linkedhashset确保按照添加顺序排序
        hashset.add("one");
        hashset.add("two");
        hashset.add("three");
        hashset.add("One");
        System.out.println(hashset);
        hashset.remove("one");
        System.out.println(hashset.size());

        List<String> supplierNames = new ArrayList<>();
        supplierNames.add("one");
        supplierNames.add("two");
        hashset.retainAll(supplierNames);
        System.out.println(hashset);
    }
}
