package ClassDemo.Algorithms;

public class LongestValidParentheses {
    public static int longestValidParentheses(String s){
        if(s.length()<2) return 0;
        int left = 0, right =0, maxLength =0;

        //先从左到右遍历
        for(int i=0; i<s.length();i++){
            if(s.charAt(i) == '(')left ++;
            else right++;
            if(right == left){
                maxLength = Math.max(maxLength, right * 2);
            }
            if(right>left){
                left = 0;
                right =0;
            }
        }
        left =0;
        right =0;
        //再从右到左遍历
        for (int i = s.length()-1; i>0 ; i--){
            if(s.charAt(i) == ')') right ++;
            else left ++;
            if(left == right){
                maxLength = Math.max(maxLength,left * 2);
            }
            if(left >right){
                left = 0;
                right =0;

            }
        }
        return maxLength;

    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()((())"));
    }
}
