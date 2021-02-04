package Week9;

public class Person {
    String name;
    int bornyear;
    public Person(){
      
    }
    public Person(String name , int bornyear){
        this.name=name;
        this.bornyear=bornyear;
       
    }
    public void introduce(){
        System.out.print("My name is "+name+",");
        System.out.println("I was born in "+bornyear+".");
    
    }
    
}
