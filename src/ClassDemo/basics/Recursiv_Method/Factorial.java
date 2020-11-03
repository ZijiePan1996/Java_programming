package ClassDemo.basics.Recursiv_Method;

/**
 * Created by Pan on 1/11/20.
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println(allFactorial(3));
    }
    public static int allFactorial(int n){

        if (n<0){
            throw new RuntimeException("False input");
        }
        //终止条件
        if(n == 0){
            return 1;
        }else{
            return n * allFactorial(n-1);
        }
    }

}
