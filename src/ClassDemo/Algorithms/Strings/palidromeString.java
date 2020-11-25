package ClassDemo.Algorithms.Strings;

public class palidromeString {

    @Deprecated
    public static boolean isPalidrome(String s){
        s = s.replaceAll("\\W" , "");
        s = s.replaceAll("\\_" , "");
        s = s.toLowerCase();
        System.out.println(s);
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

    public static boolean isPalidromeByrev(String s){
        StringBuffer sgood = new StringBuffer();
        for(int i = 0; i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sgood.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer sgood_rev = new StringBuffer(sgood).reverse();
        return sgood.toString().equals(sgood_rev.toString());
    }



    public static void main(String[] args) {
        String s = "ab_a";
        System.out.println(isPalidrome(s));
    }
}
