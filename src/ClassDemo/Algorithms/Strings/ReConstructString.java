package ClassDemo.Algorithms.Strings;

/*Leetcode 767 重建字符串
    给定一个字符串S，检查是否能重新排布其中的字母，使得两相邻的字符不同。
    若可行，输出任意可行的结果。若不可行，返回空字符串。

示例

输入: S = "aab"
输出: "aba"

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reorganize-string
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ReConstructString {
    public static String reconstructString(String S){
        int p1 = 0;
        int p2 = 0;
        p2++;
        char[] allchar = S.toCharArray();
        while(p2<allchar.length){
            if(allchar[p2] != allchar[p1]){
                p1++;
                p2++;
            }
            else{
                p2++;
            }
        }
        return S;
    }
}
