package Week6;

public class Engineer extends Person{
    String Type;
    public Engineer(String name, int age,String gender){
        this.age= age;
        this.name = name;
        this.gender=gender;
    }

    public void Create(){
        System.out.println(name+" is create "+Type);
    }
}
