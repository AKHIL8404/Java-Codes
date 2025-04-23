package practice;

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = s.nextInt();
        if (num < 0) {
            System.out.println("Negative Number Not a Palindrome");
            return;
        }
        int rev = 0;
        int original = num;
        while(num > 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if(original == rev){
            System.out.println("The Number is Palindrome");
        }
        else{
            System.out.println("Not a Palindrome Number");
        }
        s.close();
    }
}