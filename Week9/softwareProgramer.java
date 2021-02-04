package Week9;

public class softwareProgramer extends Person{
    String workState;
    public softwareProgramer(String name,int bornyear,String workState){
        super(name,bornyear);
        this.workState= workState;


    }

    public void introduce(){
        super.introduce();
        System.out.println("I am a softwareProgrammer work in "+workState+".");
    }
    
    
}
