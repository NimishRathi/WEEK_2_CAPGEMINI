package level01;


import java.util.Scanner;
//new class created
class Book{
    //Attributes
      String title;
      String author;
      int price;
    //constructor created
      Book(String title , String author , int price) {
          this.title = title;
          this.author = author;
          this.price = price;
      }
      // new methode display created
          public void display(){
              System.out.println("title is :" +  title);
              System.out.println("autho is :" + author);
              System.out.println("price is " + price);
          }
      }

public class HandleBookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter title");
        String title = sc.nextLine();
        System.out.println("enter author");
        String author = sc.nextLine();
        System.out.println("enter price");
        int price = sc.nextInt();
        //object created
        Book obj = new Book(title , author , price);
        //display methode called
        obj.display();
    }
}
