package ClassDemo.datastructure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("Beijing");
        collection.add("Taibei");
        collection.add("New York");

        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()){
            String it = (String)iterator.next();
            System.out.println(it.toUpperCase());
        }
    }
}
