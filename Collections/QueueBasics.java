import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
    public static void main(String[] args) {
         Queue<Integer> queue = new LinkedList<>();

         queue.add(5);
         queue.add(7);
         queue.add(12);
         queue.add(9);
         queue.add(11);
         queue.offer(45);
         queue.remove();

         System.out.println(queue);
         System.out.println(queue.size());
    }
}
