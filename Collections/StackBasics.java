import java.util.Iterator;
import java.util.Stack;

public class StackBasics {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Rohit");
        stack.push("Rahul");
        stack.push("Shweta");
        stack.push("Tuhi");
        stack.push("Vineet");
        stack.push("Swati");

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.contains("Roht"));

        Iterator<String> it = stack.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

    }
}
