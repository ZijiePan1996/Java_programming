package ClassDemo.datastructure.list;

import java.util.List;
import java.util.LinkedList;
public class Linkedlist {
    public static void main(String[] args){
        List<String> demoLinked= new LinkedList<String>();
        demoLinked.add("5");
        demoLinked.add("4");
        demoLinked.add("3");
        demoLinked.add("2");
        demoLinked.add("1");

        System.out.println(demoLinked);
        demoLinked.add(0,"99");
        //强制转换为linkedlist
        System.out.println((((LinkedList<String>) demoLinked).getLast()));

    }
}
