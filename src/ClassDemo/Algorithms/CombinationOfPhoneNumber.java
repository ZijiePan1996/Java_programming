package ClassDemo.Algorithms;

import java.util.*;

/**
 * Created by Pan on 9/11/20.
 */
public class CombinationOfPhoneNumber {
    public static List<String> letterCombinations(String digits) {
        List<String> a  = new ArrayList<>();
        if(digits.length() ==0 ){
            return a;
        }
        //先列出所有character和string对应的hashmap
        Map<Character, String> phoneMap = new HashMap<Character, String>(){{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
        }};
        //使用backtrack进行递归
        //a：最终返回的list，digits，输入值
        backtrack(a, phoneMap, digits, 0, new StringBuffer());
        return a;
    }
    public static void backtrack(List<String> a, Map<Character, String>
            phoneMap, String digits, int index, StringBuffer combination){
            if(index == digits.length()){
                a.add(combination.toString());
            } else {
                char digit = digits.charAt(index);
                String letters = phoneMap.get(digit);
                int letterCount = letters.length();
                for(int i = 0; i<letterCount; i++){
                    combination.append(letters.charAt(i));
                    backtrack(a, phoneMap, digits,index+1,combination);
                    combination.deleteCharAt(index);
                }
            }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }
}
