package Week5.Mgun.gun;
public class NerfSystem {

    public int gun;
    public static int ID ;
    
   
   public NerfSystem(int ammobase){
       
   if (ammobase>15) {
       System.out.println("Ammo is over load");
   } else {
       gun=ammobase;
       
   }
   
     ID++;
   }
   public void Fires(){
   if (gun>0) {
       System.out.println("Bang ! !");
       gun=gun-1;
       
   } else {
       System.out.println(" No Ammo left");
   }
   
   }
   public void reload(int ammo){
   int load;
   load=gun;
   load=load+ammo;
   
   if (load>15) {
       System.out.println("Ammo is over load");
     
   } else {
     gun=gun+ammo;
   }
   
   }
   
   public void displayNumberOfAmmo(){
       System.out.println(gun+" bullet left");
   }
   
   public void displayGunID(){
     
       System.out.println("The ID of this gun is "+ID);
   
   }
   
   
    
}