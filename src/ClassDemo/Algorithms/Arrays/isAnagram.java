package ClassDemo.Algorithms.Arrays;

import java.util.HashMap;
import java.util.Map;

public class isAnagram {

    @Deprecated
    @SuppressWarnings("all")
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> hashmaps = new HashMap<>();
        Map<Character, Integer> hashmapt = new HashMap<>();
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        for(char i:chars){
            int occur = hashmaps.getOrDefault(i,0)+1;
            hashmaps.put(i, occur);
        }
        for(char j:chart){
            int occur = hashmapt.getOrDefault(j, 0) + 1;
            hashmapt.put(j, occur);
        }
        if(hashmaps.equals(hashmapt)){return true;}
        else return false;
    }


    public boolean realisAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        //System.out.println(isAnagram("Hello", "olleH"));
        String s = "Yes";
        System.out.println(s.length());
    }
}
