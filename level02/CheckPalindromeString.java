package level02;

import java.util.Scanner;
//new class created
class PallindromeChecker{
    String text;
 //constructor
    PallindromeChecker(String text){
        this.text = text;
    }
    // methode check created
    public boolean check(){
        int i=0;
        int j=text.length()-1;
        while(j>i){
            if(text.charAt(i)!=text.charAt(j)){

                return false;
            }
            i++;
            j--;
        } return true;
    }
}
public class CheckPalindromeString {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String text = sc.nextLine();
//new object created
PallindromeChecker obj = new PallindromeChecker(text);
if(obj.check()){
    System.out.println("pallindrome");
}else{
    System.out.println("not pallindrome");
}

    }
}
