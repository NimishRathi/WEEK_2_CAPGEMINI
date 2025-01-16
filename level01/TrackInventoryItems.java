package level01;

import java.util.Scanner;
//class Item created
class Item {
    //Attribute created
    int itemCode,  price , quantity;
    String itemName;
    //constructor created
    Item(int itemCode, String itemName , int price , int quantity){
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    //new methode calculate created

    public int calculate(){
        int totalcost = price *  quantity;
        return totalcost;
    }
    //new methode display created
    public void display(){
        System.out.println("cost for the given quantity :" + quantity + " is " + calculate());
    }
}
public class TrackInventoryItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter ItemName");
        String itemName = sc.nextLine();
        System.out.println("enter ItemCode");
        int itemCode = sc.nextInt();
        System.out.println("enter Price");
        int price = sc.nextInt();
        System.out.println("enter Quantity");
        int quantity = sc.nextInt();
        //object created
        Item obj = new Item(itemCode , itemName ,  price ,quantity );
        //methode calculate called
        obj.calculate();
        //methode display called
        obj.display();


    }
}
