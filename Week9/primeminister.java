package Week9;

public class primeminister extends Person{
    String workState;
    public primeminister(String name,int bornyear,String workState){
        super(name,bornyear);
        this.workState= workState;


    }

    public void introduce(){
        super.introduce();
        System.out.println("I am a prime minister and work in "+workState+".");
    }
    
    
}
