package level02;

import java.util.Scanner;
//new class created
class Students{
    String name ;
    int rollNumber ;
    int marks;
//constructor called
      Students(String name , int rollNumber , int marks){
          this.name = name;
          this.rollNumber = rollNumber;
          this.marks = marks;
      }
      //methode calculateGrade created
      public String calculateGrade(){
          if(marks>=80)
              return "A";
          else if(marks<80 || marks >40)
              return "B";
          else
              return "C";
      }
      //new methode display created
      public void display(){
          System.out.println(calculateGrade());
      }
}

public class SimulateStudentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name of student");
        String name = sc.nextLine();
        System.out.println("enter roll number");
        int rollNumnber = sc.nextInt();
        System.out.println("enter marks");
        int marks = sc.nextInt();
        //object obj created
       Students obj = new Students(name , rollNumnber , marks);
       //methode calculateGrade called
       obj.calculateGrade();
       //methode display called
       obj.display();
    }
}

