class ForestAnimal{
    String name;
    int age;
    
    ForestAnimal(String name, int age){
        this.name=name;
        this.age= age;
    }
    void makeSound(){
        System.out.println(name + " makes a sound.");
    }
}

class WildAnimal extends ForestAnimal{
    WildAnimal(String name, int age){
        super(name, age);
    }
    @Override
    void makeSound(){
        System.out.println(name + " roars!");
    }
}

class Lion extends WildAnimal{
    Lion(String name, int age){
        super(name, age);
    }
    @Override
    void makeSound(){
        System.out.println(name + " Growls!");
    }
}

class HerbivoreAnimal extends ForestAnimal{
    HerbivoreAnimal(String name, int age){
        super(name, age);
    }
    @Override
    void makeSound(){
        System.out.println(name + " bleats!");
    }
}

class Elephant extends HerbivoreAnimal{
    Elephant(String name, int age){
        super(name, age);
    }
    @Override
    void makeSound(){
        System.out.println(name + " trumpets!");
    }
}

public class Animal {
    public static void main(String[] args) {
        ForestAnimal animal1;
        animal1= new Lion("Theo", 5);
        animal1.makeSound();
        animal1= new Elephant("Ella", 10);
        animal1.makeSound();
    }
}
