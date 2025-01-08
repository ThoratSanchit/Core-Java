package javaPractice;

import java.util.Scanner;
import java.lang.String;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int number = sc.nextInt();

        String reverseNumber = String.valueOf(number);
        String reverse = "";

        for (int i = reverseNumber.length() - 1; i >= 0; i--) {
            reverse += reverseNumber.charAt(i);
        }

        int reverseInt = Integer.parseInt(reverse);
       Integer boxedInteger=reverseInt;
        System.out.println(reverseInt);
        System.out.println("data type "+ boxedInteger.getClass().getSimpleName());
    }
}
