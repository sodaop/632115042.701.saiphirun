package Week12;

public class Triangle extends Shape{
    private double base;
    private double h;

    public Triangle(double base, double h){
     this.base=base;
     this.h=h;
    }

    public void Getarea(){
        System.out.println("Triangle area is "+0.5*base*h);
    }
    
}
