package Week7;

public class Dog extends Pet {
 
     String Size;
     String ShortLong;
   
     public Dog(String name,String color,int age,String species){
        this.name=name;
        this.color=color;
        this.age=age;
        this.species=species;
     
  
         }
         public void run(){
             System.out.println("My dog "+name+" is running in to city");
         }
         public void bark(){
             System.out.println(Size+" BOX BOX !!");
         }
         public  void isshortHair(){
             if (ShortLong=="Short") {
                System.out.println(" is The dog is short hair: True ");
             } else {
                System.out.println(" is The dog is short hair:  False ");
             }
         }
       

}
