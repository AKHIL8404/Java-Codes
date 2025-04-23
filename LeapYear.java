package practice;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Year : ");
        int year = s.nextInt();
        
        if((year % 4 == 0 && year % 100 !=0)
            ||(year % 400 == 0)){
                System.out.print("It is a Leap Year");
            }
        else{
            System.out.print("Not a Leap Year");
        }
    }
}