package Week6;

public class Gardener extends Person{
    public Gardener(String name, int age,String gender){
        this.age= age;
        this.name = name;
        this.gender=gender;
    }
    public void Plantingtrees(){
        System.out.println(name+" is create Tree");
    }
}
