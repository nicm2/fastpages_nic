package _posts;

//sample binary addition code

import java.util.Scanner;
public class BinaryAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your first binary number: ");
        int a = Integer.parseInt(sc.nextLine(), 2);
        System.out.println("What is your second binary number: ");
        int b = Integer.parseInt(sc.nextLine(), 2);


        int sum = a + b;
        System.out.println("Sum of two binary numbers is: " + Integer.toBinaryString(sum));
    }
}