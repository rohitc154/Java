import java.util.Collections;
import java.util.Vector;

// Almost all the methods of arraylist apply for the vector but, vector have some specific methods

public class VectorBasics {
    public static void main(String[] args) {

        Vector<Integer> vec = new Vector<>();

        vec.add(3);
        vec.add(2);
        vec.add(5);
        vec.add(1);
        vec.add(0);
        vec.add(7);
        vec.add(6);
        vec.add(11);
        vec.add(13);
        vec.add(14);
        vec.add(17);

        System.out.println(vec);
        Collections.sort(vec); // Sorting a Vector
        System.out.println(vec);

        // Methods specific to Vector
        System.out.println("First Element : " + vec.firstElement());
        System.out.println("Last Element : " + vec.lastElement());
        System.out.println("Capacity :" + vec.capacity());
        System.out.println(vec.elementAt(4));
        vec.insertElementAt(2, 68);
        System.out.println(vec);
        // vec.removeElementAt(1);
        // System.out.println(vec);
        // System.out.println(vec.removeAll(vec));
        // System.out.println(vec);
    }
}
