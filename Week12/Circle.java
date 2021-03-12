package Week12;

public class Circle extends Shape {
    private double R;

    public Circle(double R){
        this.R=R;
    }

    public void Getarea(){
       System.out.println("The Area of Circle is "+Math.PI*R*R);
    }
    
}
