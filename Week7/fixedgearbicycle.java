package Week7;

public class fixedgearbicycle extends bicycle{
    
    public fixedgearbicycle(){
        speed=10;
        num++; 
        System.out.println("fixedgearbicycle : "+num);
     }
 
     public fixedgearbicycle(int defaltspeed){
        num++;
        System.out.println("fixedgearbicycle : "+num);
         
 
         if (defaltspeed<99 & defaltspeed>0) {
             speed=defaltspeed;
         } else {
 
             System.out.println("Enter correct format");
             
         }
 
     }

     public void speedup(){
        if (speed<99 & speed>0) {
            speed =speed+5;
        } else {

    System.out.println("speed exceed 99 km");
            
        }

     }

     public void Break(){
        if (speed<99 & speed>0) {
            speed =speed-5;
        } else {

    System.out.println("speed exceed 0 km");
            
        }
     }


}