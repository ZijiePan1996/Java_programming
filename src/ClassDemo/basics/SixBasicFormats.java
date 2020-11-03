package ClassDemo.basics;


/*所有的java基本数据类型：
    1. byte 8bit 包装类型：Byte
    2. short 16bit 包装类型：Short
    3. int 32bit 包装类型：Integer
    4. long 64bit 包装类型：Long
    5. float 32bit 包装类型：Float
    6. double 64bit 包装类型：Double
    7. boolean 包装类型：Boolean
    8. Char 16bit 包装类型：Character
 */


import java.util.Arrays;

public class SixBasicFormats {
    public static short a = 100;
    public static long b =9L;
    public static boolean c = false;
    public static char d = 'D';
    public static byte e = 127;
    public static int f = (int)2E10;
    public static float g = 6.5f;
    public static double h = 6.5;

    public static void main(String[] args) {
        String a = "Welcome to Java";
        System.out.println(a.replaceAll("[a-c]", "!"));
        System.out.println(a.replaceFirst("e","E"));
        String[] result = a.split(" ");
        System.out.println(Arrays.toString(result));
    }
}
