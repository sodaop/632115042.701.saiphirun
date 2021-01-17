package Week7;

public class Fish extends Pet{
    
     String Size;
    String  SaltFresh;
    int SwimSpeed;
     public Fish(String name,String color,int age,String species){
        this.name=name;
        this.color=color;
        this.age=age;
        this.species=species;
     
     
       
        
         }
      public void isSwimtosea(){
          if (SaltFresh=="Sea") {
              System.out.println(name+" can Swim in the sea");
          } else {
              System.out.println(name+" can not Swim in the sea");
          }
      }
      public void Swimfast(){
          System.out.println(name+" Swim with "+SwimSpeed+" Fast");
      }
    
}
