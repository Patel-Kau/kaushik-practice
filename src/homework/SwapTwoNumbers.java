package homework;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter fist variable value: ");
        int x =sc.nextInt();
        System.out.println(" Enter Second variable value: ");
        int y =sc.nextInt();

//        int x = 10;
//        int y = 5;
         x= x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swaping:"
                + " x = " + x + ", y = " + y);
    }
}
