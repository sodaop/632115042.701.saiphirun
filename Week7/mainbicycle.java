package Week7;

public class mainbicycle {

    public static void main(String[] args) {
        fixedgearbicycle A=new fixedgearbicycle(30);
        A.speedup();
        A.displayspeed(); 
        A.Break();
        A.Break();
        A.displayspeed();
        mountainbicycle B =new mountainbicycle(10);
        B.setgear(2);
        B.speedup();
        B.displayspeed();
        B.BreakM();
        B.setgear(5);
        B.speedup();
        B.displayspeed();
    }
    
}
