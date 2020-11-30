package ClassDemo.Algorithms.Strings;

public class heystackAndneedle {
    public static int strStr(String haystack, String needle){
        int pH = 0;
        int pN = 0;
        int n = haystack.length();
        char[] charH = haystack.toCharArray();
        char[] charN = needle.toCharArray();
        int result = -1;
        while(pH < n){
            if(charH[pH] == charN[pN]){
                result = pH;
                while(pN < charN.length && pH < n && charH[pH] == charN[pN]){
                    pN++; pH++;
                    }
                if(pN == charN.length) return result;
                else {
                    result = -1;
                    }
                pH = pH-pN;
                pN = 0;
            }
            pH++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(strStr("mississippi", "pi"));
    }
}

