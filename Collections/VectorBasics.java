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

        System.out.println(vec);
        Collections.sort(vec); // Sorting a Vector
        System.out.println(vec);

        // Methods specific to Vector
        System.out.println(vec.firstElement());
        System.out.println(vec.lastElement());
        System.out.println(vec.capacity());
        System.out.println(vec.elementAt(4));
        System.out.println(vec.insertElementAt(2, 68););
    }
}
