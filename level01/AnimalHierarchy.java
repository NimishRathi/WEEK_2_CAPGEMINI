package level01;
//create class Animal
class Animal{
   protected String name;
   protected int age;
//Create constructor
    Animal(String name , int age){
        this.name = name;
        this.age = age;
    }
    //create methode
    void makeSound(){
        System.out.println("animal sound");
    }
}
//create class Dog extend Animal class
class Dog extends Animal{
    Dog(String name, int age) {
        super(name, age);
    }
//create methode makesound
@Override
    void makeSound(){
        System.out.println("bark " + name + " " + age);
    }
}
//create class Cat extends Animal class
class Cat extends Animal{
    Cat(String name, int age) {
        super(name, age);
    }
  //create a methode makesound
  @Override
    void makeSound(){
        System.out.println("meow " + name + " " + age);
    }
} //create class Birds extends Animal
class Birds extends Animal{
    Birds(String name, int age) {
        super(name, age);
    }
//create makesound
 @Override
    void makeSound(){
        System.out.println("chew " + name + " " + age);
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        String name = "zimmi";
        int age = 4;
        //create objects
        Animal an = new Animal(name,age);
        String name1 = "buzzo";
        int age1 = 2;
        Dog dog = new Dog(name1,age1);
        String name2 = "billu";
        int age2 = 2;
        Cat cat = new Cat(name2 ,age2);
        String name3 = "chew";
        int age3 = 1;
        Birds birds = new Birds(name3,age3);
        //calling methodes
        an.makeSound();
        dog.makeSound();
        cat.makeSound();
        birds.makeSound();
    }
}
