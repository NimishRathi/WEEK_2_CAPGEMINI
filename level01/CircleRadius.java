package level01;

import java.util.Scanner;

//create a class name circle
class circle {
    double radius;
    //default constructor
    circle(){
        radius = 45.0;
    }
    //parametrized constructor
    circle(int radius){
        this.radius = radius;
    }
    void display(){
        System.out.println("your radius is " + radius);
    }
}
public class CircleRadius {
    public static void main(String[] args) {
    //Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("this is default radius");
        //create object
        circle obj = new circle();
        //call display methode
         obj.display();
        System.out.println("Enter new radius");
        int radius = sc.nextInt();
         //create new object
         circle objnew = new circle(radius);
         objnew.display();

    }
}
