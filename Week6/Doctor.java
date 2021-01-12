package Week6;

public class Doctor extends Person {

    public Doctor(String name, int age,String gender){
        this.age= age;
        this.name = name;
        this.gender=gender;
    }
    public void heal(){
        System.out.println(name+" is The healing people");
    }
    
}
