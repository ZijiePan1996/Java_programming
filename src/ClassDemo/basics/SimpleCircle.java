package ClassDemo.basics;

//实例方法与静态方法
public class SimpleCircle {
    public static void main(String[] args) {
        //ins是对象的引用，getArea是实例方法
        littleCircle circle1 = new littleCircle(5);

        System.out.println(circle1.getClass());

        System.out.println(circle1.getArea());
        circle1.setRadius(1.0);
        System.out.println(circle1.getArea());
        littleCircle circle2;
        Double yesDouble = (Double) 9.0;
        int a = yesDouble.intValue();
        System.out.println(a);
    }


}
class littleCircle{
    private double radius;
    final double PI= 3.1415926;
    private static int numberofObjects;


    littleCircle(){
        this(1.0); //this关键字用于调用另一个构造方法
        numberofObjects++;
    }

    littleCircle(double radius){
        this.radius = radius;  //this关键字用于引用所构建的对象的隐藏数据域radius
        numberofObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius>0) {
            this.radius = radius;
        }
    }

    public double getArea(){
        return radius*radius*PI;
    }


}