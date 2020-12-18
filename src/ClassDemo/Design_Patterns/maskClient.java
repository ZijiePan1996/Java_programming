package ClassDemo.Design_Patterns;

public class maskClient {
    public static void main(String[] args) {
        MaskFactory factory = new MaskFactory();
        System.out.println(factory.create("医用口罩"));
        System.out.println(factory.create("N95口罩"));
    }
}
