package Patterns;

import java.util.Scanner;

public class Pat03 {

    static void show(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
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
