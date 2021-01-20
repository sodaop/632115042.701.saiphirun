package Week7;

public class mountainbicycle extends bicycle{
    
    private int gear;
    public mountainbicycle(){
        speed=10;
        gear=1;
        num++;
        System.out.println("mountainbicycle : "+num);
     }
 
     public mountainbicycle(int defaltspeed){
        num++;
        System.out.println("mountainbicycle : "+num);
         
 
         if (defaltspeed<99 & defaltspeed>0) {
             speed=defaltspeed;
             gear=1;
         } else {
 
             System.out.println("Enter correct format");
             
         }
 
     }
     public void speedup(){
        if (speed<99 & speed>0) {
            speed =speed+(gear*5);
        } else {

    System.out.println("speed exceed 99 km");
            
        }
     }
     public void setgear(int gearset){
      if (gearset>0) {
        gear = gearset;
      } else {
        System.out.println("Enter correct format");
      }
     }

     public void BreakM(){
        if (speed<99 & speed>0) {
            speed =speed-5;
        } else {

    System.out.println("speed exceed 0 km");
            
        }
     }



}