package level01;
import java.util.*;

class Employee{
      //Attribute
      String name;
      int id;
      int salary;
     //constructor
      Employee(String name , int id , int salary){
          this.name = name;
          this.id = id;
          this.salary = salary;
      }
       //methode for Display
      public void Display(){
          System.out.println(" Employee name : " + name);
          System.out.println(" Employee id : " + id);
          System.out.println(" Employee salary : " + salary);
      }
}

public class DisplayEmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int id = sc.nextInt();
        int salary = sc.nextInt();
        //create object for employee
        Employee obj = new Employee(name , id , salary);
        obj.Display();




    }
}
