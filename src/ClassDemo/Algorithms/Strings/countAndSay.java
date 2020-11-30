package ClassDemo.Algorithms.Strings;

import java.util.Arrays;

public class countAndSay {
    public static String CountAndSay(int n){
        StringBuffer say = new StringBuffer("1");
        for (int i = 0; i < n; i++) {
            if(i==0){
                continue;
            }
            if(i==1){
                say.append(1);
                continue;
            }
            else {
                char[] charArray = say.toString().toCharArray();
                say.delete(0, say.length());
                int count = 1;
                for (int j = 0; j < charArray.length; j++) {
                    while (j < charArray.length - 1 && charArray[j] == charArray[j + 1]) {
                        count++;
                        j++;
                    }
                    say.append(count);
                    say.append(charArray[j]);
                    count =1;
                }
            }

        }

        return say.toString();
    }

    public static void main(String[] args) {
        System.out.println(CountAndSay(4));
        char[] newchar = new char[]{'1','2','3'};
        newchar = Arrays.copyOfRange(newchar, 0, 1);
        System.out.println(Arrays.toString(newchar));
    }
}
