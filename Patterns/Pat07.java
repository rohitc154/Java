package Patterns;

import java.util.Scanner;

public class Pat07 {
    static void show(int n) {
        int count = 0;
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
            for (int j = i; j < j - count; j++) {
                System.out.print("* ");
            }
            count++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Value : ");
        int iter = obj.nextInt();

        show(iter);
    }
}
