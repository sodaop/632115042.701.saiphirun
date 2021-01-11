package gun;

public class maingun {
    public static void main(String[] args) {
NerfSystem gun1 = new NerfSystem(0);

gun1.Fires();

gun1.reload(15);

gun1.Fires();

gun1.Fires();

gun1.displayNumberOfAmmo();

gun1.reload(2);

gun1.displayNumberOfAmmo();

gun1.displayGunID();

NerfSystem gun2 = new NerfSystem(16);

gun2.displayGunID();

gun2.Fires();

gun2.displayNumberOfAmmo();

gun2.reload(2);

gun2.displayNumberOfAmmo();
    }
    
}
