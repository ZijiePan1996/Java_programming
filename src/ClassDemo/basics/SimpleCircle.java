package ClassDemo.basics;

//实例方法与静态方法
public class SimpleCircle {
    public static void main(String[] args) {
        //ins是对象的引用，getArea是实例方法
        littleCircle circle1 = new littleCircle(5);
        System.out.println(circle1.getArea());
    }
}
class littleCircle{
    private double radius;
    final double PI= 3.1415926;


    littleCircle(){radius =1;}

    littleCircle(double newRadius){
        radius = newRadius;
    }
    public double getArea(){
        return radius*radius*PI;
    }
}