package Week7;

public class Bird extends Pet{
    
    String Country;
   String  CanFly;
    public Bird(String name,String color,int age,String species){
       this.name=name;
       this.color=color;
       this.age=age;
       this.species=species;
       
    
      
        }
        public void Speak(){
            System.out.println(" jub jub!!");
        }
        public void country(){
            System.out.println(Country+" is the country that Bird comefrom");
        }
        public void isCanFly(){
            if (CanFly=="Fly") {
                System.out.println(name+" can Fly ");
            } else {
                System.out.println(name+" can not Fly ");
            }
        }
}
