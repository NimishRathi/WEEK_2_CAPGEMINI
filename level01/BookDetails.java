package level01;

import java.util.Scanner;
//create a class name Book
class Book{
    String title;
    String author;
    int price;
//default constructor
    Book(){
        title = "movie";
        author = "ram";
        price = 456;
    }
//parametrized constructor
Book(String title, String author , int price ) {
      this.title =  title;
      this.author = author;
      this.price = price;
}
//create a methode to display output
  void display(){
      System.out.println(title);
      System.out.println(author);
      System.out.println(price);
  }
}
public class BookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This are default values");
        //create a object name newObj
        Book newObj = new Book();
        //calling methode
        newObj.display();
        System.out.println("This are paremetrized value");
        System.out.println("enter the title");
        String title = sc.nextLine();
        System.out.println("enter the author name");
        String author = sc.nextLine();
        System.out.println("enter the price");
        int price = sc.nextInt();
        //create a new object
        Book obj = new Book(title,author,price);
        //calling a methode
        obj.display();
    }
}
