package Week12;

public class Rectangle extends Shape {

    private double x;
    private double y;


    public Rectangle(double x ,double y){
this.x=x;
this.y=y;
    }

    public void Getarea(){

        System.out.println("Rectangle Area is "+x*y);

    }
    
}
