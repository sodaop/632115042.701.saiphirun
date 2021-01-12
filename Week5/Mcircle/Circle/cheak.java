package Week5.Mcircle.Circle;

public class cheak {
    
    public  cheak(){
    }
    public void checkCircle(CircleSystem A,CircleSystem B){
        double distSq = (A.Orix - B.Oriy) * (A.Orix - B.Oriy) + 
        (A.Oriy - B.Oriy) * (A.Oriy - B.Oriy) ; 
        double radSumSq = (A.Circleradius + B.Circleradius) *  (A.Circleradius + B.Circleradius) ; 
        if (distSq<radSumSq) {
            System.out.println("The Circle "+A.getID()+" intersected with "+B.getID());
        } else {
            System.out.println("The Circle "+A.getID()+" not intersected with "+B.getID());
        }

    }


}