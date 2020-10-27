package ClassDemo.basics;

//实例方法与静态方法
public class SimpleCircle {
    public static void main(String[] args) {
        //ins是对象的引用，getArea是实例方法
        littleCircle circle1 = new littleCircle(5);
        System.out.println(circle1.getArea());
        circle1.setRadius(1.0);
        System.out.println(circle1.getArea());
    }


}
class littleCircle{
    private double radius;
    final double PI= 3.1415926;
    private static int numberofObjects;


    littleCircle(){
        radius =1;
        numberofObjects++;
    }

    littleCircle(double newRadius){
        radius = newRadius;
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