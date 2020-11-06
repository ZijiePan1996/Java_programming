package ClassDemo.Algorithms;

public class isPalindrome {
    public static String dpPalidrome(String s){
        int len = s.length();
        if(len < 2 ) return s;
        int maxlen = 1;
        int begin =0;

        boolean[][] dp = new boolean[len][len];
        for(int i =0; i<len; i++){
            dp[i][i] = true;
        }

        char[] charArray = s.toCharArray();

        for(int j=1; j<len; j++){
            for(int i=0; i<len; i++){
                if(charArray[i] != charArray[j]){
                    dp[i][j] = false;
                } else {
                    if (j-i < 3){
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i+1][j-1];

                    }
                }

                if(dp[i][j] && j-i+1 >maxlen){
                    maxlen = j-i+1;
                    begin = i;
                }
            }
        }

        return s.substring(begin,begin+maxlen);
    }





    public static String checkPalindrome(String s){
        if(s == null || s.length() ==0 ) return "";
        int n = s.length();
        String max = "";
        for(int i=0; i<n;i++){
            for(int k = i; k < n; k++ ){
                if(StringPalindrome(s.substring(i, k+1)) && (k-i)>max.length()){
                    max = s.substring(i,k+1);
                }
            }

        }
        return max;


    }
    private static Boolean StringPalindrome(String s){
        String d = String.valueOf(new StringBuilder(s).reverse());
        return s.equals(d);
    }

    public static void main(String[] args) {
        System.out.println(checkPalindrome("abbcbba"));
    }
}
