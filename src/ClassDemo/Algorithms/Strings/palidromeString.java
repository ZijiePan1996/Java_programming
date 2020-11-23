package ClassDemo.Algorithms.Strings;

public class palidromeString {
    public static boolean isPalidrome(String s){
        s = s.replaceAll("\\W", "");
        s = s.toLowerCase();
        //System.out.println(s);
        if(s.length()<=1){
            return true;
        }
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                start ++;
                end --;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalidrome(s));
    }
}
