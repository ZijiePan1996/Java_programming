package ClassDemo.Algorithms.Backtrack;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static List<String> generateParenthesis(int n){
        List<String> Combinations = new ArrayList<>();
        generateAll(new char[2 * n], 0, Combinations);
        return Combinations;
    }

    public static void backtrack(List<String> ans, StringBuilder cur,
                                 int open, int close, int max){
        if(cur.length() == max * 2){
            ans.add(cur.toString());
            return;
        }
        if(open < max){
            cur.append('(');
        }
    }





    public static void generateAll(char[] current, int pos, List<String> result){
        if(pos == current.length ){
            if(valid(current)){
            result.add(new String(current));}
        } else {
            current[pos] = '(';
            generateAll(current,pos+1,result);
            current[pos] = ')';
            generateAll(current,pos+1,result);
        }
    }

    public static boolean valid(char[] current) {
        int balance = 0;
        for(char c:current){
            if(c=='('){
                ++balance;
            } else {
                --balance;
            }
            if(balance < 0) return false;
        }
        return balance ==0;
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

}
