package level01;

import java.util.Scanner;

class HotelBooking{
    String guestName;
    String roomType;
    int nights;

   //default constructor
    HotelBooking() {
     guestName = "nimish";
     roomType = "AC";
     nights = 2;
                   }
   //parametrized constructor
   HotelBooking(String guestName , String roomType , int nights){
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
   }
   HotelBooking(HotelBooking obj){
        guestName = obj.guestName;
        roomType = obj.roomType;
        nights = obj.nights;
   }
   void display(){
       System.out.println(guestName);
       System.out.println(roomType);
       System.out.println(nights);
   }
     }
public class HotelBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("this are default values");
        HotelBooking hotel = new HotelBooking();
        hotel.display();
        System.out.println("enter values");
        String guestName = sc.nextLine();
        String roomType = sc.nextLine();
        int nights = sc.nextInt();
        System.out.println("this are parmetrized values");
        HotelBooking hotel1 = new HotelBooking(guestName,roomType,nights);
        hotel1.display();
        System.out.println("this are copy values");
        HotelBooking hotel2 = new HotelBooking(hotel1);
        hotel2.display();

    }
}
