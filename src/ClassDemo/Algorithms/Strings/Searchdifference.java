package ClassDemo.Algorithms.Strings;

public class Searchdifference {
    public static char findTheDifference(String s, String t) {
        int[] hashchar = new int[26];
        int slength = s.length();
        int tlength = t.length();
        for(int i =0; i<slength;i++){
            hashchar[s.charAt(i)-'a']++;
        }
        for(int i =0; i<tlength;i++){
            int result = --hashchar[t.charAt(i)-'a'];
            if(result<0) return t.charAt(i);
        }
        return 'a';
    }

    public static String reverseWords(String s) {
        String realString = s.replaceFirst("\\s","");
        String[] stringlist = realString.split("\\s");
        int length = stringlist.length;
        int start = 0;
        int end = length-1;
        while(start<end){
            String temp = stringlist[start];
            stringlist[start] = stringlist[end];
            stringlist[end] = temp;
            start++;
            end--;
        }
        String result = "";
        for(int i = 0; i<length-1; i++){
            result= result + stringlist[i]+" ";
        }
        return result;
    }

    public static void main(String[] args) {
        findTheDifference("abcd","abcde");
        String s  = "123 3232";
        System.out.println(s.replaceAll(" ","%20"));
        String[] a = s.split(" ");
        System.out.println(a[1]);
        System.out.println(reverseWords(" hello world "));
    }
}
