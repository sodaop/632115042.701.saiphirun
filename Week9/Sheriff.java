package Week9;

public class Sheriff extends Person{
    String workState;
    public Sheriff(String name,int bornyear,String workState){
        super(name,bornyear);
        this.workState= workState;


    }

    public void introduce(){
        super.introduce();
        System.out.println("I am a Sheriff and work in "+workState+".");
    }
    
}
