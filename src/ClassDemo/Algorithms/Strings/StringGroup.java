package ClassDemo.Algorithms.Strings;

import java.util.*;

//Leetcode 49 字母异位词分组
public class StringGroup {
    public static List<List<String>> groupAnagrams(String[] strs){
        if(strs == null || strs.length == 0){
            return new ArrayList<>();
        }
        Map<String, List<String>> hashmap = new HashMap<>();
        for(int i =0; i< strs.length; i++){
            char[] c = strs[i].toCharArray();
            //先进行排序，然后转变为字符串
            Arrays.sort(c);
            String keyStr = String.copyValueOf(c);
            if(!hashmap.containsKey(keyStr)) {
                hashmap.put(keyStr, new ArrayList<>());
            }
            hashmap.get(keyStr).add(strs[i]);
        }
        return new ArrayList<>(hashmap.values());
    }

    public static List<List<String>> countNumberAnagrams(String[] strs){
        if(strs == null || strs.length == 0) return new ArrayList<>();
        Map<String, List<String>> hashmap = new HashMap<>();
        for(String s: strs){
            char[] ca = new char[26];
            for(char c:s.toCharArray()){
                ca[c-'a']++;
            }
            String keyStr = String.valueOf(ca);
            if(!hashmap.containsKey(keyStr)){
                hashmap.put(keyStr, new ArrayList<>());
            }
            hashmap.get(keyStr).add(s);
        }
        return new ArrayList<>(hashmap.values());

    }
}
