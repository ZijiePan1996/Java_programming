package ClassDemo.basics.Recursiv_Method;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by Pan on 3/11/20.
 */
public class RecursivePalindrome {
    public static boolean isPalidrome(String s){
        return isPalifrome(s,0,s.length()-1);
    }

    public static boolean isPalifrome(String s, int low, int high){
        if(high <=low){
            return true;
        } else if(s.charAt(low)!= s.charAt(high)){
            return false;
        } else
            return isPalifrome(s, low+1, high-1);

    }



    public static void main(String[] args) {
        System.out.println(isPalidrome("123321"));
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        for(int i =0; i<10; i++){
            a.add(i);
        }
        System.out.println(a);
        c.add(a.remove(a.size() -1));
        System.out.println("a: "+ a+" c: "+c);

    }
}
