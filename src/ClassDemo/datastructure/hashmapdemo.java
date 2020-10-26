package ClassDemo.datastructure;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmapdemo {
    public static void main(String[] args){
        Map<String, Integer> incomeMap = new HashMap();
        incomeMap.put("鸡腿", 20000);
        incomeMap.put("宝宝", 200000);

        System.out.println(incomeMap.get("鸡腿"));

        for (Map.Entry<String, Integer> entry : incomeMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("++++++++++++++lambda way ++++++++++++++");
        incomeMap.forEach((k,v) -> {
            System.out.println(k + ":" +v);
        });

        System.out.println("++++++++++++++iterator way+++++++++++++");
        Set set = incomeMap.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        incomeMap.remove("宝宝");
        System.out.println(incomeMap);


    }
}
