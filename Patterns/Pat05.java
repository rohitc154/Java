package Patterns;

import java.util.Scanner;

public class Pat05 {
    static void show(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
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
