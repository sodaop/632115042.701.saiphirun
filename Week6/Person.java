package Week6;

public class Person {
    String name;
    int age;
    String gender;
    public Person(){

    }
    public Person (String name , int age,String gender){
        this.name = name;
        this.age = age;
        this.gender =gender;
    }
    public void introduce(){
        System.out.println("My name is "+name+" my age is "+age+" gender is "+gender);
    }
    
}
