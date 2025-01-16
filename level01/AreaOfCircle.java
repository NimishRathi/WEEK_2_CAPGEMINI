package level01;

import java.util.ArrayList;
import java.util.Scanner;

class Circle{
       //Attribute
       double radius ;
       //constructor
       Circle(double radius){
           this.radius = radius;
       }
       //methode to calculate
       public double calculate(){
           return Math.PI * (radius * radius);
       }

       //methode to display
       public  void display(){
           System.out.println(calculate());
       }

}
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        //object created for class Circle
        Circle obj = new Circle(radius);
        //methode calculate called
        obj.calculate();
        //methode display called
        obj.display();




    }
}
