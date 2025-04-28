package Patterns;

import java.util.Scanner;

public class Pat02 {

    static void show(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no. of times you want to print : ");
        int iter = obj.nextInt();

        for (int i = 0; i < iter; i++) {
            System.out.println("Enter value : ");
            int val = obj.nextInt();
            show(val);
        }
    }
}
