package Week6;

public class nurse extends Person {
    public nurse(String name, int age,String gender){
        this.age= age;
        this.name = name;
        this.gender=gender;
    }
    public void displaynurse(){
        System.out.println(name+" is Helping Doctor");
    }


}
