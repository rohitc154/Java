
import java.util.ArrayList;
import java.util.Scanner;

public class arrList {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);

        // Here, we pass the wrapper class in ''<>''
        ArrayList<Integer> list = new  ArrayList<>(10);

        list.add(5);
        list.add(78);
        System.out.println(list);

        for(int i = 0 ; i<5;i++){
            list.add( input.nextInt());
        }

        System.out.println(list);
    }
}
