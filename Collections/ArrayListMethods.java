import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.add(12);
        list.add(45);
        list.add(78);
        list.add(56);
        list.add(33);
        list.add(71);
        list.add(90);

        list2.add(34);
        list2.add(79);
        list2.add(32);
        list2.add(80);
        list2.add(69);

        System.out.println(list);
        System.out.println(list2);

        list2.add(3, 122);
        System.out.println(list2);
        System.out.println("Getting Value : " + list2.get(2));
        list2.set(2, 45);
        System.out.println(list2);

        System.out.println(list.remove(1));
        System.out.println("Size of the ArrayList :" + list.size());
        System.out.println("Emptyness : " + list.isEmpty());
        System.out.println("Contains : " + list.contains(56));
        System.out.println("Index of : " + list.indexOf(33));

        Object[] arr = list.toArray();
        System.out.println(arr);

        System.out.println("Adding Another list : " + list.addAll(2, list2));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
