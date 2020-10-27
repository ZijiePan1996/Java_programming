package ClassDemo.basics;

/**
 * Created by Pan on 27/10/20.
 */
public class NullPointerDemo {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(String name){
        return name;
    }

    public void print() {
        printString(name);
    }
    private void printString(String s) {
        System.out.println(s + " (" + s.length() + ")");
    }

    public static void main(String[] args) {
        NullPointerDemo printer = new NullPointerDemo();
        printer.setName("sss");
        printer.print();
    }
}
