package level01;
//create methode
class Person{
    String name;
    int age;
//default constructor
    Person(){
        name = "nimish";
        age = 22;
    }
    //copy constructor
    Person(Person obj){
        this.name = obj.name;
        this.age = obj.age;
    }
    //create a display methode
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class CopyConstructor {
    public static void main(String[] args) {
        System.out.println("this are default values");
        //create object for default constructor
        Person per = new Person();
        //call display methode
        per.display();
        System.out.println("this are copy values");
        //create a newobject
        Person newobj = new Person(per);
        //call display methode
        newobj.display();


    }
}
