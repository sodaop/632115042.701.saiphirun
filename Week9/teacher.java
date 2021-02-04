package Week9;

public class teacher extends Person{
    String workState;
    public teacher(String name,int bornyear,String workState){
        super(name,bornyear);
        this.workState= workState;
    }

    public void introduce(){
        super.introduce();
        System.out.println("I am a teacher and teach the students in "+workState+".");
    }
    
    
}
