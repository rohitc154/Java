package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> llist = new LinkedList<>();

        llist.add(74);
        llist.add(90);
        llist.add(73);
        llist.add(12);

        System.out.println(llist);

        List<Integer> vector = new Vector<>();
        vector.add(20);
        vector.add(5);
        vector.add(17);
        vector.add(98);
        System.out.println(vector);

        Vector<Integer> vec1 = new Vector<>();
        vec1.add(45);
        vec1.add(39);
        vec1.add(89);
        System.out.println(vec1);
    }
}
