package Week9;

public class football extends Person{
    String workState;
    public football(String name,int bornyear,String workState){
        super(name,bornyear);
        this.workState= workState;


    }

    public void introduce(){
        super.introduce();
        System.out.println("I am a football player and work in "+workState+".");
    }
    
    
}
