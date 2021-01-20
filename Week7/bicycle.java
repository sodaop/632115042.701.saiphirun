package Week7;

public class bicycle {

     int speed ;
     static int num=0;

    public bicycle(){
       speed=10;
    }

    public bicycle(int defaltspeed){
        

        if (defaltspeed<99 & defaltspeed>0) {
            speed=defaltspeed;
        } else {

            System.out.println("Enter correct format");
            
        }

    }

    public void displayspeed(){
        System.out.println("The Speed is "+speed);
    }
    
}
