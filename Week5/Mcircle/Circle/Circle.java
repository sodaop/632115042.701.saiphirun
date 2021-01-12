package Week5.Mcircle.Circle;

public class Circle {
    public static void main(String[] args) {
        CircleSystem circle1 = new CircleSystem(0,0,2);
        circle1.CircleArea();
        circle1.CircleCircumference();
        CircleSystem circle2 = new CircleSystem(1,2,3);
        circle2.CircleArea();
        circle2.CircleCircumference();
        CircleSystem circle3 = new CircleSystem(3,5);
        circle3.CircleArea();
        circle3.CircleCircumference();
        CircleSystem circle4= new CircleSystem(-1,-10,-1);
        circle4.CircleArea();
        circle4.CircleCircumference();
        cheak A =new cheak();
        A.checkCircle(circle1, circle2);
        A.checkCircle(circle1, circle3);
        A.checkCircle(circle2, circle3);
    }
    
}
