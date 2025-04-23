package practice;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = s.nextInt();
        int factorial =1;
        for(int i = 2; i<=num; i++){
            factorial *= i;
        }
        System.out.print("Factorial : " +factorial);
    }
}
