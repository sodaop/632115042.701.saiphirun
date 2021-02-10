package Week10;

public class Human {
    public void hit(Animal animal){
        System.out.println(animal.roar());
    }
    public static void main(String[] args) {
        Animal dog = new Dog();
        Human human = new Human();
        System.out.println("the first calling hit animal");
        human.hit(dog);

        dog = new Cat();
        System.out.println("the Second calling hit animal");
        human.hit(dog);
        dog = new Fish();
        System.out.println("the Third calling hit animal");
        human.hit(dog);
    }
}
