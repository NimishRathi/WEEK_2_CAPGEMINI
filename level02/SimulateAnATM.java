package level02;

import java.util.Scanner;
//class created
class BankAccount{
    Scanner sc = new Scanner(System.in);
   String  accountHolder;
   int accountNumber, balance;
//constructor
   BankAccount(String accountHolder , int accountNumber, int balance){
       this.accountHolder = accountHolder;
       this.accountNumber = accountNumber;
       this.balance =  balance;
   }//new methode  DepositingMoney created
     public  void DepositingMoney(){
         System.out.println("enter the amount of money you want to deposite");
         int money = sc.nextInt();
         balance = balance + money;
         System.out.println("amount deposited your current balance is :" + (balance));
     } //new methode WithDraw created
     public void WithDraw(){
         System.out.println("enter the amount of money you want to withdraw");
         int money = sc.nextInt();
         balance = balance - money;
         System.out.println("amount withdraw your current balance is " + (balance));
     } //new methode currentBalance created
     public void currentBalance(){
         System.out.println("current balance is " + balance);
     }
}
public class SimulateAnATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter account holder name");
        String  accountHolder = sc.nextLine();
        System.out.println("enter account number");
        int accountNumber = sc.nextInt();
        System.out.println("enter balance");
        int balance = sc.nextInt();
        //obj created
        BankAccount obj = new BankAccount(accountHolder , accountNumber , balance);
        //methode DepositingMoney called
        obj.DepositingMoney();
        //methode WithDraw called
        obj.WithDraw();
        //methode currentBalance called
        obj.currentBalance();

    }
}
