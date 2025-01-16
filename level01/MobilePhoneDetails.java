package level01;

import java.util.Scanner;
//new class created
class  MobilePhone{
    String brand, model;
    int price;
    //new constructor called
    MobilePhone(String brand , String model , int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    //new methode created
    void display(){
        System.out.println("brand is : " + brand);
        System.out.println("model is : " + model);
        System.out.println("price is : " + price);
    }
}
public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter brand name");
        String brand = sc.nextLine();
        System.out.println("enter model name");
        String model = sc.nextLine();
        System.out.println("enter price ");
        int price = sc.nextInt();
        //object obj created
        MobilePhone obj = new MobilePhone(brand , model , price);
        //display methode called
        obj.display();

    }
}
