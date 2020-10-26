package ClassDemo.datastructure.list;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args){
        List<String> arrayList =  new ArrayList();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add(2, "d");
        System.out.println(arrayList);

        arrayList.remove("a");

        for(int i=0; i<arrayList.size();i++){
            if(arrayList.get(i) == "a"){
                arrayList.remove(i);
            }

        }
        System.out.println(arrayList);
    }
}
