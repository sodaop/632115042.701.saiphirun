package Circle;

public class CircleSystem {
    public double Circleradius;
    public double Orix;
    public double Oriy;
    public static int CircleID=0;
    public  int temp;
    
 
   public CircleSystem(double orix,double oriy,double radius){
     
       Orix=orix;
       Circleradius=radius;
       Oriy=oriy;
       
     
        CircleID++;

        
        temp=CircleID;
    
    }
    public CircleSystem(double orix,double oriy){
       
        Orix=orix;
        Oriy=oriy;
        Circleradius=1;
        CircleID++;
        temp=CircleID;
     
      
     }
     public int getID(){

        return temp;
     }

     
    public void CircleArea(){
        
      if (Circleradius>0) {
        System.out.println("The Area of Circle "+CircleID+" is "+Math.PI*(Math.pow(Circleradius, 2)));
          
      }
      else{
        System.out.println("The Area of Circle "+CircleID+" is "+0);
      }
    }
    public void CircleCircumference(){
     if (Circleradius>0) {
            
        System.out.println("The Circumference of Circle "+CircleID+" is "+(2*Math.PI)*Circleradius);
     } else {
            
        System.out.println("The Circumference of Circle "+CircleID+" is "+0);
     }
    }

    public double getradius(){
        return Circleradius;
    }
    public double getx(){
        return Orix;
    }
    public double gety(){
        return Oriy;
    }
}
