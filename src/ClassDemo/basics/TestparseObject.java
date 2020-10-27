package ClassDemo.basics;

import sun.java2d.pipe.SpanShapeRenderer;

/**
 * Created by Pan on 27/10/20.
 */
public class TestparseObject {
    public static void main(String[] args) {
        littleCircle mycircle = new littleCircle();
        int n =5;
        printAreas(mycircle, n);
        System.out.println(mycircle.getRadius());
        littleCircle[] circleArray = new littleCircle[10];
        for(int i = 0; i<circleArray.length; i++){
            circleArray[i] = new littleCircle(Math.random()*10);
            System.out.println(circleArray[i].getArea());
        }

    }

    //此时基本数据类型int n拷贝一份到了方法里，因此方法对数值的改变不会影响原来的值

    public static void printAreas(littleCircle c, int times){
        System.out.println("Radius \t\tArea");
        while(times>=1){
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() +1);
            times --;
        }
    }

}
