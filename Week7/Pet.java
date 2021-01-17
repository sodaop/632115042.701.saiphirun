package Week7;

public class Pet {
     public String name;
     public String color;
     public int age;
     public String species;
     public Pet(){
         
     }
    public Pet(String name,String color,int age,String species){
   this.name=name;
   this.color=color;
   this.age=age;
   this.species=species;
    }
    public void showPetData(){
        System.out.println("Name : "+name+" sprcies: "+species+" color: "+color+" Age: "+age);
    }
    
}
